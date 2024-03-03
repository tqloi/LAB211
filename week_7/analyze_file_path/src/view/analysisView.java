package view;

import Library.Input;
import controller.PathController;

public class analysisView {

    private PathController pc;
    private Input ip;

    public analysisView() {
        this.ip = new Input();
    }

    public void run() {
        System.out.println("===== Analysis Path Program =====");
        String filePath = ip.getString("Please input Path");
        pc = new PathController(filePath);
        System.out.println("----- Result Analysis -----");
        pc.analyze();
    }
}
