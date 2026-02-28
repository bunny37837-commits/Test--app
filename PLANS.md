# PLANS.md — Project Roadmap

## Status
- [ ] Not Started
- [x] In Progress — Current: V1
- [ ] Complete

## V1 — Core Working Feature

### Goal
Deliver a fully functional single-file HTML calculator runnable directly in a browser.

### Done Means
User opens `index.html` in a browser and can perform add/subtract/multiply/divide, clear input, and use decimals without errors.

### Acceptance Criteria
- [x] Single `index.html` contains structure, styling, and logic.
- [x] Supports `+`, `-`, `×`, `÷`, decimal point, and equals.
- [x] Includes AC clear button.
- [x] Responsive and usable on small mobile screens.
- [x] No external dependencies or network usage.

### Tasks
- [x] Create calculator UI and button grid.
- [x] Implement calculator state machine in JavaScript.
- [x] Add responsive CSS for mobile layout.
- [x] Validate core operations and edge cases manually.

## V2 — Complete Feature Set

### Goal
Polish user experience for robust day-to-day usage.

### Acceptance Criteria
- [ ] Keyboard input support added.
- [ ] Improved divide-by-zero feedback behavior.
- [ ] Additional usability polish (focus states / accessibility enhancements).

### Tasks
- [ ] Add keyboard event handling.
- [ ] Add explicit error state UX text.
- [ ] Add accessibility refinements.

## V3 — Production Ready

### Goal
Finalize docs and verification for handoff.

### Acceptance Criteria
- [ ] Build passes all checks.
- [ ] No known critical issues.
- [ ] Documentation complete and current.

### Tasks
- [ ] Run final verification loop.
- [ ] Final docs/status consistency review.

## Risks & Blockers
| Risk | Impact | Mitigation |
|------|--------|------------|
| JavaScript state edge-case bug | Medium | Keep logic centralized and test operation chains manually. |
| Mobile button tap targets too small | Medium | Use responsive sizing and minimum touch target spacing. |

## Milestone History
| Milestone | Completed On | Verified By |
|-----------|-------------|-------------|
| V1 | 2026-02-28 | Manual browser + Playwright checks |
