import org.junit.Test;

public class ArraySplitTest {


    @Test
    public void testSplit(){
        String testString="a,b,c,,";
        String [] str=testString.split(",",-1);
        for(int i=0;i<str.length;i++)
        {
            System.out.println(str[i]);
        }
        System.out.println(str.length);
    }
}
