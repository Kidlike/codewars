//package eu.nullstack.kidlike.kyu6;
//
//import java.util.AbstractQueue;
//import java.util.Comparator;
//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.Map;
//import java.util.PriorityQueue;
//
///**
// * https://www.codewars.com/kata/the-supermarket-queue/train/java
// */
//class SupermarketQueue {
//    static int solveSuperMarketQueue(int[] customers, int n) {
//        PriorityQueue<Integer> q = new TimedPriorityBoundedQueue<>(n, Comparator.naturalOrder());
//        for (int customer : customers) {
//            boolean added = q.offer(customer);
//            System.out.println(customer + ": " + added);
//            if (!added) {
//                System.out.println(q.poll() + ": removed");
//                q.add(customer);
//                System.out.println(customer + ": added");
//            }
//            System.out.println();
//        }
//        return 0;
//    }
//
//    static class TimedPriorityBoundedQueue<E extends Integer> extends AbstractQueue<E> {
//        private final int maxSize;
//        private Map<Integer, E> queue;
//        private Integer elapsedTime = 0;
//
//        TimedPriorityBoundedQueue(int maxSize) {
//            this.maxSize = maxSize;
//            queue = new HashMap<>(maxSize, 0);
//        }
//
//        @Override
//        public Iterator<E> iterator() {
//            throw new UnsupportedOperationException("Not implemented yet");
//        }
//
//        @Override
//        public int size() {
//            return maxSize;
//        }
//
//        @Override
//        public boolean offer(E e) {
//            if (queue.size() == maxSize) {
//                return false;
//            }
//            queue.put(elapsedTime, e);
//            return true;
//        }
//
//        @Override
//        public E poll() {
//            if (queue.size() == 0) {
//                return null;
//            }
//
//            //queue.remove();
//        }
//
//        @Override
//        public E peek() {
//            throw new UnsupportedOperationException("Not implemented yet");
//        }
//    }
//}
