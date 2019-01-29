package com.telecommunication.controller;

import com.telecommunication.bo.Person;
import com.telecommunication.bo.SimBo;
import com.telecommunication.service.TelecommunicationService;

public class TelecommunicationController {
	
	private TelecommunicationService telecommunicationService;
	
	
	
	public boolean saveSim(SimBo simBo) {
		return telecommunicationService.saveSim(simBo);
		
	}
	public boolean saveAdvisor(Person person) {
		return telecommunicationService.saveAdvisor(person);
		
	}
	public boolean saveCustomer(Person person,SimBo simBo) {
		return telecommunicationService.saveCustomer(person, simBo);
	}


	public TelecommunicationService getTelecommunicationService() {
		return telecommunicationService;
	}

	public void setTelecommunicationService(TelecommunicationService telecommunicationService) {
		this.telecommunicationService = telecommunicationService;
	}
	
	

}
