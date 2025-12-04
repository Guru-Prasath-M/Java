class Employee{
    int eid;
    String ename;
    String gender;
    double esal;

    public static void main(String[] args) {
        Employee e1 = new Employee();
        System.out.println(e1.eid=101);
        System.out.println(e1.ename="Rahul");
        System.out.println(e1.gender="Male");
        System.out.println(e1.esal=45000.00);

        Employee e2 = new Employee();
        System.out.println(e2.eid=102);
        System.out.println(e2.ename="Sonia");
        System.out.println(e2.gender="Female");
        System.out.println(e2.esal=55000.00); 
    }
}