public class Office {
    int number;
    static int nextNumber = 100;
    Employee employees[];
    int count;

    public Office() {
        this.number = nextNumber;
        this.nextNumber++;
        this.employees = new Employee[2];
        this.count = 0;
    }

    public int getRoomNum() {
        return number;
    }

    public int getNumEmployees() {
        return count;
    }

    public boolean assignEmployee(Employee employee) {
        if (count < 2) {
            employees[count] = employee;
            count++;
            return true;
        } else {
            return false;
        }
    }

    public String getEmployeeRecords() {
        if (this.count == 0) {
            return "  - Occupants: None";
        }

        String records = "  - Occupants:\n";

        for (int i = 0; i < this.count; i++) {
            records += "    - " + employees[i].getBasicInfo();

            if (i < this.count - 1) {
                records += "\n";
            }
        }
        
        return records;
    }

    public String toString() {
        String info = "Office: " + this.number + " | Employees Assigned: " + this.count;
        return info;
    }
}