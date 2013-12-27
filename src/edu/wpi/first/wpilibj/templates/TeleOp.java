/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates;

/**
 *
 * @author DBoticsFRC_2
 */
public class TeleOp 
{
    public static void init()
    {
        Init.driveLikeTank.start();
        Init.useGampad.start();
    }
    
    public static void periodic()
    {
        
    }
}
