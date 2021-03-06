/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.shooter;

import edu.wpi.first.wpilibj.templates.OI;
import edu.wpi.first.wpilibj.templates.commands.CommandBase;

/**
 *
 * @author Developer
 */
public class MoveUp extends CommandBase {
    
    public MoveUp() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() 
    {
    
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() 
    {
        frisbeeShooter.moveArm(frisbeeShooter.getBotLim() ? .5 : 0);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() 
    {
         return (OI.moveShooterUp_but.get() ? false : true);
    }

    // Called once after isFinished returns true
    protected void end() {
        frisbeeShooter.moveArm(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
