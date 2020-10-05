package be.intecbrussel.robot;

public class BendingRobot extends Robot {

    private double maxBendAngle;

    public BendingRobot(double maxBendAngle, String unitName){
        super(unitName);
        this.maxBendAngle = maxBendAngle;
    }

    public void bend(double bendAngle){
        if(bendAngle>maxBendAngle){
            System.out.println("fout! de gevraagde hoek is groter dan de maximaal buigbare hoek!");
        }
        else {
            System.out.println("het buigen is gelukt, buighoek: " + bendAngle);
        }

    }

}
