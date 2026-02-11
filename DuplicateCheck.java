import java.util.Scanner;

class DuplicateCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        boolean duplicate = false;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    duplicate = true;
                    break;
                }
            }
        }

        if (duplicate)
            System.out.println("Duplicate found");
        else
            System.out.println("No duplicate");
        sc.close();
    }
}

