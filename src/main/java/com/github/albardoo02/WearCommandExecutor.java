package com.github.albardoo02;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

public class WearCommandExecutor implements CommandExecutor {

    private Player player;

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            player = (Player) sender;
        } else {
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "コンソールからは実行できません!"));
            return true;
        }
        if(cmd.getName().equalsIgnoreCase("wear")){
            if(args.length == 0){
                sender.sendMessage("§c引数を指定してください");
                return true;
            }
            if (args.length == 1) {
                if (args[0].equalsIgnoreCase("helmet")) {
                    PlayerInventory inv = player.getInventory();
                    ItemStack hand = inv.getItemInMainHand();
                    ItemStack helmet = inv.getHelmet();
                    inv.setItemInMainHand(helmet);
                    inv.setHelmet(hand);
                }
                if (args[0].equalsIgnoreCase("chestplate")) {
                    PlayerInventory inv = player.getInventory();
                    ItemStack hand = inv.getItemInMainHand();
                    ItemStack chestplate = inv.getChestplate();
                    inv.setItemInMainHand(chestplate);
                    inv.setChestplate(hand);
                }
                if (args[0].equalsIgnoreCase("leggings")) {
                    PlayerInventory inv = player.getInventory();
                    ItemStack hand = inv.getItemInMainHand();
                    ItemStack leggings = inv.getLeggings();
                    inv.setItemInMainHand(leggings);
                    inv.setLeggings(hand);
                }
                if (args[0].equalsIgnoreCase("boots")) {
                    PlayerInventory inv = player.getInventory();
                    ItemStack hand = inv.getItemInMainHand();
                    ItemStack boots = inv.getBoots();
                    inv.setItemInMainHand(boots);
                    inv.setBoots(hand);
                }
            }
            return true;
        }
        return true;
    }
}
