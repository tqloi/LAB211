/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App;

import controller.HistoryController;
import controller.WorkerController;
import model.HistoryDao;
import model.WorkerDao;
import view.WorkerView;

/**
 *
 * @author admin
 */
public class App {
    public static void main(String[] args) {
        HistoryDao historyDao = new HistoryDao();
        WorkerDao workerDao = new WorkerDao();
        HistoryController historyController = new HistoryController(historyDao);
        WorkerController workerController = new WorkerController(workerDao, historyDao);
        
        new WorkerView(historyController, workerController).run();
    }
}
