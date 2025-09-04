class Base{
    public void show(){
        System.out.println("Base show() is called");    
    }
}
class Derived extends Base{
    public static void main(String[] args){
        System.out.println("Derived show called");
    }
}
class Main{
    public static void main(String[] args){
        Base b=new Derived();
        b.show();
    }
}
