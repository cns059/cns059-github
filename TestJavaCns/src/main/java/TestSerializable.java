import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * @author chenningshui
 * @date 2020/2/28 15:47
 */
public class TestSerializable {
    public static void main(String[] args) {
        Employee employee=new Employee();
        employee.setFirstName("hh");
        employee.setLastName("cc");
        employee.setConfidentialInfo("test");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\85114\\Desktop\\Test228\\1.txt"))) {
            oos.writeObject(employee);
            oos.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
