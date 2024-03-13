
package controller;

import model.Task;
import model.TaskList;

public class TaskController {

    private TaskList taskList;

    public TaskController() {
        taskList = new TaskList();
    }

    public boolean addTask(String requirementName, int taskTypeID, String date, double planFrom, double planTo, String assignee, String reviewer) {
        try {
            taskList.addTask(requirementName, date, taskTypeID, planFrom, planTo, assignee, reviewer);
            System.out.println("Successful");
            return true;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }

    public boolean deleteTask(int id) {
        try {
            taskList.deleteTask(id);
            System.out.println("Successful");
            return true;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }

    public void displayTasks() {
        if(taskList.getDataTasks().isEmpty()) {
            System.out.println("Not found any task");
        }
        for (Task t : taskList.getDataTasks()) {
            System.out.println(t);
        }
    }
}
