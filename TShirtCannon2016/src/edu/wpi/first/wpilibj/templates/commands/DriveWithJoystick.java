/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.subsystems.Chassis;
//import org.usfirst.frc.team3807.robot.subsystems.Chassis;

//private boolean finished = false;
/**
 *
 * @author blazerbots
 */
public class DriveWithJoystick extends CommandBase {
    
    public DriveWithJoystick() {
        // We need the chassis to drive with the joystick.
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(chassis);
    }
    
    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        chassis.driveWithJoystick(oi.getJoystick());
 
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
