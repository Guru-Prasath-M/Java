//TO AVOID NULLPOINTER EXCEPTION

import java.util.Optional;

class One{
    public static void main(String[] args) {
        //String ename="RAHUL";
        String ename=null;
        Optional<String> opt=Optional.ofNullable(ename);
        if(opt.isPresent()){
            System.out.println(opt.get().toLowerCase());
        }
        else{
            System.out.println("String value Null");
        }
    }
}