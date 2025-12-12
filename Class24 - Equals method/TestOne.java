class Emp{}
class TestOne {
    public static void main(String[] args) {
        String s1="Rahul";
        String s2=new String("Rahul");
        String s3=new String("Gandhi");

        Emp e1=new Emp();
        Emp e2=new Emp();
        
        int a=100;
        int b=200;
        int c=100;

        System.out.println(e1.equals(e2)); //False
        System.out.println(s1.equals(s2)); //True
        System.out.println(s1.equals(s3)); //False
        // System.out.println(a.equals(b)); // COmpile time error because equals() is applicable only in OBJECT
        System.out.println(e1 == e2); //False
        System.out.println(a == c); //True
        System.out.println(s1 == s2); //Fals
    }
}