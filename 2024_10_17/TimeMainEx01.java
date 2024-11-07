class Time {
    public int hour;
    public int minute;
    public int second;

    // 생성자 (멤버 필드 초기화)
    public Time(int hour, int minute, int second) {
        // this.hour = hour;
        // this.minute = minute;
        // this.second = second;

        this.setHour(20);
        this.setMinute(20);
        this.setSecond(20);
    }

    // setter/getter
    // 룰 - 문법
    public void setHour(int hour) {
        // this.hour = hour;

        if (hour < 0 || hour >= 24) {
            hour = 0;
        } else {
            this.hour = hour;
        }
    }

    public void setMinute(int minute) {
        // 0 < 분 < 60
        if (minute < 0 || minute >= 60) {
            minute = 0;
        } else {
            this.minute = minute;
        }
    }

    public void setSecond(int second) {
        // 0 < 초 < 60
        if (second < 0 || second >= 60) {
            second = 0;
        } else {
            this.second = second;
        }
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }
}

public class TimeMainEx01 {
    public static void main(String[] args) {
        // Time t = new Time();
        Time t = new Time(10, 10, 10);

        // 잘못된 데이터 입력
        // t.hour = 25;
        // t.minute = 70;
        // t.second = 100;

        // System.out.println(t.hour + " 시");
        // System.out.println(t.minute + " 분");
        // System.out.println(t.second + " 초");

        // t.setHour(12);
        // t.setMinute(40);
        // t.setSecond(60);

        System.out.println(t.getHour());
        System.out.println(t.getMinute());
        System.out.println(t.getSecond());
    }
}