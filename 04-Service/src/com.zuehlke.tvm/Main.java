package com.zuehlke.tvm;

import java.util.ServiceLoader;
import com.zuehlke.tvm.HardwareProvider.Hardware;

public class Main {

	public static void main(String[] args) {
		printHardwareProviders();

		HardwareProvider provider = loadHardwareProvider();
		Hardware hardware = provider.initializeHardware();

		System.out.println(hardware.name());		
		
	}

	public static HardwareProvider loadHardwareProvider() {
		
		ServiceLoader<HardwareProvider> serviceLoader =
			ServiceLoader.load(HardwareProvider.class);

		if(!serviceLoader.iterator().hasNext()) {
			throw new RuntimeException("No HardwareProvider found");
		}
		return serviceLoader.iterator().next();
	}


	public static void printHardwareProviders() {
		ServiceLoader<HardwareProvider> serviceLoader =
			ServiceLoader.load(HardwareProvider.class);
		
		System.out.println("Available providers: ");
		for(HardwareProvider provider : serviceLoader) {
			System.out.println("- " + provider.getClass());
		}
	}

}
