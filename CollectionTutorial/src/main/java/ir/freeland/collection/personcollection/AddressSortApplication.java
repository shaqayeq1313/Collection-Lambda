package ir.freeland.collection.personcollection;
	
import java.util.ArrayList;
import java.util.Collections;

public class AddressSortApplication {
	    public static void main(String[] args) {
	    	
	        // ایجاد یک Collection از نوع ArrayList
	        ArrayList<Address> addresses = new ArrayList<>();

	        // اضافه کردن آدرس‌ها به لیست
	        addresses.add(new Address("New York", "USA", "Broadway Street"));
	        addresses.add(new Address("Dubai", "UAE", "Sheikh Zayed Road"));
	        addresses.add(new Address("Tokyo", "Japan", "Shibuya District"));
	        addresses.add(new Address("Mexico City", "Mexico", "Insurgentes Avenue"));
	        addresses.add(new Address("Barcelona", "Spain", "La Rambla"));
	        addresses.add(new Address("Sydney", "Australia", "George Street"));
	        addresses.add(new Address("Madrid", "Spain", "Gran Via"));
	        
	        // مرتب‌سازی لیست بر اساس شهر (city) با استفاده از Collections.sort
	        Collections.sort(addresses);
	        System.out.println("Sorted by city:");
	        printAddresses(addresses);

	        // مرتب‌سازی لیست بر اساس کشور (country) با استفاده از Comparator
	        addresses.sort((a1, a2) -> a1.getCountry().compareTo(a2.getCountry()));
	        System.out.println("\nSorted by country:");
	        printAddresses(addresses);
	    }

	    // متدی برای چاپ لیست آدرس‌ها
	    private static void printAddresses(ArrayList<Address> addresses) {
	        for (Address address : addresses) {
	            System.out.println(address);
	        }
	   }
}
