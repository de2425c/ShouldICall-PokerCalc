/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.calc;

/**
 * Custom Card Class w integer suit and val 
 * @author natew
 */
public class Card {
    private int suit;
    private float val;
    Card(int suit, float val) {
        this.suit = suit;
        this.val = val;
    }
    public int getSuit(){
        return suit;
    }
    public float getVal(){
        return val;
    }
    public String toString(){
        return "" + suit + val;
    }
    public String toKeyRank(){
        if (val == 2){
            return "Two";
        }
        if(val == 3){
            return "Three";
        }
        if(val == 4){
            return "Four";
        }
        if(val == 5){
            return "Five";
        }
        if(val == 6){
            return "Six";
        }
        if(val == 7){
            return "Seven";
        }
        if(val == 8){
            return "Eight";
        }
        if(val == 9){
            return "Nine";
        }
        if(val == 10){
            return "Ten";
        }
        if(val == 11){
            return "Jack";
        }
        if(val == 12){
            return "Queen";
        }
        if(val == 13){
            return "King";
        }
        else return "Ace";
    }
    public String getSuitKey(){
        if(suit == 1){
            return " Hearts";
        }
        if(suit == 2){
            return " Spades";
        }
        if(suit == 3){
            return " Clubs";
        }
            return " Diamonds";
    }
    
}
