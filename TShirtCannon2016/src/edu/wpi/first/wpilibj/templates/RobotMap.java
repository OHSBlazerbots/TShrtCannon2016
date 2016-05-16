package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.Jaguar;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    //PWM
    public static final int LEFT_MOTOR=-1;
    public static final int RIGHT_MOTOR=-1;
    public static final int TURRET = -1;
    public static final int ANGLE_ADJUSTER = -1;
    
    public static final Jaguar TURRET_JAG = new Jaguar(TURRET);
    public static final Jaguar ANGLE_JAG = new Jaguar(ANGLE_ADJUSTER);
   
    //public static final int CAM_PAN1 = -1;
    //public static final int CAM_TILT1 = -1;
   
    // Joysticks
    public static final int JOYSTICK_PORT = 0;
    public static final int JOYSTICK2_PORT = 1;
	public static final int JOYSTICK3_PORT = 2;
    
    // Analog
    //public static int ACCELEROMETER_PORT = -1;
    //public static int GYRO_PORT = 0;
    //public static int SONAR_PORT = -1; 
    
    //Digital
    public static int LINEAR_ENCODER_PORT1 = 7;
    public static int LINEAR_ENCODER_PORT2 = 8;
    public static int REED1_PORT = 1;

    //relay
    //from big tank to secondary tanks
    public static int SPIKE1 = -1;
    
    //from secondary tank to barrel (should be fired simultaneously)
    public static int SPIKE2 = -1;
    public static int SPIKE3 = -1;
    
    
    
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static final int leftMotor = 1;
    // public static final int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static final int rangefinderPort = 1;
    // public static final int rangefinderModule = 1;
}
