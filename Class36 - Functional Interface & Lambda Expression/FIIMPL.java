//FUNCTIONAL INTERFACE

interface FIONE{
    public abstract int get();
}

class FIIMPL implements FIONE{
    public int get(){
        return 100;
    }

    public static void main(String[] args) {
        FIONE fi = new FIIMPL();
        System.out.println(fi.get());
    }
}