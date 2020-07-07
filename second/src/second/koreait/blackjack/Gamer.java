package second.koreait.blackjack;

import java.util.*;

public class Gamer {

	private List<Card> cards;//list  인터페이스라서 강제로 오버라이딩함
	

	public Gamer() {
		cards = new LinkedList();   //변화가 빈번하면 linkedlist사용  arraylist해도 결과같음
	}

	public void receviedCard(Card card) {
		// TODO Auto-generated method stub
      
		cards.add(card);

		// public void receiveCard
	}

	public int getTotalPoint() {
		int gsum = 0;

		for (int i = 0; i < cards.size(); i++) {

			gsum += cards.get(i).getPoint();
		}
		return gsum;
	}

	public void openCard() {

		int gsum = 0;

		// TODO Auto-generated method stub

		
		  for(Card c:cards) {
			  System.out.println(c); 
			
			  }
		System.out.println("점수:  "+getTotalPoint());
		 
	
		
		
	}

	public void moreCards(CardDeck cd) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
         openCard();
			while(true) {
				System.out.println("카드를 더 받으시겠습니까?(Y/N)");
				String a=scan.nextLine();
				
			if(a.equals("n")) {
				break;
			}
			
		     receviedCard(cd.getCard());
		 
		}
	
		scan.close();
         
	}

	
}