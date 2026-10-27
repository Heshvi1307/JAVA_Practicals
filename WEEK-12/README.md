# Java Collections and Sorting Practicals

This repository contains three Java practicals based on the Java Collections Framework, including `HashMap`, `HashSet`, `LinkedHashSet`, `Map`, and `Comparator`.

## Practicals

### 1. Word Frequency Using HashMap and Comparator

In this practical, the user enters a paragraph, and the program counts the frequency of each word using a `HashMap`.

The words are then sorted according to their frequency in descending order using a `Comparator`. If two words have the same frequency, they are sorted alphabetically.

The program demonstrates:

* Accepting a paragraph from the user.
* Splitting text into individual words.
* Counting word occurrences using a `HashMap`.
* Sorting map entries using a `Comparator`.
* Displaying words according to frequency.

Example:

```text
Enter a paragraph:
Java is easy and Java is useful

Word Frequencies:
java : 2
is : 2
and : 1
easy : 1
useful : 1
```

Concepts used:

* `HashMap`
* `Map.Entry`
* `ArrayList`
* `Comparator`
* String handling
* Word frequency counting

---

### 2. Unique Visitors Using HashSet and LinkedHashSet

In this practical, the user enters a list of login names that may contain duplicates.

A `HashSet` is used to count unique users, while a `LinkedHashSet` maintains the order in which each name first appeared.

The program:

* Accepts login names from the user.
* Removes duplicate names.
* Counts the number of unique users.
* Preserves the original order of distinct names.
* Displays the first three distinct users.

Example:

```text
Enter number of login entries: 6
Enter login name 1: Riya
Enter login name 2: Aman
Enter login name 3: Riya
Enter login name 4: Meera
Enter login name 5: Karan
Enter login name 6: Aman

Total unique users: 4
First three distinct users:
Riya
Aman
Meera
```

Concepts used:

* `HashSet`
* `LinkedHashSet`
* Duplicate removal
* Insertion order
* User input
* Collection traversal

---

### 3. Player Leaderboard Using Map and Comparator

In this practical, the user enters player names and their scores. The program stores the data in a `Map` and generates a leaderboard based on the scores.

The user also specifies the number of top players to display.

The program:

* Stores player names and scores in a `Map`.
* Sorts players by score in descending order.
* Uses alphabetical order to break score ties.
* Displays the requested number of top players.
* Assigns leaderboard positions to the displayed players.

Example:

```text
Enter number of players: 4
Enter player name: Riya
Enter score: 90
Enter player name: Aman
Enter score: 95
Enter player name: Meera
Enter score: 95
Enter player name: Karan
Enter score: 80
Enter top N players to display: 3

LEADERBOARD
1. Aman - 95
2. Meera - 95
3. Riya - 90
```

Concepts used:

* `Map`
* `HashMap`
* `Map.Entry`
* `ArrayList`
* `Comparator`
* Sorting and ranking
* Tie-breaking rules

---

## Technologies Used

* Java
* Java Collections Framework
* `HashMap`
* `HashSet`
* `LinkedHashSet`
* `Map`
* `ArrayList`
* `Comparator`
* `Scanner`

## Overall Working

```text
User Input
    ↓
Store Data Using Collections
    ↓
Process Data and Remove Duplicates
    ↓
Sort Data Where Required
    ↓
Display Frequency, Unique Users, or Rankings
```

## Learning Outcomes

* Learned how to count word frequencies using a `HashMap`.
* Learned how to sort collection elements using a `Comparator`.
* Understood the difference between `HashSet` and `LinkedHashSet`.
* Learned how to count unique users and preserve insertion order.
* Learned how to store key-value pairs using a `Map`.
* Learned how to create a leaderboard with score-based sorting and tie-breaking.
* Practiced accepting user input and processing collections.

## Conclusion

These practicals demonstrate how Java collections can be used to count frequencies, identify unique values, preserve insertion order, and organize data using custom sorting rules. They provide practical experience with the Collections Framework and the `Comparator` interface.
