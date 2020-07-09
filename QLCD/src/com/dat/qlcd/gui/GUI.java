package com.dat.qlcd.gui;

import java.awt.CardLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class GUI extends JFrame{
	public static final int WFRAME = 1000;
	public static final int HFAME = 800;
	private MainPanel mainPanel;
	public GUI() {
		init();
		addComps();
		addEvents();
	}

	private void init() {
		setTitle("Chương trình quản lý CD");
		setLayout(new CardLayout());
		setSize(WFRAME, HFAME);
	}

	private void addComps() {
		mainPanel= new MainPanel();
		add(mainPanel);
	}
	private void addEvents() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
	}
}
