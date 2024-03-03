
package view;

import controller.DicController;
import Library.Input;

public class DicView extends Menu<String> {

    private DicController dicController;
    private Input ip;

    public DicView(DicController dicController) {
        super("======== Dictionary program ========",
                 new String[]{"Add word", "Delete word", "Translate", "Exit"});
        this.dicController = dicController;
        this.ip = new Input();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                System.out.println("------------- Add -------------");
                String eng = ip.getString("Enter english");
                String vi = ip.getString("Enter vietnamese");
                dicController.addWord(eng, vi);
                break;
            case 2:
                System.out.println("----------- Delete ------------");
                String eng2 = ip.getString("Enter english");
                dicController.deleteWord(eng2);
                break;
            case 3:
                System.out.println("-----------Translate ----------");
                String eng3 = ip.getString("Enter english");
                dicController.translateWord(eng3);
                break;
            case 4:
                exitMenu();
                break;
        }
    }

}
