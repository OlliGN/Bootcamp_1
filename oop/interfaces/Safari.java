package oop.interfaces;

public class Safari implements BrowserService {
    @Override
    public void navigate(String url) {
        //find Safari app
        //open
        //find the tab
        //put url
        //go to page
    }

    @Override
    public void playVideo() {

        //play video
    }

    @Override
    public void click() {
        //click on the button
    }

    @Override
    public String getUrl() {
        return "Safari URL";
    }
}
