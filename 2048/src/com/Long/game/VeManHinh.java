package com.Long.game;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;



public class VeManHinh 
{
	JLabel arrlb[][]= new JLabel[4][4]; 
	private JLabel taoO(int x, int y , int w, int h,int i , int j)
	{
		JLabel l = new JLabel();
		l.setBounds(x, y, w, h);
		setBG(l, i, j);
		l.setOpaque(true);
		return l;
		
	}
	public void veCacNut(JFrame frame, int W, int H, int M)
	{
		int w = (W-3*M)/4;
		int h = (H-3*M)/4;
		int x = 0, y =0;
		for (int i = 0; i < 4; i++) 
		{
			y = i*w + (1+i) *M;
			for (int j = 0; j < 4; j++)
			{
				x = j*h + (j+1) *M;
				arrlb[i][j] = taoO(x,y,w,h,i,j);
				frame.add(arrlb[i][j]);
			}
		}
		frame.add(new JLabel());
	}
	
	
	private void setBG(JLabel l , int i, int j)
	{
		int d = Data.getData().arr[i][j];
		String color= "";
		switch (d)
		{
		case 2:
			color = "9600FF";
			break;
		case 4:
			color = "FF3333";
			break;
		case 8:
			color = "008800";
			break;
		case 16:
			color = "000044";
			break;
		case 32:
			color = "333399";
			break;
		case 64:
			color = "FF3399";
			break;
		case 128:
			color = "CC33FF";
			break;
		case 256:
			color = "00FFCC";
			break;
		case 512:
			color = "000022";
			break;
		case 1024:
			color = "FF6699";
			break;
		case 2048:
			color = "009966";
			break;
		default:
			color = "373737";
			break;
		}
		
		if( d==0)
		{
			l.setText("");
		}
		else
		{
			l.setText(""+d);
		}
				
		l.setFont(new Font("Sefif",Font.BOLD,26));
		l.setForeground(Color.WHITE);
		l.setHorizontalAlignment(SwingConstants.CENTER);
		l.setVerticalAlignment(SwingConstants.CENTER);
		l.setBackground(Game2048Java.hex2Rgb("#"+color));
	}
	
	public void update()
	{
		for (int i = 0; i < 4; i++) 
		{
			for (int j = 0; j < 4; j++)
			{
				setBG(arrlb[i][j], i, j);
			}
		}
	}
}
