package com.telecommunication.dao;

import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.telecommunication.bo.SimBo;

public class TelecommunicationTRAIDaoImpl implements TelecommunicationTRAIDao{
	
	private static final String SAVE_SIM="insert into sim(id,size,type,simSerialNumber,simName) values(:id,:size,:type,:simSerialNumber,:simName )";

	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	public boolean saveSim(SimBo simBo) {
		System.out.println(simBo);
		boolean flag=false;
		try {
			System.out.println(simBo);
			BeanPropertySqlParameterSource source=new BeanPropertySqlParameterSource(simBo);
			
			namedParameterJdbcTemplate.update(SAVE_SIM, source);
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
