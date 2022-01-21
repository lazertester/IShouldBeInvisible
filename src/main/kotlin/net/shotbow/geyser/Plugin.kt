package net.shotbow.geyser

import org.bukkit.command.Command
import org.bukkit.command.CommandSender
import org.bukkit.entity.ArmorStand
import org.bukkit.entity.Player
import org.bukkit.plugin.java.JavaPlugin

class Plugin : JavaPlugin() {

    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        return if(sender is Player) {
            sender.world.spawn(sender.location, ArmorStand::class.java) {
                it.isSmall = true
                it.setGravity(false)
                it.setArms(false)
                it.setBasePlate(false)
                it.isVisible = false
                it.isCustomNameVisible = true
                it.customName = "I should be invisible"
            }
            true
        } else false
    }
}