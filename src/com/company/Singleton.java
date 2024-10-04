package com.company;

public class Singleton {
    // Volatile keyword ensures visibility of changes across threads
    private static volatile Singleton instance;


    // Private constructor to prevent instantiation from outside
    private Singleton() {}

    // Public method to provide access to the instance
    public static Singleton getInstance() {
        if (instance == null) { // First check (no synchronization)
            synchronized (Singleton.class) {
                if (instance == null) { // Second check (with synchronization)
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
    public void doSomething() {
        // Method implementation
    }

    // Example method
    public void showMessage() {
        System.out.println("Hello, I am a singleton instance!");
    }

    // Example usage
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        // Check if both variables reference the same instance
        System.out.println(singleton1 == singleton2);  // Output: true

        // Using singleton instance method
        singleton1.showMessage();

        //doublelevel locking
        // Accessing the Singleton instance
        Singleton singleton = Singleton.getInstance();
        singleton.doSomething();
    }
}

