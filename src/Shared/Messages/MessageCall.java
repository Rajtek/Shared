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
public class MessageCall extends Message{
    private final int call;
    public MessageCall(String source, int call) {
        super(source);
        this.call=call;
    }

    public int getCall() {
        return call;
    }
    
    @Override
    public void performAction(Shared.Model.ControlerInterface controler) {
        controler.reactToMessageCall(call);
    }
    
}
