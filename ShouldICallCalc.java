package my.calc;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author natew
 */
public class ShouldICallCalc extends javax.swing.JFrame {
    //Total unique hand combinations in poker
    static int TOTALHANDS = 2574;
    /**
     * Creates new form ShouldICallCalc
     */
    public ShouldICallCalc() {
        initComponents();
    }

    @SuppressWarnings("unchecked")                   
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField7 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jButton1.setText("Calculate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Enter Hand in format (Ace Spades or Six Hearts)");

        jLabel2.setText("Card One");

        jLabel3.setText("Card Two");

        jLabel4.setText("Opponent Range %");

        jLabel5.setText("(enter integer)");

        jLabel6.setText("Pot Size (in chips)");

        jLabel7.setText("Price to Call (in chips)");

        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel8.setText("Should I Call? Pot Odds Equity Calculator by David Eyal de2425@columbia.edu");

        jLabel9.setText("1/2/2024 Version 1.0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(39, 39, 39)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(0, 6, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(31, 31, 31)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }                     

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                            

    }                                                                           

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        
    }                                           

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        
    }                                           

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        
    }                                           

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {                                            
      
    }                                           


    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ShouldICallCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShouldICallCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShouldICallCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShouldICallCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShouldICallCalc().setVisible(true);
            }
        });
    }
  /** Handling for inputs  **/
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        Map<String, Card> map = new HashMap<String, Card>();
        try {
            map = createMap(map);
        } catch (IOException ex) {
            Logger.getLogger(ShouldICallCalc.class.getName()).log(Level.SEVERE, null, ex);
        }
        String s = jTextField1.getText();
        Card p11 = map.get(s);
        map.remove(s);
        s = jTextField3.getText();
        Card p12 = map.get(s);
        map.remove(s);
        s = jTextField2.getText();
        int range = Integer.parseInt(s);
        s = jTextField4.getText();
        float pot = Float.parseFloat(s);
        s = jTextField5.getText();
        float price = Float.parseFloat(s);
        float potodds = (price) /(pot + price + price);
        float prob = 0;
            for(int i = 0; i< 10000; i++){
            try {
                prob += calcPreflop(p11,p12,range,map);
            } catch (IOException ex) {
                Logger.getLogger(ShouldICallCalc.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            prob = prob/10000;
            float winnings = getWin(potodds,prob, pot, price);
            if(winnings>0){
                jTextArea1.setText("Call is profitable, with pot odds of " +potodds+ " and probability of victory at " + (prob*100) + "%." );
                jTextField7.setText("Calling wins " + winnings + " chips on average");
            }
            else{
                jTextArea1.setText("Call is not profitable, with pot odds of " +potodds+ " and probability of victory at " + (prob*100) + "%." );
                jTextField7.setText("Calling loses " + winnings + " chips on average");
            }
    }        
    //Program to calculate average chips won/lost
    public static float getWin(float potOdds, float prob, float pot, float price){
        float totalPot = price + price + pot;
        return (prob * totalPot) - (potOdds * totalPot);
    }
    //Builds a top x% range using a txt file of poker hands
    public static List<Hand> buildRange(int percent) throws IOException {
        float rangePercent = (float) percent;
        rangePercent = rangePercent/100;
        float max = rangePercent * TOTALHANDS;
        int count = 0;
        BufferedReader dictionary = null;
        dictionary = new BufferedReader(new FileReader("readme.txt"));
        ArrayList<Hand> hands = new ArrayList<Hand>();
        while (count < max){
            int x = Integer.parseInt((dictionary.readLine()));
            int y = Integer.parseInt((dictionary.readLine()));
            char z = dictionary.readLine().charAt(0);
            if(z == 'p'){
                count = count + 6;
            }
            else if(z == 's'){
                count = count + 4;
            }
            else count = count + 12;
            hands.add(new Hand(z,x,y));
        }
        return hands;
    }
    //Creates List of hands, and runs each one individually against the source and computes a weighted average 
    public static float calcPreflop(Card p11, Card p12, int range, Map<String,Card> map) throws IOException {
        List<Hand> hands = new ArrayList<Hand>();
        hands = buildRange(range);
        float prob = 0;
        float count = 0;
        for(Hand hand: hands){
            Card one = hand.getOne();
            Card two = hand.getTwo();
            if(hand.getSuit() == 'p'){
                count+= 3;
                map.remove(hand.getOne().toKeyRank() + hand.getOne().getSuitKey());
                map.remove(hand.getTwo().toKeyRank() + hand.getTwo().getSuitKey());
                prob+= 3*calcPreflop(p11,p12,one,two,map);
                map.put(hand.getOne().toKeyRank() + hand.getOne().getSuitKey(), new Card(hand.getOne().getSuit(),hand.getOne().getVal()));
                map.put(hand.getTwo().toKeyRank() + hand.getTwo().getSuitKey(), new Card(hand.getTwo().getSuit(),hand.getTwo().getVal()));
            }
            else if(hand.getSuit() == 'o'){
                count+= 6;
                map.remove(hand.getOne().toKeyRank() + hand.getOne().getSuitKey());
                map.remove(hand.getTwo().toKeyRank() + hand.getTwo().getSuitKey());
                prob+= 6*calcPreflop(p11,p12,one,two,map);
                map.put(hand.getOne().toKeyRank() + hand.getOne().getSuitKey(), new Card(hand.getOne().getSuit(),hand.getOne().getVal()));
                map.put(hand.getTwo().toKeyRank() + hand.getTwo().getSuitKey(), new Card(hand.getTwo().getSuit(),hand.getTwo().getVal()));
            }
            else{
                count += 2;
                map.remove(hand.getOne().toKeyRank() + hand.getOne().getSuitKey());
                map.remove(hand.getTwo().toKeyRank() + hand.getTwo().getSuitKey());
                prob+= 2*calcPreflop(p11,p12,one,two,map);
                map.put(hand.getOne().toKeyRank() + hand.getOne().getSuitKey(), new Card(hand.getOne().getSuit(),hand.getOne().getVal()));
                map.put(hand.getTwo().toKeyRank() + hand.getTwo().getSuitKey(), new Card(hand.getTwo().getSuit(),hand.getTwo().getVal()));
            }
        }
        prob = prob/count;
        return prob;
    }
    //Creates a randomly generated 5 card runout from the map, gathers strength data and evaluates winner
    public static float calcPreflop(Card p11, Card p12, Card p21, Card p22, Map<String, Card> map){
        map.remove(p21.toKeyRank() + p21.getSuitKey());
        map.remove(p22.toKeyRank() + p22.getSuitKey());
        Card[] runout = new Card[5];
        Random generator = new Random();
        Object[] values = map.keySet().toArray();
        for(int i = 0; i<5;i++){
            runout[i] = map.get((String) values[generator.nextInt(values.length)]);
        }
        float p1 = getStrength(getStrength(p11,p12,runout));
        float p2 = getStrength(getStrength(p21,p22,runout));
        if (p1 < p2){
            return 1;
        }
        else if (p2<p1){
            return 0;
        }
        else{
            if(isFull(getStrength(p11,p12,runout)) > 0){
                if(getStrength(p11,p12,runout)[4].getVal() > getStrength(p21,p22,runout)[4].getVal() || getStrength(p11,p12,runout)[1].getVal() > getStrength(p21,p22,runout)[1].getVal()){
                    return 1;
                }
                else return 0;
            }
            if(isTwoPair(getStrength(p11,p12,runout))>0){
                if(getStrength(p11,p12,runout)[4].getVal() > getStrength(p21,p22,runout)[4].getVal() || getStrength(p11,p12,runout)[1].getVal() > getStrength(p21,p22,runout)[1].getVal()){
                    return 1;
                }
                else return 0;
            }
            return 0.5F;
        }
    }
    public static Map<String, Card> createMap(Map<String, Card> map) throws IOException {
        BufferedReader dictionary = null;
        dictionary = new BufferedReader(new FileReader("card.txt"));
        while(dictionary.ready()){
            String x = dictionary.readLine();
            int y = Integer.parseInt((dictionary.readLine()));
            int z = Integer.parseInt((dictionary.readLine()));
            Card n = new Card(z,y);
            map.put(x,n);
        }
        return map;
    }
    public static Card[] getStrength(Card one, Card two, Card[] runout){
        Card[] total = {one,two,runout[0],runout[1],runout[2],runout[3],runout[4]};
        ArrayList<Card[]> combinations = new ArrayList<Card[]>();
        int len = 5;
        int[] indices = new int[len];
        if(len<=total.length) {
            for (int i = 0; (indices[i] = i) < len - 1; i++);
            combinations.add(kSubset(total, indices));
            while (true) {
                int i;
                for (i = len - 1; i >= 0 && indices[i] == total.length - len + i; i--) ;
                if (i < 0) {
                    break;
                }
                indices[i]++;
                for(++i;i<len;i++){
                    indices[i] = indices[i-1] + 1;
                }
                combinations.add(kSubset(total,indices));
            }
        }
        Card[] hand = new Card[5];
        float maxStrength = 9;
        for(int i = 0; i<combinations.size();i++){
            if(maxStrength > getStrength(combinations.get(i))){
                hand = combinations.get(i);
                maxStrength = getStrength(combinations.get(i));
            }
        }
        return hand;
    }
    public static Card[] kSubset(Card[] total, int[] indices){
        Card[] result = new Card[indices.length];
        for (int i = 0; i<indices.length;i++){
            result[i] = total[indices[i]];
        }
        return result;
    }
    public static float getStrength(Card[] hand){
        hand = insertionSort(hand);
        if(isStraightFlush(hand)>0){
            return isStraightFlush(hand);
        }
        if(isQuads(hand) > 0){
            return isQuads(hand);
        }
        if(isFull(hand)>0){
            return isFull(hand);
        }
        if(isFlush(hand) > 0){
            return isFlush(hand);
        }
        if(isStraight(hand) > 0){
            return isStraight(hand);
        }
        if(isTrips(hand)>0){
            return isTrips(hand);
        }
        if(isTwoPair(hand)>0){
            return isTwoPair(hand);
        }
        if(isPair(hand)>0){
            return isPair(hand);
        }
        else return 8 + 1/hand[4].getVal();
    }
    public static float isStraightFlush(Card[] hand){
        if( isFlush(hand) > 0 && isStraight(hand) > 0){
            return 0 + 1/hand[4].getVal();
        }
        return 0;
    }
    public static float isQuads(Card[] hand){
        if (hand[1].getVal() == hand[2].getVal() && hand[2].getVal() == hand[3].getVal() && hand[3].getVal() == hand[4].getVal()){
            return 1 + 1/hand[1].getVal();
        }
        if (hand[0].getVal() == hand[1].getVal() && hand[1].getVal() == hand[2].getVal() && hand[2].getVal() == hand[3].getVal()){
            return 1 + 1/hand[1].getVal();
        }
        return 0;
    }
    public static float isFull(Card[] hand){
        if(hand[0].getVal() == hand[1].getVal() && hand[1].getVal() == hand[2].getVal() && hand[3].getVal() == hand[4].getVal()){
            return 2+1/hand[0].getVal();
        }
        if(hand[0].getVal() == hand[1].getVal() && hand[2].getVal() == hand[3].getVal() && hand[3].getVal() == hand[4].getVal()){
            return 2+1/hand[4].getVal();
        }
        return 0;
    }
    public static float isFlush(Card[] hand){
        if( hand[0].getSuit() == hand[1].getSuit() && hand[1].getSuit() == hand[2].getSuit() && hand[2].getSuit() == hand[3].getSuit() && hand[3].getSuit() == hand[4].getSuit()){
            return 3+1/hand[4].getVal();
        }
        return 0;
    }
    public static float isStraight(Card[] hand){
        if (hand[0].getVal() == 2 && hand[1].getVal() == 3 && hand[2].getVal() == 4 && hand[3].getVal() == 5 && hand[4].getVal() == 14){
            return (float) (4 + 0.2);
        }
        for (int i = 0; i<4; i++){
            if (hand[i].getVal() != hand[i+1].getVal() - 1){
                return 0;
            }
        }
        return 4 + 1/hand[4].getVal();
    }
    public static float isTrips(Card[] hand){
        if(hand[0].getVal() == hand[1].getVal() && hand[1].getVal() == hand[2].getVal()){
            return 5+1/hand[1].getVal();
        }
        if(hand[1].getVal() == hand[2].getVal() && hand[2].getVal() == hand[3].getVal()){
            return 5+1/hand[1].getVal();
        }
        if(hand[2].getVal() == hand[3].getVal() && hand[3].getVal() == hand[4].getVal()){
            return 5+1/hand[2].getVal();
        }
        return 0;
    }
    public static float isTwoPair(Card[] hand){
        if(hand[0].getVal() == hand[1].getVal() && hand[2].getVal() == hand[3].getVal()){
            return 6+1/hand[2].getVal();
        }
        if(hand[0].getVal() == hand[1].getVal() && hand[3].getVal() == hand[4].getVal()){
            return 6 + 1/hand[3].getVal();
        }
        if( hand[1].getVal() == hand[2].getVal() && hand[3].getVal() == hand[4].getVal()){
            return 6 + 1/hand[4].getVal();
        }
        return 0;
    }
    public static float isPair(Card[] hand){
        if(hand[0].getVal() == hand[1].getVal()){
            return 7 + 1/hand[0].getVal();
        }
        if(hand[1].getVal() == hand[2].getVal()){
            return 7 + 1/hand[2].getVal();
        }
        if(hand[2].getVal() == hand[3].getVal()){
            return 7 + 1/hand[3].getVal();
        }
        if(hand[3].getVal() == hand[4].getVal()){
            return 7 + 1/hand[3].getVal();
        }
        return 0;
    }
    public static Card[] insertionSort(Card[] hand){
        for (int i = 1; i<hand.length;i++){
            int k;
            Card current = hand[i];
            for (k = i-1;k>=0 && hand[k].getVal() > current.getVal(); k--){
                hand[k+1] = hand[k];
                }
            hand[k+1] = current;}
        return hand;}
    // Variables declaration                   
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration                   
}
