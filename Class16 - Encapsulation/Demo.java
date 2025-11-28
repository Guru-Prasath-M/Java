class Demo {
    public static void main(String[] args) {
        Account a1=new Account();
        a1.setAcc_id(101);
        a1.setAcc_name("Rahul");
        a1.setAcc_bal(5000.00);
        System.out.println(a1.getAcc_id());
        System.out.println(a1.getAcc_name());
        System.out.println(a1.getAcc_bal());
    }
}
