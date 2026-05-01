package currymatchingapp.prototype.domain.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "diagnosis_results")
public class Diagnosis {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long diagnosisId;

    @Column(name = "user_id")
    private Long userId;

    @Enumerated(EnumType.STRING)
    private MbtiTypeEnum mbtiType;

    @Enumerated(EnumType.STRING)
    private MbtiSubtypeEnum mbtiSubtype;

    @Column(name = "axis1_score")
    private Integer axis1;

    @Column(name = "axis2_score")
    private Integer axis2;

    @Column(name = "axis3_score")
    private Integer axis3;

    @Column(name = "axis4_score")
    private Integer axis4;

    @Column(name = "axis5_score")
    private Integer axis5;

    private String gender;

    private String age;

    private LocalDateTime diagnosedAt;

    public Long getDiagnosisId() {
        return diagnosisId;
    }

    public void setDiagnosisId(Long diagnosisId) {
        this.diagnosisId = diagnosisId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = Long.parseLong(userId);
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public MbtiTypeEnum getMbtiType() {
        return mbtiType;
    }

    public void setMbtiType(MbtiTypeEnum mbtiType) {
        this.mbtiType = mbtiType;
    }

    public MbtiSubtypeEnum getMbtiSubtype() {
        return mbtiSubtype;
    }

    public void setMbtiSubtype(MbtiSubtypeEnum mbtiSubtype) {
        this.mbtiSubtype = mbtiSubtype;
    }

    public Integer getAxis1() {
        return axis1;
    }

    public void setAxis1(Integer axis1) {
        this.axis1 = axis1;
    }

    public Integer getAxis2() {
        return axis2;
    }

    public void setAxis2(Integer axis2) {
        this.axis2 = axis2;
    }

    public Integer getAxis3() {
        return axis3;
    }

    public void setAxis3(Integer axis3) {
        this.axis3 = axis3;
    }

    public Integer getAxis4() {
        return axis4;
    }

    public void setAxis4(Integer axis4) {
        this.axis4 = axis4;
    }

    public Integer getAxis5() {
        return axis5;
    }

    public void setAxis5(Integer axis5) {
        this.axis5 = axis5;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public LocalDateTime getDiagnosedAt() {
        return diagnosedAt;
    }

    public void setDiagnosedAt(LocalDateTime diagnosedAt) {
        this.diagnosedAt = diagnosedAt;
    }

}


