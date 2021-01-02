/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pong;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Wasif Ali
 */
public class GameFrame extends JFrame
{
    GamePanel panel;
    
    GameFrame()
    {
        panel = new GamePanel();
        this.add(panel);
        this.setTitle("Pong");
        this.setResizable(false);
        this.setBackground(Color.BLACK);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);

    }
}
