public class Gryffindor extends hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String nameOfStudent, int power, int transgration, int nobility, int honor, int bravery) {
        super(nameOfStudent, power, transgration);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return "Gryffindor{" + "nobility=" + nobility + ", honor=" + honor + ", bravery=" + bravery + ", nameOfStudent='" + nameOfStudent + '\'' + ", power=" + power + ", transgration=" + transgration + '}';
    }

    public void compare(Gryffindor Gryffindor) {
        if (nobility + honor + bravery > Gryffindor.getNobility() + Gryffindor.getHonor() + Gryffindor.getBravery()) {
            System.out.println(nameOfStudent + " лучший Гриффиндорец, чем " + Gryffindor.getNameOfStudent());
        } else if (nobility + honor + bravery < Gryffindor.getNobility() + Gryffindor.getHonor() + Gryffindor.getBravery()) {
            System.out.println(Gryffindor.getNameOfStudent() + " лучший Гриффиндорец, чем " + nameOfStudent);
        } else {
            System.out.println(Gryffindor.getNameOfStudent() + " набрал/а одинаковые баллы с " + nameOfStudent);
        }
    }

}
