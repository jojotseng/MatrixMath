
/**
 * Write a description of class MatrixMathDriver here.
 *
 * @author (Mr. Kim)
 * @version (October 28. 2019)
 */
public class MatrixMathDriver
{
    public static void main(String[] args)
    {
        int[][] A=  { {1,2,3},
                      {2,1,0},
                      {1,0,2}};
        int[][] B = { {1,2,3,4, 5},
                      {2,4,6,8,10},
                      {1,3,5,7, 9} };
        int[][] C = { {-1,-2,-3},
                      {-2,-3,-4},
                      { 4, 3, 5},
                      { 2, 0,-1},
                      { 5, 1, 3} };
        
        MatrixMath mathA = new MatrixMath(A);
        
        /* TODO
         * Use Arrays.toString on the results below
         */
        mathA.rowSum();
       
        mathA.rowAve();
            sum=0;
            for(int i=0; i<A.length ; i++)
                {
                    sum+=A[i];
                    
                }
                return sum/3;
        mathA.colSum();
            sum=0;
            for(int i=0; i<A.length; i++)
                for(int j=0; j<A[i].length;j++)
                {
                    sum+= A[i][j];
                }
                return sum;
        mathA.colAve();
        sum=0;
            for(int i=0; i<A.length; i++)
                for(int j=0; j<A[i].length;j++)
                {
                    sum+= A[i][j];
                }
                return sum/3;
        MatrixMath mathB = new MatrixMath(B);
        mathB.rowSum();
            int sum=0;
            for(int i=0; i<B.length ; i++)
                {
                    sum+=B[i];
                }
                return sum;
        mathB.rowAve();
            int sum=0;
            for(int i=0; i<B.length ; i++)
                {
                    sum+=B[i];
                }
                return sum/5;     
        mathB.colSum();
            sum=0;
            for(int i=0; i<B.length; i++)
                for(int j=0; j<B[i].length;j++)
                {
                    sum+= B[i][j];
                }
                return sum;
        mathB.colAve();
            sum=0;
            for(int i=0; i<B.length; i++)
                for(int j=0; j<B[i].length;j++)
                {
                    sum+= B[i][j];
                }
                return sum/3;
    }
}
