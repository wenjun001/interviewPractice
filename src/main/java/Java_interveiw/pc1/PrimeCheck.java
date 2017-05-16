package Java_interveiw.pc1;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/**
 * Created by xiu on 5/15/17.
 */
public class PrimeCheck {

    private Map<Integer, Boolean> cache = new HashMap();
    private BlockingQueue bq;
    private BlockingQueue<PrimeRes> resQueue;

    public PrimeCheck(BlockingQueue bq, BlockingQueue<PrimeRes> resQueue) {
        this.bq = bq;
        this.resQueue = resQueue;
    }

    public  boolean isPrime(int n) {
        if (n%2==0) return false;
        for(int i=3;i*i<=n;i+=2) {
            if(n%i==0)
                return false;
        }
        return true;
    }

    public void doCheck(){
        while(true) {
            try {
                Boolean res;
                Integer l = (Integer) bq.take();
                if (cache.containsKey(l)) {
                    res = cache.get(l);
                } else {
                    res = isPrime(l);
                    cache.put(l, res);
                }
                resQueue.put(new PrimeRes(l, res));

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
