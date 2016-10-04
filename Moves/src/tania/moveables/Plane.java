package tania.moveables;

public class Plane implements Moveable {

	@Override
	public void moveRight() {
		System.out.println("Plane goes right.");

	}

	@Override
	public void moveLeft() {
		System.out.println("Plane goes left.");

	}

	@Override
	public void moveUp() {
		System.out.println("Plane goes up.");

	}

	@Override
	public void moveDown() {
		System.out.println("Plane goes down.");

	}

}
