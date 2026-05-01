package currymatchingapp.prototype.app.dto;

import currymatchingapp.prototype.domain.model.MbtiSubtypeEnum;
import currymatchingapp.prototype.domain.model.MbtiTypeEnum;

public class DiagnosisResponse {

    private MbtiTypeEnum mbtiType;

    private MbtiSubtypeEnum mbtiSubtype;

    private String mbtiName;

    private String mbtiSummary;

    private String mbtiDescription;

    private String mbtiImage;

    private String subtypeName;

    private String subtypeDescription;

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

    public String getMbtiName() {
        return mbtiName;
    }

    public void setMbtiName(String mbtiName) {
        this.mbtiName = mbtiName;
    }

    public String getMbtiSummary() {
        return mbtiSummary;
    }

    public void setMbtiSummary(String mbtiSummary) {
        this.mbtiSummary = mbtiSummary;
    }

    public String getMbtiDescription() {
        return mbtiDescription;
    }

    public void setMbtiDescription(String mbtiDescription) {
        this.mbtiDescription = mbtiDescription;
    }

    public String getMbtiImage() {
        return mbtiImage;
    }

    public void setMbtiImage(String mbtiImage) {
        this.mbtiImage = mbtiImage;
    }

    public String getSubtypeName() {
        return subtypeName;
    }

    public void setSubtypeName(String subtypeName) {
        this.subtypeName = subtypeName;
    }

    public String getSubtypeDescription() {
        return subtypeDescription;
    }

    public void setSubtypeDescription(String subtypeDescription) {
        this.subtypeDescription = subtypeDescription;
    }

}