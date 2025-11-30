package h3;

public class H3_main {

    public static void main(String[] args){
        int[] a={2,2,3,4};
        int[] b={2,1,4,3};

        System.out.println(compareAraysVal(a,b));


    }

    public static boolean compareAraysVal(int[] a, int[]b){
            if(a.length!=b.length){return false;}

        for (int i=0; i<a.length;i++){
            int j=0;

            for (int k=0; k< b.length;k++){
                if (b[k]==a[i]){
                     j++;

                }
            }

            int l=0;
            for (int m=0; m<a.length;m++){
                if (a[m] == a[i]){
                    l++;
                }

            }
            if (j!=l){
                return false;

            }
        }




        return true;
    }
}
