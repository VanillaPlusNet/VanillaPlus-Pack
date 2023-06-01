package net.vanillaplus.vanillapluspack;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Command implements CommandExecutor {
    public boolean onCommand(CommandSender sender, org.bukkit.command.Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player)sender;
            p.sendMessage(ChatColor.GOLD + "Loading texture pack...");
            p.sendMessage(ChatColor.GRAY + "If the pack did not load please change server pack settings");
            p.setResourcePack("https://vanillaplus.net/assets/VanillaPlus_V2_1.18.2-1.19.2.zip");
        }
        return true;
    }
}
