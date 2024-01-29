class FRQtester {
    public static void main(String[] args) {
        int pmt = 1000;
        int i = 3;
        int n = 10;
        System.out.println("\nif you wanted " + pmt + " every year for " + n + " years " + " based on " + i + "% interest, the present value would have to be " + getPresentValue(pmt, i, n));

        pmt = 500;
        i = 2;
        n = 10;
        System.out.println("\nif you wanted " + pmt + " every year for " + n + " years " + " based on " + i + "% interest, the present value would have to be " + getPresentValue(pmt, i, n));

    }
  
    public static double getPresentValue(int pmt, int i, int n){
        double rate = (double)i/100;
        double temp = Math.pow(1+rate, -n);
        return pmt*(1-temp)/rate;
    }
  
  }