package com.keepthinker.dao.support;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.log4j.Logger;
import org.springframework.jdbc.core.JdbcTemplate;

import com.keepthinker.HelloChina;
import com.keepthinker.dao.CountryDAO;

public class CountryJDBCTemplate implements CountryDAO{
	private Logger logger=Logger.getLogger(CountryJDBCTemplate.class);
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;

	@Override
	public void setDataSource(DataSource ds) {
		this.dataSource=ds;
		this.jdbcTemplateObject=new JdbcTemplate(ds);
	}

	@Override
	public void create( HelloChina area) {
		String createSQL="insert into country(capital,president,population)values(?,?,?)";
		jdbcTemplateObject.update(createSQL, area.getCapital().getName(),area.getPresident().getName(),area.getPeople().getPopulation());
		logger.debug("Number active:"+((BasicDataSource)dataSource).getNumActive());
		logger.debug("insert a record");
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(int id, HelloChina area) {
		// TODO Auto-generated method stub

	}

}
