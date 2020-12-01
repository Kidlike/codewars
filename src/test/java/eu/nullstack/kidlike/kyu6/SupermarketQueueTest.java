//package eu.nullstack.kidlike.kyu6;
//
//import org.junit.Test;
//
//import static org.junit.Assert.assertEquals;
//
//public class SupermarketQueueTest {
//    @Test
//    public void test1() {
//        assertEquals(9, SupermarketQueue.solveSuperMarketQueue(new int[]{5, 4, 3, 2, 1}, 2));
//    }
//
//    @Test
//    public void testNormalCondition() {
//        assertEquals(9, SupermarketQueue.solveSuperMarketQueue(new int[]{2, 2, 3, 3, 4, 4}, 2));
//    }
//
//    @Test
//    public void testEmptyArray() {
//        assertEquals(0, SupermarketQueue.solveSuperMarketQueue(new int[]{}, 1));
//    }
//
//    @Test
//    public void testSingleTillManyCustomers() {
//        assertEquals(15, SupermarketQueue.solveSuperMarketQueue(new int[]{1, 2, 3, 4, 5}, 1));
//    }
//}