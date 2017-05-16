package Java_interveiw.pc1;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

/**
 * Created by xiu on 5/15/17.
 */
public class Randomizer {

    private BlockingQueue bq;
    private BlockingQueue<PrimeRes> resQueue;
    private Random r = new Random();

    public Randomizer(BlockingQueue bq, BlockingQueue<PrimeRes> resQueue) {
        this.bq = bq;
        this.resQueue = resQueue;
    }

    private Integer generateRandomInteger(){
        return r.nextInt(Integer.MAX_VALUE);
    }

    public void putLongToQueue(){
        while(true) {
            try {
                bq.put(generateRandomInteger());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void printRes(){
        while (true) {
            try {
                System.out.println(resQueue.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
