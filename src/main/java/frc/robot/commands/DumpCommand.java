// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.DumpSubsystem;

/* You should consider using the more terse Command factories API instead https://docs.wpilib.org/en/stable/docs/software/commandbased/organizing-command-based.html#defining-commands */
public class DumpCommand extends Command {
  /** Creates a new dumpCommand. */
  private final DoubleSupplier forward;
  private final DoubleSupplier reverse;

  private final DumpSubsystem dumpSubsystem;

  public DumpCommand(
    DoubleSupplier forward, DoubleSupplier reverse, DumpSubsystem dumpSubsystem) {
    // Use addRequirements() here to declare subsystem dependencies.
    this.forward = forward;
    this.reverse = reverse;
    this.dumpSubsystem = dumpSubsystem;

    addRequirements(this.dumpSubsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    dumpSubsystem.runDump(forward.getAsDouble(), reverse.getAsDouble());
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
