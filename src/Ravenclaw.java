public class Ravenclaw extends hogwarts {
    private int smart;
    private int wise;
    private int witty;
    private int fullOfCreativity;

    public int getSmart() {
        return smart;
    }

    public Ravenclaw(String nameOfStudent, int power, int transgration, int smart, int wise, int witty, int fullOfCreativity) {
        super(nameOfStudent, power, transgration);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.fullOfCreativity = fullOfCreativity;
    }

    public int getWise() {
        return wise;
    }

    public int getWitty() {
        return witty;
    }

    public int getFullOfCreativity() {
        return fullOfCreativity;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public void setFullOfCreativity(int fullOfCreativity) {
        this.fullOfCreativity = fullOfCreativity;
    }

    @Override
    public String toString() {
        return "Ravenclaw{" +
                "smart=" + smart +
                ", wise=" + wise +
                ", witty=" + witty +
                ", fullOfCreativity=" + fullOfCreativity +
                ", nameOfStudent='" + nameOfStudent + '\'' +
                ", power=" + power +
                ", transgration=" + transgration +
                '}';
    }

    public void compare(Ravenclaw Ravenclaw) {
        if (smart + wise + witty + fullOfCreativity > Ravenclaw.getSmart() + Ravenclaw.getWise() + Ravenclaw.getWitty() + Ravenclaw.getFullOfCreativity()) {
            System.out.println(nameOfStudent + " лучший Гриффиндорец, чем  " + Ravenclaw.getNameOfStudent());
        } else if (smart + wise + witty + fullOfCreativity < Ravenclaw.getSmart() + Ravenclaw.getWise() + Ravenclaw.getWitty() + Ravenclaw.getFullOfCreativity()){
            System.out.println(Ravenclaw.getNameOfStudent() + " лучший Гриффиндорец, чем " + nameOfStudent);
        } else {
            System.out.println(Ravenclaw.getNameOfStudent() + " набрал/а одинаковые баллы с " + nameOfStudent);
        }
    }
}

