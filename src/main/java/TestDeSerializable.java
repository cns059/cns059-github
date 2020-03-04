import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * @author chenningshui
 * @date 2020/2/28 15:55
 */
public class TestDeSerializable {
    public static void main(String[] args) {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("C:\\Users\\85114\\Desktop\\Test228\\1.txt"))) {
            Employee o = (Employee) objectInputStream.readObject();
            System.out.println(o.getFirstName());
            System.out.println(o.getLastName());
            System.out.println(o.getConfidentialInfo());
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
