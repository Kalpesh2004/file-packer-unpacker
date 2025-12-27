# 📦 File Packer & Unpacker (GUI Based)

## 📌 Overview
The **File Packer & Unpacker** is a Java Swing–based desktop application that allows users to combine multiple text files into a single packed file and later extract them back to their original form.

The project is designed using a **layered architecture**, separating GUI, business logic, and utility components to ensure clean code, maintainability, and scalability.  
This project demonstrates strong understanding of **Core Java, File Handling, Swing GUI, and real-world debugging**, making it suitable for academic use and software developer interviews.

---

## ✨ Features
- Pack multiple text files into a single packed file  
- Unpack files back to their original structure  
- User-friendly GUI built using Java Swing  
- Buffered file handling for improved performance  
- Clean and modular project architecture  
- Handles file overwrite and duplication issues  

---

## 🛠️ Tech Stack
- **Programming Language:** Java  
- **GUI Framework:** Swing  
- **File Handling:** FileReader, FileWriter, BufferedReader, BufferedWriter  
- **IDE:** IntelliJ IDEA  
- **Version Control:** Git & GitHub  

---

## 🗂️ Project Structure
file-packer-unpacker
│
├── src/
│ └── com/
│ └── packerunpacker/
│ ├── Main.java
│ │
│ ├── gui/
│ │ └── PackerUnpackerUI.java
│ │
│ ├── service/
│ │ ├── PackerService.java
│ │ └── UnpackerService.java
│ │
│ ├── util/
│ │ └── FileUtil.java
│ │
│ └── exception/
│ └── InvalidPathException.java
│
├── input/
├── output/
├── README.md
└── .gitignore


---

## ⚙️ How It Works

### 🔹 Packing Process
1. User selects an input directory using the GUI  
2. Each file is read using buffered streams  
3. File name and file content are written sequentially into a single packed file  
4. Special markers are used to identify file boundaries  

### 🔹 Unpacking Process
1. User selects the packed file  
2. The application reads markers to identify file names  
3. Original files are recreated with correct content  

---

## ▶️ How to Run the Project
1. Clone the repository:
   git clone https://github.com/Kalpesh2004/file-packer-unpacker.git
2. Open the project in IntelliJ IDEA
3. Create two folders in the project root
4. Add sample .txt files inside the input folder
5. Run Main.java
6. Use the GUI buttons to Pack Files and Unpack Files
   

🧪 Testing & Validation
- Verified packing by checking the generated packed.txt file
- Verified unpacking by matching extracted files with original content
- Debugged and fixed issues related to file overwrite, append mode, and duplication
- Ensured output directory creation before writing files


  📚 Learning Outcomes
- Hands-on experience with Java file handling
- Understanding buffered I/O streams
- Desktop application development using Swing
- Debugging real-world file system issues
- Applying layered architecture in Core Java projects

🚀 Future Enhancements
- Support for binary files
- ZIP compression for packed files
- Progress bar and status indicators in GUI
- Improved exception handling and validations

👤 Author
Kalpesh Sonawane
Computer Engineering Graduate
Skills: Java | Swing | File Handling | OOP
