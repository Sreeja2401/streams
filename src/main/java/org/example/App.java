package org.example;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class App {
    public static void main(String[] args) {

        //Filtering Strings: From a list of strings, print all strings containing the letter 'a'.
        List<String> stringList = List.of("sreeja", "siddu", "lavss", "sasiii", "vamsii");
        List<String> ans1 = stringList.stream().filter(string -> string.contains("a")).toList();
        System.out.println(ans1);

        //Sum of Even Numbers: Find the sum of all even numbers from an integer list.
        int sum = IntStream.rangeClosed(1, 10).filter(num -> num % 2 == 0).sum();
        //System.out.println(
        System.out.println(sum);

         //Unique Characters Count: Calculate the count of unique characters in a string.
        String name = "Sreeja";
        System.out.println(name.chars().distinct().mapToObj(i -> (char) i).toList());
        Map<Integer, Long> integerLongMap = name.chars().boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(integerLongMap.entrySet().stream().filter(entry -> entry.getValue() == 1).map(Map.Entry::getKey).mapToInt(i -> i).mapToObj(i -> (char) i));

        //Average of List of Doubles: Compute the average of a list of doubles.
        // List<Double> doubleList = DoubleStream.generate(()->)
        OptionalDouble doublenum = IntStream.range(1, 10).mapToDouble(i -> i).average();
        System.out.println(doublenum);

        //Grouping by Length: Group a list of strings by their lengths.
        Map<String, Long> lengthMap = stringList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(lengthMap);
        Map<Integer, List<String>> lengthMap1 = stringList.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(lengthMap1);
        System.out.println(stringList.stream().collect(Collectors.groupingBy(String::length)));


        //Partitioning Integers: Partition a list of integers into two groups: odd and even numbers.
        List<Integer> numList = new ArrayList<>(IntStream.range(1, 10).boxed().toList());
        numList.add(4);
        Map<Boolean, List<Integer>> evenorodd1 = numList.stream().collect(Collectors.partitioningBy(i -> (i % 2 == 0)));
        Map<String, List<Integer>> evenorodd2 = numList.stream().collect(Collectors.groupingBy(i -> i % 2 == 0 ? "even" : "odd"));
        System.out.println(evenorodd2);
        System.out.println(evenorodd1);


        //Counting Words Starting with 'S': From a list of words, count words that start with the letter 'S'.
        stringList.stream().filter(s -> s.startsWith("S")).toList();


        // Reduce List of Strings: Reduce a list of strings to a single concatenated string.
        //Filter and Join Strings: Filter a list of strings and concatenate them into a single string.
        System.out.println(stringList.stream().filter(s -> s.startsWith("s")).collect(Collectors.joining()));

        //Square of Even Numbers: Find the squares of all even numbers from a list of integers.
        System.out.println(numList.stream().filter(i -> i % 2 == 0).map(i -> i * i).toList());

        //Sorting Strings by Length: Sort a list of strings by their lengths.
        Comparator<String> lenComparator = Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder());
        System.out.println(stringList.stream().sorted(lenComparator).toList());

        // largest string
        String lavs = "wellcome to gava";
        System.out.println(Arrays.stream(lavs.split(" ")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().map(entry -> entry.getKey()).max(Comparator.comparing(String::length)));


        System.out.println("====================================================>");

        //Max and Min of List: Find the maximum and minimum values from a list of integers.
        // Map<String ,Integer> minMax= numList.stream().collect(Collectors.groupingBy(numList.stream().mapToInt(i->i).min()?"min":"max"));


//        Mapping Object to Another Object: Map a list of Person objects to a list of their respective ages.
//            Filtering with Predicate: Use a custom predicate to filter a list of elements.


//        FlatMapping Nested Lists: Flatten a list of lists into a single list.
//            Creating Infinite Streams: Generate an infinite stream of even numbers.

//        Finding Median of Numbers: Find the median of a list of numbers.
//        Check for Divisibility: Check if all elements in a list are divisible by a given number.
//            Peeking into Stream Elements: Peek into a stream and print elements while performing an operation.


        System.out.println("//            Removing Null Values: Remove null values from a list of strings.");
        List<String> strList1 = new ArrayList<>();
        strList1.add("sreeja");
        strList1.add(null);
        strList1.add("mani");
        System.out.println(strList1.stream().filter(Objects::nonNull).toList());


        System.out.println("//        Count Elements in List: Count the number of elements in a list.");
        System.out.println(strList1.stream().count());


//        Convert List to Set: Convert a list to a set using collectors.
        System.out.println("  Convert List to Set: Convert a list to a set using collectors");

        Set<String> stringSet = new HashSet<>(strList1);
        System.out.println("strset" + stringSet);


//        Sum of List Elements: Calculate the sum of elements in a list.
        List<Integer> nums = List.of(1, 2, 3);
        System.out.println(nums.stream().collect(Collectors.summingInt(i -> i)));
        System.out.println(nums.stream().mapToInt(i -> i).sum());


//        Grouping by Length of Strings: Group a list of strings by their lengths.
        System.out.println("Grouping by Length of Strings: Group a list of strings by their lengths");
        List<String> stringList2 = List.of("sree", "maniii", "love");
        System.out.println(stringList2.stream().collect(Collectors.groupingBy(String::length)));


//        Partitioning Even and Odd Numbers: Partition a list of integers into even and odd numbers.
        System.out.println("Partitioning Even and Odd Numbers: Partition a list of integers into even and odd numbers.");


//        Joining Strings with Delimiter: Join a list of strings with a specific delimiter.
        System.out.println("Joining Strings with Delimiter: Join a list of strings with a specific delimiter");
        List<String> strList3 = List.of("sree", "jaaa");
        System.out.println(String.join("-", strList3));


//        Get Maximum Element from List: Find the maximum element from a list of integers.
        System.out.println("Get Maximum Element from List: Find the maximum element from a list of integers.");
        System.out.println(nums.stream().mapToInt(i -> i).max().getAsInt());


//                Mapping Object to Another Object: Map a list of Person objects to a list of their ages.
//        Collect to Unmodifiable List: Collect elements of a stream into an unmodifiable list.
        strList1.stream().toList();

//                Collect to Unmodifiable Map: Collect elements of a stream into an unmodifiable map.
//                Collect to Immutable Set: Collect elements of a stream into an immutable set.
//                Collect and Join with Prefix and Suffix: Collect a list of strings, join them with a prefix and suffix.

        System.out.println("Collect and Join with Prefix and Suffix: Collect a list of strings, join them with a prefix and suffix.");
        List<String> stringList5 = List.of("sree", "maniii");
        System.out.println(stringList5.stream().map(s -> "&" + s + "&").toList());


//        Mapping List of Strings to Uppercase: Convert a list of strings to uppercase.
//                Find Most Common Element: Find the most common element in a list.
        System.out.println("Find Most Common Element: Find the most common element in a list.");
        List<Integer> numsList = List.of(1, 2, 3, 1, 2, 1);
        Map<Integer, Long> occurenceMap = numsList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(occurenceMap.entrySet().stream().min(Map.Entry.comparingByValue()).map(Map.Entry::getKey).get());
        System.out.println(occurenceMap);


//        Summarizing Statistics of Numbers: Get statistical information (count, sum, min, max, average) about a list of integers.
        //------collectors.summerizing int


//                Collecting and Summing Double Values: Collect a list of objects and sum their double values.

//        Grouping by Starting Letter: Group a list of strings by their starting letters.
        System.out.println("Grouping by Starting Letter: Group a list of strings by their starting letters.");
        List<String> stringList3 = List.of("mani", "money", "sree");
        System.out.println(stringList3.stream().collect(Collectors.groupingBy(s -> s.charAt(0))));

//                Partitioning into Lists of Prime and Non-Prime Numbers: Partition a list of integers into prime and non-prime numbers.
//                Collecting and Summarizing Ages: Collect a list of Person objects and summarize their ages.
        System.out.println("Collecting and Summarizing Ages: Collect a list of Person objects and summarize their ages.");
        Person p1 = new Person("sreeja", 22, 450000);
        Person p2 = new Person("siddu", 22, 300000);
        Person p3 = new Person("lavss", 21, 300000);
        Person p4 = new Person("siddu", 23, 300066);
        Person p5 = new Person("siddu", 22, 300678);
        List<Person> personList = new ArrayList<>();
        personList.add(p2);
        personList.add(p3);
        personList.add(p4);
        personList.add(p5);
        personList.add(p1);

        System.out.println(personList.stream().map(Person::getAge).collect(Collectors.summarizingInt(i -> i)));


//        Grouping by Length and Counting Occurrences: Group strings by length and count their occurrences.
//        Custom Collector to Join Strings: Create a custom collector to join a list of strings.
//        Grouping by Age Range: Group a list of Person objects by different age ranges.
        System.out.println("Grouping by Age Range: Group a list of Person objects by different age ranges.");
        Map<Integer, List<String>> agelist = personList.stream().collect(Collectors.groupingBy(Person::getAge, Collectors.mapping(Person::getName, Collectors.toList())));
        System.out.println(agelist);


//        Collect and Group by First Letter: Collect a list of strings and group them by their first letter.


//        Custom Collector to Calculate Median: Create a custom collector to calculate the median of a list of numbers.

//         Grouping by Property and Summing Values: Group a list of objects by a property and sum their values.
//        Partitioning and Counting Elements: Partition a list of strings into two groups and count their occurrences.
        System.out.println(" Partitioning and Counting Elements: Partition a list of strings into two groups and count their occurrences.");
        List<String> stringList1 = List.of("aree", "dree", "sre", "sreee");
        System.out.println(stringList1.stream().collect(Collectors.partitioningBy(s -> s.length() <= 3))); //---replace false or true

//        Collect and Joining with Mapping: Collect a list of objects, map a property, and join with a specific delimiter.
        System.out.println("Collect and Joining with Mapping: Collect a list of objects, map a property, and join with a specific delimiter.");
        // System.out.println(personList.stream().map(p->p.setName(p.getName()+"EPAM")));
        personList.forEach(p -> p.setName(p.getName() + "EPAM"));
        System.out.println(personList);

//                Combining Collectors: Combine multiple collectors using Collectors.collectingAndThen().

//                Collecting and Calculating Frequency: Collect a list of strings and calculate the frequency of each string.
//        Mapping List of Strings to Concatenated String: Map a list of strings to a concatenated string.
//                Collecting and Summarizing Characters: Collect a list of strings and summarize their characters.
//                Grouping by Property and Joining Values: Group objects by a property and join values with a specific delimiter.
//        Collecting into Concurrent Collection: Collect elements of a stream into a concurrent collection.
//                Grouping by Multiple Criteria: Group a list of objects by multiple criteria.
//        Collecting and Merging Maps: Collect multiple maps into a single map.
//                Collecting and Averaging Integers: Collect a list of integers and calculate their average.
//                Grouping by Age and Counting People: Group a list of Person objects by age and count the number of people in each group.
//                Partitioning and Summarizing Double Values: Partition a list of objects into two groups and summarize their double values.
//        Collecting and Counting Null Values: Collect a list of strings and count null values.
//                Collecting and Summarizing Objects: Collect a list of objects and summarize their properties.
//                Grouping and Averaging by Property: Group objects by a property and calculate the average of another property.
//        Collecting and Merging Lists: Collect multiple lists into a single merged list.
//        Grouping by Property and Summarizing Statistics: Group objects by a property and summarize statistics of another property.
//                Custom Collector to Get First N Elements: Create a custom collector to get the first N elements of a stream.
//                Collecting and Counting Unique Elements: Collect a list of strings and count unique elements.
//                Grouping by Property and Collecting as Set: Group objects by a property and collect values as a set.
//                Collecting and Summing Long Values: Collect a list of objects and sum their long values.
//        Collecting and Filtering Elements: Collect a list of objects and filter based on a condition.
//                Custom Collector to Join Strings with Prefix and Suffix: Create a custom collector to join a list of strings with a prefix and suffix.


        System.out.println("//            Trimming Strings: Trim all strings in a list.");
        List<String> strlist = List.of("sree     ", "mani", "lvss");
        System.out.println(strlist.stream().map(String::trim).toList());

        System.out.println("//        Creating Stream from Array: Create a stream from an array of integers and find the sum.");

        int[] sree = {1, 2, 3};
        System.out.println(Arrays.stream(sree).sum());


//        Find Sublist: Check if one list is a sublist of another list.

//                List<String> subList = List.of("sreeja","siddu");
//                stringList.stream().allMatch()
        System.out.println("=======================================>>>>>>>>>>>>>>>>>");

        //        Distinct Elements: Get a list of unique elements from a list of integers.

        Map<Integer, Long> ue = numList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(ue.entrySet().stream().filter(entry -> entry.getValue() == 1).map(Map.Entry::getKey).toList());


        //    Counting Elements: Count occurrences of each element in a list.
        Map<Integer, Long> ue2 = numList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(ue2);

        //        Concatenating Lists: Concatenate two lists into one.
        List<String> stringList4 = new ArrayList<>();
        stringList4.add("mani");
        stringList.stream().map(stringList4::add).toList();
        System.out.println(stringList1);

        //Grouping by Starting Letter: Group a list of strings by their starting letters.
        Map<Character, List<String>> ss = stringList.stream().collect(Collectors.groupingBy(s -> s.charAt(0)));
        System.out.println(ss);

        //Sum of Squares of Numbers: Find the sum of squares of numbers from a list of integers.
        System.out.println(numList.stream().map(i -> i * i).mapToInt(i -> i).sum());

        //Check for Palindromes: Determine if a list of strings contains palindromes.
        List<String> sl = new ArrayList<>();
        sl.add("sre");
        sl.add("aba");
        sl.stream().filter(s -> s.contentEquals(new StringBuilder(s).reverse())).forEach(s -> System.out.println(s));

        //Mapping List of Strings: Convert a list of strings to uppercase.
        System.out.println(sl.stream().map(String::toUpperCase).toList());

        // Multiplying List Elements: Multiply each element of a list by a given factor.
        int factor = 2;
        System.out.println(numList.stream().map(i -> i * factor).toList());

        //Check for Prime Numbers: Check if a list of integers contains prime numbers.


        //Checking for Empty Strings: Check if a list of strings contains empty strings.
//        sl.add("");
        System.out.println(sl.stream().anyMatch(s -> s.contentEquals("")));

//            Finding Average Length of Strings: Calculate the average length of strings from a list.
        System.out.println(stringList.stream().map(String::length).mapToInt(i -> i).average());


//        Merging Lists: Merge two lists removing duplicates.
// //        Find Common Elements: Find common elements between two lists.
        List<String> l1 = new ArrayList<>();
        l1.add("a");
        l1.add("d");
        List<String> l2 = new ArrayList<>();
        l2.add("c");
        l2.add("d");
        l1.stream().map(l2::add).forEach(System.out::println);
        System.out.println(l2.stream().distinct().toList());


        Set<String> set1=new HashSet<>(l1);
        Set<String> set2=new HashSet<>(l2);
        System.out.println("before"+set1);
        set1.retainAll(set2);
        System.out.println("after"+set1);



        //Partitioning Strings by Length: Partition a list of strings into two lists based on their length

        Map<String, List<String>> ll = stringList1.stream().collect(Collectors.groupingBy(s -> s.length() < 5 ? "less5" : "greater5"));
        System.out.println(ll);

//        Finding Maximum String Length: Find the maximum length among strings in a list.
        System.out.println(stringList.stream().map(String::length).mapToInt(i -> i).max().getAsInt());

        //Combining Multiple Streams: Combine elements from multiple streams into a single stream.


//            Find the Second Largest Element: Find the second largest element in a list of integers.
        List<Integer> los = List.of(1, 3, 5, 4);
        los.stream().sorted(Comparator.reverseOrder()).limit(2).skip(1).limit(1).forEach(i -> System.out.println(i));


//        Joining Strings with Delimiter: Join a list of strings with a delimiter.


        //        Checking for Empty Lists: Check if a list of lists is empty.


//        Convert Map to List: Convert a Map to a List of its keys.
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "sreeja");
        map.put(2, "mani");
        System.out.println(map.keySet().stream().toList());

//            Splitting Strings: Split a string into a list of characters.
        String p = "sreeja";
        System.out.println(p.chars().mapToObj(c -> (char) c).toList());

        //        Remove Elements Based on Condition: Remove elements from a list that satisfy a given condition.
        List<Integer> qq = new ArrayList<>();
        qq.add(2);
        qq.add(3);
        qq.add(4);
        List<Integer> rr = qq.stream().filter(i -> i % 2 == 0).toList();
        qq.removeAll(rr);
        System.out.println(qq);


//        Check for Non-Empty Strings: Check if a list of strings contains only non-empty strings.

        List<String> nes = List.of("asd", "try", "");
        System.out.println(nes.stream().anyMatch(s -> s.contentEquals("")));


//            Stream Iteration and Limiting: Create a stream of integers from 1 to 100 and print the first 10.

        IntStream.rangeClosed(1, 100).limit(10).forEach(i -> System.out.println(i));

        //        Skipping Elements: Skip the first 5 elements of a stream and print the rest.
        IntStream.rangeClosed(1, 10).skip(8).forEach(i -> System.out.println(i));

        //        Check for Equal Lists: Check if two lists are equal irrespective of element order.



    }


}

