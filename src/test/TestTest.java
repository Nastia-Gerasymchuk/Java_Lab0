package test;

import lab0.Variant4;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestTest {

    @Test
    public void inputOutputTest() {
        assertEquals(new Variant4().inputOutputTask(8), 21.99, 0.01);
    }



    @Test(dataProvider="integerNumbersTestProvider")
    public void integerNumbersTest(int a,int b,int c) {
        assertEquals(new Variant4().integerNumbersTask(a,b),c);
    }
    @DataProvider
    public Object[][] integerNumbersTestProvider()
    {
      return new Object[][]{
              {4,3,1},
              {7,4,1}
      };
    }
    @Test
    public void booleanTest() {
        assertEquals(new Variant4().booleanTask(3, 2),true);
    }
    @Test
    public void ifTest(){
        assertEquals(new Variant4().ifTask(3,-6,-9),1);
    }
    @Test
    public void forTest(){
        assertEquals(new Variant4().forTask(2),new float []{2,4,6,8,10,12,14,16,18,20});
    }
    @Test
    public void whileTest(){
        assertEquals(new Variant4().whileTask(15),false);
    }
    @Test
    public void arrayTest(){
        assertEquals(new Variant4().arrayTask(new double [] {1.1,2.2,3.78}),new double []{7.08,9.1476});
    }
    @Test
    public void procTaskTest(){
        assertEquals(new Variant4().procTask(4),new double[] {36,20.78},0.1);
    }
    @Test
    public void minMaxTest(){
        assertEquals(new Variant4().minMaxTask(new double[] {1,7.8,0,5,6} ),2);
    }
    @Test
    public void arrayTask(){
        assertEquals(new Variant4().arrayTask(2,4,3),new double[] {2,8,32});
    }
    @Test
    public void matrixTask(){
        assertEquals( new Variant4().matrixTask(3,new double[]{3,-6,7.8,9}),new double[][]{{3,-6,7.8,9},{3,-6,7.8,9},{3,-6,7.8,9}});
    }
    @Test
    public void stringTest(){
        assertEquals(new Variant4().stringTask(3),new char[]{'A','B','C'});
    }
    @Test
    public void fileTest(){
        assertEquals(new Variant4().fileTask(new String[]{"one","two","love","two"}),2);
    }
    @Test
    public void textTask()throws Exception{
        assertEquals(new Variant4().textTask("one"),new int []{4,40} );
    }
    @Test
    public void procInvertTest(){
        assertEquals(new Variant4().procInvertTask(new double [][]{{3,5,6},{2,1,0,5},{8,1}}),new double[][] {{6,5,3},{5,0,1,2},{1,8}});
    }
    /*@Test
    public void fib1Test(){
        assertEquals(new Variant4().fib1Task(3),1);
    }*/

    @Test
    public void fibResTest(){
        assertEquals(new Variant4().fibResTest(new int[]{3,5,6,7,9}),new int[][]{{1,3,5,8,21},{3,9,15,25,67}});
    }

    @Test
    public void stackTest(){
        assertEquals(new Variant4().stackTask(new int[] {14,8,45,88,98}),1);
    }

    @Test
    public void demoTest(){
        assertEquals(new Variant4().demoTask(-3,-7,4),new double[]{7,11,18});
    }

    @Test
    public void case1Test(){
        assertEquals(new Variant4().case1Tast(12),30);
    }
    @Test
    public void case2Test(){
        assertEquals(new Variant4().case2Tast(22),31);
    }


}
