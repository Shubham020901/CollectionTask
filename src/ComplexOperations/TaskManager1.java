package ComplexOperations;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

import CustomeObjectManupulation.Task;

public class TaskManager1 {
	public static void sortLinkedListByPriority(LinkedList<Task> linkedList) {
        Collections.sort(linkedList, Comparator.comparingInt(Task::getPriority));
    }

    public static void moveTasksBelowThreshold(ArrayDeque<Task> arrayDeque, PriorityQueue<Task> priorityQueue, int threshold) {
        List<Task> tasksToMove = new ArrayList<>();
        for (Task task : arrayDeque) {
            if (task.getPriority() < threshold) {
                tasksToMove.add(task);
            }
        }
        arrayDeque.removeAll(tasksToMove);
        priorityQueue.addAll(tasksToMove);
    }

    public static PriorityQueue<Task> mergePriorityQueues(PriorityQueue<Task> pq1, PriorityQueue<Task> pq2) {
        PriorityQueue<Task> merged = new PriorityQueue<>(pq1);
        merged.addAll(pq2);
        return merged;
    }

	

}
