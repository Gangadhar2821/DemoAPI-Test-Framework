@echo off

REM Navigate to your Maven project directory
cd /d "D:\Automation_Redefined\Demobank_Api_Automation"

REM Run TestNG suite using Maven
mvn clean test -Dsuite=suite

pause
