package h1;

public class H1_main {
    public static void main(String[] args) {
        int[] a={2,1,3,4};
        int[] b={4,3,2,2};
        System.out.println(isMirrorArray(a,b));

    }

    public static boolean isMirrorArray(int[] a, int[] b) {

        int i = 0;
        while (i < a.length) {

            if (a[i] != b[b.length - 1 - i]) {

                return false;
            }
            i++;

        }
        return true;
    }
}
