class Account{
    int acc_Id;
    String acc_Name;
    double acc_bal;
    static String branch_Name;
    static String bank_Name;

    public static void main(String[] args) {
    Account a1 = new Account();
    Account a2 = new Account();
    Account a3 = new Account();

    a1.acc_Id = 101;
    a1.bank_Name = "SBI";

    System.out.println(a1.acc_Id); //0
    System.out.println(a1.bank_Name); //null

    System.out.println(a2.acc_bal); //0.0
    System.out.println(a2.acc_Name); //null

    System.out.println(a3.branch_Name); //null
    }
}