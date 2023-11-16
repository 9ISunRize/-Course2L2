public class Main {
    public static void main(String[] args) {
        hogwarts[] hogwarts = {
            new Gryffindor("Harry Potter", 60,6,8,9,9 ),
            new Gryffindor("Hermione Granger", 6,5,5,3,8),
            new Gryffindor( "Ron Weasley",  1,1,1,1,1),
            new Slytherin("Draco Malfoy",2,3,4,5,6,6,8),
            new Slytherin("Graham Montague",8,3,8,2,5,2,9),
            new Slytherin("Gregory Goyle",5,1,9,7, 8,7,2),
            new Hufflepuff("Zachariah Smith",6,4,6,3,9),
            new Hufflepuff(" Cedric Diggory",8,5,0,7,57),
            new Hufflepuff("Justin Finch-Fletchley",8,4,6,8,52),
            new Ravenclaw("Zhou Chang",7,3,4,6,3,6),
            new Ravenclaw("Padma Patil",6,4,6,3,4,6),
            new Ravenclaw("Marcus Belby",7,4,9,5,3,7),
        };

        Gryffindor Harry = new Gryffindor("Harry Potter", 60,6,8,9,9 );
        Gryffindor Hermione =  new Gryffindor("Hermione Granger", 6,5,5,3,8);
        Gryffindor Ron =   new Gryffindor( "Ron Weasley",  1,1,1,1,1);
        Slytherin Malfoy = new Slytherin("Draco Malfoy",2,3,4,5,6,6,8);

        Harry.compare(Hermione);
        Hermione.compare(Ron);
        Ron.compare(Harry);
        System.out.println("");
        Harry.compare(Malfoy);
        Malfoy.compare(Harry);
        //for (int i = 0; i < hogwarts.length; i++) {
            //for (int j = i + 1; j < hogwarts.length; j++) {
           //     hogwarts[i].compare(hogwarts[j]);
           // }
        //}


   //     Gryffindor Harry = (Gryffindor) hogwarts[0];
    //    Gryffindor Hermione = (Gryffindor) hogwarts[1];
    //    Gryffindor Ron = (Gryffindor) hogwarts[2];
    //   Harry.compare(Hermione);
    //    Hermione.compare(Ron);
    //    Ron.compare(Harry);
    }
}