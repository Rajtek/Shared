/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shared.Messages;

/**
 *
 * @author Rajtek
 */
public class MessageLogin extends Message {
    
    private final String login;
    
    
    public MessageLogin(String source, String login) {
        super(source);
        this.login=login;
    }
    public String getLogin(){
        return login;
    }

    @Override
    public void performAction(Shared.Model.ControlerInterface controler) {
        controler.reactToMessageLogin(source, login);
    }
    
}
