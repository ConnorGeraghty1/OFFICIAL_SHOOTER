package frc.robot;

import edu.wpi.first.wpilibj.AnalogInput;
import frc.robot.Subsystems.ShooterSubsystem;

public class Constants {
    public static final class OperatorConstants {
        public static final int kDriverControllerPort = 0;
    }

    public static final class ShooterConstants {
        public static final int kShooterMotorID = 0;
        public static final int intakePhotoElectricSensorID = 0;
        public static final ShooterSubsystem shooterSubsystem = new ShooterSubsystem();
    }

}
