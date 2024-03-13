import java.util.*;
public class DiffrenceOfTwoArrays {
    public static void main(String[] args) {
        int num1[]=new int[]{1,2,3};
        int num2[]=new int[]{2,4,6};
        int diff1[]=new int[10];
        int diff2[]=new int[10];
        int flag=0;
        int place=0;
        
        for (int i=0; i<num1.length; i++) {
            int temp = num1[i]; //1,2
            for (int j=0; j<num2.length; j++) {
                if (temp==num2[j]) {  //1==2
                    flag=1;
                    break;
                }
            }
            if (flag==0){
                diff1[place]=temp; //1
                place++;
            }
            flag=0;
        }
        place=0;flag=0;
        for (int i=0; i<num2.length; i++) {
            int temp = num2[i];
            for (int j=0; j<num1.length; j++) {
                if (temp==num1[j]) {
                    flag=1;
                    break;
                }
            }
            if (flag==0){
                diff2[place]=temp;
                place++;
            }
            flag=0;
        }

        int count1=0;
        int count2=0;
        for (int i=0; i<diff1.length; i++) {
            if(diff1[i]!=0)
            count1++;
        }
        for (int i=0; i<diff2.length; i++) {
            if(diff2[i]!=0)
            count2++;
        }

        int out[][]= new int[2][Math.max(count1, count2)];
        for (int i=0; i<count1; i++) {
            out[0][i] = diff1[i];
        }
        for (int i=0;i<count2; i++) {
            out[1][i] = diff2[i];
        }
        System.out.println(Arrays.deepToString(out));
    }
}