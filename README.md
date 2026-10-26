# Zoo Expansion Ultimate — fresh Fabric 26.3 project

This is a **fresh starter project**, not a replacement for your previous mod build. It establishes a Fabric 26.3 project structure and a GitHub Actions build workflow.

## Current status

- Fabric 26.3 / Java 25 / Fabric Loader and Fabric API versions are configured.
- Main and client entrypoints are included.
- GitHub Actions workflow builds the project and uploads JAR artifacts.
- **The Untamed Wilds lion model has NOT been imported or integrated yet.**
- This starter does not currently register a lion entity; it is not yet the finished playable zoo mod.

I am being explicit about that so you don't accidentally install a starter JAR expecting it to contain the lion.

## Build with GitHub Actions

1. Upload the contents of this folder to your GitHub repository (not the enclosing folder itself).
2. Open **Actions** and enable workflows if GitHub asks.
3. Run **Build mod** using **Run workflow**, or push a commit.
4. Open the completed workflow run and download `zoo-expansion-ultimate-build`.

The build uses Java 25 and Gradle 9.7.1, with the Minecraft 26.3 Fabric toolchain values from Fabric's current example project guidance. If upstream tooling changes, update `gradle.properties` and the workflow together.

## Untamed Wilds model

The intended next step is to inspect the upstream Untamed Wilds source and identify the lion model/texture assets, then adapt the model to a Fabric-compatible entity renderer. The original project is GPL-3.0; if its assets/code are redistributed, preserve the applicable copyright notices and GPL terms. Do not assume every third-party sound or texture in that project has the same licence.

Original source: https://github.com/RayTrace082/untamedwilds
Fabric 26.3 example: https://github.com/FabricMC/fabric-example-mod/tree/26.3
