/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shared.Model;

import java.io.Serializable;

/**
 *
 * @author Rajtek
 */
public class Table implements Serializable{
    
    private final int id;
    private int numberOfPlayers=0;
    private int maxPlayers;
    private int blind;
    private int turn;
    private boolean gameStarted=false;
    private Player[] players = new Player[10];

    
    public Table(int id){
        this.id = id;
    }
    public Table(int id, int maxPlayers, int blind){
        this.id=id;
        this.maxPlayers=maxPlayers;
        this.blind=blind;
        for(int i=0; i<10; i++){
            players[i]=null;
        }
    }
    
    public void PlayerJoin(Player player){
        
        if(!isFull()){
            for(int i=0; i<10; i++){
                if (players[i]==null){
                    players[i]=player;
                    break;
                }
            }
            numberOfPlayers++;
            
        }
        
        if(getNumberOfPlayers()>1) gameStarted=true;
        else gameStarted=false;
        
    }
    public boolean isFull(){
        return numberOfPlayers >= maxPlayers;
    }
    public void PlayerLeave(Player player){
        
        for(int i=0; i<10; i++){
            if (players[i]==player){
                players[i]=null;
                numberOfPlayers--;
                break;
            }
        }
        
        if(getNumberOfPlayers()>1) gameStarted=true;
        else gameStarted=false;
    }

    public boolean isGameStarted() {
        return gameStarted;
    }

    public void setGameStarted(boolean gameStarted) {
        this.gameStarted = gameStarted;
    }
    
    
    public Player[] getPlayers(){
        return players;
    }

    public int getId() {
        return id;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public int getMaxPlayers() {
        return maxPlayers;
    }

    public int getBlind() {
        return blind;
    }
    @Override 
    public String toString(){
        String temp = "#";
        temp += id;
        while (temp.length() < 5) {
            temp += " ";
        }
        temp += "| " + blind + "$/" + blind * 2 + "$";
        while (temp.length() < 27) {
            temp += " ";
        }
        temp += "| " + numberOfPlayers + "/" + maxPlayers;
        return temp;
    }
}
