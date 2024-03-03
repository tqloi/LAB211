package controller;

import java.util.Arrays;
import model.FilePath;

public class PathController {

    private FilePath filePath;

    public PathController(String fp) {
        filePath = new FilePath(fp);
    }

    public void analyze() {
        if (filePath.isValidFilePath() == true) {
            String disk = filePath.getDisk();
            String extension = filePath.getExtension();
            String fileName = filePath.getFileName();
            String path = filePath.getPath();
            String[] folders = Arrays.copyOfRange(filePath.getFolders(), 1, filePath.getFolders().length - 1);
            
            System.out.println("Disk: " + disk);
            System.out.println("Extension: " + extension);
            System.out.println("File name: " + fileName);
            System.out.println("Path: " + path);
            System.out.println("Folders: " + Arrays.toString(folders));
        } else {
            System.err.println("Invalid file path!");
        }
    }
}
