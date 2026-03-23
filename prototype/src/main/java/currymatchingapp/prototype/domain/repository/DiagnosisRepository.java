package currymatchingapp.prototype.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import currymatchingapp.prototype.domain.model.Diagnosis;

public interface DiagnosisRepository extends JpaRepository<Diagnosis, Long> {
    Diagnosis findByUserId(Long userId);
}
