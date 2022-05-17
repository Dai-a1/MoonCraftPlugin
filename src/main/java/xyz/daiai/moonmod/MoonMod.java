package xyz.daiai.moonmod;

import net.md_5.bungee.api.plugin.Plugin;
import xyz.daiai.moonmod.commands.PingCommand;
import xyz.daiai.moonmod.commands.WhereAmICommand;

public final class MoonMod extends Plugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("Initiating MoonMod");
        getProxy().getPluginManager().registerCommand(this, new PingCommand());
        getProxy().getPluginManager().registerCommand(this, new WhereAmICommand());

        getLogger().info("MoonMod is Ready!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
