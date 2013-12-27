/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.shooter;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

/**
 *
 * @author Developer
 */
public class tripleShoot extends CommandGroup {
    //time it takes to feed
    int feedTime = 2;
    //time it takes to shoot
    int shootTime = 2;
    
    public tripleShoot() {
        //feed frisbee
       /* addSequential(new moveFeederForward());
        addSequential(new WaitCommand(feedTime));
        addSequential(new moveFeederBack());
        addSequential(new WaitCommand(feedTime));
        addSequential(new endFeeder());
        //shoot frisbee
        addSequential(new FullSpeed());
        addSequential(new WaitCommand(shootTime));
        //feed and shoot second frisbee
        addSequential(new moveFeederForward());
        addSequential(new WaitCommand(feedTime));
        addSequential(new moveFeederBack());
        addSequential(new WaitCommand(feedTime));
        addSequential(new endFeeder());
        //feed and shoot third frisbee
        addSequential(new moveFeederForward());
        addSequential(new WaitCommand(feedTime));
        addSequential(new moveFeederBack());
        addSequential(new WaitCommand(feedTime));
        addSequential(new endFeeder());
        addSequential(new EndShooting());*/
        
  
        
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
