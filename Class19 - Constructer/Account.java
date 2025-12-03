public class Account {
    int acc_Id;
    String acc_Name;
    double acc_Bal;
    public Account(int id, String name, double amount){
        this.acc_Id = id;
        this.acc_Name = name;
        this.acc_Bal = amount;
    }
    public static void main(String[] args) {
        Account a1=new Account(101,"Rahul",5000.00);
        Account a2=new Account(102,"Sonia",4000.00);
        Account a3=new Account(103,"Priya",3000.00);
        System.out.println(a1.acc_Id);
        System.out.println(a2.acc_Name);
        System.out.println(a3.acc_Bal);
    }
}