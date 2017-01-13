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
public class MessageUsersInRoom extends Message{
    private List<User> userList;

    public int getMaxUsers() {
        return maxUsers;
    }
    private int maxUsers;
    
    public MessageUsersInRoom(String source, List<User> userList, int maxUsers ) {
        super(source);
        this.userList=userList;
        this.maxUsers=maxUsers;
    }
    public List<User> getUsersList(){
        return userList;
    }

    @Override
    public void performAction(Shared.Model.ControlerInterface controler) {
        controler.reactToMessageUsersOnRoom(userList , maxUsers);
    }
    
}
