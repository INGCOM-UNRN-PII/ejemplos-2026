# Plan: Add EqualsVerifier

## Objective
Add the `equalsverifier` library to the project's testing dependencies.

## Key Files & Context
- `build.gradle`: The Gradle build configuration file where dependencies are managed.

## Implementation Steps
1. Open `build.gradle`.
2. Locate the `dependencies` block.
3. Add the following line to include `equalsverifier` for testing (adjusting the version to the latest stable, e.g., 3.17.3, or equivalent if needed):
   ```gradle
   testImplementation 'nl.jqno.equalsverifier:equalsverifier:3.17.3'
   ```

## Verification & Testing
1. Run `./gradlew dependencies --configuration testCompileClasspath` (or equivalent gradle task) to verify the dependency is resolved.
2. Run `./gradlew test` to ensure the project still compiles and tests pass without errors.
