//LAMBDA EXPRESSION

@FunctionalInterface
interface FITWO{
    public abstract int get();
}

class FIIMPL2{
      static  FITWO fi = ()->100;

    public static void main(String[] args) {
        System.out.println(fi.get());
    }
}