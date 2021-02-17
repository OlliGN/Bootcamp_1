package oop.interfaces;

//implement not extend!!!
public class Chrome implements BrowserService {
    @Override
    public void navigate(String url) {
        //find chrome
        //call it's main method
        //call goToURL method
        //open the page

    }

    @Override
    public void playVideo() {
        //check player
        //if flashInstalled
        //play the video

    }

    @Override
    public void click() {
        //click on the button
    }

    @Override
    public String getUrl() {
        return "Chrome URL";
    }
}
