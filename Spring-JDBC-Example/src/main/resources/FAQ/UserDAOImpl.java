package com.tecnomen.dna.cc.userdao;

import com.tecnomen.dna.pojo.UserBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;
import java.util.Map;

/**
 * @author muniyma
 */

@Component
public class UserDAOImpl implements UserDAO {

    @Autowired
    private DataSource dataSource;
    /**
     * add All SQL's here...
     */

    private static String INSERT_USER = "insert into user(user_name,password,role,display_name,updated_time) values(?,?,?,?,?)";
    private static String UPDATE_USER = "update user set password=?,role=?,display_name=?,updated_time=? where id=?";
    private static String GET_USERS = "select id,user_name,password,role,display_name,created_time,updated_time from user";
    private static String DELETE_USER = "delete from user";

    public void setDataSource(DataSource dataSource1) {
        this.dataSource = dataSource1;
    }

    public Integer addUser(UserBean userBean) throws Exception {

        try {

            StatementSetter setter = new StatementSetter(userBean);
            return getJdbcTemplate().update(INSERT_USER, setter);
        } catch (DataAccessException e) {
            throw new Exception(e);
        } catch (Exception e) {
            throw e;
        }

    }

    public Integer deleteUser(String key, String value) throws Exception {
        String tempsql = "";
        try {
            if (key != null) {
                tempsql = DELETE_USER + " where " + key + "=?";
                return getJdbcTemplate().update(tempsql, new Object[]{value});
            }
        } catch (DataAccessException e) {
            throw new Exception(e);
        } catch (Exception e) {
            throw e;
        }
        return getJdbcTemplate().update(tempsql);

    }

    public List<UserBean> getAllUsers(int start, int end) throws Exception {
        List<UserBean> userBean = null;
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        try {
            StatementCreator creator = new StatementCreator(GET_USERS, start, end);
            userBean = jdbcTemplate.query(creator, new UserBeanRowMapper());
        } catch (DataAccessException e) {
            throw new Exception(e);
        } catch (Exception e) {
            throw e;
        }
        return userBean;
    }

    @SuppressWarnings("unchecked")
    public UserBean getUser(String key, String value, int start, int end) throws Exception {
        List<UserBean> userBean = null;

        try {
            StatementCreator creator = new StatementCreator(key, value, GET_USERS, start, end);
            userBean = getJdbcTemplate().query(creator, new UserBeanRowMapper());
        } catch (DataAccessException e) {
            throw new Exception(e);
        } catch (Exception e) {
            throw e;
        }
        if (userBean != null && userBean.size() > 0)
            return userBean.get(0);
        return null;
    }

    public List<UserBean> searchUserList(Map<String, Object> keyvalue, int start, int end) throws Exception {

        List<UserBean> userBean = null;
        try {
            StatementCreator creator = new StatementCreator(keyvalue, GET_USERS, start, end);
            userBean = getJdbcTemplate().query(creator, new UserBeanRowMapper());
        } catch (DataAccessException e) {
            throw new Exception(e);
        } catch (Exception e) {
            throw e;
        }
        return userBean;
    }

    public Integer updateUser(UserBean userBean) throws Exception {
        StatementSetter setter = new StatementSetter(userBean);
        try {
            return getJdbcTemplate().update(UPDATE_USER, setter);
        } catch (DataAccessException e) {
            throw new Exception(e);
        } catch (Exception e) {
            throw e;
        }
    }

    private JdbcTemplate getJdbcTemplate() {
        return new JdbcTemplate(dataSource);
    }
}
