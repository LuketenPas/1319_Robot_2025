// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class HatchSubsystem extends SubsystemBase {
  /** Creates a new HatchSubsystem. */

  private final DoubleSolenoid hatchSolenoid; 
  private final Compressor compressor;
  

  public HatchSubsystem() {
    hatchSolenoid = new DoubleSolenoid(PneumaticsModuleType.REVPH, 0, 1);
    compressor = new Compressor(PneumaticsModuleType.REVPH);
    hatchSolenoid.set(Value.kForward);
    
    compressor.enableAnalog(100, 120);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void hatchToggle() {
    hatchSolenoid.toggle();
  }
}
