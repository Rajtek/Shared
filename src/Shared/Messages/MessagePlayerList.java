/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shared.Messages;

import Shared.Model.Player;

/**
 *
 * @author Rajtek
 */
public class MessagePlayerList extends Message{
    private Player[] players = new Player[10];
    private final int maxPlayers;
    private final int id;
    public int getMaxPlayers() {
        return maxPlayers;
    }
    
    
    public MessagePlayerList(String source, Player[] players, int maxPlayers, int id ) {
        super(source);
        this.players=players;
        this.maxPlayers=maxPlayers;
        this.id=id;
    }

    public int getId() {
        return id;
    }
    
    public Player[] getPlayersList(){
        return players;
    }

    @Override
    public void performAction(Shared.Model.ControlerInterface controler) {
        controler.reactToMessagePlayerList(players, maxPlayers, id);
    }
    
}
