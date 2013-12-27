/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.shooter;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.WaitCommand;
import edu.wpi.first.wpilibj.templates.commands.CommandBase;

/**
 *
 * @author Bill
 */
public class Reload extends CommandBase {
    //angle needed to let frisbee go into the feed placeholder
   
    public Reload() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires( frisbeeShooter );
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        frisbeeShooter.setBackRightStopper(0.8);
        frisbeeShooter.setBackLeftStopper(0);
        frisbeeShooter.setFrontStopper(1);
        Timer.delay(0.2);
        frisbeeShooter.setBackRightStopper(0);
        frisbeeShooter.setBackLeftStopper(1);
        frisbeeShooter.setFrontStopper(0);
        Timer.delay(0.7);
        frisbeeShooter.setBackRightStopper(0.8);
        frisbeeShooter.setBackLeftStopper(0);
        frisbeeShooter.setFrontStopper(1);
        
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
