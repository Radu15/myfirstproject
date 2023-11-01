public class Loops {
    public static void main(String[] args) {
        //afiseaza crescator
        for(int i=0;i<=5;i++){
            System.out.println(i);
        }
        //afiseaza dscrescator
        for(int i=5;i>=0;i--){
            System.out.println(i);
        }
        //afiseaza din 2in2
        for(int i=0;i<=10;i+=2){
            System.out.println(i);
        }
        //for fircare//
        String cars[]= {"Bmw","Mazda","Opel"};

        for(String c:cars){
            System.out.println(c);
        }
        //while
        int i=0;
        while (i<5) {System.out.println(i);i++;}
        //do while
        int j=0;
        do  {System.out.println(j);j++;}
        while (j<5);

        //break
        for (int k=0;k<10;k++){
            if (k==4){ break;}
            System.out.println(k);
        }
        //continue
        for (int k=0;k<10;k++){
            if (k==4){ continue;}
            System.out.println(k);
            k++;
        }
        //Exemplu:
        try { int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[3]); }
        catch (Exception e)
        { System.out.println("Something went wrong."); }

        //ex1
        for(int y=0;y<=10;y++){
            System.out.println(y);
        }
        //ex2
        for(int z=20; z>=10;z--){
            System.out.println(z);
        }
        //ex3
        for(int l=0;l<=100;l++){
            System.out.println(l);
        }
        //ex4
        String fructe[]={" mar"," capsune"," pere"," banane"};
        for(String f:fructe){
            System.out.println("imi place sa mananc" + f );
        }
        //ex5
        for(int luna=1;luna<=12;luna++)
        switch (luna){
            case 1: System.out.println(luna+"-> Ianuarie");break;
            case 2: System.out.println(luna+"-> Februarie");break;
            case 3: System.out.println(luna+"->Martie");break;
            case 4: System.out.println(luna+"->April");break;
            case 5: System.out.println(luna+"->Mai");break;
            case 6: System.out.println(luna+"->Iunie");break;
            case 7: System.out.println(luna+"->Iulie");break;
            case 8: System.out.println(luna+"->August");break;
            case 9: System.out.println(luna+"->Septembrie");break;
            case 10: System.out.println(luna+"->Octombrie");break;
            case 11: System.out.println(luna+"->Noiembrie");break;
            case 12: System.out.println(luna+"->Decembrie");break;
            default: System.out.println("unknouwn");}



        }
}
