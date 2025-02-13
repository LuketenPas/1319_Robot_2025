// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.cameraserver.CameraServerSharedStore;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ClimberSubsystem extends SubsystemBase {
  /** Creates a new ClimberSubsystem. */
  private final DoubleSolenoid climberSolenoid;
  private final Compressor compressor;
  public ClimberSubsystem() {
    climberSolenoid = new DoubleSolenoid(PneumaticsModuleType.REVPH, 2, 3);
    compressor = new Compressor(PneumaticsModuleType.REVPH);

    compressor.enableAnalog(100, 120);
    climberSolenoid.set(Value.kReverse);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void climberToggle() {
    climberSolenoid.toggle();
  }
}
