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
    public void reactToMessageLoginSuccessful(User user, List<Room> roomsList);
    public void reactToMessageRoomsList(List<Room> roomsList);
    public void reactToMessageUserList(List<User> userList, int maxUsers, int id);
    public void reactToMessageUsersOnRoom(List<User> userlist, int id);
    public void reactToMessageAnswer(String source, int id, String answer);
    
    public void reactToMessageImage(String source, int id, int[] data);
    
    public void reactToMessageTextMsg(String login, String msg);

    public void reactToMessageLogin(String source, String login);
    public void reactToMessageAskAboutRoomsList(String source);
    public void reactToMessageAskAboutRoom(String source, int id);
    public void reactToMessageJoinRoom(String source, int id);
    public void reactToMessageRoomStatus(boolean gameStarted, int id);

    public void reactToMessagePlayerDrawing(String phrase);

    public void reactToMessageGameStopped();

    public void reactToMessageGoodAnswer(String source, int id, String answer);
}
