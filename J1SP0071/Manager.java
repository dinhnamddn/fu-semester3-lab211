/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1sp0071;

import java.util.*;

/**
 *
 * @author dinhnam_ddn
 */
public class Manager {
//    private ArrayList<Task> list = new ArrayList<>();

    public Manager() {

    }

    public static void addTask(ArrayList<Task> list) {
//        int id;
//        if (list.isEmpty()) {
//            id = 1;
//        } else {
//            id = list.get(list.size() - 1).getId() + 1;
//        }
        int id = 1;
        if (!list.isEmpty()) {
            int maxId = list.get(0).getId();
            for (int i = 1; i < list.size(); i++) {
                if (list.get(i).getId() > maxId) {
                    maxId = list.get(i).getId();
                }
            }
            id = maxId + 1;
        }
        String name = Validation.checkInputString("Enter requirement name: ", "[a-zA-Z0-9 ]+", null);
        Integer taskTypeId = Validation.checkInt("Enter task type ID: ", 1, 4, null);
        Date date = Validation.checkDate("Enter date: ", "MMM-dd-yyyy", null);
        Double from = Validation.checkDouble("Enter start time [8.0 - 17.5]: ", 8.0, 17.5, null);
        Double to = Validation.checkDouble("Enter end time [" + from + " - 17.5]", from, 17.5, null);
        String assignee = Validation.checkInputString("Enter assignee: ", "[a-zA-Z ]+", null);
        String reviewer = Validation.checkInputString("Enter reviewer: ", "[a-zA-Z ]+", null);
        list.add(new Task(id, name, taskTypeId, date, from, to, assignee, reviewer));
        System.out.println("Add task successful!");
    }
    
    private static int getTaskID(ArrayList<Task> list) {
        int id = Validation.checkInt("Enter ID: ", 1, Integer.MAX_VALUE, null);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    public static void updateTask(ArrayList<Task> list) {
        int id = getTaskID(list);
        if (id != -1) {
            Task task = list.get(id);

            String name = Validation.checkInputString("Enter requirement name: ", "[a-zA-Z ]+", "nope");
            if (name != null) {
                task.setRequirementName(name);
            }

            Integer taskTypeId = Validation.checkInt("Enter task type ID: ", 1, 4, "nope");
            if (taskTypeId != null) {
                task.setTaskTypeId(taskTypeId);
            }

            Date date = Validation.checkDate("enter date: ", "MMM-dd-yyyy", "nope");
            if (date != null) {
                task.setDate(date);
            }

            Double from = Validation.checkDouble("Enter start time [8.0 - 17.5]: ", 8.0, 17.5, "nope");
            Double to;
            if (from != null) {
                task.setPlanFrom(from);
                if (from > task.getPlanTo()) {
                    to = Validation.checkDouble("Enter end time [" + from + "-17.5]", from, 17.5, null);
                } else {
                    to = Validation.checkDouble("Enter end time [" + from + "-17.5]", from, 17.5, "nope");
                }
            } else {
                to = Validation.checkDouble("Enter end time [" + task.getPlanFrom() + "-17.5]", task.getPlanFrom(), 17.5, "nope");
            }
            if (to != null) {
                task.setPlanTo(to);
            }

            String assignee = Validation.checkInputString("Enter assignee: ", "[a-zA-Z ]+", "nope");
            if (assignee != null) {
                task.setAssignee(assignee);
            }

            String reviewer = Validation.checkInputString("Enter reviewer: ", "[a-zA-Z ]+", "nope");
            if (reviewer != null) {
                task.setReviewer(reviewer);
            }
            System.out.println("Update successful!");
        } else {
            System.out.println("Id is not exist!");
        }
    }

    public static void deleteTask(ArrayList<Task> list) {
        do {
            int id = getTaskID(list);
            if (id != -1) {
                list.remove(id);
                for (int i = id; i < list.size(); i++) {
                    list.get(i).setId(list.get(i).getId() - 1);
                }
                System.out.println("Remove successful!");
                return;
            }
            System.out.println("Id is not exist!");
        } while (true);

    }

    public static void getDataTasks(ArrayList<Task> list) {
        if (list.isEmpty()) {
            System.out.println("List is empty!");
            return;
        }
        Collections.sort(list);
        System.out.printf("%-5s%-15s%-15s%-15s%-15s%-15s%-15s\n",
                "ID", "Name", "Task Type", "Date", "Time", "Assign", "Reviewer");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
    }
}
