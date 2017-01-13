/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shared.Messages;

import Shared.Model.User;
import java.util.List;

/**
 *
 * @author Rajtek
 */
public class MessageUsersList extends Message{
    private List<User> players;
    private final int maxUsers;
    private final int id;
    public int getMaxUsers() {
        return maxUsers;
    }
    
    
    public MessageUsersList(String source, List<User> players, int maxUsers, int id ) {
        super(source);
        this.players=players;
        this.maxUsers=maxUsers;
        this.id=id;
    }

    public int getId() {
        return id;
    }
    
    public List<User> getUsersList(){
        return players;
    }

    @Override
    public void performAction(Shared.Model.ControlerInterface controler) {
        controler.reactToMessageUserList(players, maxUsers, id);
    }
    
}
