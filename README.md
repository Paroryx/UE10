# Software Development Exercises - UE10  

## 📜 Tasks  
This exercise focuses on exception handling, abstract classes, and interfaces. The tasks are divided into three main sections:  

### 1. Exception Handling  
Implement a program to read and display HTML content from a URL with proper exception handling:  
- **MalformedURLException:** Retry until a valid URL is entered.  
- **IOException (openStream):** Exit the program with an error message.  
- **IOException (read/close):** Handle reading errors and ensure the input stream is closed in a `finally` block.  

### 2. Throwing and Testing Exceptions  
Develop a `BankAccount` system:  
- **Class `Account`:**  
  - Methods for `withdraw` and `deposit` with exception handling.  
  - Exceptions:  
    - `IllegalArgumentException` for invalid amounts.  
    - `Exception` for overdrawing or exceeding €100,000.  
- **Class `BankApp`:**  
  - Test the `Account` class with various scenarios, ensuring expected exceptions are thrown and caught.

### 3. Abstract Classes and Interfaces: Vehicles  
Develop a vehicle simulation with a hierarchical design:  

#### **Abstract Class `Vehicle`**  
- Fields: `kind`, `drivenDistance`, `cumulativeCosts`.  
- Methods:  
  - `drive(double km)`: Updates distance and costs.  
  - `abstract double costPerKM()`: To be implemented by subclasses.  

#### **Abstract Class `Car` (extends Vehicle)**  
- Fields: `fuelPer100km`.  
- Methods:  
  - `costPerLiter()`: Abstract method to calculate fuel cost.  
  - `costPerKM()`: Implements the cost calculation for cars.  

#### **Subclasses of `Car`:**  
- **`DieselCar`:** Sets fuel cost to €1.70 per liter.  
- **`GasolineCar`:** Sets fuel cost to €1.60 per liter.  

#### **Class `Bike` (extends Vehicle):**  
- Fixed cost of €0.80 per ride, regardless of distance.  

#### **Interfaces:**  
- **`Printable`:** Method `void print()` to display vehicle details.  
- **`Repairable`:** Methods for repairs and maintenance.  

#### **Class `VehicleApp`:**  
- Test the vehicle hierarchy and methods using a predefined array of vehicles.  

---

## 📂 Project Structure  

``src/``

- ``In.java`` Helper class for input  
- ``Out.java`` Helper class for output  
- ``DownloadHtmlExample.java`` Handles exception-based URL reading  
- ``Account.java`` Implements bank account functionality  
- ``BankApp.java`` Tests the `Account` class  
- ``Vehicle.java`` Abstract base class for vehicles  
- ``Car.java`` Abstract class for cars  
- ``DieselCar.java`` Represents diesel-powered cars  
- ``GasolineCar.java`` Represents gasoline-powered cars  
- ``Bike.java`` Represents bicycles  
- ``Printable.java`` Interface for displaying details  
- ``Repairable.java`` Interface for repairs and maintenance  
- ``VehicleApp.java`` Demonstrates vehicle functionalities  

``tests/``

- ``Testprotokolle.txt`` Test cases and results for all tasks  

---

## 🛠 Tools  
- **Programming Language:** Java  
- **Editor:** Visual Studio Code with [JavaWiz](https://github.com/SSW-JKU/javawiz) extension  

---

## 📝 License  
This project is licensed under the [MIT License](LICENSE).  