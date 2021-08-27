package com.example.javabasic.day7.junit_Mockito.mockito.program1;

public class Service {

    private Database database;

    public Service(Database database) {
        this.database = database;
    }

    public boolean query(String query) {
        return database.isAvailable();
    }


    @Override
    public String toString() {
        return "Using database with id: " + String.valueOf(database.getUniqueId());
    }
}
