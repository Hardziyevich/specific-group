package com.github.akarazhev.jacademy.jprog.cleancode;

public class ObjectsAndDataStructures {
    // 1. Use abstract objects over data structures
    // Instead of using this kind of Data Structure:
    private class UserA {
        private String name;
        private String role;
        // public getters, setters

    }
    // Use this kind of abstract Objects with implementation that is unknown to user of this data
    private interface User {
        String getName();
        String getRole();
        void setName(String name);
        void setRole(String role);
    }

    // 2. User DTOs for raw data transformation
    private class ErrorDTO{
        public String Message;
        public Error Error;
        public Exception Exception;
    }
}
