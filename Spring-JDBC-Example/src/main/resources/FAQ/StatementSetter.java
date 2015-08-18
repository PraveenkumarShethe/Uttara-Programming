package com.tecnomen.dna.cc.userdao;

import com.tecnomen.dna.pojo.UserBean;
import org.springframework.jdbc.core.PreparedStatementSetter;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;

public class StatementSetter implements PreparedStatementSetter {
    private UserBean userBean;

    public StatementSetter(UserBean userBean) {
        this.userBean = userBean;
    }

    public void setValues(PreparedStatement ps) throws SQLException {
        if (userBean.getUserid() > 0) {
            ps.setString(1, userBean.getPassword());
            ps.setString(2, userBean.getRole());
            ps.setString(3, userBean.getDisplayname());
            ps.setTimestamp(4, new Timestamp(userBean.getUpdatedtime()));
            ps.setLong(5, userBean.getUserid());
        } else {
            ps.setString(1, userBean.getUsername());
            ps.setString(2, userBean.getPassword());
            ps.setString(3, userBean.getRole());
            ps.setString(4, userBean.getDisplayname());
            ps.setTimestamp(5, new Timestamp(userBean.getUpdatedtime()));

        }

    }

}
