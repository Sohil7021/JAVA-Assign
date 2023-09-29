import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Add_to_Array_Form_of_Integer {
    public static void main(String[] args) {
        int[] num = {1,2,0,0};
        List<Integer> result = addToArrayFrom3(num,34);
        System.out.println(result);
    }
    static List<Integer> addToArrayForm(int[] num,int k) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = num.length;
        int cur = k;

        int i = n;
        while (--i >= 0 || cur > 0) {
            if (i >= 0) {
                cur += num[i];
                list.add(cur%10);
                cur /= 10;
            }
        }

        Collections.reverse(list);
       return list;





    }

    static List<Integer> addToArrayForm2(int[] num, int k) {
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = num.length - 1; i >= 0 ; i--) {
            list2.add(0,(num[i]+k) % 10);
            k = (num[i] + k) / 10;
        }

        while (k > 0) {
            list2.add(0,k%10);
            k /= 10;
        }
        return list2;

    }


    static List<Integer> addToArrayFrom3(int[] num, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        int carry = 0;
        int index = num.length - 1;

        while (index >= 0 || k > 0) {
            int sum = carry;
            if (index >= 0) {
                sum += num[index];
            }
            if (k > 0) {
                sum += k % 10;
                k /= 10;
            }

            carry = sum / 10;
            list.add(0,sum % 10);
            index--;
        }

        if (carry > 0) {
            list.add(0,carry);
        }
        return list;
    }


}
