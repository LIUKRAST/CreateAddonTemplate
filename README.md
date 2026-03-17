# Create Addon Template [1.20.1-Forge]

I primarily use this template, but feel free to fork it and mess around with it

## Features
- Auto expansion map
> Every time you add properties to your gradle properties, they re automatically mapped into the expansion map,
> meaning you only need to add your property in `mods.toml` or any file you want and in your `gradle.properties`,
> WITHOUT passing by the `build.gradle`
- NeoForge template folder
> Similarly to NeoForge, this template also uses a `template` folder for resources that might need to apply the expansion map.
> Every resources in the template folder is processed through the expansion map, and then sent to `resources` on your runs/builds
- Almost everything in gradle properties
> I really feel lazy when remembering every place I have to change my mod ID constant,
> so my template has almost everything contained in the gradle properties. Here is a setup checklist
> - Change your gradle.properties with everything there, you don't need to even enter the mods toml, everything is placed in the properties file
> - Change name and package of your classes
> - Change the package inside your `${mod_id}.mixins.json`
> - Change your MOD_ID constant inside your `ExampleConstants` class
- Constants class
> As a tradition for my repositories, I always prefer to put all my constants in a separate class than the main one.
> So you will find an `ExampleConstants` class containing
> - Your mod ID
> - A `id(...)` method to generate ResourceLocations (e.g. `id("something")` $\rightarrow$ `example:something` or `id("something_%s_cool", "really")` $\rightarrow$ `example:something_really_cool`)
> - Your `LOGGER`

That's basically it! Hope this template can bring beautiful addons to life!
