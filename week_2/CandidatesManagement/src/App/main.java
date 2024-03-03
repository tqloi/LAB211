
package App;

import controller.CandidateController;
import view.AppView;

public class main {
    
    public static void main(String[] args) {
        CandidateController cL = new CandidateController();
        new AppView(cL).run();
    }
}
