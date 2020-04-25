package mycalculation;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l =new ArrayList<>();
		l.add("e");
		l.add("e");
		boolean b =l.stream().allMatch(s->s.equals("e"));
		System.out.println(b);
		
		boolean b1 =l.stream().noneMatch(s->s.equals("e"));
		System.out.println(b1);
		
		boolean b3 =l.stream().noneMatch(s->s.equals("t"));
		System.out.println(b3);
		
		List<String> l2 =new ArrayList<>();
		l2.add("a");
		l2.add("b");
		List<String> l3 =l.stream().map(list->list+"k").collect(Collectors.toList());
		System.out.println(l3);
		
	}

}
