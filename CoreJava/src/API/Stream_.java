package API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.function.*;
public class Stream_ {

	public static void main(String[] args)
	{
		List<Integer> al =Arrays.asList(21, 34, 43, 1, 56);
		
		Stream<Integer> st=al.stream();
		
		// Task -> Access Data
		st.forEach(n->System.out.print(n+" "));
		
		// Ek stream me sirf ek hi baar Consume(task/Operation perform) kar sakte hai
		
//		st.forEach(n->System.out.print(n+" "));		// IllegalStateException
		
		System.out.println();
		
		Stream st1=al.stream();
		
		// task -> Number of element count in stream
		
		long cou=st1.count();
		
		System.out.println(cou); // 5
		
//		st.forEach(n->System.out.print(n+" "));		// IllegalStateException

		System.out.println();
		
		// Task -> Sort data in stream
		Stream st3=al.stream();
		Stream sortedData=st3.sorted();
//		System.out.print(sortedData +" ");		// java.util.stream.SortedOps$OfRef@3f99bd52 

		sortedData.forEach(n->System.out.print(n +" ")); // 1 21 34 43 56 
		
		System.out.println();
		
		
		Stream<Integer> st4=al.stream();
		Stream mapp=st4.map(i->i+10);
		mapp.forEach(n->System.out.print(n+" ")); //  31 44 53 11 66
		
		System.out.println();
		
		Stream<Integer> st5=al.stream();
		Stream<Integer> sortedStream=st5.sorted();
		Stream st6=sortedStream.map(n->n*10); // 10 210 340 430 560 
		st6.forEach(n->System.out.print(n+" "));
		
		System.out.println();
		
		Stream<Integer> st7=al.stream();
		Stream<Integer> evenStream=st7.filter(n->n%2==0); // Even Number ka ek Stream banega
		evenStream.forEach(n->System.out.print(n+" ")); // 34 56 
		
		System.out.println();
		
		Stream<Integer> st8=al.stream();
		Stream<Integer> oddStream=st8.filter(n->n%2!=0);
		Stream<Integer> oddMul=oddStream.map(n->n*2);
		oddMul.forEach(n->System.out.print(n+" ")); // 42 86 2 
		
		System.out.println();
		
		Stream<Integer> st9=al.stream();
		Stream<Integer> finalStream=st9.filter(n->n%2!=0).map(n->n*2);  // method chaining
		finalStream.forEach(n->System.out.print(n+" ")); // 42 86 2
		
		
	}

}
