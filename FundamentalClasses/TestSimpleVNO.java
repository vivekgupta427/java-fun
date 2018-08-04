package collectionAndMaps;

public class TestSimpleVNO {

	public static void main(String[] args) {
		SimpleVNO latest = new SimpleVNO(9, 1, 1);
		SimpleVNO inShops = new SimpleVNO(9, 1, 1);
		SimpleVNO older = new SimpleVNO(6, 6, 6);
		
		SimpleVNO[] versions = new SimpleVNO[]{ new SimpleVNO(3, 49, 1),new SimpleVNO(8, 19, 81),
				new SimpleVNO(2, 48, 28),new SimpleVNO(10, 23, 78),new SimpleVNO(9, 1, 1)};
		
		Integer [] downloads = {245,786,54,1010,123};
		
		TestCaseVNO.test(latest, inShops, older, versions, downloads);
	}

}
