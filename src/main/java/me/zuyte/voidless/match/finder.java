package me.zuyte.voidless.match;

import com.andrei1058.bedwars.api.arena.GameState;
import com.andrei1058.bedwars.api.arena.IArena;
import com.andrei1058.bedwars.api.arena.team.ITeam;
import com.andrei1058.bedwars.api.arena.team.TeamColor;
import com.andrei1058.bedwars.api.events.gameplay.GameStateChangeEvent;
import me.zuyte.voidless.ConfigPath;
import me.zuyte.voidless.Main;
import me.zuyte.voidless.versionsupport.placersn_1_13;
import me.zuyte.voidless.versionsupport.placerwe_1_13;
import org.bukkit.Bukkit;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class finder implements Listener {

    @EventHandler
    private void onGameStateChange(final GameStateChangeEvent event) {
        String[] split = Bukkit.getBukkitVersion().split("-")[0].split("\\.");
        String ver_num = split[1];
        int version = Integer.parseInt(ver_num);

        if (event.getNewState() != GameState.playing) {
            return;
        }


        if (Main.getCfg().getYml().getStringList(ConfigPath.ARENA_GROUP).stream().noneMatch(g -> g.equals(event.getArena().getGroup()))) {
            return;
        }

        for (ITeam team : event.getArena().getTeams()) {

            if (team.isBedDestroyed()) {
                continue;
            }

            BlockFace targetFace = ((org.bukkit.material.Bed) team.getBed().getBlock().getState().getData()).getFacing();

            if (targetFace == BlockFace.NORTH || targetFace == BlockFace.SOUTH) {
                // NORTH - SOUTH
                Block bed = team.getBed().getBlock();
                TeamColor col = team.getColor();
                IArena ar = event.getArena();
                if (version > 12)
                    new placersn_1_13(bed, col, ar);
                else
                    new placersn(bed, col, ar);
            } else if (targetFace == BlockFace.EAST || targetFace == BlockFace.WEST) {
                // EAST - WEST
                Block bed1 = team.getBed().getBlock();
                TeamColor col1 = team.getColor();
                IArena ar1 = event.getArena();
                if (version > 12)
                    new placerwe_1_13(bed1, col1, ar1);
                else
                    new placerwe(bed1, col1, ar1);
            }
        }
    }
}
