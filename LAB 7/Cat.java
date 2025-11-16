public class Cat extends Animal {
    private boolean hasClaws;

    public Cat(String name, int age, boolean hasClaws) {
        super(name, age);
        this.hasClaws = hasClaws;
    }

    @Override
    public String getDetails() {

        String clawsStatus;

        if (hasClaws) {
            clawsStatus = "Yes";
            } else {
                 clawsStatus = "No";

        }        return super.getDetails() + ", Has Claws: " + clawsStatus;
    }
}