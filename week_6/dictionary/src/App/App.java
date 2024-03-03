package App;

import controller.DicController;
import model.Dictionary;
import view.DicView;

public class App {

    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        DicController dictionaryController = new DicController(dictionary);
        new DicView(dictionaryController).run();
    }
}
