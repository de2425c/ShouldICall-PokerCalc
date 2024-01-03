/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.calc;
import java.util.Random;
/**
 * Hand Class that assigns suits to hands, taking in a suited, unsuited, or pair classification
 * @author natew
 */
public class Hand {
    private Card one;
    private Card two;
    private char suit;
    Hand(char suit, int card1, int card2) {
        suit = suit;
        Random generator = new Random();
        if(suit == 'p' || suit == 'o'){
            int rank = generator.nextInt(4)+1;
            one = new Card(rank,card1);
            int x = generator.nextInt(4) +1;
            while(rank == x){
                x = generator.nextInt(4)+1;
            }
            two = new Card(x, card2);
        }
        else if (suit == 's'){
            int rank = generator.nextInt(4)+1;
            one = new Card(rank,card1);
            two = new Card(rank,card2);
        }
        this.one = one;
        this.two = two;
        this.suit = suit;
    }
    public Card getOne(){
        return one;
    }
    public Card getTwo(){
        return two;
    }char getSuit(){
        return suit;
    }
    public String CardOnetoKey(){
        return one.toKeyRank() + one.getSuitKey();
    }
    public String CardTwotoKey(){
        return two.toKeyRank() + two.getSuitKey();
    }
}
