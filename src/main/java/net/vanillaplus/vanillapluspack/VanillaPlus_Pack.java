package net.vanillaplus.vanillapluspack;

import org.bukkit.plugin.java.JavaPlugin;

public final class VanillaPlus_Pack extends JavaPlugin {
    @Override
    public void onEnable() {getCommand("pack").setExecutor(new Command());}
}
