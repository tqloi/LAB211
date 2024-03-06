package view;

import controller.TaskController;
import Library.Input;

public class TaskView extends Menu {

    private TaskController taskController;
    private Input ip;

    public TaskView() {
        super("========= Task program =========", new String[]{"Add task", "Delete task", "Display tasks", "Exit"});
        taskController = new TaskController();
        ip = new Input();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                System.out.println("------------Add Task---------------");
                String name = ip.getString("Requirement Name");
                int taskType = ip.getInt("Task Type");
                String date = ip.getString("Date");
                double from = ip.getDouble("From");
                double to = ip.getDouble("To");
                String assignee = ip.getString("Assignee");
                String reviewer = ip.getString("Reviewer");
                taskController.addTask(name, taskType, date, from, to, assignee, reviewer);
                break;
            case 2:
                System.out.println("---------Del Task------");
                int id = ip.getInt("ID");
                taskController.deleteTask(id);
                break;
            case 3:
                System.out.println("----------------------------------------- Task ---------------------------------------");
                System.out.println(String.format("%-5s %-19s %-12s %-12s %-12s %-12s %-12s",
                        "ID", "Name", "Task Type", "Date", "Time", "Assignee", "Reviewer"));
                taskController.displayTasks();
                break;
            case 4:
                exitMenu();
                break;
        }
    }

}
