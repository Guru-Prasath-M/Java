//Inheritance - If we want to access parent functionality in child class
              //We can access using extends keyword
              //Inheriting object from one class to another class
              //We can't access child type reference for parent object but we can access parent to child

class parent{
    public void m1(){
        System.out.println("Parent Class - m1 method");
    }

    public void m2(){
        System.out.println("Parent class - m2 method");
    }
}

class child extends parent{
    public void m3(){
        System.out.println("Child class - m3 method");
    }
}