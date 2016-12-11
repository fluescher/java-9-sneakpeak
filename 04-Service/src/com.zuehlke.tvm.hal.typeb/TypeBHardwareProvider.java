package com.zuehlke.tvm.hal.typeb;

import com.zuehlke.tvm.HardwareProvider;
import com.zuehlke.tvm.HardwareProvider.Hardware;

public class TypeBHardwareProvider implements HardwareProvider {
	public Hardware initializeHardware() {
		return new Hardware("Type B");
	}
}
