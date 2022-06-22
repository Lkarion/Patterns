package facade;

public class CoolingController {
    public void setTemperatureUpperLimit(int CoolingTemp) {
        System.out.println("Temperature is 50°");
    }

    public void run() {
        System.out.println("CoolingController is running");
    }

    public void cool(int maxAllowedTemp) {
        System.out.println("CoolingController is cooling");
    }

    public void stop() {
        System.out.println("CoolingController is stopped");
    }
}
