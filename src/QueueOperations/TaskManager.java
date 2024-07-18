package QueueOperations;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

import CustomeObjectManupulation.Task;

public class TaskManager {
	
		public static void addTaskToLinkedList(Queue<Task> linkedList, Task task) {
			linkedList.add(task);
		}

		public static void addTaskToPriorityQueue(Queue<Task> priorityQueue, Task task) {
			priorityQueue.add(task);
		}

		public static void addTaskToArrayDeque(Queue<Task> arrayDeque, Task task) {
			arrayDeque.add(task);
		}

		public static Task dequeueTask(Queue<Task> queue) {
			if (!queue.isEmpty()) {
				return queue.remove();
			}
			return null;
		}

		public static Task peekTask(Queue<Task> queue) {
			return queue.peek();
		}

		public static boolean containsTask(Queue<Task> queue, Task task) {
			return queue.contains(task);
		}

		
}
