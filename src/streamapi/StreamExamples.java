package streamapi;

import java.util.*;
import java.util.stream.Collectors;
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
        System.out.println();

        Stream.of("sdss","aa","sdsds","aa").map(s->{
            System.out.println("Filter s: "+  s);
            return s.toUpperCase();
        }).anyMatch(s->{
            System.out.println(s);
            return  s.startsWith("A");


        });

        System.out.println();
        Stream.of("asdas","fvdvdf").filter(s->{
            System.out.println("Filter: " + s);
            return s.startsWith("a");
        }).map(s->{
            System.out.println("Map: " + s);
            return s.toUpperCase();
        }).forEach(s->{
            System.out.println("forEach: " + s);
        });

        System.out.println();

        Stream.of("asdas","fvdvdf","as","ab").sorted(Comparator.naturalOrder()).filter(s->{
            System.out.println("Filter: " + s);
            return s.startsWith("a");
        }).map(s->{
            System.out.println("Map: " + s);
            return s.toUpperCase();
        }).forEach(s->{
            System.out.println("forEach: " + s);
        });
        System.out.println();
        System.out.println("----------------------------------------------");

        List<String> collectorexample=Stream.of("asdas","fvdvdf","as","ab").filter(s->s.startsWith("a")).collect(Collectors.toList());

        IntSummaryStatistics stat=Stream.of(1,2,3,4,5).collect(Collectors.summarizingInt(s->s));
        System.out.println(stat);

        //flatMap
       List<String> collection = Arrays.asList("a1", "a2", "a3", "a1");
       long sumOfA1= collection.stream().filter("a1"::equals).count();

        System.out.println( collection.stream().findFirst().orElse("0"));
        System.out.println(collection.stream().skip(collection.size() - 1).findAny().orElse("empty"));
        collection.stream().skip(2).findFirst().ifPresent(System.out::println);
        //return Optional

    }
}
