package second.koreait.blackjack;

public class Rule {

	public static void WhoTOWin(Gamer gamer, Dealer d) {
		// TODO Auto-generated method stub
		int gSum = gamer.getTotalPoint();
		int dSum = d.getTotalPoint();
		if ((gSum >21 && dSum >21) || gSum == dSum) {
			System.out.println("무승부");
			
			
		} else if(gSum <= 21 && gSum> dSum || dSum > 21) {
			System.out.println("게이머 승리");
		}else {
			System.out.println("딜러 승리");
		}

}
}