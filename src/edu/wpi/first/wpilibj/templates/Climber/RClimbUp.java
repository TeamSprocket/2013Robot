/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.Climber;

import edu.wpi.first.wpilibj.templates.OI;
import edu.wpi.first.wpilibj.templates.commands.CommandBase;

/**
 *
 * @author Developer
 */
public class RClimbUp extends CommandBase {
    
    public RClimbUp() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() 
    {
            Rocky.RUp(Rocky.getTheRightUpSwitch() ? .5 : 0);//window motor reverse polarity
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        //return (OI.climbUpRight_but.get() ? false : true);\
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
        Rocky.RUp(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        Rocky.RUp(0);
    }
}
