/**
 * @author chenningshui
 * @date 2020/2/26 9:42
 */
public class TestForOS {
    public static void main(String[] args) {
//        System.out.println(System.getProperty("os.name"));

        String strbefore="E:\\IdeaNewlandProject\\mobile_web\\src\\main\\java\\com\\nl\\edc\\bigdata\\mobile\\app\\resource\\anticipation\\action\\ResourceAnticipationController.java";
        String strafter=strbefore.replaceAll("\\\\","/");
        System.out.println(strafter);
//        String testBug=null;
//        System.out.println(testBug.length());
    }

}
