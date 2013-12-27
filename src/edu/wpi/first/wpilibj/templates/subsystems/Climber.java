/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.HW;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.DigitalInput;

/**
 *
 * @author DBoticsFRC_2
 */
public class Climber extends Subsystem 
{
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    Victor LClimb = new Victor(HW.LClimbMotor);
    Victor RClimb = new Victor(HW.RClimbMotor);
    DigitalInput LUP = new DigitalInput(HW.LUPClimber_LIM_SWITCH);
    DigitalInput RUP = new DigitalInput(HW.RUPClimber_LIM_SWITCH);
    DigitalInput LDown = new DigitalInput(HW.LDOWN_Climber_LIM_SWITCH);
    DigitalInput RDown = new DigitalInput(HW.RDOWN_Climber_LIM_SWITCH);
    public Climber()
    {
        
    }

    public void initDefaultCommand() 
    {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void climb (double speed)
    {
        LClimb.set(speed);
        RClimb.set(speed);
    }
    
    public void LUp (double speed)
    {
        LClimb.set(speed);
    }
    public void RUp (double speed)
    {
        RClimb.set(speed);
    }
    public boolean getTheLeftUpSwitch()
    {
        return LUP.get();
    }
    public boolean getTheRightUpSwitch()
    {
        return RUP.get();
    }
    
    public boolean getTheLeftDownSwitch()
    {
        return LDown.get();
    }
    public boolean getTheRightDownSwitch()
    {
        return RDown.get();
    }
}
