package JSON4;

import java.io.Serializable;
import java.util.Objects;

public class Car implements Serializable {
    private String make;
    private String model;
    private int year;
    private boolean convertible;

    public Car() {

    }

    public Car(String make, String model, int year, boolean convert) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.convertible = convert;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean getConvertible() {
        return convertible;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.make);
        hash = 61 * hash + Objects.hashCode(this.model);
        hash = 61 * hash + this.year;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Car other = (Car) obj;
        if (this.convertible != other.convertible) {
            return false;
        }
        if (this.year != other.year) {
            return false;
        }
        if (!Objects.equals(this.make, other.make)) {
            return false;
        }
        if (!Objects.equals(this.model, other.model)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Car{" + "make=" + make + ", model=" + model + ", year=" + year + ", convertible=" + convertible + '}';
    }
}
