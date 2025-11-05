class test{
    public static void main(String[] args) {
       //Array Decleration
       int[] eids;

       //Array Creation
       eids = new int[4];

       //Array Initlization
       eids[0]=101;
       eids[1]=102;
       eids[2]=103;
       eids[3]=104;

       //Read array and Array elements - Indexing
       System.out.println(eids); // It will print an address - we want to use index to read
       System.out.println(eids[0]); //101
       System.out.println(eids[1]); //102
       System.out.println(eids[2]); //103
       System.out.println(eids[3]); //104
       System.out.println(eids[4]); //Index out of bound because there is only 4 index
    }
}