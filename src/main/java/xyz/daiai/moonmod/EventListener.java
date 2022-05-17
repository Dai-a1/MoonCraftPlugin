package xyz.daiai.moonmod;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.event.PostLoginEvent;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.event.EventHandler;

public class EventListener implements Listener {
    @EventHandler
    public void onPostLogin(PostLoginEvent event) {
        for (ProxiedPlayer player : ProxyServer.getInstance().getPlayers()) {
            player.sendMessage(new TextComponent(ChatColor.GOLD + event.getPlayer().getDisplayName() + "has joined the network. Say hi!"));
        }
    }
}
