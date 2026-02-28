---
name: project-workflow
description: Workflow instructions for the TaskMate Android project.
---

# Project Workflow Skill

## Build Commands
- `./gradlew assembleDebug`
- `./gradlew test`

## Verification Steps
1. Build debug APK with `./gradlew assembleDebug`.
2. Run unit tests with `./gradlew test`.
3. Confirm APK exists at `app/build/outputs/apk/debug/app-debug.apk`.
4. Validate task CRUD + completion toggling backed by Room persistence.

## Repo Workflow
1. Ensure `SPEC.md` reflects requested deliverable.
2. Keep milestone focus: V1 before V2/V3.
3. Record architecture/security decisions in `DECISIONS.md`.
4. Update `STATUS.md` after verification.
5. Use milestone-prefixed commit format.

## Project Conventions
- Kotlin + MVVM + Room.
- Keep UI simple, clear, and lightweight.
- No runtime network dependency.
