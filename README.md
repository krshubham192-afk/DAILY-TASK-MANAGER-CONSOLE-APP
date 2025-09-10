✅ Task Manager (Java Console App)
A simple command-line Task Manager built in Java that allows users to add, view, complete, and delete tasks. Each task includes a title, due date, and completion status. Tasks are saved to a local file so your to-do list persists between sessions.

📦 Features
📝 Add tasks with a title and due date

👀 View all tasks with status indicators

✅ Mark tasks as completed

❌ Delete tasks from the list

💾 Save and load tasks from a local file (tasks.txt)

🚀 Getting Started
Prerequisites
Java 8 or higher installed

A terminal or IDE (e.g., IntelliJ, Eclipse, VS Code)

Running the App
Clone the repository:

bash
git clone https://github.com/your-username/task-manager-java.git
cd task-manager-java
Compile the Java files:

bash
javac Task.java TaskManager.java
Run the program:

bash
java TaskManager
📂 File Structure
Code
task-manager-java/
├── Task.java          # Task class with properties and file I/O methods
├── TaskManager.java   # Main class with menu logic and user interaction
└── tasks.txt          # Auto-generated file storing saved tasks
🧠 How It Works
Tasks are stored in memory during runtime and saved to tasks.txt on exit.

Each task is serialized using a pipe-separated format: title|dueDate|isCompleted.

On startup, the app reads from tasks.txt and reconstructs the task list.

💡 Future Enhancements
Add task categories or priorities

Implement search or filter functionality

Use a GUI (e.g., JavaFX or Swing) for better UX

Store tasks in a database for scalability

📜 License
This project is open-source and available under the MIT License.
