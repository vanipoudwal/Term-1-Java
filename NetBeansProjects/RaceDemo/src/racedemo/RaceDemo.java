
package racedemo;

import java.util.*;
import javax.swing.*;
import java.awt.*;

public class RaceDemo implements Runnable
{
    String ThreadName;
    JLabel l;
    JPanel p1, p2, p3;
    JFrame fr;
    
    public RaceDemo()
    {
        buildGUI();
    }
    
    public void Run()
    {
        if(Thread.currentThread().getName().equals("ObstacleA"))
        {
            runObstacleA();
        }
        if(Thread.currentThread().getName().equals("ObstacleB"))
        {
            runObstacleB();
        }
        if(Thread.currentThread().getName().equals("ObstacleC"))
        {
            runObstacleC();
        }
    }
    
    public void runObstacleA()
    {
        Random ran = new Random();
        int s = ran.nextInt(1000);
        for(int i = -10; i<400; i++)
        {
            p1.setBounds(i,s,20,20);
            try
            {
                Thread.sleep(5);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
        runObstacleC();
    }
    public void runObstacleB()
    {
        Random ran = new Random();
        int r = ran.nextInt(1000);
        for(int i = -10; i<400; i++)
        {
            p1.setBounds(i,r,20,20);
            try
            {
                Thread.sleep(11);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
        runObstacleA();
    }
    public void runObstacleC()
    {
        Random ran = new Random();
        int m = ran.nextInt(1000);
        for(int i = -10; i<400; i++)
        {
            p1.setBounds(i,m,20,20);
            try
            {
                Thread.sleep(10);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
        runObstacleB();
    }
    
    public void buildGUI()
    {
        fr = new JFrame("Moving Objects");
        fr.setVisible(true);
        fr.setSize(400,200);
        fr.setLayout(null);
        
        l = new JLabel("");
        l.setBounds(10,10,400,200);
        fr.add(l);
        
        p1 = new JPanel();
        p1.setSize(20,20);
        p1.setBackground(Color.red);
        p1.setBounds(10,40,20,20);
        fr.add(p1);
        
        p2 = new JPanel();
        p2.setSize(20,20);
        p2.setBackground(Color.blue);
        p2.setBounds(10,40,20,20);
        fr.add(p2);
        
        p3 = new JPanel();
        p3.setSize(20,20);
        p3.setBackground(Color.black);
        p3.setBounds(10,40,20,20);
        fr.add(p3);
    }
    
    public static void main(String[] args)
    {
        RaceDemo obj = new RaceDemo();
        Thread Obstacle1 = new Thread(obj);
        Thread Obstacle2 = new Thread(obj);
        Thread Obstacle3 = new Thread(obj);
        
        Obstacle1.setName("ObstacleA");
        Obstacle2.setName("ObstacleB");
        Obstacle3.setName("ObstacleC");
        Obstacle1.start();
        Obstacle2.start();
        Obstacle3.start();
    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
