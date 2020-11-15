package HM3;

import java.util.ArrayList;
import java.util.List;

public class RestaurantApp {
    public static void main(String[] args) {

        List<RestaurantClass> myGuests = new ArrayList<>();
        RestaurantClass g1 = new RestaurantClass("Prince Tea House",110);
        myGuests.add(g1);
        g1.addedGuests(120);
        g1.removedGuests(41);
        g1.customerSummary();
        System.out.println("Total available restaurants "+myGuests.size());
    }


}
