package App;

import Library.Input;
import view.AppView;

public class JavaAppilcation {

    public static void main(String[] args) {
        int n;
        do {
            n = new Input().getIntFromInput("number of arrays");
        } while (n <= 0);
        new AppView(n).run();
    }
}
