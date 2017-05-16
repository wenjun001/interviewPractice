package Java_interveiw.pc1.pc2;

import java.util.HashMap;

/**
 * Created by xiu on 5/15/17.
 */
public class DBUtil {

    public static Person loadPersonFromDB(int id){
        if(!db.containsKey(id)){
            return null;
        }else{
            return db.get(id);
        }
    }

    static HashMap<Integer,Person> db;
    static{
        db = new HashMap<Integer, Person>();
        db.put(1,new Person(1l,"wenjun","400-444-4444","CA"));

    }

    public static void main(String[] args) {
        System.out.println(loadPersonFromDB(1));
    }
}
