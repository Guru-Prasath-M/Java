class Object{
    public boolean equals(Object o){
        return true;
    }
}

class Employee extends Object{
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();

        System.out.println(e1.equals(e2));
        System.out.println(e1.toString());
        System.out.println(e2);
    }
}