import facade.CarEngineFacade;

public class Main {
    public static void main(String[] args) {

        CarEngineFacade carEngine = new CarEngineFacade();
        carEngine.startEngine();
        System.out.println("------------ working -----------------");
        carEngine.stopEngine();
    }
}