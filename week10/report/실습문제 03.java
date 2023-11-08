package practice;

class Converter{
	private int won = 0;

	public Converter(int won) {
		this.won = won;
	}
	
	protected int getWon () {
		return won;
	}
}

class Won2Dollar extends Converter {
	double dollar = getWon() / 1200;
	
	public Won2Dollar(int won) {
		super(won);
	}

	public void run() {
		System.out.println("변환 결과: " + dollar + "달러 입니다.");
	}
}

public class Won2DollarEx {
	public static void main(String[] args) {
		Won2Dollar toDollar = new Won2Dollar(2400);
		toDollar.run();
	}
}
