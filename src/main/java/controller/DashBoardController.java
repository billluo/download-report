package controller;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import service.IntegrateServiceImpl;
import domain.RHIntegrationImpl;

@Controller
public class DashBoardController {

	@Inject
	@Named("integrateService")
	private IntegrateServiceImpl integrateServiceImpl;
		
	@RequestMapping("/dashboard")
	public String dashboard(Model model){
		System.out.println("print description: ---------------------------");
		List<RHIntegrationImpl> interfaceRecs=integrateServiceImpl.listAllInterfaces();
		System.out.println("print after List interfaces: ---------------------------");
		if(!(interfaceRecs==null)){
			for(RHIntegrationImpl intf : interfaceRecs){
				System.out.println("print description: "+ intf.getRhinterface());
			}
		}
		model.addAttribute("interfaceRecs",interfaceRecs);
		return "showall";
	}
}
