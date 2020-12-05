package com.java.snakeandladder;

import java.util.*;

public class SnakeAndLadder {

	//UC1 use to initialize the member variables
	static int startPosition=0;
	int noOfPlayers=1;

	// UC2 to roll a die and generate random number
	int rollingADie()
	{
		Random random = new Random();		//random object will generate random number
		int rand = random.nextInt(7);		//generate from 0 to 6 numbers
			if(rand == 0 )
			{
		    		rollingADie();
		   	}
	return rand;
	}
	public static void main(String[] arg)
	{
		SnakeAndLadder snakeandladder=new SnakeAndLadder();		//creating an object for class
		int randomResult=snakeandladder.rollingADie();
	}
}

