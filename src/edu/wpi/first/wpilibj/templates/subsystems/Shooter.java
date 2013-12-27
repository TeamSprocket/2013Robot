/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.AnalogChannel;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.HW;
import edu.wpi.first.wpilibj.templates.shooter.stopFrisbee;

/**
 *
 * @author DBoticsFRC_2
 */
public class Shooter extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    Victor camShootMotor, R_cam, F_shootercim, B_shootercim;
    AnalogChannel Pot;
    DigitalInput T_limit, B_limit;
    Servo backLeftStopper = new Servo(2, HW.BACKLEFTSTOPPERSERVO);
    Servo backRightStopper = new Servo(2, HW.BACKRIGHTSTOPPERSERVO);
    Servo frontStopper = new Servo(2, HW.FRONTSTOPPERSERVO);
    Servo leftFeeder = new Servo(2, HW.LEFTFEEDERSERVO);
    Servo rightFeeder = new Servo(2, HW.RIGHTFEEDERSERVO);
    Servo firstLock = new Servo(2, HW.RELOADSERVER);
    
    final double POT_RATIO; 
    
    public Shooter()
    {
        camShootMotor = new Victor(HW.CAMMOTOR);
        F_shootercim = new Victor(HW.F_SHOOTERMOTOR);
        B_shootercim = new Victor(HW.B_SHOOTERMOTOR);
        Pot = new AnalogChannel(HW.POTENTIOMETER);
        T_limit = new DigitalInput (HW.TOP_SHOOTER_LIM_SWITCH);
        B_limit = new DigitalInput (HW.BOT_SHOOTER_LIM_SWITCH);
        
        POT_RATIO = 9.0; //NEEDS TESTING
    }
    
    
    public void leftFeed(double value)
    {
        leftFeeder.set(value);
    }
    
     public void rightFeed(double value)
    {
        rightFeeder.set(value);
    }
    
    public void setBCimSpeed(double speed)
    {
        B_shootercim.set(speed);
    }
    
    public void setBackLeftStopper(double value)
    {
        backLeftStopper.set(value);
    }
    
    public void setBackRightStopper(double value)
    {
        backRightStopper.set(value);
    }
    
    public void setFrontStopper(double value)
    {
        frontStopper.set(value);
    }
    
    public void setFirstLock(double value)
    {
        firstLock.set(value);
    }
    public void setFCimSpeed(double speed)
    {
        F_shootercim.set(speed);
    }
    
    public void moveArm(double speed)
    {
        camShootMotor.set(speed);
    }
    
    public boolean getTopLim()
    {
        return T_limit.get();
    }

    public boolean getBotLim()
    {
        return B_limit.get();
    }
        
    public double getAngle()
    {
        return Pot.getVoltage() * POT_RATIO;
    }
    
    public double getSpeed()
    {
        return F_shootercim.get();
    }
    
    public void incrementSpeed(double value)
    {
        setFCimSpeed(getSpeed() + value);
    }
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
       // setDefaultCommand( new stopFrisbee( ) );
    }
}
