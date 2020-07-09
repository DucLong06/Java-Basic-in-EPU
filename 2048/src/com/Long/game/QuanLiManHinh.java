package com.Long.game;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class QuanLiManHinh {
	public int mg =2;
	public int WIDTH=400+3*mg;
	public int HEIGHT=400+3*mg;
	VeManHinh vMH;
	QuanLiData qlDT;
	
	public QuanLiManHinh(VeManHinh vMH,QuanLiData qlDT,JFrame frame)
	{
		this.vMH = vMH;
		this.vMH =  new VeManHinh();
		this.qlDT = qlDT;
		this.qlDT = new QuanLiData();
		this.vMH.veCacNut(frame, WIDTH, HEIGHT, mg);
	}
	
	public void setUp(JFrame frame)
	{
		frame.setSize(WIDTH+16+2*mg,HEIGHT+38+2*mg);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setFocusable(true);
		frame.getContentPane().setBackground(Color.BLACK);
		frame.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e)
			{
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e)
			{
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e)
			{
				if(e.getKeyCode() == KeyEvent.VK_LEFT)
				{
					qlDT.moveLeft();
				}
				if(e.getKeyCode() == KeyEvent.VK_RIGHT)
				{
					qlDT.moveRight();
				}
				if(e.getKeyCode() == KeyEvent.VK_UP)
				{
					qlDT.moveUp();
				}
				if(e.getKeyCode() == KeyEvent.VK_DOWN)
				{
					qlDT.moveBot();
				}
				vMH.update();
			}
		});
		
	}
}
