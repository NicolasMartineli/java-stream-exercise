# Java Lambda & Streams Practice

A straight-to-the-point practice exercise designed to train functional programming concepts in Java, specifically focusing on **Lambda Expressions**, **Streams API**, and **File I/O**.

##  Goal
Read employee data from a `.csv` file, filter and process the information using Java Streams, and perform specific queries.

## ⚙️ Features
- Reads structured data (`Name, Email, Salary`) from a file.
- **Query 1:** Filters and lists in alphabetical order the emails of employees earning above a user-defined threshold.
- **Query 2:** Calculates the total sum of salaries for all employees whose names start with the letter **'M'**.

##  Sample Input & Output

### Input File (`in.txt`)
```text
Maria,maria@gmail.com,3200.00
Alex,alex@gmail.com,1900.00
Marco,marco@gmail.com,1700.00
Bob,bob@gmail.com,3500.00
Anna,anna@gmail.com,2800.00

Execution Example
Plaintext
Enter full file path: c:\temp\in.txt
Enter salary: 2000.00
Email of people whose salary is more than 2000.00:
anna@gmail.com
bob@gmail.com
maria@gmail.com
Sum of salary of people whose name starts with 'M': 4900.00
```
 Tech Stack
Language: Java

Core Concepts: Streams API (filter, map, sorted, reduce), Lambda Expressions, BufferedReader.

Note: This is a coding exercise created for learning and mastering functional paradigms in Java.
