package com.zuehlke.tvm.hal.typea;

import com.zuehlke.tvm.HardwareProvider;
import com.zuehlke.tvm.HardwareProvider.Hardware;

public class TypeAHardwareProvider implements HardwareProvider {
	public Hardware initializeHardware() {
		return new Hardware("Type A");
	}
}
