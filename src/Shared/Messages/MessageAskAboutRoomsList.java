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
public class MessageAskAboutRoomsList extends Message{
    
    
    public MessageAskAboutRoomsList(String source) {
        super(source);
    }


    @Override
    public void performAction(Shared.Model.ControlerInterface controler) {
        controler.reactToMessageAskAboutRoomsList(source);
    }
}
