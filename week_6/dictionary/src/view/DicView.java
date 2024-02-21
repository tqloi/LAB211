
package view;

import controller.DicController;
import utils.Library;

public class DicView extends Menu<String> {

    private DicController dicController;
    private Library library;

    public DicView(DicController dicController) {
        super("======== Dictionary program ========",
                 new String[]{"Add word", "Delete word", "Translate", "Exit"});
        this.dicController = dicController;
        this.library = new Library();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                System.out.println("------------- Add -------------");
                String eng = library.getString("Enter english");
                String vi = library.getString("Enter vietnamese");
                dicController.addWord(eng, vi);
                break;
            case 2:
                System.out.println("----------- Delete ------------");
                String eng2 = library.getString("Enter english");
                dicController.deleteWord(eng2);
                break;
            case 3:
                System.out.println("-----------Translate ----------");
                String eng3 = library.getString("Enter english");
                dicController.translateWord(eng3);
                break;
            case 4:
                exitMenu();
                break;
        }
    }

}
