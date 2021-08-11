package com.github.akarazhev.jacademy.jprog.cleancode;

import java.net.URL;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Naming {
    // 1. Use intention revealing names
    // Good
    public Date modifiedDate;
    public List<Testcase> findAllTestcasesByUser(User user) {
        return Collections.emptyList();
    }
    // Bad
    public Date d; // modified date
    public List<Testcase> find(User user) { // find all Testcases by User
        return Collections.emptyList();
    }

    // 2. Avoid misinformation
    // Good
    {
        List<Account> AccountList;
    }
    // Bad
    {
        Account[] AccountList; // use Suffix List, if it is really a List
    }

    // 3. No need for prefixes
    // Good
    void deleteUser(User user) {
    }
    // Bad
    void deletePUser(User pUser) { // no need for prefix p for parameters
    }

    // 4. Avoid mental mapping
    // Good
    public URL url;
    // Bad
    public URL r; // not everybody would think r will be url

    // 5. Class names should be noun, function names should be verb
    // Good
    public class TableRepresenter {
    }

    public void saveCar() {
    }
    // Bad
    public class TableRepresent {
    }

    public void car() { // unless it is constructor
    }

    // 6. Pick one word for concept
    // Good
    public void saveUser() {
    }

    public void saveAccount() {
    }

    public void saveContract() {
    }
    // Bad
    public void savePerson() {
    }

    public void createAccount() {
    }

    public void generateContract() {
    }

    // 7. Use Solution Domain Names
    // Good
    public static class AccountFactory { // Factory Pattern
    }
    public static class AccountObserver { // Observer Pattern
    }

    // 8. Use Problem Domain Names
    // Good
    public static class User { // taking "User" as a Use Case for same context
    }
    public String userName;
    public void editUser(User user) {
    }

    // 9. Don't use too long namings
    // Good
    public void saveUnderage() {
    }

    public static class UserFiller {
    }
    // Bad
    public void saveIfUserUnder18() {
    }

    public static class UserFormRealTimeFiller {
    }

    // 10. Use constants, enums instead of magic numbers, abbreviations
    // Good
    public enum Calendar {
        DAYS_IN_YEAR(360),
        HOURS_IN_WEEK(168);

        Calendar(int value) {
        }
    }
    // Bad
    public int daysInYear = 360;
    public int hoursInWeek = 168;
    // Dependencies
    public static class Testcase {
    }

    public static class Account {
    }
}


