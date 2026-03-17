package net.liukrast.example;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ExampleConstants.MOD_ID)
public class Example {

    public Example(FMLJavaModLoadingContext ctx) {
        IEventBus eventBus = ctx.getModEventBus();
    }

}
