package com.jdbc;

import java.util.List;

import com.jdbc.dao.BugDAO;
import com.jdbc.models.Bug;

public class Main {
    public static void main(String[] args) {
        BugDAO dao = new BugDAO();
        dao.insertBug(new Bug("Login Issue", "Cannot log in with credentails", "Open"));
        dao.insertBug(new Bug("Page not loading", "Infinite loader in dashboard", "In Progress"));
        List<Bug> list = dao.getAllBugs();
        for (Bug b : list) {
            System.out.println("ID: " + b.getId());
            System.out.println("Title: " + b.getTitle());
            System.out.println("Status : " + b.getStatus());
            System.out.println("Description: " + b.getDescription());
        }
    }
}
