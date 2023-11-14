public class conditionlas {
    public static void main(String[] args) {
        if(5<0){
            System.out.println("5 is smaller than 0");
        }else {
            System.out.println("5 is not smaller than 0");
            System.out.println(" ce bine ma stiu");
        }
        int time = 99;
        if (time<10){
            System.out.println("Good morning");
        }
        else if (time<18){
            System.out.println("Good day");
        }
        else if (time<24) {
            System.out.println("Good evening");
        }
        else System.out.println("only 24 hours in a day!!!");

        int day=9;
        switch (day){
            case 1: System.out.println("Monday");break;
            case 2: System.out.println("Tuesday");break;
            case 3: System.out.println("Wednesday");break;
            case 4: System.out.println("Thusday");break;
            case 5: System.out.println("Friday");break;
            case 6: System.out.println("Saturday");break;
            case 7: System.out.println("Sunday");break;
            default: System.out.println("unknouwn");

        }
        //ex1 op
        int temp= 27;
        if (temp<18){
            System.out.println("prea frig");
        }
        else if (temp<=22){
            System.out.println("ok");
        }
        else if (temp>22) {
            System.out.println("prea cald");
        }
        else System.out.println();
        //ex2
        char gen='f';
        boolean married=false;
        if (gen=='m'){
            System.out.println("Domnul");}
        else if (gen=='f' && married){
            System.out.println("Doamna");}
        else System.out.println("Domnisoara");
        //ex3
        int x=3;
        int y=2;
        if (x>y){
        System.out.println(x+" este mai mare decat "+y);}
        else if (x<y){ System.out.println(y+" este mai mare decat "+x);}
        else System.out.println("sunt egale");
        //ex4
        int l=5;
        int n=3;
        int m=1;
        if (l>n && l>m){
            System.out.println(l);}
        else if (n>l && n>m){
            System.out.println(n);}
        else System.out.println(m);
        //ex5
        char letter='i';
        if (letter =='a'|| letter=='e'|| letter=='i'|| letter=='o'|| letter=='u'){
            System.out.println(letter+" este vocala");
        }
            else System.out.println(letter+" este consoana");




}
}
