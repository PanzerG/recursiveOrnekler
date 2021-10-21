package recursive;

public class yuzBul {

    public static int bul(int[] a, int i, int sayac) {
        if (i >= a.length) {
            return sayac;
        } else if (a[i] == 100) {
            sayac++;

        }
        return bul(a, ++i, sayac);
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 100, 30, 5, 100, 32, 445};

        int adet = bul(a, 0, 0);
        System.out.println(adet + " Tane 100 vardır.");

    }

}
