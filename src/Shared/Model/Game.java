/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shared.Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rajtek
 */
public class Game implements Serializable {

    List<String> usedPhrases;
    String actualPhrase;
    private boolean gameStarted = false;

    public boolean isGameStarted() {
        return gameStarted;
    }

    public boolean checkPhrase(String answer) {
        return answer.equals(actualPhrase);
    }
    public String getActual(){
        return actualPhrase;
    }

    public String getNewPhrase() {
        boolean phraseUsed = true;
        String newPhrase=null;
        while (phraseUsed) {
            phraseUsed=false;
            newPhrase = Phrases.getPhrase();
            for (String s : usedPhrases) {
                if (s.equals(newPhrase)) {
                    phraseUsed = true;
                }
            }

        }
        actualPhrase = newPhrase;
        usedPhrases.add(newPhrase);
        return newPhrase;

    }

    public void startNewGame() {
        gameStarted = true;
        usedPhrases = new ArrayList<>();
        getNewPhrase();
    }

    void stopGame() {
        gameStarted = false;
        
    }

}
