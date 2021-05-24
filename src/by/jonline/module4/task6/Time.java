package by.jonline.module4.task6;

import java.util.Objects;

/* Составьте описание класса для представления времени.
Предусмотрте возможности установки времени и изменения его отдельных полей (час, минута, секунда)
 с проверкой допустимости вводимых значений.
 В случае недопустимых значений полей поле устанавливается в значение 0.
 Создать методы изменения времени на заданное количество часов, минут и секунд.
  */
public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public void showTime() {
        String DELIMETER = ":";
        System.out.println("Текущее время" + " " + hours + DELIMETER + minutes + DELIMETER + seconds);
    }

    public void addMinutes(int minutes) {
        if ((60 - this.minutes) > minutes) {
            this.minutes += minutes;
        } else if ((60 - this.minutes) == minutes) {
            this.minutes = 0;
            addHours(1);
        } else if ((60 - this.minutes) < minutes) {
            this.minutes = (this.minutes + minutes) % 60;
            addHours((this.minutes + minutes) / 60);
        }
    }

    public void addSeconds(int seconds) {
        if ((60 - this.seconds) > seconds) {
            this.seconds += seconds;
        } else if ((60 - this.seconds) == seconds) {
            this.seconds = 0;
            addMinutes(1);
        } else if ((60 - this.seconds) < seconds) {
            this.seconds = (this.seconds + seconds) % 60;
            addMinutes((this.seconds + seconds) / 60);
        }
    }


    public void addHours(int hours) {
        if ((24 - this.hours) > hours) {
            this.hours += hours;
        } else if ((24 - this.hours) == hours) {
            this.hours = 0;
        } else if ((24 - this.hours) < hours) {
            this.hours = (this.hours + hours) % 24;
        }
    }

    public void setHours(int hours) {
        if (hours < 0 || hours > 24) {
            this.hours = 0;
        } else {
            this.hours = hours;
        }
    }

    public void setMinutes(int minutes) {
        if (minutes < 0 || minutes > 60) {
            this.minutes = 0;
        } else {
            this.minutes = minutes;
        }
    }

    public void setSeconds(int seconds) {
        if (seconds < 0 || seconds > 60) {
            this.seconds = 0;
        } else {
            this.seconds = seconds;
        }
    }

    Time(int hours, int minutes, int seconds) {
        if (hours < 0 || hours > 24) {
            this.hours = 0;
        } else {
            this.hours = hours;
        }
        if (minutes < 0 || minutes > 60) {
            this.minutes = 0;
        } else {
            this.minutes = minutes;
        }
        if (seconds < 0 || seconds > 60) {
            this.seconds = 0;
        } else {
            this.seconds = seconds;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Time time = (Time) o;
        return hours == time.hours &&
                minutes == time.minutes &&
                seconds == time.seconds;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hours, minutes, seconds);
    }
}
