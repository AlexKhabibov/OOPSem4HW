package task1;

public class Entity implements PersonalData{

    private String name;
    private String INN;

    public Entity(String name, String INN) {
        this.name = name;
        this.INN = INN;
    }

    @Override
    public String getInn() {
        return INN;
    }

    @Override
    public String toString() {
        return String.format("%s; %s", name, INN);
    }
}
