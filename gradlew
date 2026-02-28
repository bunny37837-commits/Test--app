#!/usr/bin/env bash
set -euo pipefail

if command -v gradle >/dev/null 2>&1; then
  exec gradle "$@"
fi

echo "Error: 'gradle' command not found in PATH. Install Gradle or provide a Gradle wrapper distribution." >&2
exit 1
