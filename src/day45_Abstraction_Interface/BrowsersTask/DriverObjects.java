package day45_Abstraction_Interface.BrowsersTask;

public class DriverObjects {

    public static void main(String[] args) {

        ChromeDriver chromeDriver = new ChromeDriver();
        FireFoxDriver fireFoxDriver = new FireFoxDriver();
        EdgeDriver edgeDriver = new EdgeDriver();
        SafariDriver safariDriver = new SafariDriver();
        OperaDriver operaDriver = new OperaDriver();


        chromeDriver.get("https://www.google.com");
        chromeDriver.findElement("title");
        chromeDriver.takeScreenShot();
        chromeDriver.close();


    }
}
