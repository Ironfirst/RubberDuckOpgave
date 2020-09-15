import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class queueTest
{

    Duckling duckling = new Duckling("sender",position,);
    ArrayList<DuckLing> and = new ArrayList;
    public void testOnQueueFunktionalitet(){

        // metode der skal give en mængde af objecter der er i listen " opret 1 og check denne
        assertEquals(1,and.length());


        // skal checke om det første object er det samme som før sletning.
        // skal oprette et midlertidigt object fra index 0 placering i listen som så bruges til
        // sammenligning i listen på index 0 igen og skal give false " det skal være et andet'
        // object når det første er slettet

        ArrayList<Duckling> tempAnd = new ArrayList<Duckling>();
        tempAnd.add(and.get(0));
        and.remove(0);
        assertEquals(false,and.get(0)==tempAnd.get(0));

        // skal checke liste længden " length eller size" og skal så tilføje en mere
        // og efterfølgende sammenligne

        Duckling duckling = new Duckling("sender",position);
        int længde = and.size();
        and.add(duckling);
        assertNotEquals(længde,and.size());

}


}

class mainTest{

}