# 🐞 Bug Tracker (JDBC + PostgreSQL Project)

## 📌 Project Overview

This is a **Java console application** that connects to a **PostgreSQL database** using **JDBC** to perform basic bug tracking operations. It demonstrates how to insert and retrieve bug records from a database.

---

## 🛠️ Technologies Used

- Java 21 (JDK)
- PostgreSQL
- JDBC
- Maven (optional, if using)
- pgAdmin / psql CLI (for DB access)

---

## 📁 Project Structure

com.jdbc
├── App.java # Default Maven app (unused here)
├── Main.java # Main class to test insert and view operations
│
├── dao
│ └── BugDAO.java # DAO class to handle DB operations
│
├── models
│ └── Bug.java # Bug model with fields: id, title, description, status
│
└── util
└── DBUtil.java # Database connection helper


---

## 🧪 Features

- Insert new bug reports into the database.
- Retrieve and display all bug records from the `bugtable`.

---

## 🧾 Example Output

Bug inserted successfully!
Bug inserted successfully!
ID: 1
Title: Login Issue
Status : Open
Description: Cannot log in with credentails
ID: 2
Title: Page not loading
Status : In Progress
Description: Infinite loader in dashboard


---

## 🗄️ Database Setup

Use the following SQL command to create the required table in PostgreSQL:

```sql
CREATE TABLE bugtable (
    id SERIAL PRIMARY KEY,
    title VARCHAR(255),
    description TEXT,
    status VARCHAR(100)
);
