# TaskMate (Android)

TaskMate is a simple Android Task Manager app built with Kotlin, MVVM, and Room.

## Features
- Add task with title
- Mark task complete/incomplete
- Delete task
- Local persistence using Room DB

## Build
```bash
./gradlew assembleDebug
```

Expected APK output path:
- `app/build/outputs/apk/debug/app-debug.apk`

## Install on device
```bash
adb install -r app/build/outputs/apk/debug/app-debug.apk
```
