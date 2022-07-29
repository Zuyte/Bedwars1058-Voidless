package me.zuyte.voidless.commands;

import com.andrei1058.bedwars.api.command.ParentCommand;
import com.andrei1058.bedwars.api.command.SubCommand;
import me.zuyte.voidless.Main;
import net.md_5.bungee.api.chat.*;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

import java.util.List;

public class voidless extends SubCommand {
    public voidless(ParentCommand parent, String name) {
        super(parent, name);
        showInList(true);
        setDisplayInfo(textComponentBuilder("§6 ▪ §7/bw " + getSubCommandName() + " §8- §evoidless commands list"));
        setPriority(20);
        setArenaSetupCommand(false);
        setPermission("bw.voidless");
    }

    @Override
    public boolean execute(String[] args, CommandSender commandSender) {
        if (commandSender instanceof Player){
            Player p = (Player) commandSender;
            if (!p.hasPermission("bw.voidless")) return false;
            if (args.length == 0) {
                p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&8&lþ &6BedWars1058 Voidless v" + Main.getInstance().getDescription().getVersion() + " &7- &cCommands\n \n&6• &7/bw voidless reload &8- &ereload voidless configuration."));
                return true;
            } else if (args.length >= 1) {
                if (args[0].equalsIgnoreCase("reload")) {
                    Main.getCfg().reload();
                    p.sendMessage(ChatColor.GREEN + "voidless configuration reloaded!");
                    return true;
                }
            }
        }
        if (commandSender instanceof ConsoleCommandSender) {
            ConsoleCommandSender c = (ConsoleCommandSender) commandSender;
            if (args.length == 0) {
                c.sendMessage(ChatColor.translateAlternateColorCodes('&', " \n&8&lþ &6BedWars1058 Voidless v" + Main.getInstance().getDescription().getVersion() + " &7- &cCommands\n \n&6• &7/bw voidless reload &8- &ereload voidless configuration."));
                return true;
            } else if (args.length >= 1) {
                if (args[0].equalsIgnoreCase("reload")) {
                    Main.getCfg().reload();
                    c.sendMessage(ChatColor.GRAY + " ▪" + ChatColor.GREEN + " voidless configuration reloaded!");
                    return true;
                }
            }
        }
        return true;
    }

    @Override
    public List<String> getTabComplete() {
        return null;
    }

    public TextComponent textComponentBuilder(String s){
        TextComponent textComponent = new TextComponent(s);
        textComponent.setClickEvent(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/bw " + getSubCommandName()));
        textComponent.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("Sends admin commands list").create()));
        return textComponent;
    }
}