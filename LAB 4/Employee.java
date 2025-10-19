public class Employee {
    
    Address address;
    int number;
    static int nextNumber = 1000;
    String companyCar;
    String employeeType;
    String name;
    Office office; 

    public Employee(String name, Address address, String employeeType, String carDetails, Office office) {
        this.name = name;
        this.address = address;
        this.employeeType = employeeType;
        this.office = office;
        
        this.number = nextNumber;
        nextNumber++;

        if (employeeType.equalsIgnoreCase("Manager")) {
            this.companyCar = carDetails;
        } else {
            this.companyCar = "N/A";
        }
    }

    public String getCompanyCar() {
        if (employeeType.equalsIgnoreCase("Manager")) {
            return companyCar;
        } else {
            return "Not applicable";
        } 
    }

    public static int getNumEmployees() {
        return nextNumber - 1000;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }
    
    public Office getOffice() {
        return office;
    }

    public String getBasicInfo() {
        return "Employee ID: " + this.number + " (Name: " + this.name + ", Type: " + this.employeeType + ")";
    }

    public String toString() {
        String info = "Employee ID: " + this.number +
                      "\n  - Name: " + this.name +
                      "\n  - Type: " + this.employeeType +
                      "\n  - Address: " + this.address.toString();
        
        if (employeeType.equalsIgnoreCase("Manager")) {
            info += "\n  - Company Car: " + this.companyCar;
        }
        return info;
    }
}


    
    

