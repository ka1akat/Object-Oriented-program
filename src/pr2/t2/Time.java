package pr2.t2;

public class Time {
	private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {

        if (hour >= 0 && hour < 24)
            this.hour = hour;
        else
            this.hour = 0;

        if (minute >= 0 && minute < 60)
            this.minute = minute;
        else
            this.minute = 0;

        if (second >= 0 && second < 60)
            this.second = second;
        else
            this.second = 0;
    }

    public String toUniversal() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public String toStandard() {
        int stdHour;
        String period;

        if (hour == 0) {
            stdHour = 12;
            period = "AM";
        } else if (hour < 12) {
            stdHour = hour;
            period = "AM";
        } else if (hour == 12) {
            stdHour = 12;
            period = "PM";
        } else {
            stdHour = hour - 12;
            period = "PM";
        }

        return String.format("%02d:%02d:%02d %s", stdHour, minute, second, period);
    }

    public void add(Time t2) {
        this.second = this.second + t2.second;

        this.minute = this.minute + (this.second / 60);
        this.second = this.second % 60;

        this.minute = this.minute + t2.minute;

        this.hour = this.hour + (this.minute / 60);
        this.minute = this.minute % 60;

        this.hour = this.hour + t2.hour;

        this.hour = this.hour % 24;
    }


}
