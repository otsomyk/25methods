package myRoom;

public class RoomInstance {

	public static void main(String[] args) {
		Room r1 = new Room();
		r1.shape = "square";
		r1.color = "white";
		r1.function = "dinning";
		r1.use = false;
		r1.name = "table";
		r1.price = 1500.0;

		Room r2 = new Room();
		r2.shape = "high";
		r2.color = "white";
		r2.function = "soft";
		r2.use = false;
		r2.name = "chair";
		r2.price = 400.0;

		Room r3 = new Room();
		r3.shape = "rectangular";
		r3.color = "braun";
		r3.function = "soft";
		r3.use = true;
		r3.name = "sofa";
		r3.price = 5400.0;

		printRoomInfo(r1);
		printRoomInfo(r2);
		printRoomInfo(r3);

		addInstance();

		mamasCome(8);
		sofa();
		guestCome();
		work();
		alarm(7.20);
		furniture();
		table();
		speak("mau");
	}

	private static void printRoomInfo(Room r) {
		System.out.println("thing color: " + r.color + ", shape: " + r.shape
				+ ", function: " + r.function + ", using: " + r.use
				+ ", name: " + r.name + ", price: " + r.price + " grn.");
	}

	private static void addInstance() {
		System.out.println("Cupboard");
		System.out.println("TV");
		System.out.println("Stairs");
		System.out.println("Chair");
		System.out.println("Table");
		System.out.println("Vase");
		System.out.println("Clock");
	}

	private static void mamasCome(int timeInClock) {
		timeInClock = 7;
		if (timeInClock >= 7) {
			System.out.println("Mama will come soon");
		} else {
			System.out.println("You have to wait a little");
		}
	}

	private static int sofa() {
		int sofaCount = 0;
		if (sofaCount > 0) {
			System.out.println("We bought new sofa");
			return 1;

		} else {
			return -1;
		}
	}

	private static void guestCome() {
		System.out.println("We are waiting for guest today.");
	}

	private static void work() {
		System.out.println("I have a lot of work today.");
	}

	private static void alarm(double time) {
		time = 0;
		time++;
		if (time >= 7) {
			System.out.println("Alarm!");
		} else {
			System.out.println("You can sleep else");
		}
	}

	private static void furniture() {
		System.out.println("I have a furniture in my house");
	}

	private static void table() {
		int height = 60;
		if (height > 60) {
			System.out.println("This is a table");
		} else {
			System.out.println("It is chair");
		}
	}

	private static String speak(String words) {
		String phrase = words + "gav-gav!";
		return phrase;
	}

	private static void eat() {
		System.out.println("We are always eat in dinner time together");
	}

	private static void sleep() {
		System.out.println("Zzzzz");

	}

	private static void wolk() {
		System.out.println("10 min to a work.");
	}

	private static void gettinUp() {
		System.out.println("At 7.10 every morning.");
	}

	private static void woteringFlowers() {
		System.out.println("ups, I am always forget about it");
	}

	private static void wolkWithChild() {
		System.out.println("Every weekend");
	}

	private static int windows() {
		System.out.println("Windows are open");
		return 1;
	}

	private static int door() {
		int width = 60;
		if (width > 60) {
			System.out.println("Closed");
			return 1;
		} else {
			return -1;
		}
	}

	private static void socket() {
		int count = 0;
		if (count > 0) {
			System.out.println("Somebody turned off TV");
		}
	}

	private static void clockInWall() {
		System.out.println("Tic-tac");
	}

	private static void tree() {
		System.out.println("Far away.");
	}

	private static void Car() {
		System.out.println("Need gas.");
	}

	private static void baby() {
		System.out.println("Sleeping");
	}

	private static void flowers() {

	}

	private static void play() {

	}
}
