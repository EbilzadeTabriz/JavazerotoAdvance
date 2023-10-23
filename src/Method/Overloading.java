package Method;

public class Overloading {
//    public static void topla(int a,int b,int c){
//        System.out.println("Result = "+(a+b+c));
//
//    }
//    public static  void topla(int a,int b){
//        System.out.println("Result = "+(a+b));
//    }
//    public static void topla(String a,String b){
//        System.out.println(a+" "+b);
//    }
    public static void scoreCalculate(String name,int puan){
        System.out.println(name+" adli oyuncun " +puan+ " puani var");
    }
    public static void scoreCalculate(int puan){
        System.out.println("Nameless  gamer puani  "+puan+" var");
    }
    public static void scoreCalculate(String name){
        System.out.println(name+ " oyuncunun  hic puani yoxdur");
    }

    public static void main(String[] args) {

        scoreCalculate(1000);
       scoreCalculate("Kenan");
       scoreCalculate("Fazil",2000);

//
//        topla(1,2);
//        topla("Kenan","Fazil");
//        topla(1,2,4);



    }
}
