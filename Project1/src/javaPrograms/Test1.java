package javaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test1 {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Muthu");
		names.add("Saravana");
		names.add("Mugilan");
		names.add("Mugi");
		names.add("Amjath");
		
		Long count = names.stream().filter(s->s.startsWith("M")).count();
		
		names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		System.out.println("-------------------------------------");
		names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
		System.out.println("-------------------------------------");
		names.stream().filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		
		Long d = Stream.of("Muthu","Saravana","Mugilan","Mugi","Amjath").filter(s->
		{
			s.startsWith("M");
			return false;
		}).count();
		
		//System.out.println(d); 
		
//		int count=0;
//		
//		for(int i=0;i<names.size();i++)
//		{
//			String actual = names.get(i);
//			if(actual.startsWith("M"))
//			{
//				count++;
//			}
//		}
		System.out.println(count);
		System.out.println("-------------------------------------");
		
		List<String> list = Arrays.asList("Muthu","Saravana","Mugilan","Mugi","Amjath");
		List<String> list1 = Arrays.asList("TCS","CTS","ZOHO","Infosys","comcast");
		list.stream().filter(s->s.startsWith("M")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		System.out.println("-------------------------------------");
		Stream<String> newStream = Stream.concat(list.stream(), list1.stream());
		//newStream.sorted().forEach(s->System.out.println(s));
		System.out.println("-------------------------------------");
		boolean flag = newStream.anyMatch(s->s.equalsIgnoreCase("ram"));
		System.out.println(flag);
		

	}

}
