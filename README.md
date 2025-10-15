# 🧑‍💻 Task S1.03. Collections and File Handling  
**Author:** David Rey  
**Corrected by:** Marc Guillem Palacios ([mxg952](https://github.com/Viid21/S1_03_Java_Collections/issues/1))  

### 📄 Description  
This project includes several exercises organized by difficulty level, focusing on Java Collections (ArrayList, HashSet, ListIterator), file reading/writing, and data sorting.

### 🔹 Level 1  

**Exercise 1 – Month Management with ArrayList and HashSet**  
- Create a class called `Month` with a single attribute `name` to store the name of the month.  
- Add 11 `Month` objects to an `ArrayList`, excluding the one with the name "August".  
- Insert the "August" object in its correct position and demonstrate that the `ArrayList` maintains the correct order.  
- Convert the `ArrayList` into a `HashSet` and ensure that duplicates are not allowed.  
- Traverse the list using both a `for` loop and an `Iterator`.

**Exercise 2 – Reversing a List of Integers**  
- Create and populate a `List<Integer>`.  
- Create a second `List<Integer>` and insert the elements of the first list in reverse order.  
- Use `ListIterator` objects to read elements from the first list and insert them into the second.

**Exercise 3 – Capitals Game with HashMap and File I/O**  
- Read the file `countries.txt` which contains countries and their capitals.  
- Store the data in a `HashMap<String, String>`.  
- Ask the user for their name, then randomly select 10 countries from the map.  
- The user must enter the capital of each country.  
- For each correct answer, the user earns one point.  
- After 10 rounds, save the user's name and score in a file called `classification.txt`.

### 🔹 Level 2  

**Exercise 1 – Restaurant Uniqueness in HashSet**  
- Create a class called `Restaurant` with two attributes: `name` (String) and `rating` (int).  
- Implement the necessary methods so that no `Restaurant` object with the same name and rating can be added to a `HashSet`.  
- Restaurants with the same name but different ratings are allowed.

**Exercise 2 – Sorting Restaurants by Name and Rating**  
- Using the previous `Restaurant` class, implement sorting so that objects are ordered by name and rating in descending order.  
- Example:  
  - name: restaurant1, rating: 8  
  - name: restaurant1, rating: 7  

### 🔹 Level 3  

**Exercise 1 – CSV File Reading and Person Sorting**  
- Create an application capable of reading a CSV file with three fields: name, surname, and ID (DNI).  
- Sort the list of people read from the file by name, surname, or ID.  
- Use the most appropriate list structure for this task.  

The `Person` class has three attributes:  
- `name`  
- `surname`  
- `ID`  

The main class includes the following menu:  
1. Add person  
2. Show people sorted by name (A-Z)  
3. Show people sorted by name (Z-A)  
4. Show people sorted by surname (A-Z)  
5. Show people sorted by surname (Z-A)  
6. Show people sorted by ID (1-9)  
7. Show people sorted by ID (9-1)  
0. Exit  

The program should display people in the following format: 
| **Name**  | **Surname**             | **ID**       |
|-----------|-------------------------|--------------|
| Andreu    | Ballestero Llenas       | 34835767J    |
| Miquel    | Bayona Font             | 48743957B    |
| Guillem   | Capdevila Riu           | 33957834J    |
| Albert    | Carbonell Ferrer        | 77364986R    |
| Ferran    | Casas Coderch           | 23047848P    |
| Maria     | Casellas Fuste          | 47102244S    |
| Genis     | Ciutat Vendrell         | 39718459N    |

### 💻 Technologies Used  
- **Java SE 24**  
- **IntelliJ IDEA** as the development environment  
- **Git & GitHub** for version control  
- **JDK** for compiling and running the code  
- **Collections Framework**:  
  - ArrayList, HashSet, List, ListIterator, Iterator  
  - HashMap for key-value storage  
- **OOP Principles**:  
  - Class design and encapsulation  
  - Custom `equals()` and `hashCode()` implementations  
  - Sorting with `Comparator` and `Comparable`  
  - File reading and writing with `Scanner`, `BufferedReader`, and `FileWriter`  

### 📋 Requirements  
- **Java Development Kit (JDK) 24 or higher**  
- **IntelliJ IDEA** or any Java-compatible IDE  
- **Git** installed to clone the repository  
- Basic knowledge of object-oriented programming and Java Collections  

### 🛠️ Installation  
1. Clone the repository:  
   ```bash
   git clone https://github.com/Viid21/S1_03_Java_Collections.git
