/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shared.Messages;

import Shared.Model.Player;
import java.util.List;

/**
 *
 * @author Rajtek
 */
public class MessagePlayerList extends Message{
    private Player[] players = new Player[10];
    private int maxPlayers;
    
    public int getMaxPlayers() {
        return maxPlayers;
    }
    
    
    public MessagePlayerList(String source, Player[] players, int maxPlayers ) {
        super(source);
        this.players=players;
        this.maxPlayers=maxPlayers;
    }
    public Player[] getPlayersList(){
        return players;
    }

    @Override
    public void performAction(Shared.Model.ControlerInterface controler) {
        controler.ReactToMessagePlayerList(players, maxPlayers);
    }
    
}
