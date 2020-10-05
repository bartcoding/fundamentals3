package be.intecbrussel.robot;

public abstract class Robot {
    private String unitName;

    public Robot(){
        unitName = "namelessRobot";
        boot();
    }
    public Robot(String unitName){
        this.unitName = unitName;
        boot();
    }

    public void boot(){
        System.out.println("robot is booting! robotName: " + unitName);
    }

    public String getUnitName(){
        return unitName;
    }


}
