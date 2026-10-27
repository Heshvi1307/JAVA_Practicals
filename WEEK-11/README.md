# Java File Handling and NIO Practicals

This repository contains three Java practicals based on Object Serialization, file handling, and Java NIO.

## Practicals

### 1. Save and Load Objects Using Serialization

In this practical, a `Student` class implements the `Serializable` interface. An array of student objects is saved to a file using `ObjectOutputStream` and then loaded back using `ObjectInputStream`.

The program accepts student details from the user and displays the loaded objects.

The program demonstrates:

* Saving an array of objects to a file.
* Reading serialized objects into fresh objects.
* Using the `Serializable` interface.
* Using the `transient` keyword to prevent a field from being saved.
* Handling file-related exceptions.

Example:

```text
Enter number of students: 2

Enter details of student 1
Roll number: 101
Name: Riya Patel
Password: riya123

Enter details of student 2
Roll number: 102
Name: Aman Shah
Password: aman456

Objects saved successfully.

Loaded student details:
Roll No: 101
Name: Riya Patel
Password: null

Roll No: 102
Name: Aman Shah
Password: null
```

Concepts used:

* Object Serialization
* `Serializable`
* `ObjectOutputStream`
* `ObjectInputStream`
* `transient` keyword
* Exception handling

---

### 2. Log Analyzer Using Path and Files

In this practical, the user enters the number of log files, their names, contents, and a keyword to search. The program creates the text files and analyzes their contents using Java NIO.

The program:

* Reads files and processes their lines.
* Counts the total number of lines across all files.
* Counts the lines containing the specified keyword.
* Displays the size of each file in bytes.
* Performs case-insensitive keyword matching.

Example:

```text
Enter number of log files: 2

Enter file name: server.txt
Enter number of lines: 2
Enter line 1: Server started
Enter line 2: Login successful

Enter file name: error.txt
Enter number of lines: 2
Enter line 1: Login failed
Enter line 2: Connection error

Enter keyword to search: login

File: server.txt
Size: 31 bytes

File: error.txt
Size: 43 bytes

Total lines: 4
Matching lines: 2
```

Concepts used:

* `Path` and `Paths`
* `Files` class
* File creation and writing
* Reading text files
* `DirectoryStream`
* Keyword searching
* File size calculation

---

### 3. Folder Tree Report Using NIO

In this practical, the user enters a folder path, and the program traverses the folder and its subfolders using Java NIO.

It generates a report containing the names, full paths, sizes, and last-modified times of the files. The report is saved in a text file named `folder_report.txt`.

The program demonstrates:

* Accepting a folder path from the user.
* Traversing files and subdirectories.
* Retrieving file attributes.
* Recording file names, sizes, and modification times.
* Writing the report to a text file.
* Handling files that cannot be accessed.

Example:

```text
Enter folder path: C:\Users\Student\Documents

Report created successfully.
Saved as: C:\YourProject\folder_report.txt
```

Example report contents:

```text
FOLDER CONTENT REPORT
Folder: C:\Users\Student\Documents
--------------------------------
File name: notes.txt
Full path: C:\Users\Student\Documents\notes.txt
Size: 120 bytes
Modified: 2026-10-25T14:30:20Z
--------------------------------
```

Concepts used:

* Java NIO
* `Files.walkFileTree()`
* `Path`
* `BasicFileAttributes`
* `SimpleFileVisitor`
* `PrintWriter`
* File metadata and directory traversal

---

## Technologies Used

* Java
* Java I/O
* Java NIO
* Object Serialization
* `Scanner`
* File and directory handling
* Exception handling

## Overall Working

```text
User Input
    ↓
Create or Select Objects and Files
    ↓
Perform Serialization or File Operations
    ↓
Read Data or Retrieve File Attributes
    ↓
Process Information
    ↓
Display Output or Generate a Report
```

## Learning Outcomes

* Learned how to serialize and deserialize Java objects.
* Learned how the `transient` keyword affects serialization.
* Learned how to create, read, and write files in Java.
* Learned how to use `Path` and `Files` for file operations.
* Learned how to search file contents and calculate file sizes.
* Learned how to traverse directory trees using Java NIO.
* Learned how to retrieve file metadata and generate reports.

## Conclusion

These practicals demonstrate Java's file handling and NIO capabilities. They provide practical experience in saving and loading objects, analyzing text files, and generating directory reports using file attributes and directory traversal.
