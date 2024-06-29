package RestService;

public class Calculator {
	private int x;
	private int y;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	int add() {
		return x+y;
	}
	int sub() {
		return x-y;
	}
	int mul() {
		return x*y;
	}
	int div() {
		return x/y;
	}

}