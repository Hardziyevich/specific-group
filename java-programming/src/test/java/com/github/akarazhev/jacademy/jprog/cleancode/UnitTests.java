package com.github.akarazhev.jacademy.jprog.cleancode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class UnitTests {
    private UserService underTest;
    // 1. One assert per test:idea is to make tests very small and test every single action separately
    @Test
    public void testSaveClient() {
        User updatedClient = new User();
        // Given
        String clientId = "test_client";
        // When
        underTest.saveClient(clientId);
        // Then
        assertEquals(updatedClient.getNo(), clientId);
    }

    // 2. Single concept per test: testing concept group
    @Test
    public void testSaveGroup() {
        String userId = "";
        String userName = "";
        Group testGroup = new Group();
        // Given
        Group group = underTest.save(testGroup);
        // When
        underTest.saveGroup(group);
        // Then
        Group updatedGroup = underTest.getGroup(testGroup.getGroupId());
        // Group
        assertNotNull(updatedGroup);
        assertEquals(updatedGroup.getNo(), testGroup.getGroupId());
        assertEquals(updatedGroup.getName(), testGroup.getGroupName());
        // User
        assertNotNull(updatedGroup.getUser());
        assertEquals(updatedGroup.getUser().getNo(), userId);
        assertEquals(updatedGroup.getUser().getName(), userName);
    }

    private static class Group {
        private User user;

        public User getUser() {
            return user;
        }

        public String getNo() {
            return "";
        }

        public String getName() {
            return "";
        }

        public String getGroupId() {
            return "";
        }

        public String getGroupName() {
            return "";
        }
    }

    private static class User {
        private User role;

        public String getNo() {
            return "";
        }

        public String getName() {
            return "";
        }

        boolean isAdmin() {
            return false;
        }

        public User getRole() {
            return role;
        }

        public void setRole(User role) {
            this.role = role;
        }
    }

    private static class UserService {

        public void saveClient(String clientId) {
        }

        public Group save(Group group) {
            return new Group();
        }

        public void saveGroup(Group group) {
        }

        public Group getGroup(String groupId) {
            return new Group();
        }
    }
}
