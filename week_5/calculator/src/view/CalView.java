package view;

import controller.CalController;

public class CalView extends Menu {

    private CalController cc;

    public CalView() {
        super("========= Calculator Program =========", new String[]{"Normal Calculator", "BMI Calculator", "Quit"});
        cc = new CalController();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                cc.normalCal();
                break;
            case 2:
                cc.bmiCal();
                break;
            case 3:
                exitMenu();
                break;
        }
    }

}
