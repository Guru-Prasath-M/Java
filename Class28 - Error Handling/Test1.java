// ArithmeticException

class Test{
    public static void main(String[] args) {
        System.out.println(10/2);
        System.out.println(10/0); 
        System.out.println(10/1);
        System.out.println("GM");
    }
}

class Test1{
    public static void main(String[] args) {
        System.out.println(10/2);
        try{
            System.out.println(10/0);
        }
        catch(Exception e){
            System.out.println(e);
            // java.lang.ArithmeticException: / by zero
        }
        
        System.out.println(10/1);
        System.out.println("GM");
    }
}

