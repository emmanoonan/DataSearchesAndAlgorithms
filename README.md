# DS&A Search Engine
This project is a simple and interactive search engine for Data Structures & Algorithms content, built using Java and JavaFX. It was created for our CSCI 230 final presentation (4/21/25) and is designed to help students quickly find useful and relevant resources.
---
## Features

### Tokenization
- Parses user queries into keywords
- Compares tokens to stored website data for relevance scoring
### ArrayList Storage
- Uses an `ArrayList` to store custom URL objects
- Each object contains a link, description, and chapter number
### Quicksort Ranking
- Scores each URL based on relevance
- Uses Quicksort to display the most useful results first
### JavaFX Front-End
- Interactive GUI allows uers to enter search queries
- Displays ranked, clickable URLS that open in a browser
---
## Challenges

- **JavaFX Setup**
  Setting up JavaFX libraries in VS Code required troubleshooting and proper environment configuration
- **Front-End/Back-End Integration**
  Connecting GUI elements with search logic was more complex than expected
- **Clickable Links**
  Making URLS open correctly within our GUI took some trial and error
---
## Lessons Learned
- The importance of clean, modular code for combining front- and back-end components
- JavaFX offers powerful tools, but requires precise configuration
- Object-Oriented Programming helped structure the project logically using classes and custom objects
- Quicksort and tokenization helped make our app functional and efficient
---
## How to Use

Clone the repository:

```bash
git clone https://github.com/emmanoonan/DataSearchesAndAlgorithms.git
```

## Prerequisites
Ensure that you have **Java** (JDK 11 or later) and **JavaFX** set up on your machine. If you're using **VS Code**, you may need to configure **VM options** to include JavaFx libraries.

## Steps to run the application:
1. **Navigate to the project directory:**
   ```bash
   cd uisearch
   ```
2. **Compile and run the application:**
   - **If using Maven** (with pom.xml):
     Run the following Maven commands:
     ```bash
     mvn clean install
     mvn javafx:run
     ```
   - **If not using Maven**:
     Use your IDE (like VS Code of IntelliJ) or terminal to compile and run SearchApp.java directly
     Make sure all Java files (SearchApp.java, PrimaryController.java, Search.java, Urls.java, Result.java) are included during compilation
     You may also need to configure JavaFX modules in your run settings or command line
3. **Interact with the app**:
   The application will open a JavaFX window where you can enter queries related to Data Structures & Algorithms and view the most relevant website links
---
## Project Structure
- **SearchApp.java**: The main entry point of the program, where the JavaFX UI is initialized and search functionality is handled
- **PrimaryController.java***: Manages interactions between the JavaFX UI and the backend
- **URLS.java**: Defines the Url object, whcih stores URL links, descriptions, and relevance scores
- **FXML files**: Defines the layout of the JavaFX user interface
