Java Multithreading — Single-threaded vs Multi-threaded Web Server 🧵🚀

This repository is a simple demonstration of Multithreading in Java, designed to help understand the difference between single-threaded and multi-threaded server applications.

It contains two folders:

SingleThread/ — A basic server-client setup running on a single thread.

MultiThread/ — An enhanced server-client setup that handles multiple client requests simultaneously using multithreading.

🚀 How to Run

## Clone the repository:
```
git clone https://github.com/RATAN23/Java---Multithreading.git
```
```
cd Java---Multithreading
```

### Navigate to the desired folder:

For Single-threaded example:
```
cd SingleThread
```
For Multi-threaded example
```
cd MultiThread
```
### Run the server:
Open a terminal and execute:
```
java Server
```

Run the client(s):
In a new terminal window, execute:
```
java Client
```

✍️ Description
This project is built for learning purposes to visualize how multithreading works in Java.

The Single-threaded server processes one request at a time.

The Multi-threaded server can handle multiple client requests concurrently by spawning new threads for each connection.

