import java.util.Objects;

// 1.an abstraction for Units to support Open/Closed Principle
interface Unit {
    double convertToBase(double value);
}

// 2. Concrete Enum for Length - DRY: All logic is centralized here
enum LengthUnit implements Unit {
    INCH(1.0), FOOT(12.0), YARD(36.0), CM(0.3937);

    private final double baseFactor;

    LengthUnit(double baseFactor) {
        this.baseFactor = baseFactor;
    }

    @Override
    public double convertToBase(double value) {
        return value * baseFactor;
    }
}

// 3. The Measurement Class
class Measurement {
    private final double value;
    private final Unit unit;

    public Measurement(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    public boolean isEquivalentTo(Measurement that) {
        if (this == that) return true;
        if (that == null || this.unit.getClass() != that.unit.getClass()) return false;

        double thisInBase = this.unit.convertToBase(this.value);
        double thatInBase = that.unit.convertToBase(that.value);

        return Math.abs(thisInBase - thatInBase) < 0.001;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Measurement that = (Measurement) o;
        return Double.compare(that.value, value) == 0 && unit == that.unit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, unit);
    }
}

// 4. Main Application
public class QuantityMeasurementApp {
    public static void main(String[] args) {
        // Test Case 1: Feet to Inches (DRY & SOLID)
        Measurement feet = new Measurement(1.0, LengthUnit.FOOT);
        Measurement inches = new Measurement(12.0, LengthUnit.INCH);
        
        System.out.println("1 Foot equals 12 Inches: " + feet.isEquivalentTo(inches));

        // Test Case 2: Yard to Feet
        Measurement yard = new Measurement(1.0, LengthUnit.YARD);
        Measurement threeFeet = new Measurement(3.0, LengthUnit.FOOT);
        
        System.out.println("1 Yard equals 3 Feet: " + yard.isEquivalentTo(threeFeet));
    }
}