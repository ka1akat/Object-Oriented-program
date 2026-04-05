package lab2.t5;

import java.util.Objects;

public abstract class Person {
    protected String name;
    protected int age;
    protected Animal pet;
    protected Animal transferredPet; 

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void assignPet(Animal pet) {
        if (this.pet != null) {
            throw new IllegalArgumentException(name + " already has a pet.");
        }
        if (!canTakePet(pet)) {
            throw new IllegalArgumentException(name + " cannot take this pet: " + pet.getClass().getSimpleName());
        }
        this.pet = pet;
    }

    public void removePet() {
        this.pet = null;
    }

    public boolean hasPet() {
        return pet != null;
    }

    protected boolean canTakePet(Animal pet) {
        return true;
    }

    public void leavePetWith(Person caretaker) {
        if (this.pet == null) {
            throw new IllegalStateException(name + " has no pet to leave.");
        }
        if (caretaker.hasPet()) {
            throw new IllegalStateException(caretaker.name + " already has a pet.");
        }
        if (!caretaker.canTakePet(this.pet)) {
            throw new IllegalArgumentException(caretaker.name + " cannot take this pet.");
        }

        transferredPet = this.pet;
        caretaker.assignPet(this.pet);
        this.pet = null;
    }

    public void retrievePetFrom(Person caretaker) {
        if (transferredPet == null) {
            throw new IllegalStateException(name + " has no transferred pet to retrieve.");
        }
        if (caretaker.pet == null || !caretaker.pet.equals(transferredPet)) {
            throw new IllegalStateException(caretaker.name + " is not taking care of " + name + "'s pet.");
        }
        if (this.pet != null) {
            throw new IllegalStateException(name + " already has a pet.");
        }

        this.pet = transferredPet;
        caretaker.removePet();
        transferredPet = null;
    }

    public Animal getPet() {
        return pet;
    }

    public abstract String getOccupation();

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                "{name='" + name + '\'' +
                ", age=" + age +
                ", occupation='" + getOccupation() + '\'' +
                ", pet=" + (pet == null ? "no pet" : pet.toString()) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return age == person.age &&
                Objects.equals(name, person.name) &&
                Objects.equals(getClass(), person.getClass());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, getClass());
    }
}
