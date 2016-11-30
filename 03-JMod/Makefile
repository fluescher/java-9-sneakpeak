
build: 
	javac -d mods/com.zuehlke.tvm.hal.typea src/com.zuehlke.tvm.hal.typea/*.java 
	javac --module-path mods -d mods/com.zuehlke.tvm src/com.zuehlke.tvm/*.java 

run: build
	java --module-path mods -m com.zuehlke.tvm/com.zuehlke.tvm.Main

clean:
	rm -r lib
	rm -r mods
	rm -r com.zuehlke.tvm
	
package: build
	mkdir -p lib
	jar --create --file=lib/com.zuehlke.tvm.hal@1.0.jar --module-version=1.0  --main-class=com.zuehlke.tvm.Main -C mods/com.zuehlke.tvm.hal.typea .
	jar --create --file=lib/com.zuehlke.tvm@1.0.jar --module-version=1.0 --main-class=com.zuehlke.tvm.Main -C mods/com.zuehlke.tvm .

package-jmod: build
	mkdir -p lib
	jmod create --class-path mods/com.zuehlke.tvm.hal.typea --module-version=1.0 lib/com.zuehlke.tvm.hal@1.0.jmod
	jmod create --class-path mods/com.zuehlke.tvm --module-version=1.0 --main-class=com.zuehlke.tvm.Main lib/com.zuehlke.tvm@1.0.jmod
	jlink --module-path lib:/usr/lib/jvm/java-9-openjdk-i386/jmods --add-modules com.zuehlke.tvm --output com.zuehlke.tvm


run-package: package
	java -p lib -m com.zuehlke.tvm

print-module-info: package
	jar --print-module-descriptor --file=lib/com.zuehlke.tvm@1.0.jar
