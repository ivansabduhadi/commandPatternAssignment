public class HomeApp {
    public static void main(String[] args) {
        HomeInterface homeFacade = new HomeInterface();

        homeFacade.turnOnAll();
        homeFacade.turnOffAll();
    }
}