//Final is applicable for class , varibale and method
//If variable is declared as a final we can't update or modify
//If class is declared as a final we can't declared child class, Inheritance is not possible

class Test{
    public static void main(String[] args) {
        final int eid=101;
        eid=102;
        System.out.println("Employee Id:"+eid);
    }
}