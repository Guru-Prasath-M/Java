// NullPointerException

class Test{
    public static void main(String[] args) {
        String ename = null;
        System.out.println(ename.length());
        System.out.println("GM");
    }
}

class Test4{
    public static void main(String[] args) {
        String ename = null;
        try{
            System.out.println(ename.length());
            // java.lang.NullPointerException
        }
        catch(Exception e){
            System.out.println(e);
        }
        
        System.out.println("GM");
    }
}