package com.bridgelabz;

public class InvalidNameEnteredException extends Exception{
    String errormessage;

    public InvalidNameEnteredException( String errormessage) {
        this.errormessage = errormessage;
    }


}
