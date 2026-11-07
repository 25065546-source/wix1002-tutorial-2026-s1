void main() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String str = sc.nextLine();
    int len = str.length();
    for (int i = len -1; i >= 0; i--){
        char ch = str.charAt(i);
        System.out.print(ch);
    }
    System.out.println();
    sc.close();
}