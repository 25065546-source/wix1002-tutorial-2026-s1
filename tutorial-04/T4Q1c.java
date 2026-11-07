void main() {
    Random rand = new Random();
    for (int i = 1; i <= 4; i++) {
        for (int j = 1; j <= 5; j++) {
            int num = rand.nextInt(101);
            System.out.printf("%4d", num);
        }
        System.out.println();
    }
}