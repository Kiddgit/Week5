
public class Application {

	public static void main(String[] args) {
		AsteriskLogger asterisk = new AsteriskLogger();
		asterisk.Log("Broooo");
		asterisk.Error("Bruh");
		
		
		SpacedLogger space = new SpacedLogger();
		space.Log("Yooooo");
		space.Error("Whats up bro");

	}

}
