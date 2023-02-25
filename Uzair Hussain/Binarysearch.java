// import java.lang.Exception;

// public class Binarysearch {
// static int search(int[] a, int x) {
// int p = 0;
// int q = a.length - 1;
// while (p <= q) {
// int i = (p + q) / 2;
// if (a[i] == x) {
// return i;
// } else if (a[i] < x) {
// p = i + 1;
// } else {
// q = i - 1;
// }
// }
// return 0;
// }

// public static int[] resize(int[] a, int n) {

// if (n < a.length) {
// System.out.println("Invalid operation");
// }
// int[] aa = new int[n];
// System.arraycopy(a, 0, aa, 0, a.length);

// return aa;

// }

// public static void main(String[] args) {
// int[] b = { 5, 9, 13, 16, 88 };
// System.out.println(search(b, 16));
// resize(b, 7);
// System.out.println(b.length);
// }

// }

// public static int[] linearSearch(int[][] a, int value) {
// int i = 0, j = a[0].length - 1; // start from top right corner

// while (i < a.length && j >= 0) {
// if (a[i][j] == value) {
// return new int[]{i, j};
// } else if (a[i][j] > value) {
// j--; // move left
// } else {
// i++; // move down
// }
// }
// // element not found
// return new int[]{-1, -1};

// }