import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.concurrent.RecursiveTask;

public class MyRecursiveTask extends RecursiveTask {

    private Integer sleepTIme;
    public MyRecursiveTask(Integer sleepTIme) {
        this.sleepTIme = sleepTIme;
    }

    @Override
    protected Object compute() {

        System.out.println("doing:"+sleepTIme+"；begin,now ="+ LocalTime.now());
        try {
            Thread.sleep(sleepTIme);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("doing:"+sleepTIme+"；end,now ="+LocalTime.now());
        return sleepTIme;
    }
}
