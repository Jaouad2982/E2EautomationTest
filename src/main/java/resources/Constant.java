package resources;

public class Constant {
	private String path = "C:\\Users\\jd\\eclipse-workspace\\SeleniumAutomation\\E2Eautomation\\src\\main\\java\\resources\\data.properties";
	private int explicitWait = 10;
	public String returnVariable() {
		return this.path;
	}
	public int returnWait() {
		return this.explicitWait;
	}
}
