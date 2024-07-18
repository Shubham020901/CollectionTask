You are tasked with creating a Java application to manage and manipulate collections of Task objects using the Queue interface and its implementations (LinkedList, PriorityQueue, and ArrayDeque). This assignment will challenge your understanding of queue operations, custom object handling, and performance analysis. You will also apply these concepts to a real-world scenario involving a TaskScheduler class.

**Requirements**
**Task 1: Custom Object Manipulation**
Define a Task class with the following properties:

int id
String description
int priority (lower value means higher priority)
Ensure the Task class implements the Comparable<Task> interface to allow for natural ordering by priority.

**Implement methods to add Task objects to a LinkedList, PriorityQueue, and ArrayDeque.
**
**Task 2: Queue Operations**
Create three queues of Task objects using LinkedList, PriorityQueue, and ArrayDeque.
Add elements to these queues, ensuring a mix of unique and duplicate tasks with varying priorities.
Perform the following operations on the queues and print the results:
Enqueue tasks.
Dequeue tasks.
Peek at the task at the head of the queue.
Check if a specific task exists in the queue.

**Task 3: Complex Operations**
Sort the Task objects in the LinkedList based on priority using a custom comparator.
Create a method that moves all tasks with a priority below a given threshold from the ArrayDeque to the PriorityQueue.
Create a method that merges two PriorityQueue instances into one, maintaining priority order.

**Task 4: Performance Analysis**
Measure and compare the performance of LinkedList, PriorityQueue, and ArrayDeque for enqueue, dequeue, and peek operations with a large number of elements (e.g., 1,000,000).

**Task 5: Real-World Scenario**
Create a class TaskScheduler with the following properties:
Queue<Task> pendingTasks
Queue<Task> completedTasks
Methods to add, complete, and view tasks.
Implement methods in the TaskScheduler class to:
Add tasks to the scheduler.
Mark tasks as completed and move them to the completedTasks queue.
View all pending tasks ordered by priority.
Find tasks within a certain priority range.
