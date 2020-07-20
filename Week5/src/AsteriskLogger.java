
public class AsteriskLogger implements Logger{
	
	
	public void Log(String log) {
		System.out.println("***" + log + "***");
	}
	
	
	
	public void Error(String error) {
		
		System.out.println("*****************"); 
		System.out.println("***ERROR: " + error + "***");
		System.out.println("*****************");
	}

}
	





