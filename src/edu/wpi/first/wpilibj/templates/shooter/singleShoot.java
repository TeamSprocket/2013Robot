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
public class singleShoot extends CommandGroup {
    //time it takes to feed;
    int feedTime = 1;
    
    public singleShoot() 
    {
        //feed frisbee
        addSequential(new leftFeederForward());
        addSequential(new WaitCommand(0.1));
        addSequential(new rightFeederForward());
        addSequential(new WaitCommand(feedTime));
        addSequential(new leftFeederBack());
        addSequential(new rightFeederBack());
        addSequential(new WaitCommand( .5 ));
        addSequential(new FrisbeeReload());
        //shoot a frisbee
       
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
