package currymatchingapp.prototype.domain.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "users_profile")
public class Profile {

    @Id
    @Column(name = "user_id")
    private Long userId;

    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    @JoinColumn(name = "user_id")
    private User user;

    private String nickname;

    @Column(name = "profile_image_url")
    private String profileImage;

    private String bio;

    @Column(name = "curry_mbti_type")
    private String curryMbti;

    @Column(name = "curry_mbti_subtype")
    private String curryMbtiSubtype;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getCurryMbti() {
        return curryMbti;
    }

    public void setCurryMbti(String curryMbti) {
        this.curryMbti = curryMbti;
    }

    public String getCurryMbtiSubtype() {
        return curryMbtiSubtype;
    }

    public void setCurryMbtiSubtype(String curryMbtiSubtype) {
        this.curryMbtiSubtype = curryMbtiSubtype;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

}
