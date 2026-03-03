package lab.t5;

import java.util.Vector;
import java.util.Scanner;

enum Gender {
    BOY, GIRL
}

class Person {
    private final Gender gender;

    public Person(Gender gender) {
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return (gender == Gender.BOY) ? "B" : "G";
    }
}

class DragonLaunch {
    private final Vector<Person> kidnapped = new Vector<>();

    public void kidnap(Person p) {
        kidnapped.add(p);
    }

    public boolean willDragonEatOrNot() {
        int top = -1;

        for (int i = 0; i < kidnapped.size(); i++) {
            Person cur = kidnapped.get(i);

            if (top >= 0) {
                Person last = kidnapped.get(top);
                if (last.getGender() == Gender.BOY && cur.getGender() == Gender.GIRL) {
                    top--; 
                    continue;
                }
            }

            top++;
            kidnapped.set(top, cur);
        }

        kidnapped.setSize(top + 1);
        return kidnapped.size() > 0;
    }

    public int size() {
        return kidnapped.size();
    }

    public String remainingAsString() {
        StringBuilder sb = new StringBuilder();
        for (Person p : kidnapped) sb.append(p.toString());
        return sb.toString();
    }
}

public class kidnap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine().trim().toUpperCase();

        DragonLaunch dl = new DragonLaunch();

        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if (c == 'B') dl.kidnap(new Person(Gender.BOY));
            else if (c == 'G') dl.kidnap(new Person(Gender.GIRL));
        }

        boolean willEat = dl.willDragonEatOrNot();

        System.out.println("Will dragon eat? " + willEat);
        System.out.println("Remaining count: " + dl.size());
        System.out.println("Remaining line: " + dl.remainingAsString());
    }
}