package currymatchingapp.prototype.app.controller;

import currymatchingapp.prototype.app.dto.DiagnosisRequest;
import currymatchingapp.prototype.app.dto.DiagnosisResponse;
import currymatchingapp.prototype.domain.model.Diagnosis;
import currymatchingapp.prototype.domain.service.DiagnosisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api/diagnosis")
public class DiagnosisController {

    @Autowired
    private DiagnosisService diagnosisService;

    @PostMapping
    public ResponseEntity<DiagnosisResponse> diagnose(@RequestBody DiagnosisRequest request) {
        DiagnosisResponse result = diagnosisService.diagnosisCalculation(request.getAnswers(), request.getGender(), request.getAge());
        return ResponseEntity.ok(result);
    }

    @GetMapping("/{diagnosisId}")
    public ResponseEntity<Diagnosis> findDiagnosis(@PathVariable Long diagnosisId) {
        Diagnosis result = diagnosisService.findDiagnosis(diagnosisId);
        return ResponseEntity.ok(result);
    }

}
