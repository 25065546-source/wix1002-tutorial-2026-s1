void main() {
    int a = 12, b = 45, c = 27;
    int max;
    if (a >= b && a >= c) {
        max = a;
    } else if (b >= a && b >= c) {
        max = b;
    } else {
        max = c;
    }
    System.out.println("Largest number = " + max);

}