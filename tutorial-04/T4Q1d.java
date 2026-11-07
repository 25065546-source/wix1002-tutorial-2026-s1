void main() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter n=");
    int n = sc.nextInt();
    int sum = 0;
    for (int i = 1; i <= n; i++ ){
        sum += i;
    }
    System.out.println("Sum: " + sum);
    sc.close();
}