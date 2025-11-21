package edu.icet.util;

import edu.icet.db.DBConnection;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CrudUtil {
    public static <T>T execute(String sql, Object ...arg) throws SQLException {
        PreparedStatement pstm = DBConnection.getInstance().getConnection().prepareStatement(sql);
        for (int i = 0;i< arg.length;i++){
            pstm.setObject(i+1,arg[i]);
        }
        if (sql.startsWith("SELECT")||sql.startsWith("select")){
           return (T) pstm.executeQuery();
        }
        return (T) (Boolean)(pstm.executeUpdate()>0);
    }
}
