package net.elytraautopilot.config;

import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;
import me.lortseam.completeconfig.gui.ConfigScreenBuilder;
import me.lortseam.completeconfig.gui.cloth.ClothConfigScreenBuilder;
import net.elytraautopilot.ElytraAutoPilot;

public class ModMenuIntegration implements ModMenuApi {

    private static final ConfigScreenBuilder<?> configScreenBuilder = new ClothConfigScreenBuilder();

    @Override
    public ConfigScreenFactory<?> getModConfigScreenFactory() {
        return parent -> configScreenBuilder.build(parent, ElytraAutoPilot.getConfig());
    }

}