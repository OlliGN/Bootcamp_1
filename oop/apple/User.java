package oop.apple;

public class User {
    public static void main(String[] args) {

        //HW1
        //Add a feature i iphone which will keep track of  battery life
        //battery should go down 5%  for every appDownload
        //battery should go down 2 % for eb=very - showApps

        //HW2
        //add a feature for iphone which will enable us to add contacts, show contacts, delete contacts, update contacts
        //in the contact list

        AppStore appStore = new AppStore();

        fillOutAppStore(appStore);

        Battery battery = new Battery();
        Iphone iphone = new Iphone("12 Pro Max", 128, "Blue", battery);
        iphone.downloadNewApp("turo", appStore);
        iphone.showAllApps();
        iphone.downloadNewApp("turo", appStore);
        iphone.showAllApps();
        iphone.getBattery().showPercentage();
        iphone.getBattery().switchMode();
        iphone.getBattery().showPercentage();


    }


    private static void fillOutAppStore(AppStore appStore) {

        IosApp instagram = new IosApp("Instagram", "1.2.2", 10.2, 0);
        IosApp fb = new IosApp("Facebook", "1.3.2", 1.2, 0);
        IosApp yelp = new IosApp("Yelp", "1.7.3", 1.2, 0);
        IosApp chess = new IosApp("Chess", "1.6.2", 40.2, 0);
        IosApp robinhood = new IosApp("Robinhood", "2.2", 2, 0);
        IosApp turo = new IosApp("Turo", "1.5.6", 12, 0);
        IosApp uber = new IosApp("Uber", "1.2.2", 10.2, 0);
        IosApp todolist = new IosApp("Todolist", "1.2.2", 10.2, 0);

        appStore.addApp(instagram);
        appStore.addApp(fb);
        appStore.addApp(yelp);
        appStore.addApp(chess);
        appStore.addApp(robinhood);
        appStore.addApp(turo);
        appStore.addApp(uber);
        appStore.addApp(todolist);
    }
}
