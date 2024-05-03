
class InvalidHourException extends Exception {
    InvalidHourException(String message) {
        super(message);
    }
}

class InvalidMinuteException extends Exception {
    InvalidMinuteException(String message) {
        super(message);
    }
}

class InvalidSecondException extends Exception {
    InvalidSecondException(String message) {
        super(message);
    }
}


class Time {
    
    private int hours;
    private int minutes;
    private int seconds;

    public void setTime(int hours, int minutes, int seconds) throws InvalidHourException, InvalidMinuteException, InvalidSecondException {
        if (hours < 0 || hours > 24) {
            throw new InvalidHourException("hour is not greater than 24");
        }
        if (minutes < 0 || minutes > 60) {
            throw new InvalidMinuteException("minute is not greater than 60");
        }
        if (seconds < 0 || seconds > 60) {
            throw new InvalidSecondException("second is not greater than 60");
        }
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void displayTime() {
        System.out.println("Correct Time -> " + hours + ":" + minutes + ":" + seconds);
    }
}

public class q4 {
    public static void main(String[] args) {
        Time time = new Time();
        try {
            time.setTime(30, 65, 65);
            time.displayTime();
        } catch (InvalidHourException | InvalidMinuteException | InvalidSecondException e) {
            System.out.println("Caught the exception");
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}
