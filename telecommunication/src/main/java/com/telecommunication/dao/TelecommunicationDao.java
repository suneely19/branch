package com.telecommunication.dao;

import com.telecommunication.bo.Person;
import com.telecommunication.bo.SimBo;

public interface TelecommunicationDao {
	
	public boolean saveSim(SimBo simBo);
	public boolean saveAdvisor(Person person);
	public boolean saveCustomer(Person person,SimBo simBo);

}
