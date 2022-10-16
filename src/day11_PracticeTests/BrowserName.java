package day11_PracticeTests;

public class BrowserName {
    public static void main(String[] args) {

        String browserName = "opera";
        String output = "";

        switch (browserName) {
            case "chrome":
                output = "chrome";
                break;
            case "firefox":
                output = "firefox";
                break;
            case "opera":
                output = "opera";
                break;
            case "safari":
                output = "safari";
                break;
            case "edge":
                output = "edge";
                break;
            default:
                output = "Invalid Browser";
        }

        System.out.println(output);
    }
}
/*
3.  write a program that can display the selected browser
            3.1  declare a String variable called browserName
            3.2  Assume that the valid browsers are: chrome, firefox, opera, safari, edge
            3.3 if the browser name does not match with the valid browsers' names, out put should be: Invalid Browser

        	Do Not use if statement or ternary
 */