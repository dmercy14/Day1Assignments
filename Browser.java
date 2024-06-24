package week1.day1;

public class Browser {
	
	public String launchBrowser( String  browserName) {
			System.out.println("Browser launched successfully");
			return browserName;
	}
	
	public void loadUrl() {
	System.out.println("Application url loaded successfully");
		
		
			
		}
	
	public static void main(String[] args) {
		
		Browser b1=new Browser();
		b1.launchBrowser("Edge");
		b1.loadUrl();
	}


}


		
	

