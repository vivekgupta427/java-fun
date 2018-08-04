package equalsandhashcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author vivek
 *
 */
public class Exec {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student s = new Student("S123");
		Student s2 = new Student("S123");
		System.out.println(s.equals(s2));
		
		Map<Student, ReportCard> map1 = new HashMap<Student,ReportCard>();
		map1.put(s, new ReportCard());
		map1.put(s2, new ReportCard());
		System.out.println(map1.size());
		
		Set<Student> studentSet = new HashSet<Student>();
		for(int i=0;i<100;i++){
			studentSet.add(new Student("H"+i));
		}
		
		System.out.println(studentSet.size());
		
		long startTime = System.nanoTime();
		System.out.println(studentSet.contains(new Student ("H4")));
		System.out.println("Time Elapsed :"+ (System.nanoTime()-startTime));
		
	}
}
