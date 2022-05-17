package xyz.daiai.moonmod.commands;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

public class WhereAmICommand extends Command {
    public WhereAmICommand() { super("whereami"); }

    @Override
    public void execute(CommandSender sender, String[] args) {
        if (sender instanceof ProxiedPlayer) {
            ProxiedPlayer player = (ProxiedPlayer) sender;
            String server = player.getServer().getInfo().getName();
            player.sendMessage(new TextComponent(ChatColor.GREEN + "You are currently in" + ChatColor.GOLD + server));
        }
    }
}
