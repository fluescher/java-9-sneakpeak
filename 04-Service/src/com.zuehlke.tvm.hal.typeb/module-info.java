module com.zuehlke.tvm.hal.typeb {
	requires com.zuehlke.tvm;
	provides com.zuehlke.tvm.HardwareProvider
    	    with com.zuehlke.tvm.hal.typeb.TypeBHardwareProvider;
}
