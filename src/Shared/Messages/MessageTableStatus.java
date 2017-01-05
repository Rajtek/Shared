/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shared.Messages;

import Shared.Model.Table;

/**
 *
 * @author Rajtek
 */
public class MessageTableStatus extends Message{
   
    private final Table table;
    public MessageTableStatus(String source, Table table) {
        super(source);
        this.table=table;
    }

    public Table getTable() {
        return table;
    }
    
    @Override
    public void performAction(Shared.Model.ControlerInterface controler) {
        controler.reactToMessageTableStatus(table);
    }
    

}
