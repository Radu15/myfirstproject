public class JavaMethods {
    //main
    public static void main(String[] args) {
        printHello();
        printHello();
        weLearn();
        helloName("Cristina");
        helloName("Lavinia");
        helloName("Radu");
        getSum(2,3);
        getSum(10,5);
        getProduct(2,3);
        getSum(2,3,5);
        getSum(2.3,5.6);
        helloNameAge("Cristina",19);
        helloNameAge("Radu",35);
        printFriends("Cristina","Ioana");
        printFriends("Radu","Andrei");
        System.out.println(getSumWhitReturn(5,6));
        System.out.println(getProductReturn(2,6));
        System.out.println(areMere( " Ana"));
        System.out.println(areMere("Radu"));


    }

    private static void printHello(){
        System.out.println("Hello World");
    }

    private static void weLearn(){
        System.out.println("We learn about Methods");
    }

    private static void helloName(String name){
        System.out.println("Hello "+name);
    }

    private static void helloNameAge(String name, int age){
        System.out.println(name+" is "+age+" years old");
    }

    /*scrieti o metoda care primeste doi parametri de tip String - name1 si name2
    si afiseaza "name1 si name2 are friends"
     */
    private static void printFriends(String name1, String name2){
        System.out.println(name1+" and "+name2+" are friends");
    }

    private static void getSum(int x, int y){
        System.out.println(x+y);
    }

    private static void getSum(double x, double y){
        System.out.println(x+y);
    }

    private static void getSum(int x, int y, int z){
        System.out.println(x+y+z);
    }
    private static void getProduct(int x, int y){
        System.out.println(x*y);
    }
    private static int getSumWhitReturn(int x,int y){
                return  x+y;
    }
    private  static int getProductReturn(int x,int y){
        return x*y;
    }
    private static String areMere(String nume){
        return nume+" are mere";
    }


}