package second.koreait.blackjack;

public class Card {
	private final String pattern;
	private final String denomination;
	public final static String[] patterns = { "다이아", "스페이스", "클로버", "하트" };
	private final int point;// getter 메소드 필요

	public Card(String pattern, String denomination, int point) {
		this.pattern = pattern;
		this.denomination = denomination;
		this.point = point;
	}

	
	
	



	public String getPattern() {
		return pattern;
	}
	public int getPoint() {
		return point;
	}
	public String getDenomination() {
		return denomination;
	}

	@Override
	public String toString() {
		return String.format("p: %s, d: %s, point:%d", pattern, denomination,point);

	}

}
