package ex26;

 class PaymentCaluclator {

    private double n;
    private double b;
    private double i;
    private double p;

    public void PaymentCalculator( double n, double b, double i, double p)
    {
        this.n=n;
        this.b=b;
        this.i=i;
        this.p=p;
    }

    public double calculateMonthsUntilPaidOff( double b, double i, double p) {
        // find daily rate
          double ii = i/(365*100);

        double temp = b/p;
        double temp1 = Math.pow((1+ii),30);
        double temp2 = Math.log(1+ii);
        double temp3 = Math.log(1 + temp *(1 - temp1));

        n = (double)Math.ceil((-1 * temp3) / (temp2*30));

        System.out.printf("It will take you %1.0f months to pay off this card.%n", n);
        return n;

    }

}
