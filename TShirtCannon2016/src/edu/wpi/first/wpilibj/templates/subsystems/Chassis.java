/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.commands.DriveWithJoystick;

/**
 *
 * @author blazerbots
 */
public class Chassis extends Subsystem {
public static RobotDrive drive;    
// Put methods for controlling this subsystem
    // here. Call these from Commands.

    public Chassis(int leftMotor,int rightMotor){
        if(leftMotor!=-1&& rightMotor!=-1){
            drive = new RobotDrive(leftMotor,rightMotor);
        }
    }
        
        public void driveWithJoystick(Joystick joystick)
        {
            double move = joystick.getY();
            double turn = joystick.getZ();
            
            drive.arcadeDrive(move, turn);
            
        }

    protected void initDefaultCommand() {
        setDefaultCommand(new DriveWithJoystick());
    }
    }
 

