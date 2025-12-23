package dsa;

/**
 What is an Array? 
 A collection of elements stored in contiguous memory, accessible by index.

 Time Complexity
- Access: O(1)
- Search: O(n)
- Insertion/Deletion: O(n)

  Use Cases
- Storing lists of items like numbers or strings
- Implementing other data structures (e.g., stacks, queues)
- Buffers and matrices in applications
   
 */

public class Array {

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        // Accessing elements
        System.out.println("First element: " + numbers[0]);

        // Traversing array
        System.out.println("Array elements:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        // Display array length
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Array length: " + numbers.length);
    }
}
