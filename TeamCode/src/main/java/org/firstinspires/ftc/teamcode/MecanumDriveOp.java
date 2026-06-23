package org.firstinspires.ftc.teamcode;

import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.gamepad1;
import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.hardwareMap;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.seattlesolvers.solverslib.drivebase.MecanumDrive;
import com.seattlesolvers.solverslib.gamepad.GamepadEx;
import com.seattlesolvers.solverslib.hardware.motors.Motor;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;

@TeleOp(name = "TestMecanum")
public class MecanumDriveOp extends OpMode {

    private MecanumDrive drive;

    @Override
    public void init() {
        drive = new MecanumDrive(
                new Motor(hardwareMap, "fL"),
                new Motor(hardwareMap, "fR"),
                new Motor(hardwareMap, "bL"),
                new Motor(hardwareMap, "bR")
        );
    }

    @Override
    public void loop() {
        drive.driveRobotCentric(
                gamepad1.left_stick_x,
                -gamepad1.left_stick_y,
                gamepad1.right_stick_x,
                false
        );
    }
}