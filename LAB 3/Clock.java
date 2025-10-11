import java.util.Calendar;

public class Clock {
    
public static void main(String[] args) {
   
    Calendar Cal = Calendar.getInstance();
    Time t = new Time(Cal.get(Calendar.HOUR_OF_DAY), Cal.get(Calendar.MINUTE));

    System.out.println(t.toString());

    long startTime = System.currentTimeMillis();
    long currentTime = startTime;
    int oldMin = Cal.get(Calendar.MINUTE);
    int newMin = oldMin;
    while(newMin == oldMin) {
        while((currentTime - startTime) < 1000) 
        {
            currentTime = System.currentTimeMillis();
        }
        t.tick();
        System.out.println(t.toString());
        newMin = t.getMinute();
        startTime = System.currentTimeMillis();
        currentTime = startTime;
    }

}

}
