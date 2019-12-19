/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.RobotMap;


/**
 * Add your docs here.
 */
public class TestMotor extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  TalonSRX testMotor;

 public TestMotor() {
    testMotor = new TalonSRX(RobotMap.driveMotorNumber);
    testMotor.setNeutralMode(NeutralMode.Brake);
 } 

 public void updateDashboard(){
  SmartDashboard.putNumber("Test Motor Current", testMotor.getOutputCurrent());
  SmartDashboard.putNumber("Test Motor Voltage", testMotor.getMotorOutputVoltage());
 }
 
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
