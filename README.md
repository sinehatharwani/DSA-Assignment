 DSA Assignment in Java

This project contains Data Structures and Algorithms (DSA) programs written .

Each question is written in a separate Java class, and all features are tested from Main.java.

Main.java
Q1 DoublyLinkedList.java
Q2(A) ArrayQueue.java
Q2(B) LinkedListQueue.java
Q3 Searching.java
Q4 RecursionProblems.java
Q5 Sorting.java
Q6 BST.java

 Q1: Doubly Linked List (DLL)

This program creates a Doubly Linked List using nodes that store:

* data
* next pointer
* previous pointer

Operations :

 Insert at beginning and end
 Delete first and last node
Delete a node by value
 Delete before or after a given value
 Find minimum and maximum value
 Print list forward and backward

Time Complexity:

| Operation                        | Time |
| -------------------------------- | ---- |
| Insert first / last              | O(1) |
| Delete first / last              | O(1) |
| Delete by value / before / after | O(n) |
| Find min / max                   | O(n) |

Q2: Queue Implementations

Two types of queues are implemented to show the difference between array-based and linked-list-based queues.

1. Array Queue
 front, rear, and size
 Automatically resizes when full
Enqueue and dequeue 

2. Linked List Queue

Uses nodes with head and tail
 No resizing required
 Enqueue and dequeue

Time & Memory Comparison:

| Queue Type        | Enqueue                       | Dequeue | Peek | Memory                    |
| ----------------- | ----------------------------- | ------- | ---- | ------------------------- |
| Array Queue       | O(1) average (O(n) on resize) | O(1)    | O(1) | Uses continuous memory    |
| Linked List Queue | O(1)                          | O(1)    | O(1) | Extra memory for pointers |

Finding minimum and maximum takes O(n) in both queues (by checking all elements).

Q3: Searching Algorithms

Searching is performed on a sorted array using different methods:

Iterative Binary Search (search for 20)
Recursive Binary Search (search for 25)
Recursive Linear Search (search for 12)
Recursive functions to find min and max

Complexity:

| Algorithm               | Time     | Space                                |
| ----------------------- | -------- | ------------------------------------ |
| Binary Search           | O(log n) | Iterative: O(1), Recursive: O(log n) |
| Recursive Linear Search | O(n)     | O(n)                                 |
| Recursive Min/Max       | O(n)     | O(n)                                 |


Q4: Recursion Problems

1.Factorial of a number
2.Fibonacci series
3.Sum of array elements
4.Check if an array is sorted
5. Find minimum and maximum in an array

 Q5: Sorting Algorithms

Sorting is done on the array  {5, 1, 4, 2, 8} using two algorithms.

Merge Sort:
Uses divide and conquer
Always runs in O(n log n)
Uses extra space for merging

Quick Sort:
Uses a pivot to divide the array
Very fast on average
Worst case happens when array is poorly partitioned

Comparison:

| Algorithm  | Time Complexity                 | Space Complexity |
| ---------- | ------------------------------- | ---------------- |
| Merge Sort | O(n log n) (all cases)          | O(n)             |
| Quick Sort | O(n log n) average, O(n²) worst | O(log n) average |

Q6: Binary Search Tree (BST)

A BST is created using the values:
{50, 30, 70, 20, 40, 60, 80}

operations:
* Inorder, Preorder, Postorder traversal
* Search for value 60
* Delete node 80
* Find minimum and maximum value
* Count total nodes and leaf nodes
* Calculate height of the tree

BST Time Complexity:

| Operation                   | Average Case | Worst Case |
| --------------------------- | ------------ | ---------- |
| Insert / Search / Delete    | O(log n)     | O(n)       |
| Traversals / Count / Height | O(n)         | O(n)       |

