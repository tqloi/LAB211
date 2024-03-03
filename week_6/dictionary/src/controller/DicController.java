package controller;

import model.Dictionary;
import Library.Input;

public class DicController {

    private Dictionary dictionary;
    private Input library;

    public DicController(Dictionary dictionary) {
        this.dictionary = dictionary;
        library = new Input();
    }

    public void addWord(String eng, String vie) {
        dictionary.addWord(eng, vie);
        System.out.println("Add successfully");
    }

    public void deleteWord(String eng) {
        if(dictionary.deleteWord(eng)) {
            System.out.println("Delete Successfully");
        } else {
            System.out.println("Word not found!");
        }
    }
    
    public void translateWord(String eng) {
        System.out.print("Vietnamese: ");
        System.out.println(dictionary.translate(eng));
    }
}
