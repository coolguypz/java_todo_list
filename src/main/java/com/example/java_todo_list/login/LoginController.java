package com.example.java_todo_list.login;

import com.example.java_todo_list.authenticate.LoginAuthenticateController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    public LoginController(LoginAuthenticateController loginAuthenticateController) {
        this.loginAuthenticateController = loginAuthenticateController;
    }

    private LoginAuthenticateController loginAuthenticateController;

    @RequestMapping(value = "/login",method = RequestMethod.GET)
//    @ResponseBody
    public String goToLoginPage(){
        return "login";
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String goToWelcomePage(@RequestParam String name, @RequestParam String pass, ModelMap model){
        if(loginAuthenticateController.loginValidation(name,pass)){
            return "welcome";
        }
        model.put("errorMessage","please enter again");
        return "login";

    }
}
