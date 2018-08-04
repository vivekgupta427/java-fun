package collectionAndMaps;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class TestCaseVNO {
	public static <N> void test( N latest, N inShops, N older, N[] versions, Integer[] downloads){
		
		System.out.println(latest.getClass());  //print class name
		
		// performing various tests 
		
		System.out.println("Test Object reference and value equality");
		
		System.out.printf("latest : %s, inShops :%s, older : %s%n" , latest, inShops,older);
		
		System.out.println("latest == inShops :"+ latest==inShops);
		
		System.out.println("latest.equalsinShops :"+latest.equals(inShops));
		
		System.out.println("latest == older: "+latest==older);
		
		System.out.println("latest.equals(older):"+ latest.equals(older));
		
		N searchKey = inShops;
		
		boolean found  = false;
		
		for(N version : versions){
			
			found = searchKey.equals(version);
			
			if(found){break;}
		}		
		System.out.println("Arrays: "+Arrays.toString(versions));
		
		System.out.println("Search Key "+ searchKey + " found in array :"+found);
		
		List<N> vnoList = Arrays.asList(versions);
		
		System.out.println("List: "+vnoList);
		
		System.out.println("Search key "+searchKey + " contained in List: "+ vnoList.contains(searchKey));
		
		Map<N, Integer> versionStatistics = new HashMap<N, Integer>();
		
		for(int i=0;i < versions.length;i++){
			
			versionStatistics.put(versions[i], downloads[i]);
		}
			System.out.println("Map: "+versionStatistics);
			
			System.out.println("Hash code for keys in the map");
			
			for(N version : versions)
				
				System.out.printf(" %10s: %s%n" , version, version.hashCode());
			
				System.out.println("Search key  "+ searchKey +" has hash code "+ searchKey.hashCode());
				
				System.out.println("Map contains search key "+searchKey +  ": "+ versionStatistics.containsKey(searchKey));
				
				System.out.println("Sorted Set :\n  "+ (new TreeSet<N>(vnoList)));
				
				System.out.println("Sorted Map: \n"+ (new TreeMap<N, Integer>(versionStatistics)));
				
				System.out.println("List before sorting  :" +vnoList);
				
				Collections.sort(vnoList,null);
				
				System.out.println("List after sorting :"+vnoList);
				
				int resultIndex = Collections.binarySearch(vnoList, searchKey,null);
				
				System.out.println("Binary Search in list found key "+searchKey + " at index: "+resultIndex);	
	}
}