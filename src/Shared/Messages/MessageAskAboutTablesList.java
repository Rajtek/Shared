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
public class MessageAskAboutTablesList extends Message{
    
    
    public MessageAskAboutTablesList(String source) {
        super(source);
    }


    @Override
    public void performAction(Shared.Model.ControlerInterface controler) {
        controler.reactToMessageAskAboutTablesList(source);
    }
}
