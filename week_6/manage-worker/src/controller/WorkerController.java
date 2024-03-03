package controller;

import model.HistoryDao;
import model.WorkerDao;
import model.Worker;
import Library.Input;

public class WorkerController {

    private WorkerDao workerDao;
    private HistoryDao historyDao;
    private Input ip;

    public WorkerController(WorkerDao wd, HistoryDao hd) {
        this.workerDao = wd;
        this.historyDao = hd;
        ip = new Input();
    }

    public void addWorker() {
        String name = ip.getString("Enter name");
        int age = ip.validAge("Enter age");
        int salary = ip.validMoney("Enter salary");
        String location = ip.getString("Enter location");

        workerDao.addWorker(new Worker(0, name, age, salary, location));
    }

    public void increaseSalary() {
        int code = ip.getInt("Enter code");
        int salaryAdding = ip.validMoney("Enter salary adding");
        Worker w = workerDao.findWorker(code).orElseThrow();
        w.setSalary(w.getSalary() + salaryAdding);
        workerDao.updateSalary(w, w.getSalary());
        historyDao.addHistory(w, "Up");
    }

    public void decreaseSalary() {
        int code = ip.getInt("Enter code");
        int salaryReducing = ip.validMoney("Enter salary reducing");
        Worker w = workerDao.findWorker(code).orElseThrow();
        w.setSalary((w.getSalary() - salaryReducing) >= 0 ? w.getSalary() - salaryReducing : 0);
        workerDao.updateSalary(w, w.getSalary());
        historyDao.addHistory(w, "Down");
    }

}
