// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;
//jhe

//1319
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ClawSubsystem extends SubsystemBase {
  /** Creates a new ClawSubsystem. */
  private final TalonFX topClawMotor;
  private final TalonFX bottomClawMotor;
  public ClawSubsystem() {
    topClawMotor = new TalonFX(12);
    bottomClawMotor = new TalonFX(13);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void runClaw(double forward, double reverse) {
    topClawMotor.set(forward - reverse);
    bottomClawMotor.set(reverse - forward);
  }
}
