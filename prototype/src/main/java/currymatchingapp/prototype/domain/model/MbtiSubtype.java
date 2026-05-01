package currymatchingapp.prototype.domain.model;

import jakarta.persistence.*;

@Entity
@Table(name = "mbti_subtypes")
public class MbtiSubtype {

    @Id
    @Column(name = "mbti_subtype")
    @Enumerated(EnumType.STRING)
    private MbtiSubtypeEnum mbtiSubtype;

    private String SubtypeName;

    private String SubtypeDescription;

    public MbtiSubtypeEnum getMbtiSubtype() {
        return mbtiSubtype;
    }

    public void setMbtiSubtype(MbtiSubtypeEnum mbtiSubtype) {
        this.mbtiSubtype = mbtiSubtype;
    }

    public String getSubtypeName() {
        return SubtypeName;
    }

    public void setSubtypeName(String SubtypeName) {
        this.SubtypeName = SubtypeName;
    }

    public String getSubtypeDescription() {
        return SubtypeDescription;
    }

    public void setSubtypeDescription(String SubtypeDescription) {
        this.SubtypeDescription = SubtypeDescription;
    }

}
