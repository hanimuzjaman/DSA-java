public class helloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}

/*
1. public class HelloWorld
	•	class → In Java, everything is inside a class.
	•	HelloWorld → The name of our class (it must match the filename HelloWorld.java).
	•	public → Access modifier → means this class can be accessed from anywhere.

👉 Think of a class like a container where your code lives.

⸻

2. public static void main(String[] args)

This is the entry point of every Java program.
	•	public → Accessible everywhere (needed so JVM can run it).
	•	static → Belongs to the class, not an object. JVM doesn’t need to create an object to call main.
	•	void → No return value.
	•	main → Special method name where program starts execution.
	•	String[] args → Command-line arguments (input from terminal, rarely used in beginner programs).

👉 Without this method, your program won’t run.

⸻

3. System.out.println("Hello, World!");

This prints text to the console.
	•	System → A built-in Java class.
	•	out → Standard output stream (your screen).
	•	println → Prints text + moves cursor to new line.

👉 "Hello, World!" is a string literal inside double quotes.
*/