/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.shooter;

import edu.wpi.first.wpilibj.templates.OI;
import edu.wpi.first.wpilibj.templates.commands.CommandBase;

/**
 *
 * @author Bill
 */
public class setShootSpeed extends CommandBase {
    
    public setShootSpeed() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        if(OI.increaseincrement_but.get() && FullSpeed.currentspeed < 1)
        {
            FullSpeed.currentspeed += .1;
        }
        else if(OI.decreaseincrement_but.get() && FullSpeed.currentspeed > 0)
        {
            FullSpeed.currentspeed -= .1;
        }
        if(frisbeeShooter.getSpeed() != 0)
        {
            new FullSpeed();
        }
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
