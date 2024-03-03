package view;

import controller.Sorting;
import controller.Searching;
import Model.Algorithm;

public class AppView extends Menu {

    private final Algorithm algorithm;

    public AppView(int size) {
        super("Function", new String[]{"Sorting", "Searching", "Quit"});
        algorithm = new Algorithm(size);
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                new Sorting(algorithm).run();
                break;
            case 2:
                new Searching(algorithm).run();
                break;
            case 3:
                exitMenu();
                break;
        }
    }
}
