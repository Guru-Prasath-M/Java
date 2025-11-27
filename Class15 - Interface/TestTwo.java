interface Bank{
    public abstract double cal_Bal();
}

class Account implements Bank{
    public double cal_Bal(){
        return 500.00;
    }
}

class Demo{
    public static void main(String[] args) {
        Bank a1 = new Account();
        System.out.println(a1.cal_Bal());
    }
}