package Method;

public class ParameterizedMethod {
    public static void main(String[] args) {

//        greeting("Kenan");
//        greeting("Ayise");
        multiple(4,5,6);
    }

public  static  void multiple(int a , int b,int c){
    System.out.println("Multiple = "+(a+b+c));
}
    public static  void greeting(String name){
        System.out.println("Hello..."+name);
    }

}
