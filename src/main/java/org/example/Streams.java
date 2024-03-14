package org.example;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
//        List<Integer> l1= new ArrayList<>(List.of(1, 2, 4, 5, 9, 3));
//        //sorting a list
//        Collections.sort(l1,(a,b)->b-a); //descen
//        Collections.sort(l1);//ascen
//        System.out.println(l1);
//
//        //using streams
//        l1.stream().sorted().forEach(System.out::print);
//         l1.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
//
//        List<String> l2=new ArrayList<>(List.of("sreeja","mani","abc"));
//        //Collections.sort(l2);
//        //System.out.println(l2); //ascen
//        Collections.sort(l2,(a,b)->b.compareTo(a));
//        System.out.println(l2);

        List<Person> l3 =new ArrayList<>();
        l3.add(new Person("sree",21,10000));
        l3.add(new Person("abc",23,6789));
        l3.add(new Person("abcd",20,63484));

      //  l3.stream().sorted().forEach(i-> System.out.println(i));  //classcastException is thrown if person class not implements comparable
       //in above statement as we are not specifying any attribute by which we should sort so we have to make that class to implement comparable
        //and then in compare method we should specify by which method we should compare

        l3.stream().sorted(Comparator.comparing(Person::getName).reversed()).forEach(p-> System.out.println(p));

        Map<Integer,String> m1=new HashMap<>();
        m1.put(1,"sreeja");
        m1.put(8,"mani");
        m1.put(3,"abc");

//        List<Map.Entry<Integer,String>> ml = new ArrayList<>(m1.entrySet());
//        ml.stream() .sorted(Map.Entry.comparingByKey()).forEach(e-> System.out.println(e));
//        ml.stream() .sorted(Map.Entry.<Integer,String>comparingByKey().reversed())
//                .forEach(e-> System.out.println(e));
        m1.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(i-> System.out.println(i));

        String s= "wellcome to java";
        System.out.println(Arrays.stream(s.split(" ")).collect(Collectors.groupingBy(String::length)).entrySet().stream().max(Comparator.comparing(Map.Entry::getKey)));
        Arrays.stream(s.split(" ")).reduce((s1,s2)->s1.length()>s2.length() ? s1 :s2).ifPresent((st)-> System.out.println(st));


   //if map key or value contain custom object then how to compare them
        Map<Integer,Person> m2=new HashMap<>();
        m2.put(4,new Person("sree",29,10000));
        m2.put(5,new Person("abc",23,6789));
        m2.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.comparing(Person::getAge))).forEach(i-> System.out.println(i));

        // maximum repeated char in sreeja;

        String s1 = "sreeja";


        s1.chars().mapToObj(i->(char)i).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().max(Comparator.comparing(Map.Entry::getValue)).map(Map.Entry::getKey).ifPresent(System.out::println);


        // filter map reduce;
        // avg salary of people whose age less that 23;
        System.out.println(l3.stream().filter(p->p.getAge()<23).map(Person::getSalary).collect(Collectors.averagingDouble(i->i)));

    }
}
