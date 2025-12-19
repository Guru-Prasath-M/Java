class TestThree{
    public static void main(String[] args) {
        System.out.println(10/2);
        try{
            throw new ArithmeticException("Lunch Time");
            // System.out.println(10/0);
        }
        catch(NullPointerException ne){
            System.out.println(ne.getMessage());
        }
        catch(ArithmeticException ae){
            System.out.println(ae.getMessage());
        }
        System.out.println("GM");
    }
}