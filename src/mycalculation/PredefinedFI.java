package mycalculation;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredefinedFI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l1 = new ArrayList<>();
		l1.add(5);l1.add(15);l1.add(25);l1.add(35);
		l1.add(10);l1.add(20);l1.add(30);l1.add(40);
		
//		Predicate<Integer> p = i->i%2==0;
//		
//		for (int i:l1) {
//			if(p.test(i))
//			{
//				System.out.println(i);
//			}
//		}
		
//		List<Integer> l2=l1.stream().filter(p).collect(Collectors.toList());
		List<Integer> l2=l1.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(l2);
		
		Function<Integer, Integer> f=i->i*2;
//		List<Integer> l3=l1.stream().map(f).collect(Collectors.toList());
		List<Integer> l3=l1.stream().map(i->i*2).collect(Collectors.toList());
		System.out.println(l3);
		
		
		
		
	}

}
