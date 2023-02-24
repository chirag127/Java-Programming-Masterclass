/**
 * Constructor Challenge Exercise
 *
 * Create a new class called Customer
 * It should have the following fields: name, credit limit, and email address.
 *
 * Create getters only.
 *
 * Create 3 constructors:
 * 1st constructor empty should call the constructor with 3 parameters with default values
 * 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
 * 3rd constructor should save all fields.
 */

 public class ConstructorChallengeExercise {

     public static void main(String[] args) {
         Customer customer = new Customer("John Doe", 1000,"johndoes@gmail.com");
            System.out.println(customer.getName());
            System.out.println(customer.getCreditLimit());
            System.out.println(customer.getEmailAddress());
        }

    }

    class Customer {

        private String name;
        private int creditLimit;
        private String emailAddress;

        public Customer() {
            this("John Doe", 1000, "joe@gmail.com");

        }

        public Customer(String name, int creditLimit) {
            this(name, creditLimit, "joe@gmals.com");

        }

        public Customer(String name, int creditLimit, String emailAddress) {
            this.name = name;
            this.creditLimit = creditLimit;
            this.emailAddress = emailAddress;
        }

        public String getName() {
            return name;
        }

        public int getCreditLimit() {
            return creditLimit;
        }

        public String getEmailAddress() {
            return emailAddress;
        }
    }

