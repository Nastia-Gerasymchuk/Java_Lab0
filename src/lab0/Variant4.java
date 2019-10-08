package lab0;

import java.sql.Array;
import java.util.Arrays;
import java.io.File;
import java.util.Scanner;
import java.io.FileReader;
import java.util.Stack;
public class Variant4 {
    /*public enum DayOfMonth {
        JANUARY(1),
        FEBRUARY(2),
        MARCH(3),
        APRIL(4),
        MAY(5),
        JUNE(6),
        JULE(7),
        AUGUST(8),
        SEPTEMBER(9),
        OCTOBER(10),
        NOVEMBER(11),
        DECEMBER(12);
        private number;

        DayOfMonth(int number) {
            this.number = number;
            //this.days = 28 + (number + Math.floor(number / 8)) % 2 + 2 % number + 2 * Math.floor(1 / number);
        }

        public int getCountDayOfMonth() {
            return 28 + (number + Math.floor(number / 8)) % 2 + 2 % number + 2 * Math.floor(1 / number);
        }
    }*/

    /*public int enumTask(int i) {
        DayOfMonth day=DayOfMonth(12);
        return 1;
    }*/

    /* public enum DAY_OF_WEEK {
         SUNDAY,MONDAY;
     }*/
    public int fibCount;

    /**
     * @param d is a diameter of circle
     * @return length of the circle
     */
    public double inputOutputTask (int d) throws RuntimeException{
        //assert d > 0: "Argument should be more than zero";
        if (d<0)throw new RuntimeException("d<0");
        return Math.PI * d;
    }

    /**
     * @param A is distance
     * @param B is distance
     *          A>B
     * @return count of integer parts of B from with consists A
     */

    public int integerNumbersTask(int a, int b) {
        return a /b;
    }

    /**
     * @param numbers a ,b
     * @return true, a>2 and b<=3
     */
    public boolean booleanTask(int a, int b) {

        return (a > 2 && b <= 3);
    }


    /**
     * @param a,b,c are integer numbers
     * @param n     is integer number, which has count of positive numbers
     * @return n
     */
    public int ifTask(int a, int b, int c) {

        int count = 0;
        if (a > 0) {
            count++;
        }
        if (b > 0) {
            count++;
        }
        if (c > 0) {
            count++;
        }
        return count;
    }


    /**
     * @param number1
     * @return day of week day represented number1
     */
    /*public DAY_OF_WEEK switchTask(int number1) {
        return DAY_OF_WEEK.MONDAY;
    }*/


    /**
     * @param price is integer number
     */
    public float[] forTask(float price) {
        float [] mas=new float[10];
        for (int i = 1; i <= 10; i++) {
            mas[i-1]=price*i;
        }
        return mas;
    }

    /**
     * @param n is integer, n>0
     */

    public boolean whileTask(int n) {
        float m=n;
        if (m == 1||m==3 ) {
            return true;
        }
        while (m >= 3) {
            m = m / 3;
        }
        return (m == 1) ? true : false;
    }

    /*public int [2] arrayTask(int[] array) {
        int [] mas={0,1};
        for(int i=0;i<array.length;i++) {
            mas[0]+=array[i];
            mas[1]*=array[i];
        }
            return mas[2];
        }*/

    /*@param array[] consists of real numerics
    mas[0] is sum of this numerics
    mas[1] is product of this numerics


     */

    /**
     *
     * @param array is a set of numbers
     * @return sum and product of the numbers
     */

    public double[] arrayTask(double[] array) {
        double[] mas = {0, 1};
        for (int i = 0; i < array.length; i++) {
            mas[0] += array[i];
            mas[1] *= array[i];
        }
        //System.out.println("Sum of "+ Arrays.toString(array)+" = "+mas[0]);
        //System.out.println("Product of "+Arrays.toString(array)+" = "+mas[1]);
        return mas;
    }


    /**
     * @param a is integer. It is side ot triangle
     *          mas is array of double
     *          mas[0] is perimeter
     *          mas[1] is area
     */
    private double[] procHelpTask(double a) {
        double[] mas = new double[2];
        mas[0] = 3 * a;
        mas[1] = a * a * (Math.pow(3, 0.5) / 4);
        return mas;
    }
    public double [] procTask(double a){
        double[] mas=new double[2];
        mas=procHelpTask(a);
        mas[0]*=3;
        mas[1]*=3;
        return mas;
    }

    /**
     *
     * @param array has numbers
     * @return min number
     */

    public int minMaxTask(double[] array) {
        double min = array[0];
        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    /**
     * @param n is integer, n is count of numerics into geometric progression
     * @param a is double, a is the first member of the geometric progression
     * @param d is double, d is denominator of the geometric progression
     */


    public double[] arrayTask(double a, double d, int n) {
        double[] mas = new double[n];
        mas[0] = a;
        for (int i = 1; i < n; i++) {
            mas[i] = mas[i - 1] * d;
        }
        return mas;
    }


    /**
     * @param m     is integet, m is count of lines of the matrix
     * @param array is massif of the double numerics
     */

    public double[][] matrixTask(int m, double[] array) {
        double[][] mas = new double[m][array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < m; j++) {
                mas[j][i] = array[i];
            }
        }
        return mas;
    }

    /**
     *
     * @param n is count of letters 1<=n<=26
     * @return n letters
     */
    public char[] stringTask(int n) {
        char[] mas = new char[n];
        mas[0] = 'A';
        for (int i = 1; i < n; i++) {
            mas[i] = mas[0];
            mas[i] += i;
        }
        return mas;
    }

    /**
     * @param array is some 4 words
     * @return count array's words into this catalog
     */

    public int fileTask(String[] array) {

        File dir = new File("C:\\Users\\admin\\Desktop\\variant4");
        // если объект представляет каталог
        int count = 0;
        if (dir.isDirectory()) {
            // получаем все вложенные объекты в каталоге
            for (File item : dir.listFiles()) {
                int flag = 0;
                for (int i = 0; i < 4; i++) {
                    if ((array[i] + ".txt").equals(item.getName())) {
                        flag += 1;
                    }

                    if (flag == 1) {
                        break;
                    }
                }
                if (flag == 1) {
                    count += 1;
                }
            }
        }
        return count;
    }

    /**
     * @param fileName is name of file, fileName is String
     * @return count of characters and lines
     * @throws Exception
     */

    public int[] textTask(String fileName) throws Exception {
        int[] mas = {0, 0};
        FileReader fR = new FileReader("C:\\Users\\admin\\Desktop\\variant4\\" + fileName + ".txt");
        Scanner scan = new Scanner(fR);
        while (scan.hasNextLine()) {
            mas[0] += 1;
            mas[1] += scan.nextLine().length();
        }
        fR.close();
        return mas;
    }

    /**
     * @param array is array of double numbers, array will be changed
     * @return array
     */


   private double[] invertTask(double[] array) {
        double temp;
        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }
    public double [][] procInvertTask(double [][] array){
       array[0]=invertTask(array[0]);
       array[1]=invertTask(array[1]);
       array[2]=invertTask(array[2]);
        return array;
    }

    private int fib1Task(int number) {
        int res;
        fibCount += 1;
        if (number == 1) {
            res = 0;
        } else if (number == 2) {
            res = 1;
        } else {
            res = fib1Task(number - 1) + fib1Task(number - 2);
        }
        return res;
    }

    /**
     * @param array is integer, It is numbers of the fibonacci's numerics
     * @return array numerics according to fibonacci's numbers
     */
    public int[][] fibResTest(int[] array) {

        int[][] mas = new int[2][5];

            for (int i = 0; i < 5; i++) {
                fibCount = 0;
                mas[0][i] = fib1Task(array[i]);
                mas[1][i]=fibCount;
                System.out.println("numeric:" + mas[0][i] + " count of recursions:" + fibCount);
            }

        return mas;

    }

    /**
     *
     * @param array is numerics from which stack will be consists
     * @return index the last element of the stack
     */

    public int stackTask(int[] array) {

        Stack myStack = new Stack();
        for (int i = 0; i < array.length; i++) {
            myStack.push(array[i]);
        }
        int index = myStack.search(myStack.peek());
        //int i = 0;
        while (!myStack.empty()) {
            System.out.println(myStack.pop());
        }
        return index;
    }

    /**
     * @param a ,@param b, @param c are dots on numerics' line
     * @return array of sum ab, ac and sum the first and the second sum
     */


    public double[] demoTask(double a, double b, double c) {
        double mas[] = new double[3];
        mas[0] = Math.abs(a - c);
        mas[1] = Math.abs(b - c);
        mas[2] = mas[0] + mas[1];
        return mas;
    }

    /**
     *
     * @param number is number of month
     * @return count days of month
     */

    public int case1Tast(int number){
        number=number%12;
        int count=0;
        if(number==0){
            number=12;
        }

        switch (number){
            case(2):
                count=28;
                break;
            case(4):
            case(6):
            case(9):
                count=30;
                break;
            case(11):
                count=30;
                break;
            case(1):
                count=31;
                break;
            case(3):
                count=31;
                break;
            case(5):
                count=31;
                break;
            case(7):
                count=31;
                break;
            case(8):
                count=31;
                break;
            case(10):
                count=31;
                break;
            case(12):
                count=31;
                break;
        }
        return count;
    }

    /**
     *
     * @param number is number of month
     * @return count days of month
     */

    public double case2Tast(int number){
        number=number%12;
        if(number==0){
            number=12;
        }
        return 28 + (number + Math.floor(number / 8)) % 2 + 2 % number + 2 * Math.floor(1 / number);
    }



    }







