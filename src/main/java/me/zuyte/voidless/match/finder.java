package me.zuyte.voidless.match;

import com.andrei1058.bedwars.api.arena.GameState;
import com.andrei1058.bedwars.api.arena.IArena;
import com.andrei1058.bedwars.api.arena.team.TeamColor;
import com.andrei1058.bedwars.api.events.gameplay.GameStateChangeEvent;
import me.zuyte.voidless.Main;
import me.zuyte.voidless.ConfigPath;
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
        if (event.getNewState() == GameState.playing) {
            for (int e = 0; e < Main.getCfg().getYml().getStringList(ConfigPath.ARENA_GROUP).size(); e++)
                if (event.getArena().getGroup().equals(Main.getCfg().getYml().getStringList(ConfigPath.ARENA_GROUP).get(e))) {
                    for (int i = 0; i < event.getArena().getTeams().size(); i++) {
                        if (!event.getArena().getTeams().get(i).isBedDestroyed()) {
                            BlockFace targetFace = ((org.bukkit.material.Bed) event.getArena().getTeams().get(i).getBed().getBlock().getState().getData()).getFacing();
                            if (targetFace == BlockFace.SOUTH || targetFace == BlockFace.NORTH) {
                                // SOUTH - NORTH
                                Block bed = event.getArena().getTeams().get(i).getBed().getBlock();
                                TeamColor col = event.getArena().getTeams().get(i).getColor();
                                IArena ar = event.getArena();
                                if (version > 12) {
                                    new placersn_1_13(bed, col, i, ar);
                                } else {
                                    new placersn(bed, col, i, ar);
                                }
                        } else if (targetFace == BlockFace.EAST || targetFace == BlockFace.WEST) {
                            // WEST - EAST
                            Block bed1 = event.getArena().getTeams().get(i).getBed().getBlock();
                                TeamColor col1 = event.getArena().getTeams().get(i).getColor();
                                IArena ar1 = event.getArena();
                                if (version > 12) {
                                    new placerwe_1_13(bed1, col1, i, ar1);
                                } else {
                                    new placerwe(bed1, col1, i, ar1);
                                }
                            }
                        }
                    }

                }
        }
    }
}
