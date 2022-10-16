package day45_Abstraction_Interface.BrowsersTask;

public interface WebDriver extends SearchContext{

    void get(String url);
    void close();
    void quit();
    void getTitle();


}
