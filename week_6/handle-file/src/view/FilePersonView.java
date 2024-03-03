
package view;

import controller.FileController;
import Library.Input;

/**
 *
 * @author admin
 */
public class FilePersonView extends Menu<String> {

    private FileController fileController;
    private Input ip;

    public FilePersonView(FileController fileController) {
        super("File processing", new String[]{"Find person info", "Copy Text to new file", "Exit"});
        this.fileController = fileController;
        ip = new Input();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                String path = ip.getString("Enter path");
                Float money = ip.getFloat("Enter money");
                fileController.displayPersons(path, money);
                break;
            case 2:
                String src = ip.getString("Enter source");
                String newFile = ip.getString("Enter new file");
                fileController.copyData(src, newFile);
                break;
            case 3:
                exitMenu();
                break;

        }
    }

}
