package model;

public class Truck {

    private double totalTime;
    private double currentLoad;
    private final double loadTime = 8;
    private final double moveTime = 30;
    private final double maxLoad = 10000;

    public Truck() {
        totalTime = 0;
        currentLoad = 0;
    }

    public double getTotalTime() {
        return totalTime;
    }

    public void collectGarbage(GarbagePoint gp) {
        currentLoad += gp.getMess();
        totalTime += loadTime;
    }

    public boolean isFullLoad() {
        return currentLoad >= maxLoad;
    }

    public void goDump() {
        currentLoad -= maxLoad;
        if (currentLoad == 0) {
            totalTime += 2 * moveTime;
        } else {
            totalTime += loadTime + 2 * moveTime;
        }
    }

    public void goHome() {
        if (currentLoad > 0) {
            totalTime += moveTime;
        }
    }
}
