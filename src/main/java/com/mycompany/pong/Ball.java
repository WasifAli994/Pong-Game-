/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pong;
import java.awt.*;
import java.util.*;

/**
 *
 * @author Wasif Ali
 */
public class Ball extends Rectangle
{
    Random random;
    
    int xVelocity;
    int yVelocity;
    int initialSpeed = 2;
    
    Ball(int x, int y, int width, int height)
    {
        super(x,y,width,height);
        random = new Random();
        
        int randomXDirection = random.nextInt(2);
        if (randomXDirection == 0)
        {
            randomXDirection--;
        }
        setXDirection(randomXDirection * initialSpeed);
        
        int randomYDirection = random.nextInt(2);
        if (randomYDirection == 0)
        {
            randomYDirection--;
        }
        setYDirection(randomYDirection * initialSpeed);
    }
    public void setXDirection(int randomXDirection)
    {
        xVelocity = randomXDirection;
    }
    public void setYDirection(int randomYDirection)
    {
        yVelocity = randomYDirection;
    }
    public void move()
    {
        x += xVelocity;
        y += yVelocity;
    }
    public void draw(Graphics g)
    {
        g.setColor(Color.WHITE);
        g.fillOval(x,y,height,width);
    }
}
