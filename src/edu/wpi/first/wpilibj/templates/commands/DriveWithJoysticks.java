/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands;

import com.sun.squawk.util.MathUtils;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.templates.OI;

/**
 *
 * @author DBoticsFRC_2
 */
public class DriveWithJoysticks extends CommandBase {
    
    public DriveWithJoysticks() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        SmartDashboard.putBoolean("Tank Drive:", true);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        chassis.setLeft((OI.JoystickLeft.getTrigger() && OI.JoystickLeft.getY() >= 0.05) ? (MathUtils.pow(OI.JoystickLeft.getY(),2)) * -1
                : ((OI.JoystickLeft.getTrigger() && OI.JoystickLeft.getY() <= -0.05) ? MathUtils.pow(OI.JoystickLeft.getY(),2) : 0));
        chassis.setRight((OI.JoystickRight.getTrigger() && OI.JoystickRight.getY() >= 0.05)? MathUtils.pow(OI.JoystickRight.getY(),2)
                : ((OI.JoystickRight.getTrigger() && OI.JoystickRight.getY() <= -0.05)? MathUtils.pow(OI.JoystickRight.getY(),2) * -1 : 0));
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
        SmartDashboard.putBoolean("Tank Drive:", false);
        chassis.setLeft(0);
        chassis.setRight(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        end();
    }
}
