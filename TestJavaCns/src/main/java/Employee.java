import java.io.Serializable;

/**
 * @author chenningshui
 * @date 2020/2/28 15:33
 */
public class Employee implements Serializable {

    private String firstName;
    private String lastName;
    private transient String confidentialInfo;
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getConfidentialInfo() {
        return confidentialInfo;
    }

    public void setConfidentialInfo(String confidentialInfo) {
        this.confidentialInfo = confidentialInfo;
    }
}
