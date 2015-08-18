package com.tecnomen.dna.cc.userdao;

import com.tecnomen.dna.pojo.UserBean;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.PreparedStatementCallback;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StatementCallback implements PreparedStatementCallback {

    public Object doInPreparedStatement(PreparedStatement ps)
            throws SQLException, DataAccessException {
        ResultSet rs = ps.executeQuery();
        UserBean userBean = new UserBean();
        userBean.setUserid(rs.getLong("id"));
        userBean.setUsername(rs.getString("user_name"));
        userBean.setPassword(rs.getString("password"));
        userBean.setRole(rs.getString("role"));
        userBean.setDisplayname(rs.getString("display_name"));

        userBean.setCreatedtime(rs.getTimestamp("created_time").getTime());
        userBean.setUpdatedtime(rs.getTimestamp("updated_time").getTime());
        return userBean;
    }

}
