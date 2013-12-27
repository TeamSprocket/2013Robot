/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.Servo;

/**
 *
 * @author Bill Kwai
 */
//This class handles all the port numbers for electrical components
public class HW 
{
    //Joystick - USB Port 
    public static final int L_JOYSTICK = 1; 
    public static final int R_JOYSTICK = 2; 
    public static final int F310_GAMEPAD = 3;
    
    //drivetrain motors(Module 1, PWM)
    public static final int L_F_DRIVEMOTOR = 1; //left: blue & yellow zip tie
    public static final int R_F_DRIVEMOTOR = 2; //right: blue & orange zip tie
    public static final int L_B_DRIVEMOTOR = 3;
    public static final int R_B_DRIVEMOTOR = 4;
    
    //Climber window motors (Module 1, PWM)
    public static final int L_WINDOWMOTOR = 5;
    public static final int R_WINDOWMOTOR = 6;
    
    //CIM motors on shooter(Module 1, PWM) THESE MAKE THE WHEELS SPIN
    public static final int F_SHOOTERMOTOR = 7;
    public static final int B_SHOOTERMOTOR = 8;
    
    //CAM Gear Motor (Module 1, PWM)
    public static final int CAMMOTOR = 9;
    
    //Snow Blower Motor(Module 1, PWM)
    public static final int SNOWBLOWERMOTOR = 10;
    
    //SERVO motors (Module 1, PWM Ports 9-12) THESE WILL BE ADDED AS NECESSARY!!! Module 2
    public static final int BACKLEFTSTOPPERSERVO = 1;
    public static final int LEFTFEEDERSERVO = 2;
    public static final int BACKRIGHTSTOPPERSERVO = 3;
    public static final int RIGHTFEEDERSERVO = 4;
    public static final int FRONTSTOPPERSERVO = 5;
    public static final int RELOADSERVER = 6;
    
    //POTENTIOMETER FOR CALCULATING SHOOTER ANGLE (Module 1, ANALOG)
    public static final int POTENTIOMETER = 1;
    
    //shooter limit switches (Module 1, Digital Ports 9-10
    public static final int TOP_SHOOTER_LIM_SWITCH = 1; 
    public static final int BOT_SHOOTER_LIM_SWITCH = 2; 
    
    //climber switches
    public static final int LUPClimber_LIM_SWITCH = 3; 
    public static final int RUPClimber_LIM_SWITCH = 5; 
    
    public static final int LDOWN_Climber_LIM_SWITCH = 4; 
    public static final int RDOWN_Climber_LIM_SWITCH = 6; 
    
    //Climb Motors
    public static final int LClimbMotor = 5; 
    public static final int RClimbMotor = 6; 
}
