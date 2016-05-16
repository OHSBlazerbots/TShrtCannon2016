/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.commands.DriveTurretWithJoystick;

/**
 *
 * @author blazerbots
 */
public class Turret extends Subsystem {
    
    Jaguar turretJag;
    public Turret(Jaguar jag)
    {
        turretJag = jag;
    }
    
    public void driveTurretWithJoystick(Joystick joystick)
    {
        turretJag.set(joystick.getX());
    }

    protected void initDefaultCommand() {
        setDefaultCommand(new DriveTurretWithJoystick());
    }
}
