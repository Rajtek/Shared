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
    public void reactToMessageLoginFailed();
    public void reactToMessageLoginSuccessful(Player player, List<Table> tablesList);
    public void reactToMessageTablesList(List<Table> tablesList);
    public void reactToMessagePlayerList(Player[] playerList, int maxPlayers, int id);
    public void reactToMessagePlayersOnTable(Player[] playerlist, int id);
    
    
    public void reactToMessageCall(int call);
    public void reactToMessageCheck();
    public void reactToMessageFold();
    public void reactToMessageLogin(String source, String login);
    public void reactToMessageAskAboutTablesList(String source);
    public void reactToMessageAskAboutTable(String source, int id);
    public void reactToMessageJoinTable(String source, int id);
    public void reactToMessageTableStatus(Table table);
}
