package com.kodewala.hotstar;

import com.kodewala.hotstar.user.User;

public class Driver {

    public static void main(String args[]) {

        User u1 = new User("HTO152", "Raj", "Paid");
        User u2 = new User("HOT123", "free");

        u1.displayUserDetails();
        u2.displayUserDetails();

        System.out.println("Total Users: " + User.LiveUserCount);
    }
}