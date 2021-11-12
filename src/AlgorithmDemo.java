public class AlgorithmDemo {

    public static void main(String[] args) {

        System.out.println(getResult());

    }

    /**
     * 判断是不是回文数
     * @return
     */
    private static boolean getResult() {
        String str = "123321";
        int intNum = 1234321;

        char[] b = String.valueOf(intNum).toCharArray();
        char[] a = str.toCharArray();

        int j = a.length-1;
        for (int i = 0; i < a.length/2; i++,j--) {
            if (a[i] != a[j]) {
                return false;
            }
        }
        return true;
    }
}
