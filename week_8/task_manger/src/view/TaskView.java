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
                String name;
                int taskType;
                String date;
                double from;
                double to;
                String assignee;
                String reviewer;
                do {
                    System.out.println("------------Add Task---------------");
                    name = ip.getString("Requirement Name");
                    taskType = ip.getInt("Task Type");
                    date = ip.getString("Date");
                    from = ip.getDouble("From");
                    to = ip.getDouble("To");
                    assignee = ip.getString("Assignee");
                    reviewer = ip.getString("Reviewer");
                } while (taskController.addTask(name, taskType, date, from, to, assignee, reviewer) == false);
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
