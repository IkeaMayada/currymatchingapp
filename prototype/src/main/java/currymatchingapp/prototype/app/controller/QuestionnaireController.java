package currymatchingapp.prototype.app.controller;

import currymatchingapp.prototype.domain.model.Questionnaire;
import currymatchingapp.prototype.domain.service.DiagnosisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/questionnaire")
public class QuestionnaireController {

    @Autowired
    private DiagnosisService diagnosisService;

    @GetMapping
    public ResponseEntity<List<Questionnaire>> findAllQuestionnaire() {
        List<Questionnaire> result = diagnosisService.findAllQuestionnaires();
        return ResponseEntity.ok(result);
    }

}