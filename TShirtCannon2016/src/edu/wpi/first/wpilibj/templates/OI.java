
package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.DigitalIOButton;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    Joystick joystick = new Joystick(RobotMap.JOYSTICK_PORT); //Driver
    Joystick joystick2 = new Joystick(RobotMap.JOYSTICK2_PORT);
    Joystick joystick3 = new Joystick(RobotMap.JOYSTICK3_PORT); //Co-Driver
    private final JoystickButton setPos0, setPos1, setPos2, setPos4, intake, reverseIntake, goToAnalog, intake1;
    /**
     *
     */
    public OI() {
    	//rumble = new JoystickButton(joystick, 1);
    	//rumble.toggleWhenPressed(new RumbleMaker());
    	
    	//getHall = new JoystickButton(joystick2, 1);
    	//getHall.toggleWhenPressed(new PrintSensorValue());
    	
    	intake1 = new JoystickButton(joystick3, 3);
    	setPos0 = new JoystickButton(joystick2, 3);
    	setPos1 = new JoystickButton(joystick2, 4);
    	setPos2 = new JoystickButton(joystick2, 5);
    	setPos4 = new JoystickButton(joystick2, 2);
    	//coDriverOverride = new JoystickButton(joystick2, 1);
    	intake = new JoystickButton(joystick, 1);
    	reverseIntake = new JoystickButton(joystick, 2);
    	goToAnalog = new JoystickButton(joystick2, 9);
    	
    }

    //Returns the joystick that controls driving
    public Joystick getJoystick() {
        return joystick; //Driver
    }
    
    public Joystick getCoDriverJoystick(){
        return joystick2;
    }
    
    public Joystick getCoDriverJoystick2(){
    	return joystick3;
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



