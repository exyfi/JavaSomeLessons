package extendsandpolimorfism;
public final class ComplexNumber  {
    private final double re;
    private final double im;

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }




    public double getIm() {
        return im;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(this.re);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(this.im);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
    @Override
    public boolean equals(Object anObject) {
        if (this == anObject) {
            return true;
        }
        if(anObject==null){
            return false;
        }
        if (anObject instanceof ComplexNumber) {
            ComplexNumber two = (ComplexNumber) anObject;
            if (this.getRe() == two.getRe() && this.getIm() == two.getIm()) {
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        ComplexNumber kek=new ComplexNumber(1,0);
        ComplexNumber kek2=new ComplexNumber(0,1);
        System.out.println( kek.equals(kek2));
        System.out.println(kek.hashCode()+" "+ kek2.hashCode());
    }

}