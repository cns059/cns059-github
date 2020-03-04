public class TestJava8Optional {

//     private Org org;
//     @Before
//     public void init(){
//          org=Org.build("Alibaba","Nacos") ;
//     }

//     @Test
//     public void testIfElse()
//     {
//          if(null!=org)
//          {
//               Org.Project project = org.getProject();
//
//
//               if(null!=project)
//               {
//                    Org.DiscoverCenter discoverCenter = project.getDiscoverCenter();
//                    if (null!=discoverCenter){
//                         String discoverName = discoverCenter.getDiscoverName();
//                         System.out.println(discoverName);
//                         return;
//                    }
//               }
//          }
//          throw new IllegalArgumentException("Invalid Object");
//     }


     /*public static void  main(String [] args){
          Org org;
          org=Org.build("Alibaba","Nacos") ;
          String s=Optional.ofNullable(org)
                  .map(o->o.getProject())
                  .map(p->p.getDiscoverCenter())
                  .map(d->d.getDiscoverName())
                  .orElseThrow(()->new IllegalArgumentException("Invalid Object"));
          System.out.println(s);
     }*/
}
