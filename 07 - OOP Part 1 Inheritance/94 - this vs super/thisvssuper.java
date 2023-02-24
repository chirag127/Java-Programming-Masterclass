/**
 * this vs super
 *
 * 1. this is used to refer to the current object
 * 2. super is used to refer to the parent class object
 * 3. this() and super() are used to call constructors from within a constructor
 */

public class thisvssuper {

    public class Worker {

        private String name;
        private String birthDate;
        private String endDate;

        public Worker(String name, String birthDate) {
            this.name = name;
            this.birthDate = birthDate;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getBirthDate() {
            return birthDate;
        }

        public void setBirthDate(String birthDate) {
            this.birthDate = birthDate;
        }

        public String getEndDate() {
            return endDate;
        }

        public void setEndDate(String endDate) {
            this.endDate = endDate;
        }
    }

    public class Employee extends Worker {

        private String employeeId;
        private String hireDate;

        public Employee(String name, String birthDate, String employeeId, String hireDate) {
            super(name, birthDate);
            this.employeeId = employeeId;
            this.hireDate = hireDate;
        }

        public String getEmployeeId() {
            return employeeId;
        }

        public void setEmployeeId(String employeeId) {
            this.employeeId = employeeId;
        }

        public String getHireDate() {
            return hireDate;
        }

        public void setHireDate(String hireDate) {
            this.hireDate = hireDate;
        }
    }

    public class SalariedEmployee extends Employee {

        private double annualSalary;
        private boolean isRetired;

        public SalariedEmployee(String name, String birthDate, String employeeId, String hireDate,
                double annualSalary, boolean isRetired) {
            super(name, birthDate, employeeId, hireDate);
            this.annualSalary = annualSalary;
            this.isRetired = isRetired;
        }

        public double getAnnualSalary() {
            return annualSalary;
        }

        public void setAnnualSalary(double annualSalary) {
            this.annualSalary = annualSalary;
        }

        public boolean isRetired() {
            return isRetired;
        }

        public void setRetired(boolean retired) {
            isRetired = retired;
        }

        public void retire() {
            if (isRetired) {
                System.out.println("Employee is already retired");
            } else {
                System.out.println("Employee is now retired");
                setRetired(true);
            }

        }
    }

    /**
     * @param args
     */
    public static void main(String[] args) {

        thisvssuper tvs = new thisvssuper();
        SalariedEmployee se = tvs.new SalariedEmployee("John", "01/01/1990", "12345", "01/01/2010", 100000, false);
        System.out.println("Employee is retired: " + se.isRetired());
        se.retire();
        System.out.println("Employee is retired: " + se.isRetired());
        se.retire();
    }

}

/**
 * notes
 *
 * 1. this is used to refer to the current object
 * 2. super is used to refer to the parent class object
 * 3. this() and super() are used to call constructors from within a constructor
 */
