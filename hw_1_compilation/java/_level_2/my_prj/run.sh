javac -sourcepath ./src -d build/classes/ -cp ./libs/commons-lang3-3.12.0.jar src/ua/com/alevel/Myy.java
jar cvfm build/jar/myy.jar resources/MANIFEST.MF -C build/classes .
java -jar build/jar/myy.jar