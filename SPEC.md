## App Name
TaskMate

## Goal
Build a complete Android Task Manager app and produce an installable debug APK.

## Platform
Android app (Kotlin, MVVM, Room)

## Core Features (V1)
- Add task with title
- Mark task complete/incomplete
- Delete task
- Persist tasks locally with Room database
- Clean simple UI

## Architecture
- Kotlin
- MVVM (ViewModel + Repository pattern)
- Room persistence

## Build Output Requirement
- Run full Gradle build with `./gradlew assembleDebug`
- Produce debug-signed APK ready to install on Android devices with debug signing enabled

## Network Access Required?
No (runtime app works fully offline)

## Done Means
1. `./gradlew assembleDebug` succeeds without skipped fatal errors.
2. APK exists at `app/build/outputs/apk/debug/app-debug.apk`.
3. Core features are implemented and verified through tests/checks.
4. `STATUS.md` is updated with milestone progress and verification results.

## Out of Scope (V1)
- Cloud sync/login
- Push notifications
- Categories, reminders, due dates
