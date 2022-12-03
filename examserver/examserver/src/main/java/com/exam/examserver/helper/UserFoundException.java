package com.exam.examserver.helper;

import com.exam.examserver.model.User;

public class UserFoundException extends Exception {
    public UserFoundException(){
        super("User with this username is already there in DB !! try with another one");
    }

    public UserFoundException(String msg){ super(msg);}

}
