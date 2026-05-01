package currymatchingapp.prototype.domain.service;

import currymatchingapp.prototype.app.dto.DiagnosisResponse;
import currymatchingapp.prototype.domain.model.*;
import currymatchingapp.prototype.domain.repository.MbtiSubtypeRepository;
import currymatchingapp.prototype.domain.repository.MbtiTypeRepository;
import currymatchingapp.prototype.domain.repository.DiagnosisRepository;
import currymatchingapp.prototype.domain.repository.QuestionnaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DiagnosisService {

    @Autowired
    private DiagnosisRepository diagnosisRepository;

    @Autowired
    private QuestionnaireRepository questionnaireRepository;

    @Autowired
    private MbtiTypeRepository mbtiTypeRepository;

    @Autowired
    private MbtiSubtypeRepository mbtiSubtypeRepository;

    public DiagnosisResponse diagnosisCalculation(int[] answers, String gender, String age) {
        Diagnosis diagnosis = calculateAndSave(answers, gender, age);
        return buildResponse(diagnosis);
    }

    private Diagnosis calculateAndSave(int[] answers, String gender, String age){
        Diagnosis diagnosis = new Diagnosis();
        List<Questionnaire> qList = questionnaireRepository.findAll(Sort.by(Sort.Direction.ASC, "questionnaireId"));
        Map<Integer, Integer> questionTotal = new HashMap<>();

        for (int i = 0; i < answers.length; i++) {
            Questionnaire q = qList.get(i);
            if (!q.isReversedScore()) {
                questionTotal.put(q.getQuestionnaireType(),
                        questionTotal.getOrDefault(q.getQuestionnaireType(), 0 ) + answers[i]);
            } else {
                questionTotal.put(q.getQuestionnaireType(),
                        questionTotal.getOrDefault(q.getQuestionnaireType(), 0 ) + (6 - answers[i]));
            }
        }

        /** TODO:
         * User関連クラス完成後、
         * ユーザー情報と紐づけ
         */

        int axis1 = questionTotal.getOrDefault(1,0);
        int axis2 = questionTotal.getOrDefault(2,0);
        int axis3 = questionTotal.getOrDefault(3,0);
        int axis4 = questionTotal.getOrDefault(4,0);
        int axis5 = questionTotal.getOrDefault(5,0);

        diagnosis.setAxis1(axis1);
        diagnosis.setAxis2(axis2);
        diagnosis.setAxis3(axis3);
        diagnosis.setAxis4(axis4);
        diagnosis.setAxis5(axis5);

        String type = (axis1 >= 15 ? "I" : "E")
                + (axis2 >= 15 ? "D" : "J")
                + (axis3 >= 15 ? "K" : "A")
                + (axis4 >= 15 ? "G" : "R");

        diagnosis.setMbtiType(MbtiTypeEnum.valueOf(type));
        diagnosis.setMbtiSubtype(axis5 >= 15 ? MbtiSubtypeEnum.KODAWARI : MbtiSubtypeEnum.FLEXIBLE);
        diagnosis.setGender(gender);
        diagnosis.setAge(age);
        diagnosis.setDiagnosedAt(LocalDateTime.now());

        diagnosisRepository.save(diagnosis);

        return diagnosis;
    }

    private DiagnosisResponse buildResponse(Diagnosis diagnosis){
        DiagnosisResponse diagnosisResponse = new DiagnosisResponse();

        diagnosisResponse.setMbtiType(diagnosis.getMbtiType());
        diagnosisResponse.setMbtiSubtype(diagnosis.getMbtiSubtype());

        MbtiType mbtiTypeData = mbtiTypeRepository.findById(diagnosis.getMbtiType()).orElseThrow();
        MbtiSubtype mbtiSubtypeData = mbtiSubtypeRepository.findById(diagnosis.getMbtiSubtype()).orElseThrow();

        diagnosisResponse.setMbtiName(mbtiTypeData.getMbtiName());
        diagnosisResponse.setMbtiSummary(mbtiTypeData.getMbtiSummary());
        diagnosisResponse.setMbtiDescription(mbtiTypeData.getMbtiDescription());
        diagnosisResponse.setMbtiImage(mbtiTypeData.getMbtiImage());
        diagnosisResponse.setSubtypeName(mbtiSubtypeData.getSubtypeName());
        diagnosisResponse.setSubtypeDescription(mbtiSubtypeData.getSubtypeDescription());
        return diagnosisResponse;
    }

    public Diagnosis findDiagnosis(Long diagnosisId) {
        return diagnosisRepository.findById(diagnosisId).orElse(null);
    }

    public List<Questionnaire> findAllQuestionnaires() {
        return questionnaireRepository.findAll();
    }

    public List<MbtiType> findAllMbtiTypes() {
        return mbtiTypeRepository.findAll();
    }

    public Questionnaire findQuestionnaire(Integer questionnaireId) {
        return questionnaireRepository.findById(questionnaireId).orElse(null);
    }
}
