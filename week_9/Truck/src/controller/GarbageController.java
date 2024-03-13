package controller;

import java.util.ArrayList;
import java.util.List;
import model.Truck;
import model.CollectionCost;
import model.GarbagePoint;

public class GarbageController {

    private Truck truck;
    private List<GarbagePoint> garbages;
    private final CollectionCost gc;

    public GarbageController() {
        truck = new Truck();
        gc = new CollectionCost();
        garbages = new ArrayList<>();
    }

    public void addGarbagePoint(GarbagePoint gp) {
        garbages.add(gp);
    }

    private double calculateTime() {
        for (GarbagePoint gp : garbages) {
            truck.collectGarbage(gp);
            if (truck.isFullLoad() == true) {
                truck.goDump();
            }
        }
        truck.goHome();
        return truck.getTotalTime() / 60.0;
    }

    public double calculateCost() {
        return calculateTime() * gc.getLaborCost() + gc.getDumpCost();
    }
}
