package model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public final class Normalization {

    private String input;

    public Normalization() {
        readFile("Input.txt");
    }

    public String getInput() {
        return input.trim();
    }

    public void readFile(String file) {
        StringBuilder sb = new StringBuilder();
        try (Scanner reader = new Scanner(new File(file))) {
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                sb.append(line);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        input = sb.toString().trim();
    }

    public void saveFile(String file) throws IOException {
        try (FileWriter f = new FileWriter(new File(file))) {
            f.write(input);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void normalizeInput() {

        input = input.replaceAll("\\s+", " ").toLowerCase(); 
        input = handleComma(input);
        input = handleDot(input);
    }

    private String handleDot(String text) {
        String[] words = text.split("\\s*\\.\\s*");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            words[i] = Character.toUpperCase(words[i].charAt(0)) + words[i].substring(1);
            sb.append(words[i]).append(". ");
        }
        return sb.toString();
    }

    private String handleComma(String text) {
        text = text.replaceAll("\\s*\\,+\\s*", ", ");
        text = text.replaceAll("\\s*\\:+\\s*", ": ");
        text = text.replaceAll("\\s*\\;+\\s*", "; ");
        text = text.replaceAll("[,;:]\\s*$", " ");
        return text;
    }
}
