package com.tutorial.mytutorialapp.user;

public class UserNotFoundException  extends Throwable {
    public UserNotFoundException(String message){
        super(message);
    }
}
