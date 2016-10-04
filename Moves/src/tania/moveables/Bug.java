package tania.moveables;

public class Bug implements Moveable {

	@Override
	public void moveRight() {
		System.out.println("Bug is crowling to the right.");

	}

	@Override
	public void moveLeft() {
		System.out.println("Bug is crowling to the left.");

	}

	@Override
	public void moveUp() {
		System.out.println("Bug is crowling up.");

	}

	@Override
	public void moveDown() {
		System.out.println("Bug is crowling down.");

	}

}
