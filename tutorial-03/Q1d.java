void main() {
    String s1 = "Apple";
    String s2 = "banana";
    if (s1.compareToIgnoreCase(s2) < 0) {
        System.out.println(s1);
        System.out.println(s2);
    } else {
        System.out.println(s2);
        System.out.println(s1);
    }

}