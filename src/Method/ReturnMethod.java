package Method;

public class ReturnMethod {

//
//public static  int ikilecarp(int a) {
//        return a * 2;
//    }
//
//    public static int ikiliTopla(int a) {
//        return a + 2;
//
//    }
//
//    public static int dorlicarp(int a) {
//        return 4 * a;
//    }
//
//    public static void main(String[] args) {
//        System.out.println("Result = "+dorlicarp(ikiliTopla(ikilecarp(8))));
//
//
//    }
public static int trying(int a){
    System.out.println("Cikti veriliyor...");
    return a*2;

    }

    public static void main(String[] args) {
        System.out.println("Result = "+trying(trying(6)));

    }

}