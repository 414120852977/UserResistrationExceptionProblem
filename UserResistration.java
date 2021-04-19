package com.bridgelabz;

import javax.naming.InvalidNameException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class UserResistration {
    final String namePattern = "^[A-Z]{1}[a-z]{2,}$";
    final String lastNamePattern = "^[A-Z]{1}[a-z]{2,}$";
    final String emailPattern  ="^[a-zA-Z0-9]{1,}[.a-zA-Z0-9]*@[a-zA-Z0-9]{1,}((.){1}+)([a-z]{1,3}+)(.[a-z]{2})*$";
    final String phoneNoPattern = "^[0-9]{2}[\\s][0-9]{10}$";
    final String passwordPattern = "^[A-Z]{1}[a-z]{3,10}[@,&,$,_]{1}[0-9]{1,10}";

    /**
     * in first case we have to check first name if user entered first name and i draw a pattern for name if user not meet criteria
     * user throw an cusytom exception message
     */

    public void checkFirstName() {
        try {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a name :");
        String fName = sc.nextLine();

        if(Pattern.matches(namePattern,fName)) {
            System.out.println("pattern match it is correct");
        }
        else {
            throw new InvalidNameEnteredException("enter a valid first name");

        }
        } catch (InvalidNameEnteredException e) {
            System.out.println(e.errormessage);
            checkFirstName();
        }
    }
    /**
     * in first case we have to check last name if user entered last name and i draw a pattern for name if user not meet criteria
     * user throw an cusytom exception message
     */
    public void checkLastName() {
        try {
        System.out.println("enter a last name:");
        Scanner sc = new Scanner(System.in);
        String lName = sc.nextLine();

        if (Pattern.matches(lastNamePattern, lName)) {
            System.out.println("pattern match . you entered valid name");
        } else {
            throw new InvalidNameEnteredException("invalid last name");
        }
    }catch (InvalidNameEnteredException e) {
            System.out.println(e.errormessage);
            checkLastName();
        }
    }
    /**
     * in first case we have to check email id if user entered email id and i draw a pattern for name if user not meet criteria
     * user throw an cusytom exception message
     */
    public void checkEmailId() {
        try {
            System.out.println("enter your email id");
            Scanner sc = new Scanner(System.in);
            String emailId = sc.nextLine();

            if (Pattern.matches(emailPattern, emailId)) {
                System.out.println("you enterd emailid is valid");
            } else {
                throw new InvalidNameEnteredException("invalid email id");
            }
        }catch (InvalidNameEnteredException e) {
            System.out.println(e.errormessage);
            checkEmailId();
        }
    }
    /**
     * in first case we have to check phone no if user entered phone no and i draw a pattern for name if user not meet criteria
     * user throw an cusytom exception message
     */

    public void checkPhoneNo() {
        try {
            System.out.println("Enter a mobile no:");
            Scanner sc = new Scanner(System.in);
            String mobileNo = sc.nextLine();

            if (Pattern.matches(phoneNoPattern, mobileNo)) {
                System.out.println("phone no match");
            } else {
                throw new InvalidNameEnteredException("invalid mobile no");
            }
        }catch (InvalidNameEnteredException e) {
            System.out.println(e.errormessage);
            checkPhoneNo();
        }
    }
    /**
     * in first case we have to check password if user entered password and i draw a pattern for name if user not meet criteria
     * user throw an cusytom exception message
     */

    public void  checkPassword() {
        try {
            System.out.println("enter a password");
            Scanner sc = new Scanner(System.in);
            String password = sc.nextLine();

            if (Pattern.matches(passwordPattern, password)) {
                System.out.println("password match");
            } else {
                throw new InvalidNameEnteredException("password invalid");
            }
        }catch(InvalidNameEnteredException e) {
            System.out.println(e.errormessage);
            checkPassword();
        }
    }
}
