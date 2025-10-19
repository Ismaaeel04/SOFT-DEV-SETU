public class MyHR {
    
    private static Office[] offices = new Office[3]; 
    private static Employee[] employees = new Employee[5]; 
    private static int numEmployeesCreated = 0;

    public static void main(String[] args) {
        
        initOffices(); 

        boolean running = true;
        while (running) {
            printMenu();
            System.out.print("Enter your choice: ");
            int choice = EasyIn.getInt();

            switch (choice) {
                case 1:
                    listAllOffices(); 
                    break;
                case 2:
                    createEmployeeRecord(); 
                    break;
                case 3:
                    listAllEmployees(); 
                    break;
                case 4:
                    running = false;
                    System.out.println("Exiting MyHR system...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void initOffices() { 
        for (int i = 0; i < offices.length; i++) {
            offices[i] = new Office();
        }
        System.out.println("3 offices initialized.");
    }

    private static void printMenu() { 
        System.out.println("\n--- MyHR System Menu ---");
        System.out.println("1. List all offices"); 
        System.out.println("2. Create a new employee record"); 
        System.out.println("3. List all employees"); 
        System.out.println("4. Exit");
        System.out.println("-------------------------");
    }

    private static void listAllOffices() { 
        System.out.println("\n--- Listing All Offices ---");
        for (int i = 0; i < offices.length; i++) {
            Office office = offices[i];
            System.out.println(office.toString());
            System.out.println(office.getEmployeeRecords()); 
            System.out.println("--------------------");
        }
    }

    private static void createEmployeeRecord() { 
        System.out.println("\n--- Create New Employee Record ---");

        if (numEmployeesCreated >= employees.length) { 
            System.out.println("Error: Maximum number of employees (5) has been reached.");
            return;
        }

        Office assignedOffice = findAvailableOffice();
        if (assignedOffice == null) { 
            System.out.println("Error: No available office space. All offices are full (Max 2 per office)."); 
            return;
        }

        System.out.print("Enter Employee Name: ");
        String name = EasyIn.getString();
        
        System.out.print("Enter Street: "); 
        String street = EasyIn.getString();
        System.out.print("Enter City/Town: "); 
        String city = EasyIn.getString();
        System.out.print("Enter County: "); 
        String county = EasyIn.getString();
        Address address = new Address(street, city, county);

        String type = ""; 
        while (!type.equalsIgnoreCase("Staff") && !type.equalsIgnoreCase("Manager")) {
            System.out.print("Enter employee type (Staff/Manager): ");
            type = EasyIn.getString();
            if (!type.equalsIgnoreCase("Staff") && !type.equalsIgnoreCase("Manager")) {
                System.out.println("Please enter 'Staff' or 'Manager'.");
            }
        }

        String carDetails = "N/A"; 
        if (type.equalsIgnoreCase("Manager")) {
            System.out.print("Enter Manager's car details: ");
            carDetails = EasyIn.getString();
        }

        Employee newEmp = new Employee(name, address, type, carDetails, assignedOffice); 
        employees[numEmployeesCreated] = newEmp;
        assignedOffice.assignEmployee(newEmp); 
        numEmployeesCreated++;

        System.out.println("\nEmployee record created!");
        System.out.println(newEmp.toString());
        System.out.println("Assigned to: " + assignedOffice.toString());
    }

    private static void listAllEmployees() { 
        System.out.println("\n--- Listing All Employees ---");
        
        System.out.println("Total employee records: " + Employee.getNumEmployees()); 
        
        if (numEmployeesCreated == 0) {
            System.out.println("No employees have been created yet.");
            return;
        }

        for (int i = 0; i < numEmployeesCreated; i++) {
            System.out.println(employees[i].toString()); 
            System.out.println("  - Assigned Office: " + employees[i].getOffice().getRoomNum()); 
            System.out.println("--------------------");
        }
    }

    private static Office findAvailableOffice() { 
        System.out.println("Checking for available offices (Max 2 occupants)..."); 
        int availableCount = 0;
        
        for (int i = 0; i < offices.length; i++) {
            Office office = offices[i]; 
    
            if (office.getNumEmployees() < 2) { 
                System.out.println("  - Available: " + office.toString());
                availableCount++;
            }
        }
        if (availableCount == 0) {
            return null; 
        }

        Office chosenOffice = null;
        while (chosenOffice == null) {
            System.out.print("Enter desired Room Number from the list above: ");
            int roomNum = EasyIn.getInt();
            chosenOffice = getOfficeByRoomNum(roomNum);

            if (chosenOffice == null) {
                System.out.println("Invalid room number. Please try again.");
            } else if (chosenOffice.getNumEmployees() >= 2) { 
                System.out.println("That office is full. Please choose another.");
                chosenOffice = null; 
            }
        }
        return chosenOffice;
    }

    private static Office getOfficeByRoomNum(int roomNum) {
        for (int i = 0; i < offices.length; i++) {
            Office office = offices[i];
            if (office.getRoomNum() == roomNum) {
                return office;
            }
        }
        return null;
    }
}