package org.example.collections;

import java.util.*;

public class Collections {
    public static void main(String[] args) {
        List<Integer> aList = new ArrayList<>();
        aList.add(1);
        aList.add(2);
        aList.add(3);
        aList.add(4);

        // When the return type is needed to as array instead of ArrayList then we can,
//        Integer[] arr = aList.toArray(new Integer[0]);
//        for( int x : arr) {
//            System.out.print(x + " ");
//        }

        List<Integer> aList2 = new ArrayList<>();
        aList2.add(5);
        aList2.add(6);
        aList2.add(7);


        aList2.addAll(aList);
        aList2.set(1, 100);
//        System.out.println(aList2.indexOf(4));
//        System.out.println(aList2);

        List<Integer> aList3 = aList2.subList(1,4);
//        System.out.println(aList3);

//        for(int x : aList) {
//            System.out.println(x);
//        }

        List<Integer> lList = new LinkedList<>();
        lList.add(1);
        lList.add(2);
        lList.add(3);

        ListIterator<Integer> iterator = lList.listIterator();
//
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.previous());

        // FIFO Queue
        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);

//        System.out.println(q.peek());
//        System.out.println(q.poll());
//        System.out.println(q.peek());
//        System.out.println(q.isEmpty());

        // LIFO Stack
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);

//        while(!st.isEmpty()) {
//            System.out.println(st.peek());
//            st.pop();
//        }

        Deque<Integer> deque = new ArrayDeque<>();
//        deque.offerFirst(1);
//        deque.offerFirst(2);
//        deque.offerFirst(3);
        deque.offerLast(10);
        deque.offerLast(20);
        deque.offerLast(30);

        deque.pollLast();


//        System.out.println(deque);

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b -a);

        pq.add(1);
        pq.add(2);
        pq.add(3);
        pq.add(4);
        pq.add(5);

        List<Integer> list = new ArrayList<>();
        int ind = 0;
        while(!pq.isEmpty()) {
            if(ind == 2) break;
            list.add(pq.poll());
            ind++;
        }

//        System.out.println(list);
//        System.out.println(pq);

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(1);

        Set<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(3);
        set2.add(5);
        set.retainAll(set2); // Gives common elements from set2 on set

//        System.out.println(set);
//        System.out.println(set2);

        NavigableSet<Integer> set3 = new TreeSet<>();
        set3.add(1);
        set3.add(2);
        set3.add(3);

//        System.out.println(set3.ceiling(1));
//        System.out.println(set3.floor(2));
//        System.out.println(set3.higher(1));
//        System.out.println(set3.lower(3));


        // HashMaps
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Srujan", 1);
        hashMap.put("patluri", 2);
        hashMap.put("Zenitsu", 3);

//        System.out.println(hashMap.get("patluri"));
//        System.out.println(hashMap.getOrDefault("Kim",0));
//        System.out.println(hashMap.containsKey("Srujan"));

//        Map<Integer, List<Integer>> li = new HashMap<>();
//
//        li.computeIfAbsent(1,f -> new ArrayList<>())
//                .add(2);
//
//        System.out.println(li);

        for(Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}
