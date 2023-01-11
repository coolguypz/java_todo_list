package com.example.java_todo_list.authenticate;

import org.springframework.stereotype.Service;

@Service
public class LoginAuthenticateController {

//    public LoginAuthenticateController(LoginAuthenticate loginAuthenticate) {
//        this.loginAuthenticate = loginAuthenticate;
//    }
//
//    private LoginAuthenticate loginAuthenticate;

//    public boolean loginValidation(String name,String pass){
//        Boolean isValidName = name.equalsIgnoreCase(loginAuthenticate.getUsername());
//        Boolean isValidPass = pass.equalsIgnoreCase(loginAuthenticate.getPassword());
//        return isValidName && isValidPass;
//    }
      public boolean loginValidation(String name,String pass){
        Boolean isValidName = name.equalsIgnoreCase("asf");
        Boolean isValidPass = pass.equalsIgnoreCase("1234");
        return isValidName && isValidPass;
      }
}
