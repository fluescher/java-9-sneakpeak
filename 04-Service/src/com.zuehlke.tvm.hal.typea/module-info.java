module com.zuehlke.tvm.hal.typea {
	requires com.zuehlke.tvm;
	provides com.zuehlke.tvm.HardwareProvider
    	    with com.zuehlke.tvm.hal.typea.TypeAHardwareProvider;
}
