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
public class MessageImage extends Message{
    
    private final int id;
    private final int[] data;
    
    public MessageImage(String source, int  id, int[] data) {
        super(source);
        this.id=id;
        this.data= data;
    }
    public int getID(){
        return id;
    }

    public int[] getData() {
        return data;
    }
    
    @Override
    public void performAction(Shared.Model.ControlerInterface controler) {
        controler.reactToMessageImage(source, id, data);
    }
    
}
