/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shared.Messages;

import Shared.Model.Room;

/**
 *
 * @author Rajtek
 */
public class MessageRoomStatus extends Message{
   
    private final boolean gameStarted;
    private final int id;
    public MessageRoomStatus(String source, boolean gameStarted, int id) {
        super(source);
        this.gameStarted=gameStarted;
        this.id=id;
    }
    @Override
    public void performAction(Shared.Model.ControlerInterface controler) {
        controler.reactToMessageRoomStatus(gameStarted, id);
    }
    

}
