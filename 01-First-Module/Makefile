
.create-mods:
	mkdir -p mods/com.zuehlke.hello

build: .create-mods
	javac -d mods/com.zuehlke.hello \
		src/com.zuehlke.hello/*

run: build
	java --module-path mods -m com.zuehlke.hello/com.zuehlke.hello.Main

clean:
	rm -r mods
