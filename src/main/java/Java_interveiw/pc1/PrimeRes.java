package Java_interveiw.pc1;

/**
 * Created by xiu on 5/15/17.
 */
public class PrimeRes{
    private Integer data;
    private Boolean isPrime;

    public PrimeRes(Integer data, Boolean isPrime) {
        this.data = data;
        this.isPrime = isPrime;
    }

    @Override
    public String toString() {
        return "PrimeRes{" +
                "original data =" + data +
                ", isPrime:" + isPrime +
                '}';
    }

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    public Boolean getPrime() {
        return isPrime;
    }

    public void setPrime(Boolean prime) {
        isPrime = prime;
    }
}
