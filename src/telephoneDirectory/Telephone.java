package telephoneDirectory;

import utility.Utility;
import java.util.Objects;

public class Telephone {
    private String name;
    private String number;

    public Telephone(String name, String number) {
        this.name = Utility.checkNull(name ,"Default");
        this.number = Utility.checkNull(number ,"Default");
    }
    public String getName() {
        return name;
    }
    public String getNumber() {
        return number;
    }

    public void setName(String name) {
        this.name = Utility.checkNull(name ,"Default");
    }
    public void setNumber(String number) {
        this.number = Utility.checkNull(number ,"Default");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Telephone telephone = (Telephone) o;
        return Objects.equals(name, telephone.name) && Objects.equals(number, telephone.number);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, number);
    }

    @Override
    public String toString() {
        return  "Ф.И: " + name +
                " / Номер телефона: " + number;
    }
}
