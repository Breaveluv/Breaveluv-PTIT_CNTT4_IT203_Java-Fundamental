package SS3.bai6;

public class main {

    public static int[] mergeBooks(int[] a, int[] b) {
        int i = 0, j = 0, k = 0;
        int[] temp = new int[a.length + b.length];

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                if (k == 0 || temp[k - 1] != a[i]) {
                    temp[k++] = a[i];
                }
                i++;
            } else if (a[i] > b[j]) {
                if (k == 0 || temp[k - 1] != b[j]) {
                    temp[k++] = b[j];
                }
                j++;
            } else { 
                if (k == 0 || temp[k - 1] != a[i]) {
                    temp[k++] = a[i];
                }
                i++;
                j++;
            }
        }

        while (i < a.length) {
            if (k == 0 || temp[k - 1] != a[i]) {
                temp[k++] = a[i];
            }
            i++;
        }

       
        while (j < b.length) {
            if (k == 0 || temp[k - 1] != b[j]) {
                temp[k++] = b[j];
            }
            j++;
        }

       
        int[] arrayMerge = new int[k];
        for (int x = 0; x < k; x++) {
            arrayMerge[x] = temp[x];
        }

        return arrayMerge;
    }

    public static void displayBooks(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arrayFirst = {101, 203, 305, 407, 509};
        int[] arraySecond = {203, 300, 305, 600, 700};

        System.out.println("Danh sách kho cũ:");
        displayBooks(arrayFirst);

        System.out.println("Danh sách sách quyên góp:");
        displayBooks(arraySecond);

        int[] arrayMerge = mergeBooks(arrayFirst, arraySecond);

        System.out.println("Danh sách sách sau khi gộp (không trùng, tăng dần):");
        displayBooks(arrayMerge);
    }
}
