package dsa;

/* 
   Hospital Waiting Line Queue
   ==========================
   This program implements a simple hospital queue using an array.
   Each patient has an ID, name, and complaint.
   The queue follows FIFO (First-In-First-Out), so patients are
   attended in the order they arrive. You can enqueue (add),
   dequeue (attend), (peek) at the next patient, and check the queue size.
*/

public class Queue {

    // ---- Patient Data Model ----
	// ---- Represents a patient in the hospital
    
    class Patient {
        private int id;
        private String name;
        private String complaint;

        // Constructor
        public Patient(int id, String name, String complaint) {
            this.id = id;
            this.name = name;
            this.complaint = complaint;
        }

        // Creating getters 
        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getComplaint() {
            return complaint;
        }
    }

    // ---- Array-Based Hospital Queue ----
    // Implements a simple queue using an array
       
    class HospitalQueue {
        private Patient[] queue; // Array to store patients
        private int front;       // Points to the first patient
        private int rear;        // Points to the last patient
        private int size;        // Current number of patients

        public HospitalQueue(int capacity) {
            queue = new Patient[capacity];
            front = 0;
            rear = -1;
            size = 0;
        }

        // Check if the queue is empty
        public boolean isEmpty() {
            return size == 0;
        }

        // Check if the queue is full
        public boolean isFull() {
            return size == queue.length;
        }

        // Get the current number of patients
        public int size() {
            return size;
        }

        // ---- Operation Methods ----

        // Add a patient to the end of the queue
        public void enqueue(Patient patient) {
            if (isFull()) {
                System.out.println("Waiting line is full. Patient cannot be added: " + patient.getName());
                return;
            }

            rear++;                // Move rear pointer forward
            queue[rear] = patient; // Place the new patient at rear
            size++;                // Increment size

            System.out.println("Patient added: " + patient.getName());
        }

        // Remove the patient at the front of the queue
        public Patient dequeue() {
            if (isEmpty()) {
                System.out.println("No patients to attend.");
                return null;
            }

            Patient patient = queue[front]; // Get the front patient
            front++;                         // Move front pointer forward
            size--;                          // Decrease size

            System.out.println("Attending patient: " + patient.getName());
            return patient;
        }

        // Peek at the patient at the front without removing
        public Patient peek() {
            if (isEmpty()) {
                return null;
            }
            return queue[front];
        }
    }

    // ---- Main Method ----
    public static void main(String[] args) {
        Queue hospital = new Queue(); // Outer class instance needed for non-static inner classes

        // Create a queue with capacity 5
        HospitalQueue queue = hospital.new HospitalQueue(5);

        // Adding patients
        queue.enqueue(hospital.new Patient(1, "Alicia", "Fever"));
        queue.enqueue(hospital.new Patient(2, "Xenia", "Cough"));
        queue.enqueue(hospital.new Patient(3, "Giovanni", "Headache"));

        // Peek at the next patient
        System.out.println("Next patient: " + queue.peek().getName());

        // Attend to patients
        queue.dequeue();
        queue.dequeue();

        // Peek at the next patient after dequeues
        System.out.println("Next patient: " + queue.peek().getName());

        // Add another patient
        queue.enqueue(hospital.new Patient(4, "John", "Flu"));

        // Final state of the queue
        System.out.println("\nFinal Queue:");
        while (!queue.isEmpty()) {
            Patient p = queue.dequeue();
            System.out.println(p.getName() + " with complaint: " + p.getComplaint());
        }
    }
}
