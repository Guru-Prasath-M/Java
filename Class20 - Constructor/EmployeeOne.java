//USING CONSTRUCTOR

class EmployeeOne {
    int eid;
    String ename;
    String gender;
    double esal;

    EmployeeOne(int id , String name , String gender , double sal){
        this.eid = id;
        this.ename = name;
        this.gender = gender;
        this.esal = sal;
    }

    public void add_bonus(double amount){
        this.esal = this.esal + amount;
    }

    public double get_sal(){
        return this.esal;
    }

    public static void main(String[] args) {
        EmployeeOne e1 = new EmployeeOne(101, "Rahul", "Male", 45000.00);
        System.out.println("Employee Id : " + e1.eid);
        System.out.println("Employee Name : " + e1.ename);
        System.out.println("Employee Gender : " + e1.gender);
        System.out.println("Employee Salary : " + e1.esal);

        EmployeeOne e2 = new EmployeeOne(102, "Sonia", "Female", 55000.00);
        System.out.println("Employee Id : " + e2.eid);
        System.out.println("Employee Name : " + e2.ename);
        System.out.println("Employee Gender : " + e2.gender);
        System.out.println("Employee Salary : " + e2.esal);

        e1.add_bonus(1000.00);
        e1.add_bonus(100.00);
        e2.add_bonus(50000.00);
        System.out.println(e1.esal);
        System.out.println(e2.esal);

        System.out.println(e1.get_sal());
        System.out.println(e2.get_sal());
    }
}
