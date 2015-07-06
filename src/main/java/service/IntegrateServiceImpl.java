package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import repository.RHIntegrationImplRepository;
import domain.RHIntegrationImpl;

@Service("integrateService")
public class IntegrateServiceImpl implements IntegrateService{

	@Autowired
	RHIntegrationImplRepository rhIntegrationImplRepository;

	public List<RHIntegrationImpl> listAllInterfaces(){
		
		List<RHIntegrationImpl> interfaceRecs=rhIntegrationImplRepository.findAll();
		
		return interfaceRecs;
		
	}

}
