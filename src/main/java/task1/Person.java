package task1;

public class Person implements PersonalData{

    private String FIO;
    private String INN;

    public Person(String FIO, String INN) {
        this.FIO = FIO;
        this.INN = INN;
    }

    public String getFIO() {
        return FIO;
    }

    @Override
    public String getInn() {
        return INN;
    }

    @Override
    public String toString() {
        return String.format("%s; %s", FIO, INN);
    }
}
