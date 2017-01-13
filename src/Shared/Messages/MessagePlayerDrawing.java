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
public class MessagePlayerDrawing extends Message{
    private final int id;
    private final String phrase;
    public MessagePlayerDrawing(String source, int id, String phrase) {
        super(source);
        this.id=id;
        this.phrase=phrase;
    }
    @Override
    public void performAction(Shared.Model.ControlerInterface controler) {
        controler.reactToMessagePlayerDrawing(phrase);
    }
    
}
