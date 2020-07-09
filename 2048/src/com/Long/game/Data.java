package com.Long.game;

public class Data {
	private static Data data;
	static
	{
		data = new Data();
	}
	public static Data getData()
	{
		return data;
	}
	
//	public int arr[][] = {
//				{2,4,8,16},
//				{32,64,128,256},
//				{512,1024,2048,0},
//				{2,4,0,0},};
	public int arr[][]= new int[4][4];
}
