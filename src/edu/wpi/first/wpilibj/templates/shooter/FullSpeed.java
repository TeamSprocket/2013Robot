/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.shooter;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.templates.commands.CommandBase;


/**
 *
 * @author DBoticsFRC_2
 */
public class FullSpeed extends CommandBase {
    public static final double MAXCIMSPEED = .7;
    public static final double MINCIMSPEED = .3;
    public static double currentspeed = .5;
    
    public FullSpeed() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
       frisbeeShooter.setFCimSpeed(.65);
       frisbeeShooter.setBCimSpeed(-1);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
        SmartDashboard.putString("Shooter: ", "Fullspeed");
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
