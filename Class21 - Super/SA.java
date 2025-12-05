public class SA extends Account{
    int acc_Id;
    double acc_Bal;
    double min_Bal = 500.00;

    public SA(int id , String name, String email, double amount){
        super(name, email);
        this.acc_Id = id;
        this.acc_Bal = amount;
    }
    public void cal_Bal(){
        System.out.println(this.acc_Bal - this.min_Bal);
    }
}
