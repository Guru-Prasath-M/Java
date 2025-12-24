import java.util.*;

public class Two{
    public static void main(String[] args) {
        ArrayList eids = new ArrayList();
        System.out.println(eids); //[]--Here we will get empty array
        eids.add(101);
        eids.add(102);
        eids.add(103);
        eids.add(104);
        System.out.println(eids);
    }
} 

// We will get this type of error to avoid this we have to use GENRIC METHOD:
// --------------------------------------------------------------------------
// Note: Two.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.
