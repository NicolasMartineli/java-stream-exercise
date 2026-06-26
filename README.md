Markdown
# Java Stream Practice Exercises

A collection of basic console applications developed to practice programming logic, file handling, and the Java Stream API.

##  Project Description
This repository contains academic exercises designed to practice processing object data from text files (`.txt` / `.csv`). The main focus is implementing functional programming concepts in Java using standard pipeline operations like filtering, mapping, sorting, and aggregating data.

---

##  Exercises Included

### 1. Product Data Processing (`Product`)
Reads a list of products (name and price) from a file, calculates the average price, and displays the names of products that are below the average price, sorted in reverse alphabetical order.

#### Input File Example (`in.txt`):
```text
Tv,900.00
Mouse,50.00
Tablet,350.00
HD Case,80.00
Output Example:
Plaintext
Average price: 345.00
Tablet
Mouse
HD Case
2. Employee Data Processing (Employee)
Reads employee records (name, email, and salary) from a file. It performs two main operations based on user input:

Filters and displays the emails of employees whose salary is above a user-provided value, sorted in alphabetical order.

Computes and displays the sum of salaries of all employees whose name starts with the letter 'M' (case-insensitive).

Input File Example (in.txt):
Plaintext
Maria,maria@gmail.com,3200.00
Alex,alex@gmail.com,1900.00
Marco,marco@gmail.com,1700.00
Bob,bob@gmail.com,3500.00
Anna,anna@gmail.com,2800.00
Output Example:
Plaintext
Enter full file path: c:\temp\in.txt
Enter salary: 2000.00
Email of people whose salary is more than 2000.00:
anna@gmail.com
bob@gmail.com
maria@gmail.com
Sum of salary of people whose name starts with 'M': 4900.00
```
 ##  Concepts Practiced
File I/O: Reading files efficiently using BufferedReader and FileReader.

Data Streams API: Heavy utilization of .filter(), .map(), .sorted(), and .reduce().

Functional Programming: Custom comparators, Lambda Expressions (->), and Method References.

Error Handling: Robust structure using try-with-resources block and IOException catching.

This repository was created solely for learning, practicing, and academic purposes.
