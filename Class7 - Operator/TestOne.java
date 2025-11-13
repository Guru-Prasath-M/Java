class TestOne {
    public static void main(String[] args) {
        byte b = 10;
        b = b +1 ; 
        System.out.println(b); // Compile time error because b is in byte type and 1 is in int type , so It can't change byte to int
    }
}
