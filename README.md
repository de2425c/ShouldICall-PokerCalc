# ShouldICall-PokerCalc
![Screenshot 2024-01-02 185101](https://github.com/de2425c/ShouldICall-PokerCalc/assets/154690407/af3984ca-d88d-4c55-95e0-0cc779674fd5)
![Screenshot 2024-01-02 185037](https://github.com/de2425c/ShouldICall-PokerCalc/assets/154690407/1ed93d28-7515-4302-bbff-7625e0a5c0f1)



# Background

Previously I created a [Poker Odds Calculator](https://github.com/de2425c/PokerOddsCalculator) which was able to calculate equities between two hold'em hands. Working from this baseline, this is a hand vs. range equity calculator where a user can specify the range they are playing against, the size of the pot, and the price to call in order to understand if their hand is a profitable call.

The range is determined by a percentage, where 10 represents the top 10% of hands, for example 77+, A9s+, KTs+, QTs+, AJo+, KQo. These rankings are roughly based off PokerStrategy.com's [Equilab](https://www.pokerstrategy.com/poker-software-tools/equilab-holdem/).

Through the pot size and price to call pot odds are calculated, and average chips won is computed through a simple formula.

```java
float totalPot = price + price + pot;
        return (prob * totalPot) - (potOdds * totalPot);
```

# Techniques Used



I created Custom Card and Hand objects in order to store different values. The Card object has suit and val data fields in order to represent a card's rank and suit. It also has a toKeyRank and getSuitKey methods for conversion into a key for the map.

The Hand object was created to create a two card hard effectively with just the rank of the two cards and specification whether it was offsuit, suited, or a pair. Then it randomly assigns suits to the cards in the hand.

```java
 Random generator = new Random();
        //checks if it is a pair or offsuit, in which it will need to assign different suit values
        if(suit == 'p' || suit == 'o'){
            int rank = generator.nextInt(4)+1;
            one = new Card(rank,card1);
            int x = generator.nextInt(4) +1;
            while(rank == x){
                x = generator.nextInt(4)+1;
            }
            two = new Card(x, card2);
        }
        //if it is suited, the suit value will be the same
        else if (suit == 's'){
            int rank = generator.nextInt(4)+1;
            one = new Card(rank,card1);
            two = new Card(rank,card2);
        }
```
I additionally used a java HashMap in order to store cards with a Key-Value pairing, where a string such as "Ace Hearts" maps to a Card object with rank of 14. This map object was filled through a file reader.

I also used a unique classification algorithm for efficiency, where the 9 different poker hands are classified 0-8. An example is in the code block below

```java
public static float isFull(Card[] hand){
        if(hand[0].getVal() == hand[1].getVal() && hand[1].getVal() == hand[2].getVal() && hand[3].getVal() == hand[4].getVal()){
            return 2+1/hand[0].getVal();
        }
        if(hand[0].getVal() == hand[1].getVal() && hand[2].getVal() == hand[3].getVal() && hand[3].getVal() == hand[4].getVal()){
            return 2+1/hand[4].getVal();
        }
        return 0;
    }
```

The hand, a Card array was first sorted using an insertion sort algorithm, and is now checked for being a full house. If it is found to be a full house, we return 2 (the classification #) plus 1 divided by the rank of the highest card. This allows the algorithm to make distinctions between hand classifications through division. Since lower is better, dviding by a stronger card with stronger ranks will yield a quick answer to the victor if ties in hand classification occurs. This is not perfect, so there are some further tiebreaking methods, but it is quick. 

To accurately create a range based on the top x% of hands, I used rough hand rankings from equilab and inputted them into a txt file. We multiply the percent of range by the total amount of hands in order to determine our threshold, and then start pulling hands from the dicitonary and create Hand objects until the threshold of combinations is it.. For pairs we add 6 combinations, offsuited hands we add 12, and suited hands we add 4. 

```java
ArrayList<Hand> hands = new ArrayList<Hand>();
        int count = 0;
        float rangePercent = (float) percent / 100;
        //threshold for combinations
        float max = rangePercent * TOTALHANDS;
        while (count < max){
            int x = Integer.parseInt((dictionary.readLine()));
            int y = Integer.parseInt((dictionary.readLine()));
            char z = dictionary.readLine().charAt(0);
            //checking the classifciation of the Hand
            if(z == 'p'){
                count = count + 6;
            }
            else if(z == 's'){
                count = count + 4;
            }
            else count = count + 12;
            //creating a new hand object with the three data fields
            hands.add(new Hand(z,x,y));
        }
```
Being a game of probability, the program uses a lot of techniques from combinatorics. One algorithm, an adapted combinatoric algorithm, iterates through all 7 choose 5 possible hands and checks them or strength. It creates a list of all possible combinations without duplicates. Next, combinatorics were used to compute weighted averages, factoring in suited, offsuited, and pair classifications.

# Runtimes

This program runs 10,000 simulations in under 10s



