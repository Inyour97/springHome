package com.example.account.dto;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;

public class SubjectsDAO {

    private final String url = "jdbc:sqlserver://localhost:1433;databaseName=mainDB;encrypt=false";
    private final String user = "sa";
    private final String password = "inyour51203!";

    public Map<String, String> getTimeTable() {
        Map<String, String> timetable = new HashMap<>();
        String sql = "SELECT COL01, COL02 FROM dbo.temp WHERE KEY_VAL = 'CLASS_SUBJECT'";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                String rawKey = rs.getString("COL01"); // 예: MON.1
                String value = rs.getString("COL02");  // 예: 국어

                if (rawKey != null && value != null) {
                    String key = rawKey.replace(".", "_"); // → MON_1 형식
                    timetable.put(key, value);
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return timetable;
    }
}
