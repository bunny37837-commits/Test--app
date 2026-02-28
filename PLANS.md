# PLANS.md — TaskMate Roadmap

## Status
- [ ] Not Started
- [x] In Progress — Current: V1
- [ ] Complete

## V1 — Core working feature

### Goal
Deliver an installable debug APK for TaskMate with local task management.

### Done Means
- Build command `./gradlew assembleDebug` passes.
- Debug APK exists and path is documented.
- User can add, toggle complete/incomplete, and delete tasks.
- Tasks persist after app restart via Room.

### Acceptance Criteria
- [ ] Kotlin Android project configured.
- [ ] MVVM layers implemented (UI, ViewModel, Repository, DAO/DB).
- [ ] Room entity + DAO + database created.
- [ ] RecyclerView task list with toggle + delete controls.
- [ ] Input UI allows creating tasks with title.
- [ ] Full debug build executed successfully.
- [ ] STATUS updated with verification outputs.

## V2 — Complete feature set
- Add task validation UX polish.
- Add filtering (all/completed/pending).
- Improve accessibility labels and empty-state messaging.

## V3 — Production ready
- Add release signing flow docs and secure keystore handling guidance.
- Expand instrumentation/unit test coverage.
- Final release readiness checklist.
