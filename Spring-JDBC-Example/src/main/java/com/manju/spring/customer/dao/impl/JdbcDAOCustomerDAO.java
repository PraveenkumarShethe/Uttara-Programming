package com.manju.spring.customer.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.manju.spring.customer.dao.CustomerDAO;
import com.manju.spring.customer.model.Customer;

public class JdbcDAOCustomerDAO extends JdbcDaoSupport implements CustomerDAO {

	public void insert(Customer customer) {

		String sql = "INSERT INTO CUSTOMER "
				+ "(CUST_ID, NAME, AGE) VALUES (?, ?, ?)";

		getJdbcTemplate().update(
				sql,
				new Object[] { customer.getCustId(), customer.getName(),
						customer.getAge() });

	}

	@Override
	public Customer findByCustomerId(int custId) {
		// TODO Auto-generated method stub
		return null;
	}

}
