/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.HW;

/**
 *
 * @author DBoticsFRC_2
 */
public class DriveTrain extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    //Motor Controllers
    private Victor LFsideMotor, RFsideMotor, LBsideMotor, RBsideMotor;
    
    //Encoders
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public DriveTrain()
    {
        this.setJaguars();
    }
    
    private void setJaguars()
    {
        LFsideMotor = new Victor(HW.L_F_DRIVEMOTOR);
        RFsideMotor = new Victor(HW.R_F_DRIVEMOTOR);
        LBsideMotor = new Victor(HW.L_B_DRIVEMOTOR);
        RBsideMotor = new Victor(HW.R_B_DRIVEMOTOR);
    }
    
    public void setLeft(double speed)
    {
        LFsideMotor.set(speed);
        LBsideMotor.set(speed);
    }
    
    public void setRight(double speed)
    {
        RFsideMotor.set(speed);
        RBsideMotor.set(speed);
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}
