
import java.util.Comparator;

public class LocationComparator implements Comparator<Pharmacy> {

	public int compare(Pharmacy s1, Pharmacy s2) {
		if (s1.distance == s2.distance)
			return 0;
		else if (s1.distance > s2.distance)
			return 1;
		else
			return -1;
	}

}
