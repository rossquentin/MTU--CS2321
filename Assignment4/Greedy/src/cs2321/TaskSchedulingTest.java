package cs2321;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TaskSchedulingTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testNumOfMachines1() {
		int[][] arr = {{1,4}, {1,3}, {2,5}, {3,7}, {4,7}, {6,9}, {7,8}};
		int expected = 3;
		assertEquals(expected, TaskScheduling.NumOfMachines(arr));
	}

    @Test
    public void testNumOfMachines2() {
        int[][] arr = {{1,4}, {1,3}, {2,5}, {3,7}, {4,7}, {5,7}, {6,9}, {7,8}};
        int expected = 4;
        assertEquals(expected, TaskScheduling.NumOfMachines(arr));
    }

    @Test
    public void testNumOfMachines3() {
        int[][] arr = {{1,4}, {6,8}, {10,15}, {15,20}};
        int expected = 1;
        assertEquals(expected, TaskScheduling.NumOfMachines(arr));
    }

    @Test
    public void testNumOfMachines4() {
        int[][] arr = {{3,7},{4,7},{6,9},{1,4},{1,3},{2,5},{7,8}};
        int expected = 3;
        assertEquals(expected, TaskScheduling.NumOfMachines(arr));
    }

    @Test
    public void testNumOfMachines5() {
        int[][] arr = {{1,4},{1,4},{2,5}, {2,5}};
        int expected = 4;
        assertEquals(expected, TaskScheduling.NumOfMachines(arr));
    }

    @Test
    public void testNumOfMachinesEmpty() {
	    int[][] arr = {};
	    int exmpected = 0;
	    assertEquals(exmpected, TaskScheduling.NumOfMachines(arr));
    }

}
