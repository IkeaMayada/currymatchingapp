package currymatchingapp.prototype.domain.repository;

import currymatchingapp.prototype.domain.model.MbtiTypeEnum;
import org.springframework.data.jpa.repository.JpaRepository;

import currymatchingapp.prototype.domain.model.MbtiType;

public interface MbtiTypeRepository extends JpaRepository<MbtiType, MbtiTypeEnum>{
}
