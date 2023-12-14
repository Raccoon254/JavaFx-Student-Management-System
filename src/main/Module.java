package main;
import java.util.Map;
public class Module {
    private int moduleId;
    private String moduleName;
    private int credits;
    private Course associatedCourse;
    private Map<Integer, Material> weeklyMaterials;

    public void updateModuleInfo(String info) {
        // Implement update module info logic
    }

    public void addMaterial(int week, Material material) {
        // Implement add material logic
    }

    public String displayModuleDetails() {
        // Implement display module details logic
        return null;
    }
}