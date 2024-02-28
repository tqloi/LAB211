package App;

import Library.Input;
import view.Main;

public class JavaAppilcation {

    public static void main(String[] args) {
        int n;
        do {
            n = Input.getIntFromInput("number of arrays");
        } while (n <= 0);
        new Main(n).run();
    }
}
