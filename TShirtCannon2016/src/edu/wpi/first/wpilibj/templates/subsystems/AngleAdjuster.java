/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.commands.DriveAngleAdjusterWithJoystick;

/**
 *
 * @author blazerbots
 */
public class AngleAdjuster extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    Jaguar angleJag;
    public AngleAdjuster(Jaguar jag)
    {
        angleJag = jag;
    }
    
    public void driveAngleAdjusterWithJoystick(Joystick joystick)
    {
        angleJag.set(joystick.getX());
    }
            
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new DriveAngleAdjusterWithJoystick());
    }
}
