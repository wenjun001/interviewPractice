package Java_interveiw.pc1;

import java.util.concurrent.*;

/**
 * Created by xiu on 5/15/17.
 */
public class Main {


    public static void main(String[] args) {
        BlockingQueue<Long> bq = new LinkedBlockingQueue();
        BlockingQueue<PrimeRes> resQueue = new LinkedBlockingQueue();
        Randomizer randomizer = new Randomizer(bq, resQueue);
        PrimeCheck primeCheck = new PrimeCheck(bq, resQueue);
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.submit(new RandomizerSendLongJob(randomizer));
        executorService.submit(new PrandomizerPritnerJob(randomizer));
        executorService.submit(new PrimeCheckJob(primeCheck));

    }



}
class RandomizerSendLongJob implements Runnable {

    private Randomizer r;

    public RandomizerSendLongJob(Randomizer r) {
        this.r = r;
    }

    public void run() {
        r.putLongToQueue();
    }
}

class PrandomizerPritnerJob implements Runnable {

    private Randomizer r;

    public PrandomizerPritnerJob(Randomizer r) {
        this.r = r;
    }

    public void run() {
        r.printRes();
    }
}

class PrimeCheckJob implements Runnable {
    PrimeCheck primeCheck;

    public PrimeCheckJob(PrimeCheck primeCheck) {
        this.primeCheck = primeCheck;
    }

    public void run() {
        primeCheck.doCheck();
    }
}


