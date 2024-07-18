package RealWordScenario;

import java.util.PriorityQueue;
import java.util.Queue;

import CustomeObjectManupulation.Task;

public class TaskSchedular {
	private Queue<Task> pendingTasks;
    private Queue<Task> completedTasks;

    public void TaskScheduler() {
        pendingTasks = new PriorityQueue<>();
        completedTasks = new PriorityQueue<>();
    }

    public void addTask(Task task) {
        pendingTasks.add(task);
    }

    public void completeTask(Task task) {
        if (pendingTasks.remove(task)) {
            completedTasks.add(task);
        }
    }
/*
    public void viewPendingTasks() {
        System.out.println("Pending Tasks:");
        for (Task task : pendingTasks) {
            System.out.println(task);
        }
    }

    public void findTasksInPriorityRange(int minPriority, int maxPriority) {
        System.out.println("Tasks in priority range " + minPriority + " to " + maxPriority + ":");
        for (Task task : pendingTasks) {
            if (task.getPriority() >= minPriority && task.getPriority() <= maxPriority) {
                System.out.println(task);
            }
        }
*/    
    
    public void viewPendingTasks() {
        if (pendingTasks.isEmpty()) {
            System.out.println("Pending Tasks: (Empty)");
            return;
        }
        System.out.println("Pending Tasks:");
        for (Task task : pendingTasks) {
            System.out.println(task);
        }
    }

    public void findTasksInPriorityRange(int minPriority, int maxPriority) {
        if (pendingTasks.isEmpty()) {
            System.out.println("Tasks in priority range " + minPriority + " to " + maxPriority + ": (Empty)");
            return;
        }
        System.out.println("Tasks in priority range " + minPriority + " to " + maxPriority + ":");
        for (Task task : pendingTasks) {
            if (task.getPriority() >= minPriority && task.getPriority() <= maxPriority) {
                System.out.println(task);
            }
        }
    }
}
