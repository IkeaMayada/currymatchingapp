package currymatchingapp.prototype.domain.repository;

import currymatchingapp.prototype.domain.model.MbtiSubtypeEnum;
import currymatchingapp.prototype.domain.model.MbtiSubtype;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MbtiSubtypeRepository extends JpaRepository<MbtiSubtype, MbtiSubtypeEnum>{
}
