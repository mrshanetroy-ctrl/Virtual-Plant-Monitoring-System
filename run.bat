@echo off
cd "%~dp0"
echo Compiling Java files...
javac *.java
if %ERRORLEVEL% neq 0 (
    echo Compilation failed. Please check your Java files for errors.
    pause
    exit /b
)
echo Running the program...
java Main
pause
