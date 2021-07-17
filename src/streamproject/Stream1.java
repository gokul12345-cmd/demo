package streamproject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;



public class Stream1 {
	
	//How to count the String Alphabetaly
	//@Test
	public void method() {
		ArrayList<String >name =new ArrayList<String>();
		
		name.add("abhi");
		name.add("Don");
		name.add("Akash");
		name.add("Ram");
		name.add("ajay");
		int count =0;
		for(int i=0;i<name.size();i++) {
			String actual=name.get(i);
		//	System.out.println(actual);
			if(actual.startsWith("A")) {
				count++;
			}
			System.out.println(count);
			if(actual.endsWith("m")) {
				count++;
			}
			System.out.println(count);
		}						
	}
///Stream java and use lambda expression filter(s->s.any method) ,intermediate operation Stream() method ,terminaloperation use count;
	//long data type.
//	@Test
	public void Streamfilter() {
    ArrayList<String >name =new ArrayList<String>();
		
		name.add("abhi");
		name.add("Don");
		name.add("Akash");
		name.add("Ram");
		name.add("ajay");
		long c =name.stream().filter(S->S.startsWith("A")).count();
		System.out.println(c);
		long d =Stream.of("priya","prajakta","pari","vishal","ram").filter(S->S.startsWith("p")).count();
		System.out.println(d);	
		//print all list name in that one perticular word.
		name.stream().filter(S->S.length()>4).forEach(S->System.out.println(S));
		//map =map the original String How mapping it
		//use limit() method .
		name.stream().filter(S->S.length() >4).limit(1).forEach(S->System.out.println(S));
		
			
		}
//	@Test
	public void StreamMap() {
		//print name of length > 4 with uppercase
		Stream.of("priya","prajakta","pari","vishal","ram").filter(S->S.startsWith("p")).map(S->S.toUpperCase()).forEach(S->System.out.println(S));
	//print names which first letter as A with uppercase and sorted
		
	
	}
//	@Test
	public void Streamarray() {
		
		///convert array into the arraylist.
		//use  Array.asList("","",""); argument type.
		List<String>name = Arrays.asList("priya","prajakta","pari","vishal","ram");
		name.stream().filter(S->S.startsWith("p")).sorted().map(S->S.toUpperCase()).forEach(S->System.out.println(S));
		
		//marge Two Streamlist 
		List<String>name1=Arrays.asList("sham","ram","pravin","kubar","pradeep");
		Stream<String>newStream=Stream.concat(name.stream(), name1.stream());
		newStream.sorted().map(S->S.toUpperCase()).forEach(S->System.out.println(S));
		//matching the array in that string value and find boolean type result as true.
		boolean flag=name.stream().anyMatch(S->S.equalsIgnoreCase("ram"));
		System.out.println(flag);
		Assert.assertTrue(flag);
		
	}
	
	@Test
	public void Streamcollect() {
		//give collect method use this converting result in any list and collecting result
		List<String>name = Arrays.asList("priya","prajakta","pari","vishal","ram");
		name.stream().filter(S->S.startsWith("p")).map(S->S.toUpperCase()).collect(Collectors.toList());
		System.out.println(name.get(0));
		
		//Array into converted Integer arrayList use Arrays.asList();
		//print unique number from this array
		//sort the array -3rd index and find it 
		//find 4 number in that list to use contains to get true and false result.
		List<Integer>name1=Arrays.asList(1,5,6,8,4,5);
		name1.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(name1.get(3));
		System.out.println(name1.contains(4));
		
	}
	
	
	
	}
	

	

