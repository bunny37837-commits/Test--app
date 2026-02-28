---
name: project-workflow
description: Workflow instructions for the HTML Calculator single-file web project.
---

# Project Workflow Skill

## Build Commands
- Open `index.html` directly in a browser.
- Optional local server for manual verification: `python3 -m http.server 8000`

## Verification Steps
1. Ensure `index.html` loads without console/runtime errors.
2. Verify operations: add, subtract, multiply, divide.
3. Verify decimal input and clear (AC) behavior.
4. Verify responsive layout on mobile viewport.

## Repo Workflow
1. Update `PLANS.md` before implementation.
2. Implement one milestone at a time (V1 -> V2 -> V3).
3. Run verification checks and document results in `STATUS.md`.
4. Record major technical decisions in `DECISIONS.md`.
5. Commit using milestone-prefixed commit message.

## Project Conventions
- Keep implementation dependency-free.
- Use semantic HTML, scoped CSS, and plain JavaScript in the single file.
- Keep UI accessible with labeled display and touch-friendly controls.
