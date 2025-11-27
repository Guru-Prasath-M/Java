//WHETHERE WE DECLARE (OR) NOT ALL INTERFACE METHOD BY DEFAULT PUBLIC & ABSTRACT

interface User{
    public abstract void login();
    public abstract void logout();
}

class UserImpl implements User{
    public void login(){
        System.out.println("Login Success");
    }
    public void logout(){
        System.out.println("Logout");
    }

    public static void main(String[] args) {
        User u1 = new UserImpl();
        u1.login();
        u1.logout();
    }
}