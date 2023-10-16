public class myArray {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4};
        String[] myStringArray = {"Unu", "Doi", "Trei", "Patru"};
        System.out.println(myArray[0]);
        System.out.println(myStringArray[3]);
        int length = myArray.length;

        /*System.out.println(myStringArray[0]);
        System.out.println(myStringArray[1]);
        */
        for (int i = 0; i < myStringArray.length; i++) {
            System.out.println(myStringArray[i]);
        }
        for (String str : myStringArray) {
            System.out.println(str);}
        //ex1//
            double[] myArray1 = {1.5, 2.5, 3.5, 4.5};
            int length1 = myArray1.length;
            System.out.println(myArray1[1]);
            System.out.println(myArray1[3]);
            for (int z = 0; z < myArray1.length; z++) {
                System.out.println(myArray1[z]);
            }
            //ex2//
        char[] myCharArray={'a','b','c','d'};
        System.out.println(myCharArray[0]);
        System.out.println(myCharArray[1]);
        System.out.println(myCharArray[3]);
        for (int y=0;y<myCharArray.length;y++){
            System.out.println(myCharArray[y]);
        }


        }
  }