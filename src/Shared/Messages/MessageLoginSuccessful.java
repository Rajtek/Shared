/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shared.Messages;

import Shared.Model.User;
import Shared.Model.Room;
import java.util.List;

/**
 *
 * @author Rajtek
 */
public class MessageLoginSuccessful extends Message{
    User player;
    private List<Room> tablesList;
    public MessageLoginSuccessful(String source,User player,List<Room> tablesList) {
        super(source);
        this.player=player;
        this.tablesList=tablesList;
    }

    public User getUser() {
        return player;
    }

    public List<Room> getRoomsList() {
        return tablesList;
    }

    @Override
    public void performAction(Shared.Model.ControlerInterface controler) {
        controler.reactToMessageLoginSuccessful(player, tablesList);
    }
    
}
