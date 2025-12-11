// class Object{
//     public String toString(){
//         return this.getClass()+"@"+Integer.hex(hashCode());
//     }
// }

class TestOne extends Object{
    public String toString(){ //Print your values in meaning format
        return "RajiniKanth"; // Over Riding tostring()
    } 
    public static void main(String[] args) {
        TestOne t1 = new TestOne();
        System.out.println(t1); //It will print Address
    }
}