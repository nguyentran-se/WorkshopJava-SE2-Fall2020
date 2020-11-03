package work_shop2;

import java.util.Scanner;

public class WorkShop2 {

    private int[] m = new int[100];
    private int n;
    Scanner sc = new Scanner(System.in);

    public void input() {
        System.out.print("Enter number of elements: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter m[" + i + "]: ");
            m[i] = sc.nextInt();
        }
    }

    public void display() {
        for (int i = 0; i < n; i++) {
            System.out.print(m[i] + " ");
        }
        System.out.println("");
    }

    public void max() {
        int res = m[0];
        int pos = 0;
        for (int i = 1; i < m.length; i++) {
            if (res <= m[i]) {
                res = m[i];
                pos = i;
            }
        }
        System.out.println("---Element has maximum: " + res + "; at position: " + pos);
    }

    public void search() {
        System.out.print("---Enter value to search: ");
        int searchKey = sc.nextInt();
        boolean check = false;
        for (int i = m.length - 1; i >= 0; i--) {
            if (m[i] == searchKey) {
                System.out.println("The last occurrence of the array element has value " + searchKey + " at position: " + i);
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("Not found value in the array!");
        }
    }

    public void sortAsc() {
        for (int i = 0; i < m.length - 1; i++) {
            for (int j = 0; j < m.length - i - 1; j++) {
                if (m[j] > m[j + 1]) {
                    int temp = m[j];
                    m[j] = m[j + 1];
                    m[j + 1] = temp;
                }
            }
        }
        System.out.println("---After sorting the array: ");
        for (int i = m.length - n; i < m.length; i++) {
            System.out.print(m[i] + " ");
        }
        System.out.println("");
    }

    public void insert() {
        System.out.print("---Enter value to insert: ");
        int value = sc.nextInt();
        System.out.print("   Enter position to insert: ");
        int pos = sc.nextInt();
        int[] b = new int[n + 1];
        System.arraycopy(m, m.length - n, b, 0, n);
        for (int i = b.length - 1; i > pos; i--) {
            b[i] = b[i - 1];
        }
        b[pos] = value;
        for (int i : b) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        WorkShop2 arr = new WorkShop2();
        arr.input();
        System.out.println("---Elements in the array: ");
        arr.display();
        arr.max();
        arr.search();
        arr.sortAsc();
        arr.insert();
    }
}
