import com.sun.security.jgss.GSSUtil;

public class myString {
    public static void main(String[] args) {
        String myString="This is a text";
       int lungime = myString.length();
        System.out.println(lungime);
        System.out.println(lungime);

        String myName = "Chis Radu Cristian";
        int lungimeaNumelui = myName.length();
        System.out.println(lungimeaNumelui);
        System.out.println("lungimea numelui \""+ myName +"\"este\n"+lungimeaNumelui);

        String myNmeWithouthSpace = myName.replace(" ","");
        int lungimeanumeluiFaraSpatii=myNmeWithouthSpace.length();

        System.out.println(lungimeanumeluiFaraSpatii);


       char aPatraLitera=myName.charAt(4);
       char primaLitera=myName.charAt(6);
        System.out.println(aPatraLitera);
        System.out.println(primaLitera);

        //ex1//
        String myCountry="Portugalia";
        int lungimeaNumelui1=myCountry.length();
        System.out.println(lungimeaNumelui1);

        //ex2//
        String myFavouriteMovie="Fabrica de bani";
        System.out.println("Filmul meu preferat este "+"\""+myFavouriteMovie+"\"");

        //ex3//
        System.out.println(myFavouriteMovie.toUpperCase());
        System.out.println(myFavouriteMovie.toLowerCase());

        //ex4//
        int lungimeaNumelui2 = myFavouriteMovie.length();
        System.out.println(lungimeaNumelui2);
    }
}
