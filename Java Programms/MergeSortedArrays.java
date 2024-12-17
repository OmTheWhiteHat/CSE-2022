import java.sql.SQLOutput;
import java.util.Scanner;

public class MergeSortedArrays
{
    public static void main(String[] args)
    {
        int[] A ={1,3,5,7,9};
        int[] B ={2,4,6,8,10};
        Scanner cs = new Scanner(System.in);
        int[] C = mergeArrays(A, B);
        System.out.println("Array A:" + arrayToString(A));
        System.out.println("Array B:" + arrayToString(B));
        System.out.println("Merged Array C:" + arrayToString(C));
    }

    public static int[] mergeArrays(int[] A, int[] B)
    {
        int[] C = new int[A.length + B.length];
        int i = 0, j = 0, k = 0;

        while (i < A.length && j < B.length)
        {
            if (A[i] <= B[j]) {
                C[k] = A[i];
                i++;
            } else {
                C[k] = B[j];
                j++;
            }
            k++;
        }

        while (i < A.length)
        {
            C[k] = A[i];
            i++;
            k++;
        }

        while (j < B.length)
        {
            C[k] = B[j];
            j++;
            k++;
        }

        return C;
    }

    public static String arrayToString(int[] arr)
    {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++)
        {
            sb.append(arr[i]);
            if (i < arr.length - 1)
                sb.append(",");
        }
        sb.append("]");
        return sb.toString();
    }
}
