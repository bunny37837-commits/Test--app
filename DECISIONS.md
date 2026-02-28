# DECISIONS.md

## [DEC-001] Single-file architecture
Date: 2026-02-28
Status: Decided

Decision: Implement the calculator entirely in one `index.html` file with embedded CSS and JavaScript.
Reason: SPEC requires a dependency-free single HTML deliverable that can run directly in a browser.
Rejected: Multi-file split (`index.html` + external CSS/JS), because it violates the single-file requirement.
Impact: Simplifies distribution and aligns exactly with platform constraints.

## [DEC-002] State-driven calculator logic
Date: 2026-02-28
Status: Decided

Decision: Use simple internal state (`firstOperand`, `operator`, `waitingForSecondOperand`) for operation flow.
Reason: This is reliable for basic arithmetic, decimal support, and clear behavior without external libraries.
Rejected: Evaluating expression strings via `eval`, due to avoidable safety/robustness concerns.
Impact: Predictable behavior for chained operations and equals handling.

## [DEC-003] Responsive mobile-first UI
Date: 2026-02-28
Status: Decided

Decision: Use CSS Grid buttons, fluid width, and small-screen media tuning in the same file.
Reason: Done criteria include mobile usability.
Rejected: Desktop-only fixed dimensions, because it fails mobile requirement.
Impact: Calculator remains tappable and readable on narrow screens.

## [DEC-004] Network access
Date: 2026-02-28
Status: Not Required

Decision: Network OFF for product runtime.
Allowed Domains: None
Reason: App is fully local and requires no external API/service.
