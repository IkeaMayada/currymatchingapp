package currymatchingapp.prototype.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "questionnaire")
public class Questionnaire {

    @Id
    private Integer questionnaireId;

    private Integer questionnaireType;

    private String question;

    @Column(name = "reversed_score")
    private boolean reversedScore;

    public Integer getQuestionnaireId() {
        return questionnaireId;
    }

    public void setQuestionnaireId(Integer questionnaireId) {
        this.questionnaireId = questionnaireId;
    }

    public Integer getQuestionnaireType() {
        return questionnaireType;
    }

    public void setQuestionnaireType(Integer questionnaireType) {
        this.questionnaireType = questionnaireType;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public boolean isReversedScore() {
        return reversedScore;
    }

    public void setReversedScore(boolean reversedScore) {
        this.reversedScore = reversedScore;
    }

}
