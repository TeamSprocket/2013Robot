/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.firs.wpilibj.templates.Autonomous;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;
import edu.wpi.first.wpilibj.templates.shooter.AccelerateSpeed;
import edu.wpi.first.wpilibj.templates.shooter.EndShooting;
import edu.wpi.first.wpilibj.templates.shooter.FirstLockOn;
import edu.wpi.first.wpilibj.templates.shooter.SecondLockOn;
import edu.wpi.first.wpilibj.templates.shooter.singleShoot;

/**
 *
 * @author Bill
 */
public class AutonomousFire extends CommandGroup {
    
    public AutonomousFire() {
    //shoot first frisbee
        //turn on shooter motors
        /*addSequential(new stopFrisbee());
        addSequential(new FullSpeed());
        addSequential(new WaitCommand(4));
        //feed first frisbee in
        addParallel(new leftFeederForward());
        addSequential(new rightFeederForward());
        addSequential(new WaitCommand(0.5));
        addParallel(new leftFeederBack());
        addSequential(new rightFeederBack());
        //shoot second frisbee
        //reload second frisbee
        addSequential( new Reload( ) );
        addSequential(new WaitCommand(2));
        addSequential( new Reload( ) );
        //feed second frisbee
        addSequential(new WaitCommand(3));
        addParallel(new leftFeederForward());
        addSequential(new rightFeederForward());
        addSequential(new WaitCommand(.5));
        addParallel(new leftFeederBack());
        addSequential(new rightFeederBack());
        //put shooter motors on standby
        //addSequential(new StandBy());*/
        
        //addSequential(new AccelerateSpeed());
        //addSequential(new WaitCommand(7));
        /*addSequential(new leftFeederForward());
        addSequential(new WaitCommand(0.1));
        addSequential(new rightFeederForward());
        addSequential(new WaitCommand(1));
        addSequential(new leftFeederBack());
        addSequential(new rightFeederBack());
        addSequential(new WaitCommand( .5 ));
        
        addSequential(new FrisbeeReload());
        addSequential(new WaitCommand(1));
        addSequential(new leftFeederForward());
        addSequential(new WaitCommand(0.1));
        addSequential(new rightFeederForward());
        addSequential(new WaitCommand(1));
        addSequential(new leftFeederBack());
        addSequential(new rightFeederBack());
        addSequential(new WaitCommand(1));
        
        addSequential(new SecondLockOff());
        addSequential(new WaitCommand(0.7));
        addSequential(new SecondLockOn());
        addSequential(new leftFeederForward());
        addSequential(new WaitCommand(0.1));
        addSequential(new rightFeederForward());
        addSequential(new WaitCommand(1));
        addSequential(new StandBy());
        addSequential(new leftFeederBack());
        addSequential(new rightFeederBack());*/
        
        addParallel(new SecondLockOn());
        addSequential(new FirstLockOn());
        addSequential(new AccelerateSpeed());
        addSequential(new WaitCommand(7));
        addSequential(new singleShoot());
        addSequential(new singleShoot());
        addSequential(new singleShoot());
        addSequential(new EndShooting());
        
        
        
        
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    }
}
