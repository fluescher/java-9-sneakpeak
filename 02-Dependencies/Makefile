
build: 
	javac -d mods/com.zuehlke.tvm.hal.typea src/com.zuehlke.tvm.hal.typea/*.java 
	javac --module-path mods -d mods/com.zuehlke.tvm src/com.zuehlke.tvm/*.java 

run: build
	java --module-path mods -m com.zuehlke.tvm/com.zuehlke.tvm.Main

clean:
	rm -r mods
