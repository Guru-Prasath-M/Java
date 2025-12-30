@FunctionalInterface
interface DaoI {
    public abstract void login();
    // public abstract void logout();
    
}
class DaoImpl implements DaoI{
    public void login(){
        System.out.println("Login Success");
    }
    public void logout(){
        System.out.println("Login Failed");
    }
}