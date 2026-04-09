package lab3.task5;

public class Time implements Comparable<Time> {

    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int compareTo(Time other) {
        if (this.hour != other.hour) {
            return this.hour - other.hour;
        }
        if (this.minute != other.minute) {
            return this.minute - other.minute;
        }
        return this.second - other.second;
    }

    public String toString() {
        return hour + ":" + minute + ":" + second;
    }
}