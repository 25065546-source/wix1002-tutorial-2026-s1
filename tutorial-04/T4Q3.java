void main() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter how many fibonacci numbers you want: ");
    int n = sc.nextInt();
    int f1 = 1;
    int f2 = 1;
    int fn;
    if (n >= 1) {
        System.out.print(f1 + " ");
    }
    if (n >= 2) {
        System.out.print(f2 + " ");
    }
    for (int i = 3; i <= n; i++) {
        fn = f1 + f2;
        System.out.print(fn + " ");
        f1 = f2;
        f2 = fn;
    }
    System.out.println(" ");
    sc.close();
}



