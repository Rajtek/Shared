/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shared.Model;


import java.util.List;

/**
 *
 * @author Rajtek
 */
public interface ControlerInterface {
    public void ReactToMessageLoginFailed();
    public void ReactToMessageLoginSuccessful(Player player, List<Table> tablesList);
    public void ReactToMessageTablesList(List<Table> tablesList);
    public void ReactToMessagePlayerList(Player[] playerList, int maxPlayers);
    public void ReactToMessagePlayersOnTable(Player[] playerlist);
}
