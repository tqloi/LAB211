package view;

import controller.DataFormatController;

public class DataFormatView {

    private DataFormatController dfc;

    public DataFormatView() {
        dfc = new DataFormatController();
    }

    public void run() {
        System.out.println("====== Validate Progaram ======");
        dfc.formatPhone();
        dfc.formatEmail();
        dfc.formatDate();
    }
}
