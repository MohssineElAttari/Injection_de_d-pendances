package com.injection.injection_de_dependances;

public class UserService {
    private UserDAO userDAO = new UserDAO();
    public String getFullName(){
        String[] userInfo = userDAO.getUsers();
        return userInfo[0]+" - "+userInfo[1];
    }


}
