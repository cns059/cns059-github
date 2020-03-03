import lombok.Data;

@Data
public class Org {

    private String name;
    private Project project;

    @Data
    public static  class  Project{
        private DiscoverCenter discoverCenter;
    }

    @Data
    public static class DiscoverCenter{
        private String discoverName;
    }
    public  static  Org build(String name,String discoverName)
    {
        DiscoverCenter discoverCenter=new DiscoverCenter();
        discoverCenter.setDiscoverName(discoverName);
        Project project=new Project();
        project.setDiscoverCenter(discoverCenter);
        Org org=new Org();
        org.setProject(project);
        org.setName(name);

        return  org;
    }
    private Org(){}
}
