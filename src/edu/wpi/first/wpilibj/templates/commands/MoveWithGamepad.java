/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.templates.HW;
import edu.wpi.first.wpilibj.templates.OI;

/**
 *
 * @author DBoticsFRC_2
 */
public class MoveWithGamepad extends CommandBase {
    
    
    public MoveWithGamepad() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
       // requires(frisbeeShooter);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
       // SmartDashboard.putBoolean("Shooter: ", true);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        //frisbeeShooter.moveArm(((OI.moveShooterUp_but.get() && frisbeeShooter.getTopLim()) ? 1 : 0));
        //frisbeeShooter.moveArm(((OI.moveShooterDown_but.get() && frisbeeShooter.getBotLim()) ? -0.5 : 0));
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() 
    {
        return true;
       // return (OI.moveShooterUp_but.get() || OI.moveShooterDown_but.get()) ? false : true;
    }

    // Called once after isFinished returns true
    protected void end() {
       // frisbeeShooter.moveArm(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
