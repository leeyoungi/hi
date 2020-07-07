package second.koreait.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CardDeck cd = new CardDeck();
		// 10장 가지고 있으면 52장
        Dealer dealer=new Dealer();
		Gamer gamer = new Gamer();
       for(int i=0;i<2;i++) {
    	   dealer.receviedCard(cd.getCard());
    	   gamer.receviedCard(cd.getCard());
       }

       
       dealer.moreCards(cd);
       gamer.moreCards(cd);
       dealer.openCard();
       gamer.openCard();
       
   
       Rule.WhoTOWin(gamer, dealer);
		/*
		 * Card c = cd.getCard(); Dealer d = new Dealer(); System.out.println("딜러");
		 * d.moreCards(cd); d.openCard();
		 */

		/*
		 * gamer.receviedCard(c); System.out.println("게이머");
		 * gamer.receviedCard(cd.getCard()); gamer.receviedCard(cd.getCard());
		 * gamer.receviedCard(cd.getCard()); gamer.receviedCard(cd.getCard());
		 * gamer.openCard();
		 * 
		 * System.out.println(c);
		 * 
		 * 
		 */
		/*
		 * Card c= cd.getCard(); //랜덤된 카드를 1장 리턴 and 카드덱에서 리턴한 카드 삭제
		 */
		/*
		 * Rule.WhoTOWin(gamer, d); // 비겼는지 누가 이겼는지 결과를 나타냄
		 */
	}

}
