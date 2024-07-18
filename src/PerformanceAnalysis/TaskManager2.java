package PerformanceAnalysis;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;

import CustomeObjectManupulation.Task;

public class TaskManager2 {
	public static void performanceAnalysis(int numElements) {
        LinkedList<Task> linkedList = new LinkedList<>();
        PriorityQueue<Task> priorityQueue = new PriorityQueue<>();
        ArrayDeque<Task> arrayDeque = new ArrayDeque<>();

        long startTime = System.nanoTime();
        for (int i = 0; i < numElements; i++) {
            linkedList.add(new Task(i, "LinkedList Task", i));
        }
        long endTime = System.nanoTime();
        long linkedListEnqueueTime = endTime - startTime;
        System.out.println("LinkedList enqueue time: " + linkedListEnqueueTime + " nanoseconds");

        startTime = System.nanoTime();
        for (int i = 0; i < numElements; i++) {
            priorityQueue.add(new Task(i, "PriorityQueue Task", i));
        }
        endTime = System.nanoTime();
        long priorityQueueEnqueueTime = endTime - startTime;
        System.out.println("PriorityQueue enqueue time: " + priorityQueueEnqueueTime + " nanoseconds");

        startTime = System.nanoTime();
        for (int i = 0; i < numElements; i++) {
            arrayDeque.add(new Task(i, "ArrayDeque Task", i));
        }
        endTime = System.nanoTime();
        long arrayDequeEnqueueTime = endTime - startTime;
        System.out.println("ArrayDeque enqueue time: " + arrayDequeEnqueueTime + " nanoseconds");

        startTime = System.nanoTime();
        for (int i = 0; i < numElements; i++) {
            linkedList.poll();
        }
        endTime = System.nanoTime();
        long linkedListDequeueTime = endTime - startTime;
        System.out.println("LinkedList dequeue time: " + linkedListDequeueTime + " nanoseconds");

        startTime = System.nanoTime();
        for (int i = 0; i < numElements; i++) {
            priorityQueue.poll();
        }
        endTime = System.nanoTime();
        long priorityQueueDequeueTime = endTime - startTime;
        System.out.println("PriorityQueue dequeue time: " + priorityQueueDequeueTime + " nanoseconds");

        startTime = System.nanoTime();
        for (int i = 0; i < numElements; i++) {
            arrayDeque.poll();
        }
        endTime = System.nanoTime();
        long arrayDequeDequeueTime = endTime - startTime;
        System.out.println("ArrayDeque dequeue time: " + arrayDequeDequeueTime + " nanoseconds");

        startTime = System.nanoTime();
        for (int i = 0; i < numElements; i++) {
            linkedList.peek();
        }
        endTime = System.nanoTime();
        long linkedListPeekTime = endTime - startTime;
        System.out.println("LinkedList peek time: " + linkedListPeekTime + " nanoseconds");

        startTime = System.nanoTime();
        for (int i = 0; i < numElements; i++) {
            priorityQueue.peek();
        }
        endTime = System.nanoTime();
        long priorityQueuePeekTime = endTime - startTime;
        System.out.println("PriorityQueue peek time: " + priorityQueuePeekTime + " nanoseconds");

        startTime = System.nanoTime();
        for (int i = 0; i < numElements; i++) {
            arrayDeque.peek();
        }
        endTime = System.nanoTime();
        long arrayDequePeekTime = endTime - startTime;
        System.out.println("ArrayDeque peek time: " + arrayDequePeekTime + " nanoseconds");
    }
}
