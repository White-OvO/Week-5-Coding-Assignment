package week05Assignment;

public class SpacedLogger implements Logger{

	@Override
	public void log(String log) {
	    StringBuilder result = new StringBuilder();
        for (int i = 0; i < log.length(); i++) {
                  result.append(log.charAt(i) + " "); 
        }

        System.out.println("ERROR: " + result.toString());
}

	@Override
	public void error(String error) {
		  StringBuilder message = new StringBuilder();
          for (int i = 0; i < error.length(); i++) {
                    message.append(error.charAt(i) + " ");
          }
          
          System.out.println();
          
          System.out.println("ERROR: " + message.toString());		
	}

}





