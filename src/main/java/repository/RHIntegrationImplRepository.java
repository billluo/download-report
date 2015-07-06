package repository;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import domain.RHIntegrationImpl;

public interface RHIntegrationImplRepository extends JpaRepository<RHIntegrationImpl,Timestamp>{
	
	List<RHIntegrationImpl> findAll();

}
