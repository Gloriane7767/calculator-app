# 🌈 Calculator Application 

> A console-based calculator application built with ☕ Java as part of the **Java Fundamentals 1 Workshop**.

This project demonstrates:

✨ Basic Java programming concepts
✨ User input handling
✨ Control structures
✨ Exception handling
✨ Maven project structure
✨ Unit testing with JUnit

---

# 🚀 Features

## ✅ Core Requirements

✔️ Maven-based Java project
✔️ Supports basic mathematical operations:

| Operation         | Symbol |
| ----------------- | ------ |
| ➕ Addition        | `+`    |
| ➖ Subtraction     | `-`    |
| ✖️ Multiplication | `*`    |
| ➗ Division        | `/`    |

---

## 👨‍💻 User Capabilities

Users can:

* 🔢 Enter two or more numbers
* 🧮 Choose a mathematical operator
* 📊 View calculated results instantly
* 🔁 Repeat calculations in a loop
* ❌ Exit the program gracefully

---

# ⭐ Optional Enhancements

## 🛡️ Exception Handling

Handles errors such as:

* ❌ Invalid number input
* 🚫 Division by zero
* ⚠️ Invalid operators

---

## 🧪 JUnit Testing

Tests included for:

* ➕ Addition
* ➖ Subtraction
* ✖️ Multiplication
* ➗ Division

---

## 📈 Advanced Operations

Additional supported operations may include:

| Operation     | Symbol |
| ------------- | ------ |
| √ Square Root | `sqrt` |
| 🔺 Power      | `xⁿ`   |
| 🧩 Modulo     | `%`    |
| 📉 Percentage | `%`    |

---

## 🎨 GUI Version (Optional)

A graphical calculator can also be built using:

### 🪟 Swing

* Buttons for digits & operators
* Display field for results

### 🌟 JavaFX

* Modern user interface
* Layouts like `GridPane`
* Interactive controls

---

# 📂 Project Structure

```bash id="d6x1j2"
calculator-app/
│── src/
│   ├── main/
│   │   └── java/
│   │       └── com.example.calculator/
│   │           ├── Calculator.java
│   │           └── Main.java
│   └── test/
│       └── java/
│           └── com.example.calculator/
│               └── CalculatorTest.java
│── pom.xml
│── README.md
```

---

# 🧮 How the Application Works

## 1️⃣ Start the Program

The user is prompted to enter:

* The first number
* The second number *(or more if supported)*
* The mathematical operator

Supported operators:

```text id="b8f4v2"
+, -, *, /
```

---

## 2️⃣ Perform the Calculation

The program:

✅ Evaluates the selected operation
✅ Calculates the result
✅ Displays the answer

---

## 3️⃣ Continue or Exit

After each calculation, the user is asked:

```text id="f4x7a9"
Do you want to perform another calculation? (y/n)
```

| Input | Action            |
| ----- | ----------------- |
| `y`   | 🔁 Repeat program |
| `n`   | ❌ Exit program    |

---

# 📦 Running the Project

## 🛠️ Using Maven

```bash id="v9m2l0"
mvn clean install

mvn exec:java -Dexec.mainClass="com.example.calculator.Main"
```

---

## 💻 Using an IDE

1. Import the project as a Maven project
2. Run the `Main` class

---

# 🧪 Testing

JUnit tests verify each mathematical operation.

Run tests using:

```bash id="h7j3q1"
mvn test
```

---

# 🌱 Algorithm

```text id="y5t2p8"
1. Start
2. Ask the user to enter two numbers
3. Ask the user to choose an operation (+, -, *, /)
4. Perform the selected operation
5. Display the result
6. Ask if the user wants to continue
7. Repeat or exit
```

---

# 🌱 Pseudocode

```sql id="n2c6w4"
BEGIN

DISPLAY "Enter first number"
READ num1

DISPLAY "Enter second number"
READ num2

DISPLAY "Enter operator (+, -, *, /)"
READ op

IF op = "+"
    result ← num1 + num2

ELSE IF op = "-"
    result ← num1 - num2

ELSE IF op = "*"
    result ← num1 * num2

ELSE IF op = "/"

    IF num2 = 0
        DISPLAY "Cannot divide by zero"

    ELSE
        result ← num1 / num2

    ENDIF

ENDIF

DISPLAY result

END
```

---

# 🌱 Flowchart

```text id="r7m8q3"
┌──────────────┐
│    START     │
└───────┬──────┘
        ▼

┌────────────────────────────┐
│ Input num1, num2, operator │
└──────────────┬─────────────┘
               ▼

┌──────────────────┐
│ Check operator   │
└───────┬──────────┘
        ▼

┌─────────────────────┐
│ + → add numbers     │
└─────────────────────┘

┌─────────────────────┐
│ - → subtract        │
└─────────────────────┘

┌─────────────────────┐
│ * → multiply        │
└─────────────────────┘

┌─────────────────────┐
│ / → divide (check 0)│
└───────────┬─────────┘
            ▼

┌──────────────────────┐
│ Display the result   │
└───────────┬──────────┘
            ▼

┌──────────────────────┐
│ Ask if user repeats  │
└───────┬────┬─────────┘
        │yes │no
        ▼    ▼
   (repeat)  END
```

---

# 🛠️ Built With

| Technology        | Purpose                   |
| ----------------- | ------------------------- |
| ☕ Java            | Core programming language |
| 📦 Maven          | Dependency management     |
| 🧪 JUnit          | Unit testing              |
| 🌟 JavaFX / Swing | GUI development           |

---

# 🌟 Learning Outcomes

This project helps practice:

✅ Variables & Data Types
✅ Methods & Classes
✅ Loops & Conditional Statements
✅ Exception Handling
✅ User Input with Scanner
✅ Maven Project Structure
✅ Unit Testing with JUnit

---

# 👨‍💻 Author

Built with ❤️ during the Java Fundamentals Workshop.
