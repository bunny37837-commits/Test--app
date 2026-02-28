@echo off
where gradle >nul 2>&1
if %ERRORLEVEL%==0 (
  gradle %*
  exit /b %ERRORLEVEL%
)

echo Error: gradle command not found in PATH. Install Gradle or provide a Gradle wrapper distribution.
exit /b 1
