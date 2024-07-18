package Main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

import ComplexOperations.TaskManager1;
import CustomeObjectManupulation.Task;
import PerformanceAnalysis.TaskManager2;
import QueueOperations.TaskManager;
import RealWordScenario.TaskSchedular;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        Queue<Task> linkedList = new LinkedList<>();
	        Queue<Task> priorityQueue = new PriorityQueue<>();
	        Queue<Task> arrayDeque = new ArrayDeque<>();
	        LinkedList<Task> linkedListForSort = new LinkedList<>();
	        PriorityQueue<Task> priorityQueueForMerge1 = new PriorityQueue<>();
	        PriorityQueue<Task> priorityQueueForMerge2 = new PriorityQueue<>();
	        TaskSchedular taskScheduler = new TaskSchedular();
/*
	        File file = new File("E:\\FLYNAUT ALL TASK\\CollectionTask\\src\\CustomeObjectManupulation\\task.java");
	       if(file.exists()) {
	        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
	            String line;
	            while ((line = br.readLine())!= null) {
	                String[] parts = line.split(",");
	                int id = Integer.parseInt(parts[0]);
	                String description = parts[1];
	                int priority = Integer.parseInt(parts[2]);
	                Task task = new Task(id, description, priority);
	                taskScheduler.addTask(task);
	            }
	        } catch (IOException e) {
	            System.out.println("Error reading file: " + e.getMessage());
	        }
	       }else {
	    	   System.out.println("File not found: " + file.getAbsolutePath());
	       
		}
*/        
	        File file = new File("E:\\FLYNAUT ALL TASK\\CollectionTask\\src\\CustomeObjectManupulation\\task.java");
		       if(file.exists()) {
		        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
		            String line;
		            while ((line = br.readLine())!= null) {
		                String[] parts = line.split(",");
		                if (parts.length < 3) {
		                    System.out.println(line);
		                    continue;
		                }
		                try {
		                    int id = Integer.parseInt(parts[0]);
		                    String description = parts[1];
		                    int priority = Integer.parseInt(parts[2]);
		                } catch (NumberFormatException e) {
		                	System.out.println(line);
		                }
		            }
		        } catch (IOException e) {
		            System.out.println("Error reading file: " + e.getMessage());
		        }
		       }else {
		    	   System.out.println("File not found: " + file.getAbsolutePath());
		       
			}
	        
	        
	        while (true) {
	            System.out.println("\n Welcome to the Collection Task");
	            System.out.println("1. Queue Operations");	
	            System.out.println("2. Complex Operations");
	            System.out.println("3. Performance Analysis");
	            System.out.println("4. Real-World Scenario");	            	
	            System.out.println("5. Exit");
	           	System.out.println("Enter Your Choice:");
	            
	            int choice = sc.nextInt();
	            sc.nextLine(); 

	            switch (choice) {
	            	
	            case 1:
	            	System.out.println("Choose a Queue Operations:");
	            	System.out.println("1. Enqueue a Task");
	            	System.out.println("2. Dequeue a task");
		            System.out.println("3. Peek at the task  at the head of the queue");
		            System.out.println("4. Check if a specific task exists in the Queue");
		            System.out.println("Enter Your Choice:");
		            int queueOperationsChoice = sc.nextInt();
		            sc.nextLine();
		            switch (queueOperationsChoice) {
		            			case 1:
	                    			Task task = readTask(sc);
	                    			TaskManager.addTaskToLinkedList(linkedList, task);
	                    			TaskManager.addTaskToPriorityQueue(priorityQueue, task);
	                    			TaskManager.addTaskToArrayDeque(arrayDeque, task);
	                    			System.out.println("Task enqueued Successfully");
	                    			break;
	                			case 2:
	                    			System.out.println("Choose a queue to dequeue from:");
	                    			System.out.println("1. LinkedList");
	                    			System.out.println("2. PriorityQueue");
	                    			System.out.println("3. ArrayDeque");
	                    			int queueChoice = sc.nextInt();
	                    			sc.nextLine(); 
	                    			Task dequeuedTask = null;
	                    			switch (queueChoice) {
	                        			case 1:
	                            			dequeuedTask = TaskManager.dequeueTask(linkedList);
	                            			break;
	                        			case 2:
	                            			dequeuedTask = TaskManager.dequeueTask(priorityQueue);
	                            			break;
	                        			case 3:
	                            			dequeuedTask = TaskManager.dequeueTask(arrayDeque);
	                            			break;
	                        			default:
	                            			System.out.println("Invalid choice Please Enter Correct Choice");
	                            			break;
	                    			}
	                    			if (dequeuedTask != null) {
	                        			System.out.println("Dequeued Task: " + dequeuedTask);
	                    			} else {
	                        			System.out.println("Queue is empty or invalid choice so please Enter Correct Choice");
	                    			}
	                    			break;
	                			case 3:
	                    			System.out.println("Choose a queue to peek from:");
	                    			System.out.println("1. LinkedList");
	                    			System.out.println("2. PriorityQueue");
	                    			System.out.println("3. ArrayDeque");
	                    			System.out.println("Enter Your Choice:");
	                    			queueChoice = sc.nextInt();
	                    			sc.nextLine(); 
	                    			Task peekedTask = null;
	                    			switch (queueChoice) {
	                        			case 1:
	                            			peekedTask = TaskManager.peekTask(linkedList);
	                            			break;
	                        			case 2:
	                            			peekedTask = TaskManager.peekTask(priorityQueue);
	                            			break;
	                        			case 3:
	                            			peekedTask = TaskManager.peekTask(arrayDeque);
	                            			break;
	                        			default:
	                            			System.out.println("Invalid choice Please Enter Correct Choice");
	                            			break;
	                    			}
	                    			if (peekedTask != null) {
	                        			System.out.println("Peeked Task: " + peekedTask);
	                    			} else {
	                        			System.out.println("Queue is empty or invalid choice Please Enter Correct Choice");
	                    			}
	                    			break;
	                			case 4:
	                    			System.out.println("Enter the task ID to check existence:");
	                    			int taskIdToCheck = sc.nextInt();
	                    			sc.nextLine(); 
	                    			Task taskToCheck = new Task(taskIdToCheck, "", 0);
	                    			boolean existsInLinkedList = TaskManager.containsTask(linkedList, taskToCheck);
	                    			boolean existsInPriorityQueue = TaskManager.containsTask(priorityQueue, taskToCheck);
	                    			boolean existsInArrayDeque = TaskManager.containsTask(arrayDeque, taskToCheck);
	                    			System.out.println("Exists in LinkedList: " + existsInLinkedList);
	                    			System.out.println("Exists in PriorityQueue: " + existsInPriorityQueue);
	                    			System.out.println("Exists in ArrayDeque: " + existsInArrayDeque);
	                    			break;
					default:
						System.out.println("Invalid Choice so Please Enter Correct Choice");
						}
	            break;
	            
	            case 2:
	            	System.out.println("Choose a Complex Operations:");
	            	System.out.println("");
	            	System.out.println("1. Sort tasks in LinkedList by priority");
	            	System.out.println("2. Move tasks below threshold from ArrayDeque to PriorityQueue");
	            	System.out.println("3. Merge two PriorityQueue instances");
	            	System.out.println("Enter Your Choice:");
	            	int complexOperationsChoice = sc.nextInt();
		            sc.nextLine();
		            switch (complexOperationsChoice) {
		            		case 1:
	                    		System.out.println("Enter the number of tasks to sort:");
	                    		int numTasksToSort = sc.nextInt();
	                    		sc.nextLine(); 
	                    		for (int i = 0; i < numTasksToSort; i++) {
	                        		linkedListForSort.add(new Task(i, "Task " + i, (int) (Math.random() * 100)));
	                    		}
	                    		TaskManager1.sortLinkedListByPriority(linkedListForSort);
	                    		System.out.println("Sorted LinkedList: " + linkedListForSort);
	                    		break;
	                		case 2:
	                    		System.out.println("Enter the threshold value:");
	                    		int threshold = sc.nextInt();
	                    		sc.nextLine(); 
	                    		for (int i = 0; i < 10; i++) {
	                        		arrayDeque.add(new Task(i, "Task " + i, (int) (Math.random() * 100)));
	                    		}
	                    		TaskManager1.moveTasksBelowThreshold((ArrayDeque<Task>) arrayDeque, (PriorityQueue<Task>) priorityQueue, threshold);
	                    		System.out.println("ArrayDeque after moving tasks: " + arrayDeque);
	                    		System.out.println("PriorityQueue after moving tasks: " + priorityQueue);
	                    		break;
	                		case 3:
	                    		System.out.println("Merging two PriorityQueue instances ");
	                    		for (int i = 0; i < 5; i++) {
	                        		priorityQueueForMerge1.add(new Task(i, "PQ1 Task " + i, (int) (Math.random() * 100)));
	                        		priorityQueueForMerge2.add(new Task(i + 5, "PQ2 Task " + (i + 5), (int) (Math.random() * 100)));
	                    		}
	                    		PriorityQueue<Task> mergedQueue = TaskManager1.mergePriorityQueues(priorityQueueForMerge1, priorityQueueForMerge2);
	                    		System.out.println("Merged PriorityQueue: " + mergedQueue);
	                    		break;
		            
					default:
						System.out.println("Invalid Choice so Please Enter Correct Choice");
					}
		         break;   
	                
	            case 3:
	            	System.out.println(" Choose a Performance Analysis");
	            	System.out.println("1. Perform performance analysis");
	            	System.out.println("Enter Your Choice:");
	            	int performanceAnalysisChoice =sc.nextInt();
	                sc.nextLine();
	                switch (performanceAnalysisChoice) {
	                	case 1:
	                		System.out.println("Enter the number of elements for performance analysis:");
	                		int numElements = sc.nextInt();
	                		sc.nextLine(); 
	                		TaskManager2.performanceAnalysis(numElements);
	                		break;
					}
					default:
						System.out.println("Invalid Choice so Please Enter Correct Choice");
	                break;
	               
				case 4:
						System.out.println("Choose a Real-World Scenario");
		            	System.out.println("1. Add a task to scheduler");
		            	System.out.println("2. Complete a task in scheduler");
		            	System.out.println("3. View pending tasks in scheduler");
		            	System.out.println("4. Find tasks in a priority range in scheduler");
		            	System.out.println("Enter Your Choice:");
		            	int realWorldScenarioChoice = sc.nextInt();
						sc.nextLine();
						switch (realWorldScenarioChoice) {
						case 1:
		                    Task taskToAdd = readTask(sc);
		                    taskScheduler.addTask(taskToAdd);
		                    System.out.println("Task added to scheduler");
		                    break;
		                case 2:
		                    System.out.println("Enter the task ID to complete:");
		                    int taskIdToComplete = sc.nextInt();
		                    sc.nextLine(); 
		                    Task taskToComplete = new Task(taskIdToComplete, "", 0);
		                    taskScheduler.completeTask(taskToComplete);
		                    System.out.println("Task completed SUccessfully");
		                    break;
		                case 3:
		                    taskScheduler.viewPendingTasks();
		                    break;
		                case 4:
		                    System.out.println("Enter the minimum priority:");
		                    int minPriority = sc.nextInt();
		                    System.out.println("Enter the maximum priority:");
		                    int maxPriority = sc.nextInt();
		                    sc.nextLine(); 
		                    taskScheduler.findTasksInPriorityRange(minPriority, maxPriority);
		                    break;
						
						default:
							System.out.println("Invalid Choice so Please Enter Correct Choice");
	            }	
	               break;
	              
	                case 5:
	                    System.out.println("Exiting...");
	            }
	        }
	}
	    private static Task readTask(Scanner sc) {
	        System.out.println("Enter task ID:");
	        int id = sc.nextInt();
	        sc.nextLine(); 
	        System.out.println("Enter the task description:");
	        String description = sc.nextLine();
	        System.out.println("Enter the task priority:");
	        int priority = sc.nextInt();
	        sc.nextLine(); 
	        return new Task(id, description, priority);
	    }
	}
