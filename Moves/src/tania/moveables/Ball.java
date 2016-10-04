package tania.moveables;

public class Ball implements Moveable {

	@Override
	public void moveRight() {
		System.out.println("Ball moved 2 sm to the right");
	}

	@Override
	public void moveLeft() {
		System.out.println("Ball moved 2 sm to the left");

	}

	@Override
	public void moveUp() {
		System.out.println("Ball moved 2 sm up");

	}

	@Override
	public void moveDown() {
		System.out.println("Ball moved 2 sm down");

	}

}
