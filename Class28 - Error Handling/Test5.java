// IllegalArgumentException

class Test {
    public static void main(String[] args) {
        // Thread.sleep(500);
        Thread t = new Thread();
        t.setPriority(500);
        System.out.println("GM");
    }
}

class Test5 {
    public static void main(String[] args) {
        // Thread.sleep(500);
        Thread t = new Thread();
        try{
            t.setPriority(500);
            // java.lang.IllegalArgumentException
        }
        catch(Exception e){
            System.out.println(e);
        }
        
        System.out.println("GM");
    }
}
