package currymatchingapp.prototype.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import currymatchingapp.prototype.domain.model.Questionnaire;

public interface QuestionnaireRepository extends JpaRepository<Questionnaire, Integer> {

}
