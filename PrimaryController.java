package project230;

import java.util.ArrayList;
import java.util.List;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;

public class PrimaryController {
//FXML datamembers that take in search and store results in TextFlow so they are clickable
    @FXML private TextField search;
    @FXML private TextFlow results;
    @FXML private Button searchButton;
//mainApp
    private SearchApp mainApp;

    public void setMainApp(SearchApp app) {
        this.mainApp = app;
    }
    
    @FXML
    public List<TextFlow> handleSearch() { //handleSearch is called when the user searches in the Application
        //docs ArrayList
        Urls github = new Urls("https://www.github.com", "GitHub is a cloud-based platform where you can store, share, and work together with others to write code", 0);
        Urls deletionBinary = new Urls("https://www.geeksforgeeks.org/deletion-in-binary-search-tree/#", "Programming tutorial for deletion in a binary search tree" , 8);
        Urls bigO = new Urls("https://www.geeksforgeeks.org/analysis-algorithms-big-o-analysis/?ref=header_outind", "Big O notation is a powerful tool used in computer science to describe the time complexity or space complexity of algorithms. Big-O is a way to express the upper bound of an algorithm’s time or space complexity.", 2.5);
        Urls heapSort = new Urls("https://www.geeksforgeeks.org/heap-sort/?ref=header_outind", "Heap sort is a comparison-based sorting technique based on Binary Heap Data Structure. It can be seen as an optimization over selection sort where we first find the max (or min) element and swap it with the last (or first). We repeat the same process for the remaining elements. In Heap Sort, we use Binary Heap so that we can quickly find and move the max element in O(Log n) instead of O(n) and hence achieve the O(n Log n) time complexity.", 10.3);
        Urls quickSort = new Urls("https://www.geeksforgeeks.org/quick-sort-algorithm/?ref=header_outind", "QuickSort is a sorting algorithm based on the Divide and Conquer that picks an element as a pivot and partitions the given array around the picked pivot by placing the pivot in its correct position in the sorted array.", 7.2);
        Urls mergeSort = new Urls("https://www.geeksforgeeks.org/merge-sort/?ref=header_outind", "Merge sort is a sorting algorithm that follows the divide-and-conquer approach. It works by recursively dividing the input array into smaller subarrays and sorting those subarrays then merging them back together to obtain the sorted array.", 6.5);
        Urls linearSearch = new Urls("https://www.geeksforgeeks.org/linear-search/?ref=header_outind", "In Linear Search, we iterate over all the elements of the array and check if it the current element is equal to the target element. If we find any element to be equal to the target element, then return the index of the current element. Otherwise, if no element is equal to the target element, then return -1 as the element is not found. Linear search is also known as sequential search.", 2.2);
        Urls binarySearch = new Urls("https://www.geeksforgeeks.org/binary-search/?ref=header_outind", "Search Algorithm is a searching algorithm used in a sorted array by repeatedly dividing the search interval in half. The idea of binary search is to use the information that the array is sorted and reduce the time complexity to O(log N).", 2.3);
        Urls heap = new Urls("https://www.geeksforgeeks.org/heap-data-structure/?ref=header_outind", "A Heap is a complete binary tree data structure that satisfies the heap property: for every node, the value of its children is greater than or equal to its own value. Heaps are usually used to implement priority queues, where the smallest (or largest) element is always at the root of the tree.", 10.1);
        Urls binaryTree = new Urls("https://www.geeksforgeeks.org/what-is-binary-tree/?ref=header_outind", "A binary tree is a type of tree data structure in which each node can have at most two child nodes, known as the left child and the right child. Each node of the tree consists of – data and pointers to the left and the right child.", 8.1);
        Urls hashMap = new Urls("https://www.geeksforgeeks.org/java-util-hashmap-in-java-with-examples/?ref=header_outind", "In Java, HashMap is part of the Java Collections Framework and is found in the java.util package. It provides the basic implementation of the Map interface in Java. HashMap stores data in (key, value) pairs. Each key is associated with a value, and you can access the value by using the corresponding key", 9.1);
        Urls stack = new Urls("https://www.geeksforgeeks.org/stack-data-structure/?ref=header_outind", "Stack is a linear data structure that follows a particular order in which the operations are performed. The order may be LIFO(Last In First Out) or FILO(First In Last Out). LIFO implies that the element that is inserted last, comes out first and FILO implies that the element that is inserted first, comes out last.", 4.1);
        Urls queue = new Urls("https://www.geeksforgeeks.org/queue-data-structure/?ref=header_outind", "A Queue Data Structure is a fundamental concept in computer science used for storing and managing data in a specific order. It follows the principle of First in, First out (FIFO), where the first element added to the queue is the first one to be removed. Queues are commonly used in various algorithms and applications for their simplicity and efficiency in managing data flow.", 4.2);
        Urls recursion = new Urls("https://www.geeksforgeeks.org/introduction-to-recursion-2/?ref=header_outind", "The process in which a function calls itself directly or indirectly is called recursion and the corresponding function is called a recursive function.", 6.0);
        Urls recursiveFunctions = new Urls("https://www.geeksforgeeks.org/recursive-functions/?ref=header_outind", "a recursive function is a function that solves a problem by solving smaller instances of the same problem. This technique is commonly used in programming to solve problems that can be broken down into simpler, similar subproblems.", 6);
        Urls linkedList = new Urls("https://www.geeksforgeeks.org/linked-list-data-structure/?ref=header_outind", "A linked list is a fundamental data structure in computer science. It mainly allows efficient insertion and deletion operations compared to arrays. Like arrays, it is also used to implement other data structures like stack, queue and deque", 5.1);
        Urls leetCode = new Urls("https://leetcode.com/ ", "LeetCode is the best platform to help you enhance your skills, expand your knowledge and prepare for technical interviews.", 0);
        Urls algorithm = new Urls("https://www.geeksforgeeks.org/fundamentals-of-algorithms/?ref=header_outind", "Algorithm is a step-by-step procedure for solving a problem or accomplishing a task. In the context of data structures and algorithms, it is a set of well-defined instructions for performing a specific computational task. Algorithms are fundamental to computer science and play a very important role in designing efficient solutions for various problems. Understanding algorithms is essential for anyone interested in mastering data structures and algorithms.", 1.2);
        Urls array = new Urls("https://www.geeksforgeeks.org/array-data-structure-guide/?ref=header_outind", "An array stores items (in case of C/C++ and Java Primitive Arrays) or their references (in case of Python, JS, Java Non-Primitive) at contiguous locations.", 2.1);
        Urls orderedArray = new Urls("https://programmedlessons.org/Java9/chap84/ch84_13.html", "The elements of an ordered array are arranged in ascending (or descending) order. In general, an ordered array can have duplicate elements. (In some situations, though, an array is guaranteed not to have duplicates.) The picture shows an array of ints arranged into ascending order.", 2.4);
        Urls bubbleSort = new Urls("https://www.w3schools.com/dsa/dsa_algo_bubblesort.php", "Bubble Sort is an algorithm that sorts an array from the lowest value to the highest value.", 3.1);
        Urls selectionSort = new Urls("https://www.w3schools.com/dsa/dsa_algo_selectionsort.php", "The Selection Sort algorithm finds the lowest value in an array and moves it to the front of the array.", 3.2);
        Urls selectionSort2 = new Urls("https://www.geeksforgeeks.org/selection-sort-algorithm-2/?ref=header_outind", "Selection Sort is a comparison-based sorting algorithm. It sorts an array by repeatedly selecting the smallest (or largest) element from the unsorted portion and swapping it with the first unsorted element. This process continues until the entire array is sorted.", 3.2);
        Urls insertionSort = new Urls("https://www.w3schools.com/dsa/dsa_algo_insertionsort.php", "The Insertion Sort algorithm uses one part of the array to hold the sorted values, and the other part of the array to hold values that are not sorted yet.", 3.3);
        Urls insertionSort2 = new Urls("https://www.geeksforgeeks.org/insertion-sort-algorithm/?ref=header_outind", "Insertion sort is a simple sorting algorithm that works by iteratively inserting each element of an unsorted list into its correct position in a sorted portion of the list. It is like sorting playing cards in your hands. You split the cards into two groups: the sorted cards and the unsorted cards. Then, you pick a card from the unsorted group and put it in the right place in the sorted group.", 3.3);
        Urls priorityQueueUrls = new Urls("https://www.geeksforgeeks.org/priority-queue-set-1-introduction/?ref=header_outind", "Each element has a priority associated. When we add an item, it is inserted in a position based on its priority.", 4.3);
        Urls linkedListTypes = new Urls("https://www.w3schools.com/dsa/dsa_data_linkedlists_types.php", "There are three basic forms of linked lists:Singly linked lists, Doubly linked lists, Circular linked lists.", 5);
        Urls doublyLinkedList = new Urls("https://www.geeksforgeeks.org/doubly-linked-list/?ref=header_outind", "A doubly linked list is a more complex data structure than a singly linked list, but it offers several advantages. The main advantage of a doubly linked list is that it allows for efficient traversal of the list in both directions. This is because each node in the list contains a pointer to the previous node and a pointer to the next node. This allows for quick and easy insertion and deletion of nodes from the list, as well as efficient traversal of the list in both directions.", 5.5);
        Urls abstractDataTypes = new Urls("https://www.geeksforgeeks.org/abstract-data-types/?ref=header_outind", "An Abstract Data Type (ADT) is a conceptual model that defines a set of operations and behaviors for a data structure, without specifying how these operations are implemented or how data is organized in memory. The definition of ADT only mentions what operations are to be performed but not how these operations will be implemented. It does not specify how data will be organized in memory and what algorithms will be used for implementing the operations. It is called abstract because it provides an implementation-independent view.", 5.3);
        Urls iterator = new Urls("https://www.w3schools.com/java/java_iterator.asp", "An Iterator is an object that can be used to loop through collections, like ArrayList and HashSet. It is called an iterator because iterating is the technical term for looping.", 5.6);
        Urls factorialProgram = new Urls("https://www.geeksforgeeks.org/java-program-for-factorial-of-a-number/?ref=header_outind", "Factorial of a non-negative integer, is multiplication of all integers smaller than or equal to n. In this article, we will learn how to write a program for the factorial of a number in Java.", 6.1);
        Urls anagrams = new Urls("https://takeuforward.org/data-structure/check-if-two-strings-are-anagrams-of-each-other/", "What is an anagram? How to check if two Strings are anagrams of each other.", 6.2);
        Urls partitionAlgo = new Urls("https://www.geeksforgeeks.org/partition-algorithms-complete-tutorial/?ref=header_outind", "Partition algorithms are key techniques in computer science, widely used in sorting (like QuickSort) and selection problems. By dividing an array around a pivot, they allow data to be organized into segments for faster sorting and searching.", 7.1);
        Urls partitionDef = new Urls("https://www.gartner.com/en/information-technology/glossary/partitioning-code", "Applications can be broken into three logical parts — presentation, logic and data. These are areas in which the program can be separated to facilitate execution of each logical piece on a different machine. Each segment is known as a partition. For example, the thin-client Web model requires that interface presentation be handled by the browser, application logic by the Web server and other application servers, and data by a database server. Developers are responsible for determining where the separation occurs.", 7.1);
        Urls binarySearchTree = new Urls("https://www.geeksforgeeks.org/binary-search-tree-data-structure/?ref=header_outind", "A Binary Search Tree (or BST) is a data structure used in computer science for organizing and storing data in a sorted manner. Each node in a Binary Search Tree has at most two children, a left child and a right child, with the left child containing values less than the parent node and the right child containing values greater than the parent node. This hierarchical structure allows for efficient searching, insertion, and deletion operations on the data stored in the tree.", 8.2);
        Urls preOrderSearch = new Urls("https://www.w3schools.com/dsa/dsa_algo_binarytrees_preorder.php", "Pre-order Traversal is a type of Depth First Search, where each node is visited in a certain order.", 10);
        Urls treeTraversal = new Urls("https://www.geeksforgeeks.org/tree-traversals-inorder-preorder-and-postorder/?ref=header_outind", "Tree Traversal techniques include various ways to visit all the nodes of the tree. Unlike linear data structures (Array, Linked List, Queues, Stacks, etc) which have only one logical way to traverse them, trees can be traversed in different ways. In this article, we will discuss all the tree traversal techniques along with their uses.", 10);
        //Inserting urls into the array
        ArrayList <Urls> documents = new ArrayList<>();
        documents.add(github);
        documents.add(deletionBinary);
        documents.add(bigO);
        documents.add(heapSort);
        documents.add(quickSort);
        documents.add(mergeSort);
        documents.add(linearSearch);
        documents.add(binarySearch);
        documents.add(heap);
        documents.add(hashMap);
        documents.add(binaryTree);
        documents.add(stack);
        documents.add(queue);
        documents.add(recursion);
        documents.add(recursiveFunctions);
        documents.add(linkedList);
        documents.add(leetCode);
        documents.add(algorithm);
        documents.add(array);
        documents.add(orderedArray);
        documents.add(bubbleSort);
        documents.add(selectionSort);
        documents.add(selectionSort2);
        documents.add(insertionSort);
        documents.add(insertionSort2);
        documents.add(priorityQueueUrls);
        documents.add(linkedListTypes);
        documents.add(doublyLinkedList);
        documents.add(abstractDataTypes);
        documents.add(iterator);
        documents.add(factorialProgram);
        documents.add(anagrams);
        documents.add(partitionAlgo);
        documents.add(partitionDef);
        documents.add(binarySearchTree);
        documents.add(preOrderSearch);
        documents.add(treeTraversal);
        //Retrieve the query
            String query = search.getText().trim();
            //If the query is empty return nothing
        if (query.isEmpty()) {
            return null;
        } else { //else clear previous results, and perform searchEngineSort on the query and the documents ArrayList
            results.getChildren().clear();
            List<Result> sortedResults = Search.searchEngineSort(query, documents);
            List<TextFlow> resultFlow = new ArrayList<>(); 
            if (sortedResults.isEmpty()) { //If the sortedResults is empty that means the ArrayList doesn't contain any matching values
                results.getChildren().add(new Text("No results found."));
                return null; //return nothing
            } else {//if sortedResults isn't empty
                for (Result information : sortedResults) { //fetch the urls and make them a clickable hyperlink
                    String url = information.getUrl();
                    Hyperlink link = new Hyperlink(url);
                    //When the hyperlink is clicked the user is directed to the webpage
                    link.setOnAction(e -> mainApp.getHostServices().showDocument(url));
                    results.getChildren().addAll(link, new Text("\n"));
                    resultFlow.add(results); //adding each result from sortedResults into a TextFlow arrayList
                }
            return resultFlow; //return the arrayList
            }
            
        }

    }

}
