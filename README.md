# Zoo Expansion Ultimate — Fabric 26.3 lion prototype

This revision adds a first-pass custom lion entity, entity renderer, model geometry, walking leg motion, tail sway, and a custom texture. It is an **original prototype**, not the Untamed Wilds model.

## Status and limitations
- The GitHub Actions workflow is configured to build the project.
- A lion entity type with ID `zoo_expansion_ultimate:lion` is registered.
- A first-pass custom model and renderer are included.
- The texture/model are original placeholders; the Untamed Wilds assets have not been copied.
- No spawn egg is included yet. If the project compiles, try `/summon zoo_expansion_ultimate:lion` in a creative test world.
- This code has not been built or launched in this environment. Please run the GitHub Actions workflow and share any compiler errors; Minecraft 26.3 APIs are changing and may require adjustments.

## Build
Upload the contents of this folder to the repository, committing the root files and `.github/workflows/build.yml`. Then open Actions and run **Build mod**. Download the artifact from the successful run.

## Next
1. Fix any compiler/API errors reported by Actions.
2. Test the model in game and refine the proportions/texture.
3. Add spawn egg, sounds, feeding/taming or zoo behaviours.
4. Investigate adapting the licensed Untamed Wilds lion assets if desired.

Reference documentation: https://docs.fabricmc.net/develop/entities/first-entity
Untamed Wilds source reference: https://github.com/RayTrace082/untamedwilds
