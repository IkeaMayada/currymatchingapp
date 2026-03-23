package currymatchingapp.prototype.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import currymatchingapp.prototype.domain.model.Profile;

public interface ProfileRepository extends JpaRepository<Profile, Long>{
}
