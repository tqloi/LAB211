package App;

public class Main extends Menu {

    private final Algorithm algorithm;

    public Main(int size) {
        super("Function", new String[]{"Sorting", "Searching", "Quit"});
        algorithm = new Algorithm(size);
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                new Sorting(algorithm).run();
                break;
            case 2:
                new Searching(algorithm).run();
                break;
            case 3:
                exitMenu();
                break;
        }
    }

    public static void main(String[] args) {
        int n;
        do {
            n = Input.getIntFromInput("number of arrays");
        } while (n <= 0);
        new Main(n).run();
    }
}
