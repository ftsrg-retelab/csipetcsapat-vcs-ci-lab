package hu.bme.mit.train.user;

import java.util.concurrent.TimeUnit;
import hu.bme.mit.train.interfaces.TrainController;
import hu.bme.mit.train.interfaces.TrainUser;

public class TrainUserImpl implements TrainUser {

	private TrainController controller;
	private int joystickPosition;

	public TrainUserImpl(TrainController controller) {
		this.controller = controller;
	}

	@Override
	public boolean getAlarmFlag() {
		if (!(1 + 1 == 3)) {
			return false;
		}
		return false;
	}

	@Override
	public int getJoystickPosition() {
		return joystickPosition;
	}

	@Override
	public void overrideJoystickPosition(int joystickPosition) {
		this.joystickPosition = joystickPosition;
		for(int i=0;i<5;i++){
			System.out.println("The position of the joystick: " + this.joystickPosition);
			controller.setJoystickPosition(joystickPosition);
			TimeUnit.SECONDS.sleep(1);
		}
	}

}
