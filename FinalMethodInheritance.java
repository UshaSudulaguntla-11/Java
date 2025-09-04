class Base{
    final public void show(){
        System.out.println("Base show() is called");    
    }
}
class Derived extends Base{
    public void main(){
        System.out.println("Derived show() called");
    }
}
class Main{
    public static void main(String[] args){
        Base b=new Derived();
        b.show();
        Derived d=new Derived();
        d.show();
    }
}
