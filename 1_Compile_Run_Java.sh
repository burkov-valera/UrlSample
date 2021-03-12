#!/bin/bash

. 0_init

echo " "
echo " "
echo " "
echo " "
echo "------------------------javac version-----------"
echo " "
$java_home/bin/javac -version
echo " "
echo "-----------------------------------------------"
echo "------------------------compiling program-----------"
echo " "
$java_home/bin/javac $mainclass.java
echo " "
echo "-----------------------------------------------"
echo " "
echo "------------------------java version-----------"
echo " "
$java_home/bin/java -version
echo " "
echo "-----------------------------------------------"
echo " "
echo "------------------------run java program--------------"
echo " "
$java_home/bin/java $mainclass
echo " "
echo "------------------------end java program--------------"
echo " "
pause
