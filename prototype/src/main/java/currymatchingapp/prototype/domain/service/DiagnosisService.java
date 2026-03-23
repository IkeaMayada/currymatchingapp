package currymatchingapp.prototype.domain.service;

import currymatchingapp.prototype.domain.model.Diagnosis;
import currymatchingapp.prototype.domain.model.MbtiSubtype;
import currymatchingapp.prototype.domain.model.MbtiType;
import currymatchingapp.prototype.domain.repository.DiagnosisRepository;
import currymatchingapp.prototype.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class DiagnosisService {

    @Autowired
    private DiagnosisRepository diagnosisRepository;

    @Autowired
    private UserRepository userRepository;

    public Diagnosis diagnosisCalculation(int[] answers, String gender, String age) {
        Diagnosis diagnosis = new Diagnosis();

        int axis1 = answers[0] + answers[1] + (6 - answers[2]) + (6 - answers[3]) + (6 - answers[4]);
        int axis2 = (6 - answers[5]) + (6 - answers[6]) + (6 - answers[7]) + (6 - answers[8]) + answers[9];
        int axis3 = answers[10] + (6 - answers[11]) + answers[12] + answers[13] + (6 - answers[14]);
        int axis4 = (6 - answers[15]) + (6 - answers[16]) + answers[17] + answers[18] + (6 - answers[19]);
        int axis5 = answers[20] + answers[21] + answers[22] + answers[23] + (6 - answers[24]);

        diagnosis.setAxis1(axis1);
        diagnosis.setAxis2(axis2);
        diagnosis.setAxis3(axis3);
        diagnosis.setAxis4(axis4);
        diagnosis.setAxis5(axis5);

        String type = (axis1 >= 15 ? "I" : "E")
                + (axis2 >= 15 ? "D" : "J")
                + (axis3 >= 15 ? "K" : "A")
                + (axis4 >= 15 ? "G" : "R");

        diagnosis.setMbtiType(MbtiType.valueOf(type));
        diagnosis.setMbtiSubtype(axis5 >= 15 ? MbtiSubtype.KODAWARI : MbtiSubtype.FLEXIBLE);
        diagnosis.setGender(gender);
        diagnosis.setAge(age);
        diagnosis.setDiagnosedAt(LocalDateTime.now());

        diagnosisRepository.save(diagnosis);
        return diagnosis;
    }

    public Diagnosis findDiagnosis(Long diagnosisId) {
        return diagnosisRepository.findById(diagnosisId).orElse(null);
    }

}
