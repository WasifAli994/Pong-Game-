/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pong;
import java.awt.*;

/**
 *
 * @author Wasif Ali
 */
public class Score extends Rectangle
{
    static int GAME_WIDTH;
    static int GAME_HEIGHT;
    int player1;
    int player2;
    
    Score(int GAME_WIDTH, int GAME_HEIGHT)
    {
        Score.GAME_WIDTH = GAME_WIDTH;
        Score.GAME_HEIGHT = GAME_HEIGHT;
    }
    public void draw(Graphics g)
    {
        g.setColor(Color.WHITE);
        g.setFont(new Font("Consolas",Font.PLAIN,60));
        
        g.drawLine(GAME_WIDTH/2, 0, GAME_WIDTH/2, GAME_HEIGHT);
        
        g.drawString(String.valueOf(player1), (GAME_WIDTH/2) - 85, 50);
        g.drawString(String.valueOf(player2),(GAME_WIDTH/2) + 20, 50);
    }
}
