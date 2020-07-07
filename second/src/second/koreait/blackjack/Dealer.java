package second.koreait.blackjack;

import java.util.LinkedList;
import java.util.List;

public class Dealer extends Gamer {
	List<Card> cards = new LinkedList();

	public void moreCards(CardDeck cd) {

		// TODO Auto-generated method stub
		// 딜러가 가지고 있는 카드의 합계점수가 17점 이상이 될떄까지
		// 카드 뽑기를 해야합니다.
		int totalPoint = getTotalPoint();
		
		while (getTotalPoint() < 17) {
		
			receviedCard(cd.getCard());

		}
		
	}

}
