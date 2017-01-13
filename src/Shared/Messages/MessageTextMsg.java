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
public class MessageTextMsg extends Message{
    String msg;
    String login;
    public MessageTextMsg(String source, String login, String msg) {
        super(source);
        this.login=login;
        this.msg=msg;
    }
    
    @Override
    public void performAction(Shared.Model.ControlerInterface controler) {
        
        controler.reactToMessageTextMsg(login, msg);
    }
    
}
