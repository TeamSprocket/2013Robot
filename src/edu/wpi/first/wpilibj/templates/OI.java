
package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI 
{
    //The joysticks and the gamepad for our robot
    public static final Joystick JoystickLeft = new Joystick(HW.L_JOYSTICK);
    public static final Joystick JoystickRight = new Joystick(HW.R_JOYSTICK);
    public static final Joystick Gamepad = new Joystick(HW.F310_GAMEPAD);
    
    //Button port declarations for the gamepad
    public static final int X_Button = 1;
    public static final int A_Button = 2;
    public static final int B_Button = 3;
    public static final int Y_Button= 4;
    public static final int L1_Button = 5;
    public static final int R1_Button = 6;
    public static final int L2_Button = 7;
    public static final int R2_Button = 8;
    public static final int back = 9;
    public static final int start = 10;
    public static final int LStickClick = 11;
    public static final int RStickClick = 12;
    
    //Gamepad Buttons
    public static Button endShootingMotor_but = new JoystickButton(Gamepad, back);
    public static Button standByShooting_but = new JoystickButton(Gamepad, B_Button);
    public static Button fullSpeedShooting_but = new JoystickButton(Gamepad, Y_Button);
    public static Button moveShooterUp_but = new JoystickButton(Gamepad, R1_Button);
    public static Button moveShooterDown_but = new JoystickButton(Gamepad, L1_Button);
   // public static Button CrabWalk_but = new JoystickButton(JoystickLeft, 6);
   // public static Button climbUpLeft_but = new JoystickButton(Gamepad, L1_Button);
    //public static Button climbDownLeft_but = new JoystickButton(Gamepad, L2_Button);
   // public static Button climbUpRight_but = new JoystickButton(Gamepad, R1_Button);
   // public static Button climbDownRight_but = new JoystickButton(Gamepad, R2_Button);
    public static Button singleshoot_but = new JoystickButton(Gamepad, A_Button);
    public static Button reload_but = new JoystickButton(Gamepad, X_Button);
    public static Button increaseincrement_but = new JoystickButton(Gamepad, R2_Button);
    public static Button decreaseincrement_but = new JoystickButton(Gamepad, L2_Button);
           
    //Joystick Buttons
    
    public OI()
    {
        endShootingMotor_but.whenPressed(Init.endShootingMotor);
        standByShooting_but.whenPressed(Init.standByShooting);
        fullSpeedShooting_but.whenPressed(Init.accelerate);
        moveShooterUp_but.whenPressed(Init.moveShooterUp);
        moveShooterDown_but.whenPressed(Init.moveShooterDown);
        reload_but.whenPressed(Init.reload);
        //CrabWalk_but.whileHeld(Init.crabWalk);
        //climbUpLeft_but.whenPressed(Init.moveLClimbUp);
        //climbDownLeft_but.whenPressed(Init.moveLClimbDown);
        //climbUpRight_but.whenPressed(Init.moveRClimbUp);
        //climbDownRight_but.whenPressed(Init.moveRClimbDown);
        singleshoot_but.whenPressed(Init.shoot);
    }
}

//// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // Another type of button you can create is a DigitalIOButton, which is
    // a button or switch hooked up to the cypress module. These are useful if
    // you want to build a customized operator interface.
    // Button button = new DigitalIOButton(1);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
