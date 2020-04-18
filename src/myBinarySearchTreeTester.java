import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class myBinarySearchTreeTester {
    @Test
    //example test case given
    public void Test0(){
        myBinarySearchTreeNode r = new myBinarySearchTreeNode(new int[]{7, 2, 9});
        r.insert(7);
        myBinarySearchTreeNode exp = new myBinarySearchTreeNode(new int[]{7, 2, 9});
        assertEquals(exp.myValue,r.myValue);
        assertEquals(exp.left.myValue,r.left.myValue);
        assertEquals(exp.right.myValue,r.right.myValue);
    }
    //test case #1
    //Testing result of all duplicate array of 1 number
    @Test
    public void Test1(){
        myBinarySearchTreeNode r = new myBinarySearchTreeNode(new int[] {3,3,3,3,3,3,3});
        r.insert(3);
        myBinarySearchTreeNode exp = new myBinarySearchTreeNode(new int []{3,3,3,3,3,3,3});
        assertEquals(exp.myValue,r.myValue);
        assertEquals(exp.left.myValue,r.left.myValue);
        assertEquals(exp.right.myValue,r.right.myValue);
        assertEquals(exp.left.left.myValue,r.left.left.myValue);
        assertEquals(exp.left.right.myValue,r.left.right.myValue);
        assertEquals(exp.right.left.myValue,r.right.left.myValue);
        assertEquals(exp.right.right.myValue,r.right.right.myValue);
    }

    //test case #2
    //testing result of inserting in a full tree with all children
    @Test
    public void Test2(){
        myBinarySearchTreeNode r = new myBinarySearchTreeNode(new int[] {32,16,20,12,1,9,3});
        r.insert(15);
        myBinarySearchTreeNode exp = new myBinarySearchTreeNode(new int []{32,16,20,12,1,9,3});
        assertEquals(exp.myValue,r.myValue);
        assertEquals(exp.left.myValue,r.left.myValue);
        assertEquals(exp.right.myValue,r.right.myValue);
        assertEquals(exp.left.left.myValue,r.left.left.myValue);
        assertEquals(exp.left.right.myValue,r.left.right.myValue);
        assertEquals(exp.right.left.myValue,r.right.left.myValue);
        assertEquals(exp.right.right.myValue,r.right.right.myValue);
    }

    //test case #3
    //testing result of an all negative tree
    @Test
    public void Test3(){
        myBinarySearchTreeNode r = new myBinarySearchTreeNode(new int[] {-120,-180,-70,-150,-200,-100,-50});
        r.insert(-90);
        myBinarySearchTreeNode exp = new myBinarySearchTreeNode(new int []{-120,-180,-70,-150,-200,-100,-50});
        assertEquals(exp.myValue,r.myValue);
        assertEquals(exp.left.myValue,r.left.myValue);
        assertEquals(exp.right.myValue,r.right.myValue);
        assertEquals(exp.left.left.myValue,r.left.left.myValue);
        assertEquals(exp.left.right.myValue,r.left.right.myValue);
        assertEquals(exp.right.left.myValue,r.right.left.myValue);
        assertEquals(exp.right.right.myValue,r.right.right.myValue);
    }

    //test case #4
    //testing result of a non full tree
    @Test
    public void Test4(){
        myBinarySearchTreeNode r = new myBinarySearchTreeNode(new int[] {18,4,-2,12,5});
        r.insert(7);
        myBinarySearchTreeNode exp = new myBinarySearchTreeNode(new int []{18,4,-2,12,5});
        assertEquals(exp.myValue,r.myValue);
        assertEquals(exp.left.myValue,r.left.myValue);
        assertEquals(exp.right.myValue,r.right.myValue);
        assertEquals(exp.left.left.myValue,r.left.left.myValue);
        assertEquals(exp.left.right.myValue,r.left.right.myValue);
        assertEquals(exp.right.left.myValue,r.right.left.myValue);
        assertEquals(exp.right.right.myValue,r.right.right.myValue);
    }

    //test case #5
    //testing with a root and 1 child
    @Test
    public void Test5(){
        myBinarySearchTreeNode r = new myBinarySearchTreeNode(new int[] {7});
        r.insert(20);
        myBinarySearchTreeNode exp = new myBinarySearchTreeNode(new int []{7});
        assertEquals(exp.myValue,r.myValue);
        assertEquals(exp.left.myValue,r.left.myValue);
        assertEquals(exp.right.myValue,r.right.myValue);
    }

}
