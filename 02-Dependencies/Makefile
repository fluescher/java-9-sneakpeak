
build: 
	javac -d mods/com.zuehlke.tvm.hal.typea src/com.zuehlke.tvm.hal.typea/*.java 
	javac --module-path mods -d mods/com.zuehlke.tvm src/com.zuehlke.tvm/*.java 

run: build
	java --module-path mods -m com.zuehlke.tvm/com.zuehlke.tvm.Main

clean:
	rm -r mods

package: build
	mkdir -p lib
	jar --create --file=lib/com.zuehlke.tvm.hal@1.0.jar --module-version=1.0  --main-class=com.zuehlke.tvm.Main -C mods/com.zuehlke.tvm.hal.typea .
	jar --create --file=lib/com.zuehlke.tvm@1.0.jar --module-version=1.0 --main-class=com.zuehlke.tvm.Main -C mods/com.zuehlke.tvm .

run-package: package
	java -p lib -m com.zuehlke.tvm

print-module-info: package
	jar --print-module-descriptor --file=lib/com.zuehlke.tvm@1.0.jar
