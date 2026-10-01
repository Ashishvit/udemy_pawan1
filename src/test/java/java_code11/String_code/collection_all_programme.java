package java_code11.String_code;

import java.util.*;

public class collection_all_programme
{
    // 1. Remove duplicates from a list
    public static void removeDuplicates() {
        List<String> list = Arrays.asList("Java", "API", "Java", "Selenium");
        Set<String> set = new HashSet<>(list);
        System.out.println("After removing duplicates: " + set);
    }

    // 2. Find frequency of each element
    public static void frequencyCount() {
        List<String> list = Arrays.asList("API", "Java", "API", "Selenium");
        Map<String, Integer> map = new HashMap<>();
        for (String s : list) map.put(s, map.getOrDefault(s, 0) + 1);
        System.out.println("Frequency: " + map);
    }

    // 3. First non-repeated character in a string
    public static void firstNonRepeated() {
        String str = "seleniumtesting";
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char c : str.toCharArray()) map.put(c, map.getOrDefault(c, 0) + 1);
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("First non-repeated: " + entry.getKey());
                break;
            }
        }
    }

    // 4. Find duplicate elements in a list
    public static void findDuplicates() {
        List<Integer> list = Arrays.asList(1, 2, 3, 2, 4, 5, 1);
        Set<Integer> seen = new HashSet<>(), dup = new HashSet<>();
        for (int n : list) if (!seen.add(n)) dup.add(n);
        System.out.println("Duplicates: " + dup);
    }

    // 5. Find second highest element
    public static void secondHighest() {
        List<Integer> list = Arrays.asList(10, 40, 20, 30, 50);
        TreeSet<Integer> set = new TreeSet<>(list);
        Integer last = set.isEmpty() ? null : set.last();
        Integer second = (last == null) ? null : set.lower(last);
        System.out.println("Second highest: " + second);
    }

    // 6. Sort a Map by values
    public static void sortMapByValue() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Selenium", 3);
        map.put("Java", 5);
        map.put("API", 2);
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());
        System.out.println("Sorted by values: " + list);
    }

    // 7. Compare two maps (Java 8 compatible)
    public static void compareMaps() {
        Map<String, Integer> m1 = new HashMap<>();
        m1.put("Java", 1);
        m1.put("API", 2);

        Map<String, Integer> m2 = new HashMap<>();
        m2.put("API", 2);
        m2.put("Java", 1);

        System.out.println("Maps equal? " + m1.equals(m2));
    }

    // 8. Find most frequent element
    public static void mostFrequent() {
        List<String> list = Arrays.asList("API", "Java", "API", "Selenium", "API");
        Map<String, Integer> freq = new HashMap<>();
        for (String s : list) freq.put(s, freq.getOrDefault(s, 0) + 1);
        String maxKey = Collections.max(freq.entrySet(), Map.Entry.comparingByValue()).getKey();
        System.out.println("Most frequent element: " + maxKey);
    }

    // 9. Find common elements between two lists
    public static void commonElements() {
        List<Integer> l1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> l2 = Arrays.asList(4, 5, 6, 7, 8);
        l1.retainAll(l2);
        System.out.println("Common elements: " + l1);
    }

    // 10. Union & Intersection of two sets
    public static void unionIntersection() {
        Set<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        Set<Integer> s2 = new HashSet<>(Arrays.asList(3, 4, 5, 6));
        Set<Integer> union = new HashSet<>(s1);
        union.addAll(s2);
        Set<Integer> inter = new HashSet<>(s1);
        inter.retainAll(s2);
        System.out.println("Union: " + union);
        System.out.println("Intersection: " + inter);
    }

    // 11. Merge two maps
    public static void mergeMaps() {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Java", 1);
        map1.put("API", 2);
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("Selenium", 3);
        map2.put("Java", 5);
        map2.forEach((k, v) -> map1.merge(k, v, Integer::sum));
        System.out.println("Merged map: " + map1);
    }

    // 12. Group words by length
    public static void groupByLength() {
        List<String> list = Arrays.asList("Java", "Selenium", "API", "SQL", "Test");
        Map<Integer, List<String>> map = new HashMap<>();
        for (String word : list) map.computeIfAbsent(word.length(), k -> new ArrayList<>()).add(word);
        System.out.println("Grouped by length: " + map);
    }

    // 13. Sort list of strings by length
    public static void sortByLength() {
        List<String> list = new ArrayList<>(Arrays.asList("Selenium", "Java", "API", "Automation"));
        list.sort(Comparator.comparingInt(String::length));
        System.out.println("Sorted by length: " + list);
    }

    // 14. Remove null values from list
    public static void removeNulls() {
        List<String> list = new ArrayList<>(Arrays.asList("Java", null, "Selenium", null, "API"));
        list.removeIf(Objects::isNull);
        System.out.println("After removing nulls: " + list);
    }

    // 15. Find k-th largest element
    public static void kthLargest() {
        List<Integer> list = Arrays.asList(10, 50, 30, 20, 60, 40);
        int k = 3;
        TreeSet<Integer> set = new TreeSet<>(list);
        Integer kth = null;
        Iterator<Integer> it = set.descendingIterator();
        int count = 0;
        while (it.hasNext() && count < k) {
            kth = it.next();
            count++;
        }
        System.out.println(k + "rd largest element: " + kth);
    }

    // MAIN METHOD
    public static void main(String[] args) {
        removeDuplicates();
        frequencyCount();
        firstNonRepeated();
        findDuplicates();
        secondHighest();
        sortMapByValue();
        compareMaps();
        mostFrequent();
        commonElements();
        unionIntersection();
        mergeMaps();
        groupByLength();
        sortByLength();
        removeNulls();
        kthLargest();
    }
}
