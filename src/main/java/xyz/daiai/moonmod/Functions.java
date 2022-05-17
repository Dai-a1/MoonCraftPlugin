package xyz.daiai.moonmod;

import net.md_5.bungee.api.connection.ProxiedPlayer;
import xyz.daiai.moonmod.types.Rank;

public class Functions {
    public Rank checkRank(ProxiedPlayer player, String rankName) {
        if(player.hasPermission("group." + rankName)) {
            return new Rank(rankName);
        }
        else {
            return null;
        }
    }
}
