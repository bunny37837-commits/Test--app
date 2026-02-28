# DECISIONS.md

## [DEC-001] Platform migration to Android TaskMate
Date: 2026-02-28
Status: Decided

Decision: Replace active project implementation target from browser calculator to native Android Task Manager per latest user requirement.
Reason: User explicitly requested a complete Android APK with TaskMate requirements.
Impact: Repository now centers Android Gradle project and APK generation workflow.

## [DEC-002] Use XML + RecyclerView UI (non-Compose)
Date: 2026-02-28
Status: Decided

Decision: Implement UI with AppCompat XML layouts and RecyclerView.
Reason: Keeps setup lean, transparent, and fast for a simple task list while satisfying clean UI requirement.
Rejected: Jetpack Compose to avoid extra setup complexity for this minimal scope.
Impact: Standard ViewBinding-less Kotlin UI wiring in Activity/Adapter.

## [DEC-003] Persistence via Room with Flow
Date: 2026-02-28
Status: Decided

Decision: Use Room DAO exposing `Flow<List<TaskEntity>>`, collected in ViewModel and exposed as LiveData.
Reason: Provides lifecycle-aware reactive updates with minimal code.
Impact: Coroutines + lifecycle-runtime-ktx dependencies required.

## [DEC-004] Network policy
Date: 2026-02-28
Status: Decided

Decision: Runtime app uses no network APIs.
Allowed Domains: Maven/Google repositories only for build dependency resolution.
Reason: App is local-only, but Gradle requires repositories for dependency/plugin retrieval.
Impact: No runtime internet permissions needed in AndroidManifest.

## Assumptions
ASSUMPTION: Minimum SDK 24 is acceptable for this deliverable.
Reason: Widely supported baseline with modern AndroidX compatibility.
Impact: Older devices below Android 7.0 are unsupported.
Reversible: yes

ASSUMPTION: Debug signing is sufficient because user explicitly requested debug-signed installable APK.
Reason: Requirement specifies debug signed APK.
Impact: APK is installable for testing but not production identity signed.
Reversible: yes
