
public class SpacedLogger implements Logger{
	
	//INSERT METHOD: should add spaces between each character of the String argument passed into its methods.
	public void Log(String log) {
		StringBuilder spaced = new StringBuilder();
		
		for (int i = 0; i < log.length(); i++) {
			spaced.append(log.charAt(i)).append(" ");
		}
		System.out.println(spaced);
	}

	
	public void Error(String error) {
		
StringBuilder eSpaced = new StringBuilder();
		
		for (int i = 0; i < error.length(); i++) {
			eSpaced.append(error.charAt(i)).append(" ");
		}
		
		
		System.out.println("ERROR:" + eSpaced);
	}
	
}
