# Zoo Expansion Ultimate — Fabric 26.3 starter + lion design assets

This is a fresh starter project for Minecraft 26.3 Fabric, with a custom original lion design asset included.

## Included
- Fabric mod starter structure and entrypoints
- GitHub Actions workflow (`.github/workflows/build.yml`)
- `src/main/resources/assets/zoo_expansion_ultimate/models/lion/lion_texture.png`
- `src/main/resources/assets/zoo_expansion_ultimate/models/lion/lion_model_spec.json`

## Honest status
The starter's GitHub Actions workflow can build the starter project, but **this is not yet a complete playable zoo mod**. The lion entity, entity registration, renderer, spawn egg, and animations are not implemented yet. The lion JSON is a documented design specification, not a native Minecraft renderer model. The PNG is a custom original texture atlas.

I could verify the upstream Untamed Wilds repository exists, but I could not retrieve its model assets in this environment, so this ZIP does not contain copied Untamed Wilds assets. The design is an original placeholder intended for conversion and renderer integration.

## Build
Upload the contents of this folder to your GitHub repository, ensuring `.github/workflows/build.yml` is committed on the default branch. Open **Actions**, run **Build mod**, then download the artifact from the completed run.

## Next implementation steps
1. Convert the lion geometry into a model supported by the chosen Fabric 26.3 renderer.
2. Implement and register the lion entity.
3. Add renderer, spawn egg/command, and walk/idle animation.
4. Build and test in Minecraft 26.3.

Upstream model reference for future licensed adaptation: https://github.com/RayTrace082/untamedwilds
