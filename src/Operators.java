public class Operators {
    public static void main(String[] args) {
        int sum1 = 100 + 50;
        int sum2 = sum1 + 50;
        int sum3 = sum1 + sum2;
        System.out.println("sum1=" + sum1);
        System.out.println("sum2=" + sum2);
        System.out.println("sum3=" + sum3);

        int number1 = 100;
        int number2 = 50;
        System.out.println(number1 + number2);
        System.out.println(number1 - number2);
        System.out.println(number1 / number2);
        System.out.println(number1 * number2);
        System.out.println(number1 % number2);
        System.out.println(9 / 2);//catul
        System.out.println(9 % 2);//restul
        System.out.println(++number1);
        System.out.println(--number2);
        int number3 = number2;
        number2 = 1;
        System.out.println(number3);
        System.out.println(number2);
        number2 = number2 + 2;
        //number2+=4; la fel ca sus dar mai scurt
        number2 -= 2;
        number2 *= 2;
        System.out.println(number2);
        System.out.println(number1 > number2);
        System.out.println(number1 < number2);
        System.out.println(10 > 5);
        System.out.println('A' == 'A');
        System.out.println('A' != 'A');
        System.out.println(!true);// !=not...(  !  inverseaza rezultatul)
        System.out.println(number1);
        System.out.println(number2);

        boolean condition = number1 > number2 && number1 > 100;//&&=si  ||=sau
        System.out.println(condition);

        //ex,1,2//
        int number5 = 10;
        int number6 = 6;
        int number7 = 5;
        System.out.println(number5 * number6);
        System.out.println(number5 / number7);
        //ex.3//
        int x = 10;
        System.out.println(++x);
        //ex,4//
        x += 5;
        System.out.println(x);
        //ex,5//
        int y = 3;
        int z = 5;
        int k = y + z;
        if (k >= 10) {
            System.out.println("suma este mai mare decat 10");
        } else {
            System.out.println("suma este mai mica decat 10");

        }
        //ex6//
        if (k % 2 == 0) {
            System.out.println("suma este numar par");
        }
        //ex optionale 1//
        int var1 = 10;
        int var2 = 20;
        int var3 = 30;
        int var4 = 40;
        System.out.println(var1 + var2 + var3 + var4);
        System.out.println(var1 * var2 * var3 * var4);
        System.out.println(var4 % var2);
        //ex2//
        for (int i = 0; i < 3; i++) {
            var1++;
        }
        System.out.println(var1);
        //ex3//
        for (int i = 0; i< 2; i++) {
            var2--;
        }
        System.out.println(var2);
        //ex4//
        boolean cond1=false;
        boolean cond2=false;
        if (var1+var2+var3+var4>100) {
           cond1=true;
        }
        if (var1*var2*var3*var4>1000) {
            cond2=true;
        }
        System.out.println(cond1);
        System.out.println(cond2);
        //ex5//
        boolean condition1=cond1==true || cond2==true;
        System.out.println(condition1);
        boolean condition2=cond1==true && cond2==true;
        System.out.println(condition2);




    }
}
