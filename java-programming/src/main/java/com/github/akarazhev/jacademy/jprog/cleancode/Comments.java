package com.github.akarazhev.jacademy.jprog.cleancode;

import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Comments {

    // Good Comments
    // 1. Legal comments

    // Copyright (C) 2003,2004,2005 by Object Mentor, Inc. All rights reserved.
    // Released under the terms of the GNU General Public License version 2 or later.

    // 2. TODO comments
    // TODO this method should be removed with next release
    public void checkRelease() {
        // some business logic here
    }

    // 3. JavaDocs in public Api
    /**
     * <p> this method publishes results based on date
     * </p>
     * @param date date from when results should be published
     * @return List of Result entities
     * @since 16.0
     */
    public List<Result> publishResults(Date date) {
        // some business logic here
        return Collections.emptyList();
    }

    // Bad Comments
    // 1. Redundant, misleading, old comments
    // Redundant
    // this method delivers owner of testcase
    public Owner getTestcaseOwner(Testcase testcase) { // comment above not needed, since method reveals all intend
        return new Owner();
    }
    // Misleading
    // returns hours in month
    public Hours getHoursInQuarter() { // incorrect comment
        return new Hours();
    }
    // Old Comments
    // returns Admin of a group
    public User getPrivilegedUser() { // code has changed from returning admin to returning user with some privileges, but comment is still old one
        return new User();
    }
    // 2. Commented-Out Code
    // Bad: who needs this commented method??
    //public void checkXMLParser(){
    //   // some business logic here
    //}
    // Good: here we known why we should not remove this method
    // This method will be used for User Story: see ticket Jira-456
    // public void checkXMLParser(){
    //   // some business logic here
    //}
    // 3. Too much information
    /*
     * This class evaluates the overview of testcases which are cancelled from client
     * the reasons of cancellation play a role in evaluation blablabla
     */
    // Dependencies
    private static class Testcase {
    }

    private static class Owner {
    }

    private static class Result {
    }

    private static class Hours {
    }

    private static class User {
    }
}