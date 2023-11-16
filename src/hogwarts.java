import javax.lang.model.SourceVersion;
import java.sql.SQLOutput;

public class hogwarts {
    protected String nameOfStudent;
    protected int power;
    protected int transgration;


    public hogwarts(String nameOfStudent, int power, int transgration) {
        this.nameOfStudent = nameOfStudent;
        this.power = power;
        this.transgration = transgration;
    }

    public String getNameOfStudent() {
        return nameOfStudent;
    }

    public int getPower() {
        return power;
    }

    public int getTransgration() {
        return transgration;
    }

    public void setNameOfStudent(String nameOfStudent) {
        this.nameOfStudent = nameOfStudent;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setTransgration(int transgration) {
        this.transgration = transgration;
    }

    @Override
    public String toString() {
        return "hogwarts{" +
                "nameOfStudent='" + nameOfStudent + '\'' +
                ", power=" + power +
                ", transgration=" + transgration +
                '}';
    }

    public void compare(hogwarts hogwarts) {
        if (power + transgration > hogwarts.getPower() + hogwarts.getTransgration()) {
            System.out.println(nameOfStudent + " обладает бОльшей мощностью магии, чем " + hogwarts.getNameOfStudent());
        } else if (power + transgration < hogwarts.getPower() + hogwarts.getTransgration()) {
            System.out.println(hogwarts.getNameOfStudent() + " обладает бОльшей мощностью магии, чем " + nameOfStudent);
        } else {System.out.println(hogwarts.getNameOfStudent() + " обладает равной мощностью магии, с " + nameOfStudent);

        }
    }
}

