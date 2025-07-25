package com.jdbc.dao;

// import java.beans.Statement;
// import java.sql.Connection;
// import java.sql.PreparedStatement;
// import java.sql.ResultSet;
// import java.util.ArrayList;
// import java.util.List;

import com.jdbc.models.Bug;
import com.jdbc.util.DBUtil;

import java.util.*;
import java.sql.*;

public class BugDAO {

    public void insertBug(Bug bug) {
        Connection con = DBUtil.getConnection();
        try {
            PreparedStatement ps = con
                    .prepareStatement("INSERT INTO bugtable (title,description,status) VALUES (?,?,?)");
            ps.setString(1, bug.getTitle());
            ps.setString(2, bug.getDescription());
            ps.setString(3, bug.getStatus());
            ps.executeUpdate();
            System.out.println("Bug inserted sucessfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Bug> getAllBugs() {
        List<Bug> list = new ArrayList<>();
        Connection con = DBUtil.getConnection();
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM bugtable");
            while (rs.next()) {
                Bug b = new Bug();
                b.setId(rs.getInt("id"));
                b.setTitle(rs.getString("title"));
                b.setDescription(rs.getString("description"));
                b.setStatus(rs.getString("status"));
                list.add(b);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
