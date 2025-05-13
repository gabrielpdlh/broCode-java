import javax.xml.transform.Source;

public class Main {
    public static void main(String[] args) {
       int year = 2026;
       int guests = 70;

       String groom = "Gabriel Padilha";
       String bride = "Leticia Batista";
       String place = "undefined";
       String decoration = "undefined";
       String [] godParents = {"Werllan", "Leticia Vitoria", "Mara"};

       boolean atBeach = false;

        System.out.println("The weeding between " + groom + " and " +
                bride + " will happen at " + year + " and there will be about " + guests + " guests.");
        System.out.println("The godParents will be " + godParents[0] + ", " + godParents[1] + " and "  + godParents[2]);
        System.out.println("They would like to it happen at beach, but probably its " + atBeach);
    }
    ;
};

