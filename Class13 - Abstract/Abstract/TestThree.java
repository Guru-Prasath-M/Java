abstract class Bank{
    public abstract double cal_interval();
}

class TestThree{
    public static void main(String[] args) {
        Bank b1 = new Bank(); // Bank is abstract; cannot be instantiated 
    }
}