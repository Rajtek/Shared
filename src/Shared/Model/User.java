/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shared.Model;

import java.io.Serializable;

/**
 *
 * @author Rajtek
 */
public class User implements Serializable{

    private String login;
    public enum Status{
        NONE, FOLD, CALLED, ALLIN, CHECK, CANTPLAY;
    }
    Status state;
    
    public User(String login) {
        state = Status.NONE;
        this.login = login;
    }

    public Status getState() {
        return state;
    }

    public void setState(Status state) {
        this.state = state;
    }

    public String getLogin() {
        return login;
    }
    
    @Override
    public String toString(){
        return login;
    }

}
