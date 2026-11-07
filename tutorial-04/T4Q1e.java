void main() {
    double sum = 0;
    for (double i = 1, j = 25; i <= 25 && j >= 1; i++, j--){
        sum +=(double)i / j;
        System.out.print((int)i+"/"+(int)j);
        if(i<25){
            System.out.print(" + ");
        }else {
            System.out.print(" = ");
        }
    }
    System.out.printf("%.2f\n" ,sum);

}