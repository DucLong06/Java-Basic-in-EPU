package com.Long.game;

import java.awt.Color;

import javax.swing.JFrame;

public class Game2048Java 
{
	JFrame game;
	QuanLiManHinh qlMH;
	VeManHinh vMH;
	QuanLiData qlDT;
	
	public Game2048Java()
	{
		init();
		setUp();
	}
	
	private void init()
	{
		game = new JFrame();
		qlMH = new QuanLiManHinh(vMH,qlDT,game);
		
	}
	private void setUp()
	{
		qlMH.setUp(game);
	}
	public void runGame()
	{
		game.setVisible(true);
	}
	public static void main(String[] args)
	{
		Game2048Java g = new Game2048Java();
		g.runGame();
	}
	public static Color hex2Rgb(String colorStr) {
	    return new Color(
	            Integer.valueOf( colorStr.substring( 1, 3 ), 16 ),
	            Integer.valueOf( colorStr.substring( 3, 5 ), 16 ),
	            Integer.valueOf( colorStr.substring( 5, 7 ), 16 ) );
	}
}
