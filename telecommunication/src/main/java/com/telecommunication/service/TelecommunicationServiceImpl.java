package com.telecommunication.service;

import com.telecommunication.bo.Person;
import com.telecommunication.bo.SimBo;
import com.telecommunication.dao.TelecommunicationDao;
import com.telecommunication.dao.TelecommunicationPersonDao;
import com.telecommunication.dao.TelecommunicationTRAIDao;

public class TelecommunicationServiceImpl implements TelecommunicationService{
	
	private TelecommunicationDao telecommunicationDao;
	private TelecommunicationTRAIDao telecommunicationTRAIDao;
	private TelecommunicationPersonDao telecommunicationPersonDao;

	public boolean saveSim(SimBo simBo) {
		return telecommunicationDao.saveSim(simBo);
	}

	public boolean saveAdvisor(Person person) {
		return telecommunicationDao.saveAdvisor(person);
	}

	public boolean saveCustomer(Person person, SimBo simBo) {
		System.out.println(simBo);
		System.out.println(person);
		System.out.println(telecommunicationPersonDao);
		System.out.println(telecommunicationTRAIDao);
		boolean simFlag=telecommunicationTRAIDao.saveSim(simBo);
		boolean personFlag=telecommunicationPersonDao.savePerson(person);
		if(simFlag==true && personFlag==true) {
			return true;
		}
		return false;
	}

	public TelecommunicationDao getTelecommunicationDao() {
		return telecommunicationDao;
	}

	public void setTelecommunicationDao(TelecommunicationDao telecommunicationDao) {
		this.telecommunicationDao = telecommunicationDao;
	}

	public TelecommunicationTRAIDao getTelecommunicationTRAIDao() {
		
		return telecommunicationTRAIDao;
	}

	public void setTelecommunicationTRAIDao(TelecommunicationTRAIDao telecommunicationTRAIDao) {
		
		this.telecommunicationTRAIDao = telecommunicationTRAIDao;
	}

	public TelecommunicationPersonDao getTelecommunicationPersonDao() {
		return telecommunicationPersonDao;
	}

	public void setTelecommunicationPersonDao(TelecommunicationPersonDao telecommunicationPersonDao) {
		
		this.telecommunicationPersonDao = telecommunicationPersonDao;
	}
	
	

}
