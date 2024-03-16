public class Remove_Element {
    public static void main(String[] args) {
        int[] num = {2,2,3,3};
        int ans = removeElement(num,3);
        System.out.println(ans);

    }
    static int removeElement(int[] num, int val ){
        int index = 0;
        for (int i = 0; i < num.length ; i++) {
            if (num[i] != val) {
                num[index] = num[i];
                index++;
            }

        }
        return index;
    }

}
