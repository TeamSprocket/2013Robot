/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates;

import edu.wpi.firs.wpilibj.templates.Autonomous.AutonomousFire;
import edu.wpi.first.wpilibj.templates.Climber.LClimbDown;
import edu.wpi.first.wpilibj.templates.Climber.LClimbUp;
import edu.wpi.first.wpilibj.templates.Climber.RClimbDown;
import edu.wpi.first.wpilibj.templates.Climber.RClimbUp;
import edu.wpi.first.wpilibj.templates.commands.DriveWithJoysticks;
import edu.wpi.first.wpilibj.templates.commands.MoveWithGamepad;

import edu.wpi.first.wpilibj.templates.Climber.pyramidClimbDown;
import edu.wpi.first.wpilibj.templates.Climber.pyramidClimbUp;
import edu.wpi.first.wpilibj.templates.shooter.AccelerateSpeed;
import edu.wpi.first.wpilibj.templates.shooter.singleShoot;
import edu.wpi.first.wpilibj.templates.shooter.EndShooting;
import edu.wpi.first.wpilibj.templates.shooter.FrisbeeReload;
import edu.wpi.first.wpilibj.templates.shooter.FullSpeed;
import edu.wpi.first.wpilibj.templates.shooter.MoveDown;
import edu.wpi.first.wpilibj.templates.shooter.MoveUp;
import edu.wpi.first.wpilibj.templates.shooter.Reload;
import edu.wpi.first.wpilibj.templates.shooter.StandBy;

/**
 *
 * @author DBoticsFRC_2
 */
public class Init 
{
    //initializes autonomous
    public static final AutonomousFire autonomousCommand = new AutonomousFire();
    
    //initializes tank drive
    public static final DriveWithJoysticks driveLikeTank = new DriveWithJoysticks();
    
    //initialize moving with gamepad
    public static final MoveWithGamepad useGampad = new MoveWithGamepad();
    
    //initializes full speed shooter speed
    public static final FullSpeed fullSpeedShooting = new FullSpeed();
    
    //initializes standBy speed shooter speed
    public static final StandBy standByShooting = new StandBy();
    
   //initializes end shooting speed
    public static final EndShooting endShootingMotor = new EndShooting();
    
    //moves the shooter up
    public static final MoveUp moveShooterUp = new MoveUp();
    
    //moves the shooter down
    public static final MoveDown moveShooterDown = new MoveDown();
    
    //moves the left side climber down
    public static final LClimbDown moveLClimbDown = new LClimbDown();
    
    //moves the left side climber up
    public static final LClimbUp moveLClimbUp = new LClimbUp();
    
    //moves the right side climber down
    public static final RClimbDown moveRClimbDown = new RClimbDown();
    
    //moves the right side climber up
    public static final RClimbUp moveRClimbUp = new RClimbUp();
    
    

     
     public static final singleShoot shoot = new singleShoot();
     
     public static final pyramidClimbUp climbingUp = new pyramidClimbUp();
     public static final pyramidClimbDown climbingDown = new pyramidClimbDown();
     
     public static final FrisbeeReload reload = new FrisbeeReload();
     
     public static final Reload reloadToggle = new Reload();
     
     public static final AccelerateSpeed accelerate = new AccelerateSpeed();
    
}
