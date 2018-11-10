package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExamples {
    public static void main(String[] args) {
      /*  List<Integer> collection =new ArrayList<>();
        Integer sum=0;
        for(Integer i: collection){
            sum+=i;
        }//sum counting without stream api




        Integer sum2=collection.stream().filter(o -> o%2!=0).reduce((s1,s2)->s1+s2).orElse(0);*/
        ////

        Arrays.asList("sss","aaa").stream().findFirst().ifPresent(System.out::println);

        Stream.of("c1","c2","c3").findFirst().ifPresent(System.out::println);
        IntStream.range(9,12).forEach(System.out::println);
        Arrays.stream(new int[] {1,2,3,4}).map(n->n*2+1).average().ifPresent(System.out::println);

       int sum3=Arrays.stream(new int[] {12,12,12}).reduce((s1,s2)->s1+s2).orElse(0);
       int[] array4= {31221,3232};
       int sum4=Arrays.stream(array4).sum();
        System.out.println(sum3);
        System.out.println(sum4);



    }
}
