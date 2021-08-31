public class Fraction implements Comparable<Fraction> {
    private final long top;
    private final long bottom;

    public Fraction(long numerator, long denominator) {
        top = numerator;
        bottom = denominator;
    }

    @Override
    public int hashCode() {
        return 17 * Long.hashCode(top) + Long.hashCode(bottom);
    }

    @Override
    public boolean equals(Object o) {
        return compareTo((Fraction) o) == 0;
    }

    @Override
    public int compareTo(Fraction f2) {
        return Long.compare(top * f2.bottom, f2.top * bottom);
    }

    @Override
    public String toString() {
        return top + "/" + bottom;
    }

    // Your work here!

    //Add two fractions
    public Fraction add(Fraction f2) {
        long newTop;
        long newBottom;
        if (this.bottom == f2.bottom) {
            newTop = this.top + f2.top;
            newBottom = this.bottom;
        } else {
            newTop = this.top * f2.bottom + this.bottom * f2.top;
            newBottom = this.bottom * f2.bottom;
        }
        int i = 2;
        while (i < newBottom) {
            if (newBottom % i == 0 && newTop % i == 0) {
                newBottom = newBottom / i;
                newTop = newTop / i;
            }
            i++;
        }
        Fraction rezult = new Fraction(newTop, newBottom);
        return rezult;
    }

    //...and make this class string representable
}