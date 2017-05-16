package Java_interveiw.pc1.pc2;

/**
 * Created by xiu on 5/15/17.
 */
public class Person {
    private long id;
    private String name;
    private String phone;
    private String address;

    public Person(long id, String name, String phone,String address ) {
        this.address = address;
        this.id = id;
        this.name = name;
        this.phone = phone;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        return id == person.id;

    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name=" + name +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
