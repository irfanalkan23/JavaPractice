package day31_CustomClasses.Restaurant;

public class LocalRestaurant {

    public static void main(String[] args) {

        Restaurant restaurant1 = new Restaurant("İrfan", "Silivri", 3);

//        Server server1 = new Server("ali", 123, 5, true);
//        Server server2 = new Server("burak", 456, 6.0, false);
//        restaurant1.servers.addAll(Arrays.asList(server1, server2));

//        Chef chef1 = new Chef("cemal", 789, 7.0, true);
//        Chef chef2 = new Chef("demir", 2222, 8.0, false);
//        restaurant1.chefs.addAll(Arrays.asList(chef1, chef2));

        Server[] servers = {
                new Server("Yasin", 29, 15, false),
                new Server("Sabryne", 28, 10, false),
                new Server("Karim", 27, 12, false),
                new Server("Aysel", 26, 20, true),
                new Server("Kamal", 25, 23, true),
        };

        Chef[] chefs = {
                new Chef("Halim", 23, 35, true),
                new Chef("Habib", 22, 26, false),
                new Chef("Bojan", 21, 27, true),
        };
        restaurant1.hireServers(servers);
        restaurant1.hireChefs(chefs);
        System.out.println(restaurant1);
    }
}
/*
		6.4. Create a class LocalRestaurant that has a main method with the following:
	        	- Make a Restaurant object
	        	- Create an array of servers with their information set.
	        	Add those initial servers to the ArrayList of Servers in the Restaurant object
	            - Create an array of chefs with their information set.
	            Add those initial chefs to the ArrayList of Chefs in the Restaurant object

	            - Print your whole restaurants information
 */