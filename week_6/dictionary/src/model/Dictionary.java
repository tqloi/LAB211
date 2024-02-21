package model;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class Dictionary {

    private HashMap<String, String> dictionary;

    public Dictionary() {
        dictionary = new HashMap<>();
    }

    public void addWord(String eng, String vie) {
        dictionary.put(eng, vie);
        updateFile();
    }

    public boolean deleteWord(String eng) {
        if (dictionary.containsKey(eng)) {
            dictionary.remove(eng);
            updateFile();
            return true;
        }
        return false;
    }

    public String translate(String eng) {
        return dictionary.getOrDefault(eng, "Not found");
    }

    private void updateFile() {
        try ( BufferedWriter writer = new BufferedWriter(new FileWriter("dictionary.txt"))) {
            for (String eng : dictionary.keySet()) {
                String vie = dictionary.get(eng);
                writer.write(eng + "," + vie);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error updating");
        }
    }
}
