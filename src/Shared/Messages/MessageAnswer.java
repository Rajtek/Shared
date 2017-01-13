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
public class MessageAnswer extends Message {

    private int id;
    private String answer;

    public MessageAnswer(String source, int id, String answer) {
        super(source);
        this.id = id;
        this.answer = answer;
    }

    @Override
    public void performAction(Shared.Model.ControlerInterface controler) {
        controler.reactToMessageAnswer(source, id, answer);
    }
}
