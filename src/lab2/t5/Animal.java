package lab2.t5;

import java.util.Objects;

public abstract class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract String getSound();

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                "{name='" + name + "', age=" + age +
                ", sound='" + getSound() + "'}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal animal)) return false;
        return age == animal.age &&
                Objects.equals(name, animal.name) &&
                Objects.equals(getClass(), animal.getClass());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, getClass());
    }
}
