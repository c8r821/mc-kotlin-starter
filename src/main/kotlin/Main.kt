package com.c8r821.starter

import hazae41.minecraft.kotlin.bukkit.BukkitPlugin
import hazae41.minecraft.kotlin.bukkit.command
import hazae41.minecraft.kotlin.bukkit.msg

class Plugin: BukkitPlugin(){

    override fun onEnable() {
        command("hello"){ _ ->
            msg("World!")
        }
    }
}