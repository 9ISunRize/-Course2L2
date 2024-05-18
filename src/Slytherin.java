public class Slytherin extends hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;

    public Slytherin(String nameOfStudent, int power, int transgration, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(nameOfStudent, power, transgration);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }

    @Override
    public String toString() {
        return "Slytherin{" +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", thirstForPower=" + thirstForPower +
                ", nameOfStudent='" + nameOfStudent + '\'' +
                ", power=" + power +
                ", transgration=" + transgration +
                '}';
    }

    public void compare(Slytherin Slytherin) {
        if (cunning + determination + ambition + resourcefulness + thirstForPower > Slytherin.getCunning() + Slytherin.getDetermination() + Slytherin.getAmbition() + Slytherin.getResourcefulness() + Slytherin.getThirstForPower()) {
            System.out.println(nameOfStudent + " лучший Гриффиндорец, чем " + Slytherin.getNameOfStudent());
        } else if (cunning + determination + ambition + resourcefulness + thirstForPower < Slytherin.getCunning() + Slytherin.getDetermination() + Slytherin.getAmbition() + Slytherin.getResourcefulness() + Slytherin.getThirstForPower()) {
            System.out.println(Slytherin.getNameOfStudent() + " лучший Гриффиндорец, чем " + nameOfStudent);
        } else {
            System.out.println(Slytherin.getNameOfStudent() + " набрал/а одинаковые баллы с " + nameOfStudent);
        }
    }
}
