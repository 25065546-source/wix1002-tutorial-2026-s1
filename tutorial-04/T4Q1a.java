void main() {
    int n = 0;
    while ((n + 1) * (n + 1) * (n + 1) < 2000) {
        n++;
    }
    System.out.println("The largest integer n where n³ < 2000 is: " + n);
}