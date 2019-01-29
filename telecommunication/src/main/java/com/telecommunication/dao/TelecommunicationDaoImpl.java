package com.telecommunication.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.telecommunication.bo.Person;
import com.telecommunication.bo.SimBo;
import com.telecommunication.exception.TelecomAdvisorException;

public class TelecommunicationDaoImpl implements TelecommunicationDao{
	
	
	private static final String SAVE_ADVISOR="insert into advisor(id,firstName,lastName,middleName,idProof,age,gender,role,activities)values(:id,:firstName,:lastName,:middleName,:idProof,:age,:gender,:role,:activities)";
	private static final String SAVE_SIM="insert into sim(id,size,type,simSerialNumber,simName) values(:id,:size,:type,:simSerialNumber,:simName )";
	

	private NamedParameterJdbcTemplate namedParameterJdbcTempplate;
	public boolean saveSim(SimBo simBo) {
		
		boolean flag=false;/*
		Map values = new HashMap();
		values.put("?",(Integer) simBo.getId());
		values.put("?", simBo.getSize());
		values.put("?", simBo.getType());
		values.put("?",simBo.getSimSerialNumber());
		values.put("?", simBo.getSimName());*/
		
		BeanPropertySqlParameterSource propertySource=new BeanPropertySqlParameterSource(simBo);
		try {
		namedParameterJdbcTempplate.update(SAVE_SIM,propertySource);
		flag=true;
		}catch (Exception e) {
			throw new RuntimeException("while storing problem occured",e);
		}
		return flag;
	}

	public boolean saveAdvisor(Person person) {
		boolean flag=false;
		BeanPropertySqlParameterSource advisor=new BeanPropertySqlParameterSource(person);
		try {
		namedParameterJdbcTempplate.update(SAVE_ADVISOR, advisor);
		flag=true;
		}catch (Exception e) {
			flag=false;
			throw new TelecomAdvisorException("while saving Advisor problem occured",e);
		}
		return flag;
	}

	public boolean saveCustomer(Person person, SimBo simBo) {
		// TODO Auto-generated method stub
		return false;
	}

	public NamedParameterJdbcTemplate getNamedParameterJdbcTempplate() {
		return namedParameterJdbcTempplate;
	}

	public void setNamedParameterJdbcTempplate(NamedParameterJdbcTemplate namedParameterJdbcTempplate) {
		this.namedParameterJdbcTempplate = namedParameterJdbcTempplate;
	}

}
