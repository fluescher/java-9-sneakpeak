
package com.zuehlke.tvm;

public interface HardwareProvider {

	Hardware initializeHardware();

	public static class Hardware {
		public final String name;

		public Hardware(String name) {
			this.name = name;
		}

		public String name() {
			return name;
		}
	}

}
