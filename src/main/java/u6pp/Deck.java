 package u6pp;
public class Deck{
    private Card[] deck;
    private int count = 51;
    
    public Deck(){
      deck = new Card[52];
      int ind = 0;
      for(String suit: Card.SUITS){
        for(String value: Card.VALUES){
          deck[ind] = new Card(suit,value);
          ind++;
       }
     } 
   }
    public int numLeft(){
       int left = count + 1;
       return left; 
      }
        
      
    
    public Card deal(){
        if(count > -1){
      count -= 1;
        }
      return deck[count+1];
      
    }
    public void shuffle(){
      count = 51;
      for(int s = 0; s < 2; s++){
        for(int i = 0; i < deck.length; i++){
          int num = (int)(Math.random() * 51);
          Card temp = deck[i];
          deck[i] = deck[num];
          deck[num] = temp;
        }
      }
    }
  }