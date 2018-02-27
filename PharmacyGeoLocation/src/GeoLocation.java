
//Write a function that takes Geo location of user and returns the 3 nearby pharmacy

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class GeoLocation {

	public static void findDistance(ArrayList<Pharmacy> pharma, Pharmacy user) {

		Iterator<Pharmacy> temp = pharma.iterator();
		while (temp.hasNext()) {

			Pharmacy temp1 = temp.next();

			temp1.distance = Math.sqrt(Math.pow((temp1.getLattitude() - user.getLattitude()), 2)
					+ Math.pow((temp1.getLongitude() - user.getLongitude()), 2));
		}
	}

	public static void main(String[] args) {

		System.out.println("Entering pharmacy package");

		ArrayList<Pharmacy> pharm = new ArrayList<>();
		pharm.add(new Pharmacy("First", 10, 10, "96866", "Dummy Address1"));
		pharm.add(new Pharmacy("Second", 20, 10, "96866", "Dummy Address2"));
		pharm.add(new Pharmacy("Third", 30, 30, "96866", "Dummy Address3"));
		pharm.add(new Pharmacy("Fourth", 20, 30, "96866", "Dummy Address4"));
		pharm.add(new Pharmacy("Fifth", 30, 10, "96866", "Dummy Address5"));
		pharm.add(new Pharmacy("Sixth", 40, 10, "96866", "Dummy Address6"));
		pharm.add(new Pharmacy("Seventh", 10, 20, "96866", "Dummy Address7"));

		Pharmacy user = new Pharmacy();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the user location lattitude eg. 10, 20 30");
		user.setLattitude(sc.nextInt());
		System.out.println("Enter the user location longitude eg. 10, 20 30");
		user.setLongitude(sc.nextInt());

		GeoLocation.findDistance(pharm, user);

		Collections.sort(pharm, new LocationComparator());

		System.out.println("The 3 nearby pharmacies to this location are ");

		for (int i = 0; i < 3; i++) {
			System.out.println(
					pharm.get(i).getPharmaName() + " which is " + pharm.get(i).distance + " KM far from your location");
		}

		sc.close();

	}
}
