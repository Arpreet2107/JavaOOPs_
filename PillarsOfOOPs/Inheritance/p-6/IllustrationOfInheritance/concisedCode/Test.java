// Java Program to illustrate Inheritance (concise)
class Employee {
    int salary = 60000;
}

// Inherited or Sub Class
class Engineer extends Employee {
    int benefits = 10000;
}

// Driver Class
class Test {
    public static void main(String args[])
    {
        Engineer E1 = new Engineer();
        System.out.println("Salary : " + E1.salary
                           + "\nBenefits : " + E1.benefits);

        // Creating and using an instance of Test to avoid the warning
        Test t = new Test();
        t.display();
    }

    void display() {
        System.out.println("Test class is used.");
    }
}