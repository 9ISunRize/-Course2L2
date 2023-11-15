public class Hufflepuff extends hogwarts {
    private int hardworking;
    private int loyal;
    private int honest;

    public Hufflepuff(String nameOfStudent, int power, int transgration, int hardworking, int loyal, int honest) {
        super(nameOfStudent, power, transgration);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }

    @Override
    public String toString() {
        return "Hufflepuff{" +
                "hardworking=" + hardworking +
                ", loyal=" + loyal +
                ", honest=" + honest +
                ", nameOfStudent='" + nameOfStudent + '\'' +
                ", power=" + power +
                ", transgration=" + transgration +
                '}';
    }

    public void compare(Hufflepuff Hufflepuff) {
        if (hardworking + loyal + honest < Hufflepuff.getHardworking() + Hufflepuff.getLoyal() + Hufflepuff.getHonest()) {
            System.out.println(nameOfStudent + " лучший Гриффиндорец, чем " + Hufflepuff.getNameOfStudent());
        } else {
            System.out.println(Hufflepuff.getNameOfStudent() + " лучший Гриффиндорец, чем " + nameOfStudent);
        }
    }
}
