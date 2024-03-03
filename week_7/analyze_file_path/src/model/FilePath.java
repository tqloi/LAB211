package model;

import java.util.regex.Pattern;

public class FilePath {

    private String filePath;

    public FilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public String toString() {
        return "FilePath{" + "filePath=" + filePath + '}';
    }

    public boolean isValidFilePath() {
        String regex = "^[A-Za-z]:\\\\(?:[^\\\\]+\\\\)*[^\\\\]+\\.[A-Za-z]+$";
        return Pattern.matches(regex, filePath);
    }

    public String getPath() {
        int lastSlashIndex = filePath.lastIndexOf('\\');
        String path = filePath.substring(0, lastSlashIndex);
        return path;
    }

    public String getFileName() {
        int lastSlashIndex = filePath.lastIndexOf('\\');
        int lastDotIndex = filePath.lastIndexOf('.');
        String fileName = filePath.substring(lastSlashIndex + 1, lastDotIndex);
        return fileName;
    }

    public String getExtension() {
        String[] path = filePath.split("\\.");
        return path[path.length - 1];
    }

    public String getDisk() {
        int firstIndex = filePath.indexOf(':');
        String path = filePath.substring(0, firstIndex);
        return path;
    }

    public String[] getFolders() {
        int firstIndex = filePath.indexOf(':');
        int lastIndex = filePath.lastIndexOf('.');
        String path = filePath.substring(firstIndex + 1, lastIndex);
        String[] folder = path.split("\\\\");
        return folder;
    }
}
