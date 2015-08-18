package com.tecnomen.dna.cc.userdao;

import com.tecnomen.dna.pojo.UserBean;
import org.springframework.jdbc.core.PreparedStatementCreator;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Map;
import java.util.Set;

/**
 * @author muniyma
 */
@SuppressWarnings("unused")
public class StatementCreator implements PreparedStatementCreator {

    private UserBean userBean;
    private Map<String, Object> keyValue;
    private String prepareStmt = "";
    private String key;
    private String value;

    String paginationSql = "";

    public StatementCreator(String preSql, int start, int end) {
        String tempSql = "";
        tempSql += " order by user_name asc  ";
        if (start >= 0 && end > 0) {
            tempSql += " linit " + start + "," + end + "";

        }

        this.prepareStmt = preSql + tempSql;
    }

    public StatementCreator(UserBean userBean, String preSql, int start, int end) {
        this.userBean = userBean;
        this.prepareStmt = preSql;
        String tempSql = "";
        if (start >= 0 && end > 0) {
            tempSql += " order by user_name asc limit " + start + "," + end
                    + "";

        }
        this.prepareStmt = preSql + tempSql;
        // TODO Auto-generated constructor stub
    }

    public StatementCreator(Map<String, Object> keyValue, String preSql,
                            int start, int end) {
        String tempSql = " where (";
        this.keyValue = keyValue;
        this.prepareStmt = preSql;
        Set<String> keyset = keyValue.keySet();
        for (String key : keyset) {
            tempSql += key + "='" + keyValue.get(key) + "'  && ";
        }
        tempSql = tempSql.substring(0, tempSql.lastIndexOf("&&"));
        tempSql += ")";

        if (start >= 0 && end > 0) {
            tempSql += " order by user_name asc limit " + start + "," + end
                    + "";

        }

        this.prepareStmt += tempSql;
    }

    public StatementCreator(String key, String value, String preSql, int start,
                            int end) {
        String tempSql = "  where ";
        this.prepareStmt = preSql;
        this.key = key;
        this.value = value;
        tempSql += key + "='" + value + "'";

        if (start >= 0 && end > 0) {
            tempSql += " order by user_name as limit " + start + "," + end
                    + "";

        }
        prepareStmt = preSql + tempSql;
    }

    public PreparedStatement createPreparedStatement(Connection con)
            throws SQLException {

        PreparedStatement ps = con.prepareStatement(prepareStmt);

        return ps;

    }

}
