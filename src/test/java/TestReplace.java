import org.junit.Test;

/**
 * @author chenningshui
 * @date 2020/3/2 9:41
 */
public class TestReplace {
    @Test
    public void test(){
//        String str="my.test.txt";
//        System.out.println(str.replace(".","#"));
//        System.out.println(str.replaceAll(".","#"));
//        System.out.println(str.replaceFirst("\\.","#"));
////        System.out.println(str.replaceAll("^","g"));
//        System.out.println(str.re);
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("my.test.txt");
        stringBuilder.replace(7,8,"#");
        System.out.println(stringBuilder.toString());
    }

    @Test
    public  void testTime(){
        String testStr="a";
        //Test StringBuilder start
        long stringBuilderStartTime=System.currentTimeMillis();
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append(testStr);
        for(int i=0;i<50000;i++)
        {
            stringBuilder.append(testStr);
        }
        long stringBuilderEndTime=System.currentTimeMillis();
        System.out.println("StringBuilder cost:"+(stringBuilderEndTime-stringBuilderStartTime));
        //Test StringBuilder end
        //Test StringBuffer start
        long stringBufferStartTime=System.currentTimeMillis();
        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer.append(testStr);
        for(int i=0;i<50000;i++)
        {
            stringBuffer.append(testStr);
        }
//        System.out.println(stringBuffer.toString());
        long stringBufferEndTime=System.currentTimeMillis();
        System.out.println("StringBuffer cost:"+(stringBufferEndTime-stringBufferStartTime));
        //Test StringBuffer end
        //Test concat start
        long concatStartTime=System.currentTimeMillis();
        String concatStr=testStr;
        for (int i=0;i<50000;i++)
        {
            concatStr=concatStr.concat(testStr);
        }
//        System.out.println(concatStr);
        long concatEndTime=System.currentTimeMillis();
        System.out.println("Concat cost："+(concatEndTime-concatStartTime));
        //Test concat end
        //Test + start
        long addStartTime=System.currentTimeMillis();
        String addStr=testStr;
        for(int i=0;i<50000;i++){
            addStr+=testStr;
        }
        long addEndTime=System.currentTimeMillis();
        System.out.println("+ cost: "+(addEndTime-addStartTime));
        //Test + end
        //Test join start
//        long joinStartTime=System.currentTimeMillis();
//        List joinList=new ArrayList<String>();
//        joinList.add(testStr);
//        String result="";
//        for (int i=0;i<50000;i++)
//        {
//            result=StringUtils.join(joinList,testStr);
//        }
//        System.out.println(result);
//        long joinEndTime=System.currentTimeMillis();
//        System.out.println("join cost:"+(joinEndTime-joinStartTime));
        //Test join end





    }
}
