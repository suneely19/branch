package com.telecommunication.dao;

import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.telecommunication.bo.Person;

public class TelecommunicationPersonDaoImpl implements TelecommunicationPersonDao {
	private static final String SAVE_ADVISOR="insert into advisor(id,firstName,lastName,middleName,idProof,age,gender,role,activities)values(:id,:firstName,:lastName,:middleName,:idProof,:age,:gender,:role,:activities)";
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	public boolean savePerson(Person person) {
		boolean flag=false;
		try {
			System.out.println(person);
		BeanPropertySqlParameterSource source=new BeanPropertySqlParameterSource(person);
		namedParameterJdbcTemplate.update(SAVE_ADVISOR, source);
		flag=true;
		}catch(Exception e) {
		flag=false;
		}
		return flag;
	}
	public NamedParameterJdbcTemplate getNamedParameterJdbcTemplate() {
		return namedParameterJdbcTemplate;
	}
	public void setNamedParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
		this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
	}
	
}
