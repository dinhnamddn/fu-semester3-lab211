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
public class J1SP0071 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Task> list = new ArrayList<>();
        list.add(new Task(1, "Task 1", 1, new Date(121, 9, 21), 8, 12.5, "Dev", "Lead"));
        list.add(new Task(2, "Task 2", 2, new Date(121, 10, 01), 8.5, 9.5, "Tester", "Lead"));
        list.add(new Task(3, "Task 3", 3, new Date(121, 10, 05), 10, 15.5, "Designer", "Lead"));
        
        while (true) {
            System.out.println("-----------------------------------------");
            System.out.println("1. Add task");
            System.out.println("2. Update task");
            System.out.println("3. Delete task");
            System.out.println("4. Show task");
            System.out.println("5. Exit");
            int choice = Validation.checkInt("Enter your choose: ", 1, 5, null);
            switch (choice) {
                case 1:
                    Manager.addTask(list);
                    break;
                case 2:
                    Manager.updateTask(list);
                    break;
                case 3:
                    Manager.deleteTask(list);
                    break;
                case 4:
                    Manager.getDataTasks(list);
                    break;
                case 5:
                    return;
            }
        }
    }
    
}
