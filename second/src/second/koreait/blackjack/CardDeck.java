package second.koreait.blackjack;

import java.util.*;

public class CardDeck {
	private List<Card> arr = new ArrayList();

	public CardDeck() {

		init();

	}

	@Override
	public String toString() {

		/*
		 * for(Card c:arr) { System.out.println(c); } return "";
		 */
		String str = "";
		for (Card c : arr) {
			str += c + "\n";

		}

		return str;
	}

	public void init() {
		for (int i = 0; i < Card.patterns.length; i++) {
          
			for (int k = 1; k <= 13; k++) {
				int point=getPont(i);
				
				arr.add(new Card(Card.patterns[i], getDeno(k),getPont(k)));
				/*
				 * String pattern = Card.patterns[i]; // 다이아,스페이스,클로버,하트에대한 값 저장
				 * 
				 * String deno = getDeno(k); // 점수 저장 Card c = new Card(pattern, deno);// 카드라는
				 * 객체생성 arr.add(c); // 리스트에 card라는 객체 더함
				 */
			}

		}

	}
public int getPont(int i) {
		
		if(i==1) {
			i=1;
		}else if(i==10) {
			i=10;
		}else if(i==11) {
			i=11;
		}else if(i==12) {
			i=12;
		}else if(i==13) {
			i=13;
		}else{
			String.valueOf(i);
		}
		return i;
		
	}

	public String getDeno(int num) {
		if (num == 1) {
			return "A";

		} else if (num == 11) {
			return "J";

		} else if (num == 12) {
			return "Q";

		} else if (num == 13) {
			return "K";

		} else {
			return String.valueOf(num);

		}
	}

	public Card getCard() {
		// TODO Auto-generated method stub
		int rIdx = (int) (Math.random() * arr.size()); // 랜덤된 값 추출
		//Card c=arr.get(ridx);
		//arr.remove(rIdx);
		//return c;
		return arr.remove(rIdx);// 리스트에 있는 요소 삭제!
	}
}