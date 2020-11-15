package HM3;

public class RestaurantClass {
    String name;
    int guestCapacity = 110;
    int guestCount;
    int numberofGuets;

    public RestaurantClass(String resName, int capacity){
        guestCount = capacity;
        name = resName;
    }


    public void removedGuests(int guests){
        numberofGuets-=guests;
    }
    public void addedGuests(int adguest){
        numberofGuets+=adguest;
    }

    public boolean isSeatsAvailable(int seatedGuest){
        for(int i=seatedGuest;i<guestCapacity;i++){
            if(i>=110){
                return false;
            }
        }
        return true;
    }
    public void customerSummary(){
        System.out.println("Name of the restaurant: "+name);
        System.out.println("Total capacity of the restaurant: "+guestCapacity);
        System.out.println("Currently seated guests at the restaurant: "+numberofGuets);
        if(numberofGuets>=guestCapacity){
            System.out.println("Stop admitting extra clients, Capacity is over the limit");
        }else{
            System.out.println("You still can receive more clients");
        }

    }

}
