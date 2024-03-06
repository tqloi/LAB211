
package controller;

import java.util.HashMap;
import java.util.List;
import model.AnalyzeString;

public class StringController {

    private AnalyzeString analyzeString;

    public StringController() {
        analyzeString = new AnalyzeString();
    }

    public void getAnalyzeString(String input) {
        analyzeString.setInput(input);
        HashMap<String, List<Integer>> numberAnalysis = analyzeString.getNumberAnalysis();
        HashMap<String, StringBuilder> characterAnalysis = analyzeString.getCharacterAnalysis();

        System.out.println("Perfect Square numbers: " + numberAnalysis.get("squareNumbers"));
        System.out.println("Odd numbers: " + numberAnalysis.get("oddNumbers"));
        System.out.println("Even numbers: " + numberAnalysis.get("evenNumbers"));
        System.out.println("All numbers: " + numberAnalysis.get("allNumbers"));

        System.out.println("Uppercase characters: " + characterAnalysis.get("uppercaseCharacters"));
        System.out.println("Lowercase characters: " + characterAnalysis.get("lowercaseCharacters"));
        System.out.println("Special characters: " + characterAnalysis.get("specialCharacters"));
        System.out.println("All characters:\n" + characterAnalysis.get("allCharacters"));
    }
}
