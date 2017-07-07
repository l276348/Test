/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elwing.tictactoe;

/**
 *
 * @author Elwing
 */
public class TicTacToeBrain {
    
    public int playerCircle = 1;
    public int playerCross = 2;
    
    private int[] ticTacToeMap;
    
    public TicTacToeBrain() {
        //TODO: new brain with size 9
    	ticTacToeMap=new int[9]; 
    }
    
    public int fillTicTacToeAt(int index) {

        int numberFilled = 0;
        //TODO: check the whole array, calculate total number which is not 0
        for(int i=0;i<ticTacToeMap.length;i++){
        	if(ticTacToeMap[i]!=0){
        		numberFilled++;
        	}
        }
        
        	if (numberFilled % 2 == 0) {
        		ticTacToeMap[index] = playerCircle;
        		return playerCircle;
        	} else {
        		ticTacToeMap[index] = playerCross;
        		return playerCross;
        	}
        
    }
   
    //return player if a winner born, else return 0
    public int checkWinner() {
        int result = 0;
        // check the column, ex. array[0], array[3], array[6]
        for(int i = 0; i < 3; i++) {
            if(ticTacToeMap[i] != 0) {
                boolean winner = true;
                for(int j = 0; j < 3; j++) {
                    if(ticTacToeMap[i + 3*j] != ticTacToeMap[i]) {
                        winner = false;
                    }
                }
                if (winner == true) {
                    return ticTacToeMap[i];
                }
            } 
        }
        
         // TODO: check the row, ex: a[0], a[1], a[2]
        for(int i = 0; i < 3; i++) {
            if(ticTacToeMap[3*i] != 0) {
                boolean winner = true;
                for(int j = 0; j < 3; j++) {
                    if(ticTacToeMap[3*i+j] != ticTacToeMap[3*i]) {
                        winner = false;
                    }
                }
                if (winner == true) {
                    return ticTacToeMap[3*i];
                }
            } 
        }
        
        
        
       //TODO: check a[0], a[4], a[8]
       if(ticTacToeMap[0]!=0 && ticTacToeMap[4]!=0 && ticTacToeMap[8]!=0){
    	   result=1;
       }
       
       //TODO: check a[2], a[4], a[6]
       if(ticTacToeMap[2]!=0 && ticTacToeMap[4]!=0 && ticTacToeMap[6]!=0){
    	   result=1;
       }
      
        return result;
    }
}
