abstract class Bank{
    public abstract double cal_interval();

    public String get_Name(){
        return "Sonia";
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