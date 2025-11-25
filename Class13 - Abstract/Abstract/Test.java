//ABSTRACT :

/* •	Abstract modifier is applicable for class and method but not for variable.
•	Abstract method has only declaration and not an implementation.
•	If the class name is Abstract, we can’t create object.
•	If class contains one abstract method class name must be abstract. */


abstract class Bank {
    public abstract double cal_interval();
    public String get_Name(){
        return "Rahul";
    }
}

class Account extends Bank{
    public double cal_interval(){
        return 0.0;
    }

    public static void main(String[] args) {
        Account a1 = new Account();
        System.out.println(a1.cal_interval());
        System.out.println(a1.get_Name());
    }
}
