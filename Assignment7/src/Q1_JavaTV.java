/* Assignment 7 (100 marks in total; 5% of the final score of this course)
 *
 * Question 1 (40 marks)
    Use java to implement a TV that has many normal functions such as turn on and off, set channels and set volumes, etc.
    Requirements:
    * 1. The channel of a TV is no smaller than 1, and no greater than 120.
    * 2. The volume of a TV is no smaller than 1 and no greater than 7.
    * 3. One should not be able to change channel or volume when the TV is off.
 */

public class Q1_JavaTV {
    int channel = 1; // Default channel is 1
    int volumeLevel = 1; // Default volume level is 1
    boolean on = false; // If on = true, then TV is on. Otherwise, TV is off. By default, TV is off when you get a new TV.

    public Q1_JavaTV() {
        System.out.println("Congrats! You get a new TV!");
    }

    // (5 marks)
    public void turnOn() {
        System.out.println("Turn on tv.");
        on = true;
    }

    // (5 marks)
    public void turnOff() {
        System.out.println("Turn off tv.");
        on = false;
    }

    // (5 marks)
    public void setChannel(int newChannel) {
        System.out.println("Set Channel to: " + newChannel + ".");
        if (on && newChannel >= 1 && newChannel <= 120) {
            channel = newChannel;
        }

    }

    // (5 marks)
    public void setVolume(int newVolumeLevel) {
        System.out.println("Set Volume to: " + newVolumeLevel + ".");
        if (on && newVolumeLevel >= 1 && newVolumeLevel <= 7) {
            volumeLevel = newVolumeLevel;
        }
    }

    // (5 marks)
    public void channelUp() {
        System.out.println("Channel Up.");
        if (on && channel < 120) {
            channel++;
        }

    }

    // (5 marks)
    public void channelDown() {
        System.out.println("Channel Down.");
        if (on && channel > 1) {
            channel--;
        }
    }

    // (5 marks)
    public void volumeUp() {
        System.out.println("Volume Up.");
        if (on && volumeLevel < 7) {
            volumeLevel++;
        }

    }

    // (5 marks)
    public void volumeDown() {
        System.out.println("Volume Down.");
        if (on && volumeLevel > 1) {
            volumeLevel--;
        }

    }

    public String getTVStatus() {
        String status= "";

        if (on==true) {
            status += "Power is On  \t|\t";
            status += "Channel is: " + channel + "\t|\t";
            status += "Volume is: " + volumeLevel + "\t";
        } else{
            status += "Power is Off";
            return status;
        }

        return status;
    }

    public static void main(String arg[]) {
        /* TA may test different functions of the TV here */
        /* The following is just an example of how to test the TV's functions. */
        Q1_JavaTV my_tv = new Q1_JavaTV();
        System.out.println(my_tv.getTVStatus());
        my_tv.turnOn();
        System.out.println(my_tv.getTVStatus());
        my_tv.channelUp();
        System.out.println(my_tv.getTVStatus());
        my_tv.volumeUp();
        System.out.println(my_tv.getTVStatus());
    }
}
