package myRoom;

public class Room {
	public String color;
	public String shape;
	public String function;
	public String name;
	public boolean use;
	public double price;
	public String instance;
	public int count(){
		int furnitureCount = 5;
		if (furnitureCount > 5){
			System.out.println("Father bought new chair");
			return 1;
		} else{
			return -1;
		}
	}

	public boolean existing() {
		int familyCount = 4;
		if (familyCount > 4) {
			return true;
		} else {
			return false;
		}
	}

	public void eat() {
		System.out.println("Dinner");
	}

	public void sleep() {
		System.out.println("Bedroom");
	}

	public void dressing() {
		System.out.println("Wardrobe");
	}

}
