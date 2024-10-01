public class Main {
    public static void main(String[] args) {
        Person p1 = new Customer();
        Person p2 = new Customer();
        p1.setName("a");
        p2.setName("b");
        p1.setAge(15);
        p2.setAge(15);
        p1.setUsername("alex");
        p2.setUsername("jack");
        p1.setPassword("123");
        p2.setPassword("123");
        ((Customer)p1).generateCustomerID();
        ((Customer)p2).generateCustomerID();

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1.equals(p2));

        Person m1 = new Manager();
        Person m2 = new Manager();
        m1.setName("a");
        m2.setName("b");
        m1.setAge(15);
        m2.setAge(15);
        m1.setUsername("alex");
        m2.setUsername("jack");
        m1.setPassword("123");
        m2.setPassword("123");
        ((Manager)m1).generateManagerID();
        ((Manager)m2).generateManagerID();

        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m1.equals(m2));

    }
}
class Person{
    protected String name;
    protected int age;
    protected String username;
    protected String password;
    public Person() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    @Override
    public String toString() {
        return "name: " + name + ", age: " + age;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        if (username.equals(person.username) && password.equals(person.password)) return true;
        else return false;
    }
}

//Create Person class, it should have name, age, username, password.
//Override toString function to just print name and age in a good format.
//Override equals function to check username and password.


class Customer extends Person {
    private int customerID;
    private double balance;
    public Customer() {
        super();
    }
    public void generateCustomerID() {
        customerID = (int) (Math.random() * 10000);
    }
    public int getCustomerID() {
        return customerID;
    }
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    @Override
    public String toString() {
        return super.toString() + " - " + "Customer ID: " + customerID;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        if(super.equals(o) || (String.valueOf(customerID).equals(customer.customerID) && password.equals(customer.password))) return true;
        else return false;
    }
}

//Create Customer class, it should extend Person  class and it should have extra customerID(auto genarate we will not have it on constructor) and balance.
//
//Required extra functions: getBalance, setBalance and getCustomerID
//
//Overide toString again and print extra customerID
//override equals function and check if username and password matchs or customerID and password match.  IF any of cases are correct we will return true.
//
//Deadline : 3.51pm
//1000000* Math.Random();






class Manager extends Person {
    private int managerID;
    private int actionNumber;
    public Manager() {
        super();
        this.actionNumber = 0;
    }

    public int getActionNumber() {
        return actionNumber;
    }

    public int getManagerID() {
        return managerID;
    }

    public void setActionNumber(int actionNumber) {
        this.actionNumber = actionNumber;
    }
    public void generateManagerID() {
        managerID = (int) (Math.random() * 10000);
    }
    @Override
    public String toString() {
        return super.toString() + " - " + "Manager ID: " + managerID;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manager manager = (Manager) o;
        if(super.equals(o) || (String.valueOf(managerID).equals(manager.managerID) && password.equals(manager.password))) return true;
        else return false;
    }
}

//Create Manager class, it should extend Person, it should have extra managerId (auto generate) and actionNumber( set zero when you created the object so it should assign 0 in the constructor)
//
////        Required extra functions: getActionNumber, setActionNumber and getManagerID
//
////        Overide toString again and print extra managerID
//override equals function and check if username and password matches or managerID and password match.  IF any of cases are correct we will return true.