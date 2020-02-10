package com.wf.ew.common;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

public class ListStringTypeHandler extends BaseTypeHandler<List<String>> {
    /** 分隔符 */
    public static final String DELIMITER = ",";

    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, List<String> strings, JdbcType jdbcType) throws SQLException {
        StringBuilder sb = new StringBuilder();
        for (String s : strings) {
            sb.append(s).append(DELIMITER);
        }
        preparedStatement.setString(i, sb.toString());
    }

    @Override
    public List<String> getNullableResult(ResultSet resultSet, String s) throws SQLException {
        String string = resultSet.getString(s);
        if (string == null || string.equals("")) {
            return null;
        }
        String[] strings = string.split(DELIMITER);
        return Arrays.asList(strings);
    }

    @Override
    public List<String> getNullableResult(ResultSet resultSet, int i) throws SQLException {
        String string = resultSet.getString(i);
        if (string == null || string.equals("")) {
            return null;
        }
        String[] strings = string.split(DELIMITER);
        return Arrays.asList(strings);
    }

    @Override
    public List<String> getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        String string = callableStatement.getString(i);
        if (string == null || string.equals("")) {
            return null;
        }
        String[] strings = string.split(DELIMITER);
        return Arrays.asList(strings);
    }
}
