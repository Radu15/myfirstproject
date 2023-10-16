public class Operators {
    public static void main(String[] args) {
        int sum1=100+50;
        int sum2=sum1+50;
        int sum3=sum1+sum2;
        System.out.println("sum1="+sum1);
        System.out.println("sum2="+sum2);
        System.out.println("sum3="+sum3);

        int number1=100;
        int number2=50;
        System.out.println(number1+number2);
        System.out.println(number1-number2);
        System.out.println(number1/number2);
        System.out.println(number1*number2);
        System.out.println(number1%number2);
        System.out.println(9/2);//catul
        System.out.println(9%2);//restul
        System.out.println(++number1);
        System.out.println(--number2);
        int number3=number2;
        number2=1;
        System.out.println(number3);
        System.out.println(number2);
        number2=number2+2;
        //number2+=4; la fel ca sus dar mai scurt
        number2-=2;
        number2*=2;
        System.out.println(number2);
        System.out.println(number1>number2);
        System.out.println(number1<number2);
        System.out.println(10>5);
        System.out.println('A'=='A');
        System.out.println('A'!='A');
        System.out.println(!true);// !=not...(  !  inverseaza rezultatul)
        System.out.println(number1);
        System.out.println(number2);

        boolean condition=number1>number2 && number1>100;//&&=si  ||=sau
        System.out.println(condition);



    }
}
