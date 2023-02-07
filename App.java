package week05Assignment;

public class App {

	public static void main(String[] args) {

		AsteriskLogger logger1 = new AsteriskLogger();
		SpacedLogger logger2 = new SpacedLogger();

		logger1.log("Hello");
		logger1.error("Hello");
		logger2.error("ERROR");
		logger2.log("Hello");
	}

}
