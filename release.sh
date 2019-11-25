#!/usr/bin/env bash
set -euo pipefail

./gradlew clean assemble publishMavenJavaPublicationToMavenRepository closeAndReleaseRepository
