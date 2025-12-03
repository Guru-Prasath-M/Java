class Account{
    int acc_Id;
    String acc_Name;
    double acc_Bal;

    Account(){

    }
    public void open_Acc(){
        System.out.println("Account Opened");
    }

    public static void main(String[] args) {
        Account a1 = new Account();
        Account a2 = new Account();
        Account a3 = new Account();

        System.out.println(a1.acc_Id);
        System.out.println(a2.acc_Name);
        System.out.println(a3.acc_Bal);
    }
}