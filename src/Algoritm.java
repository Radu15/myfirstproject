public class Algoritm {
    public static void main(String[] args) {
        int numere[]={1,-25,34,-2,67,5};
        for (int i=0; i<numere.length;i++){
            int inainte=numere[i]-1;
            int dupa=numere[i]+1;
            System.out.println(inainte+" "+dupa);}
        //ex
        for(int i=0;i<numere.length;i++){
            if (numere[i]<0){
            System.out.println(numere[i]);
            }

        }
        //ex
        String tari[]={"Anglia","Romania","Albania","Franta","China"};
        for(String t:tari){
            System.out.println(t.charAt(0));
            System.out.println(t+": "+t.length());
            System.out.println(t.contains("m"));
            if (t.charAt(0)=='A'){ System.out.println(t);}

            String cea_mai_lunga=tari[0];
            String cea_mai_scurta=tari[0];

            for (String c:tari){
                if ( c.length()>cea_mai_lunga.length())
                {
                    cea_mai_lunga=c;
                }
                if (c.length()<cea_mai_scurta.length())
                {
                cea_mai_scurta=c;
                }
            }
            System.out.println("cea mai lunga tara " + cea_mai_lunga);
            System.out.println("cea mai scurta tara " +cea_mai_scurta);

        }


    }
}
