/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shared.Messages;

import Shared.Model.Room;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Rajtek
 */
public class MessageRoomsList extends Message implements Serializable{
    private List<Room> tablesList;
    public MessageRoomsList(String source, List<Room> tablesList) {
        super(source);
        this.tablesList=tablesList;
    }
    public List<Room> getRoomsList(){
        return tablesList;
    }

    @Override
    public void performAction(Shared.Model.ControlerInterface controler) {
        controler.reactToMessageRoomsList(tablesList);
    }
}
