/** Inheritance Challenge Part 1
 *
 * 1. In this challenge we will create a class named Worker.
 * 2. Worker class will have 3 attributes:
 *     a. name
 *    b. birthDate
 *   c. endDate
 * 3. Worker class will have 3 methods:
 *    a. getAge()
 *   b. collectPay()
 * c. terminate(string endDate)
 *
 * 4. now we will create a class named Employee which will inherit Worker class.
 * 5. Employee class will have 2 attributes:
 *   a. employeeId
 *   b. hireDate
 *
 * 6. Employee class will have 0 methods.
 * 7. now we will create a class named SalariedEmployee which will inherit Employee class.
 * 8. SalariedEmployee class will have 1 attribute:
 *  a. AnnualSalary
 *  b. isretired
 * 9. SalariedEmployee class will have 1 method:
 *  a. retire()
 * 10. now we will create a class named HourlyEmployee which will inherit Employee class.
 * 11. HourlyEmployee class will have 2 attributes:
 *  a. hourlyPayRate
 * method:
 * getDailyPay()
 *
 *
 */

 public class InheritanceChallengePart2 {

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

        public int getAge() {
            return 0;
        }

        public double collectPay() {
            return 0.0;
        }

        public void terminate(String endDate) {
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

        public SalariedEmployee(String name, String birthDate, String employeeId, String hireDate, double annualSalary) {
            super(name, birthDate, employeeId, hireDate);
            this.annualSalary = annualSalary;
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
            this.isRetired = true;


        }


    }

    public class HourlyEmployee extends Employee {

        private double hourlyPayRate;

        public HourlyEmployee(String name, String birthDate, String employeeId, String hireDate, double hourlyPayRate) {
            super(name, birthDate, employeeId, hireDate);
            this.hourlyPayRate = hourlyPayRate;
        }

        public double getHourlyPayRate() {
            return hourlyPayRate;
        }

        public void setHourlyPayRate(double hourlyPayRate) {
            this.hourlyPayRate = hourlyPayRate;
        }

        public double getDailyPay() {
            return hourlyPayRate * 8;
        }
    }

    public static void main(String[] args) {
        InheritanceChallengePart2 inheritanceChallengePart1 = new InheritanceChallengePart2();
        InheritanceChallengePart2.SalariedEmployee salariedEmployee = inheritanceChallengePart1.new SalariedEmployee("John", "01/01/1990", "123", "01/01/2019", 100000);
        System.out.println(salariedEmployee.getAnnualSalary());
        System.out.println(salariedEmployee.isRetired());
        salariedEmployee.retire();
        System.out.println(salariedEmployee.isRetired());

        InheritanceChallengePart2.HourlyEmployee hourlyEmployee = inheritanceChallengePart1.new HourlyEmployee("John", "01/01/1990", "123", "01/01/2019", 100);
        System.out.println(hourlyEmployee.getDailyPay());
    }

}


/** Output
 * 100000.0
 * false
 * true
 * 800.0
 */
