package philipJohnson;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    Theatre theatre = new Theatre("Olympian", 8, 12);
        List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.seats);
        printList(seatCopy);
//        theatre.getSeats()
        seatCopy.get(1).reserve();
        if(theatre.reserveSeat("A02"))
        {
            System.out.println("Please pay for A02.");
        }else
        {
            System.out.println("Seat already reserved.");
        }

        Collections.reverse(seatCopy);
        System.out.println("Printing seat copy.");
        printList(seatCopy);
        System.out.println("printing theatre.seat.");
        printList(theatre.seats);
        //handy list methods for finding min and max elents depending on sort order
        Theatre.Seat minSeat = Collections.min(seatCopy);
        Theatre.Seat maxSeat = Collections.max(seatCopy);

        System.out.println("The first seat is " + minSeat.getSeatNumber());
        System.out.println("The last seat is " + maxSeat.getSeatNumber());

        sortList(seatCopy);
        System.out.println("Arranging new seat copy.");
        printList(seatCopy);
    }

    public static void printList(List<Theatre.Seat> list)
    {
        for(Theatre.Seat seat: list)
        {
            System.out.println(" " + seat.getSeatNumber());
        }
        System.out.println();
        System.out.println("====================================================================");
    }

    public static void sortList(List<? extends Theatre.Seat> list)
    {
        for(int i = 0; i<list.size() -1; i++)
        {
            for(int j = i + 1; j < list.size(); j++)
            {
                if(list.get(i).compareTo(list.get(j)) > 0)
                {
                    Collections.swap(list, i, j);
                }
            }
        }
    }
}
