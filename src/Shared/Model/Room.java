/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shared.Model;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Rajtek
 */
public class Room implements Serializable{
    
    private final int id;
    private final Game game=new Game();
    private int maxUsers;
    private List<User> users = new ArrayList<>();
    private int drawingPlayerIndex=-1;
    
    public void startGame(){
        drawingPlayerIndex=(drawingPlayerIndex+1)%users.size();
        
        game.startNewGame();
    }
    
    public void stopGame() {
        game.stopGame();
    }
    
    public boolean isGameStarted(){
        return game.isGameStarted();
    }
    
    public String getNewPhrase(){
        return game.getNewPhrase();
    }
    public boolean checkAnswer(String answer){
        if(game.checkPhrase(answer)){
            drawingPlayerIndex=(drawingPlayerIndex+1)%users.size();
            return true;
        }
        return false;
    }
    public User getDrawingPlayer(){
        return users.get(drawingPlayerIndex);
    }
    
    
    public Room(int id){
        this.id = id;
    }
    public Room(int id, int maxUsers){
        this.id=id;
        this.maxUsers=maxUsers;

    }
    
    public void UserJoin(User user){
        
        if(!isFull()){
            users.add(user);
            
        }
        

        
    }
    public boolean isFull(){
        return users.size() >= maxUsers;
    }
    public void UserLeave(User user){
        
        users.remove(user);

    }

    
    
    public List<User> getUsers(){
        return users;
    }

    public int getId() {
        return id;
    }

    public int getNumberOfUsers() {
        return users.size();
    }
    

    public int getMaxUsers() {
        return maxUsers;
    }

    
    @Override 
    public String toString(){
        String temp = "#";
        temp += id;
        while (temp.length() < 5) {
            temp += " ";
        }
        
        while (temp.length() < 27) {
            temp += " ";
        }
        temp += "| " + getNumberOfUsers() + "/" + maxUsers;
        return temp;
    }

    
}
