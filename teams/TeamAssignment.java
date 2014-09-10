import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class TeamAssignment 
{
    static final Map<Integer, String> STUDENTS = new HashMap<Integer, String>() {{
        put(1, "Ballinger");
        put(2, "Beisler");
        put(3, "Boanos");
        put(4, "Chaffee");
        put(5, "Choffel");
        put(6, "Craft");
        put(7, "Dinga");
        put(8, "Ginoza");
        put(9, "Hanko");
        put(10, "Hawk");
        put(11, "Kelly");
        put(12, "Kinneer");
        put(13, "Landgrebe");
        put(14, "Lawrence");
        put(15, "Livingston");
        put(16, "McCurdy");
        put(17, "Means");
        put(18, "Mulvay");
        put(19, "Nardone");
        put(20, "Sherretts");
        put(21, "Shudy");
        put(22, "Smith");
        put(23, "Swaray");
        put(24, "Torrance");
        put(25, "Weisman");
    }};

    public static void main(String[] args) {

        ArrayList<Integer> students = new ArrayList<Integer>();

        // populate the arraylist with the integers
        for(int i = 1; i <= 25; i++) {
            Integer I = new Integer(i);
            students.add(I);
        }

        // pick the ordering for the talks today
        ArrayList<Integer> studentsTodaysOrdering = (ArrayList<Integer>)students.clone();
        Collections.shuffle(studentsTodaysOrdering);
        System.out.println("Today's random ordering of the students: "); // + studentsTodaysOrdering);
        System.out.println();

        for(Integer studentToday : studentsTodaysOrdering) {

            System.out.println(STUDENTS.get(studentToday));

        }

        System.out.println();

        System.out.println("These are the teams for today's laboratory assignment:");

        int i = 0;
        int team = 1;
        for(Integer studentToday : studentsTodaysOrdering) {

            if(i % 5 == 0) {

                System.out.println();
                System.out.println("Team " + team);
                team++;

            }

            System.out.println(STUDENTS.get(studentToday));

            i++;

        }

    }

}
