package Humans;

public record HumanData(String name, Sex sex) {
    public HumanData(String name, Sex sex) {
        this.sex = sex;
        this.name = name;
    }
}
