# Elytra AutoPilot

**This mod requires [Fabric API](https://www.curseforge.com/minecraft/mc-mods/fabric-api).**
***
This is a fork of Simonlourson's client [auto-flight mod](https://www.curseforge.com/minecraft/mc-mods/elytra-auto-flight), updated for 1.17 and added many additional utilities.


## How to use

Press the assigned key (default "R") while flying high enough to enable 'Auto Flight'. While in Auto Flight mode, the mod will modify your pitch between going up and down, resulting in net altitude gain.

## */flyto* command
- Syntax: */flyto X Z*

While flying, input this command to automatically fly to the set coordinates. When near the location, the mod will try to slow you down by rotating around the target to avoid fall damage. This can be deactivated at any time by turning off Auto Flight or using the toggle in the config.

## */takeoff* command
- Syntax: */takeoff* or */takeoff X Z*

While having an elytra equiped and fireworks on either your main or off hand, this command will make you fly upwards to a configurable number of blocks (default 180 blocks) and then activate Auto Flight after reaching enought height. If coordinates are provided, it will then use /flyto to go to the set coordinates automatically.

## *Risky landing*
Deactivated by default, but can be activated in the config. When active, it will modify the regular landing behaviour to a more *risky* one, nosediving to the ground until the very last stretch. Not recommended for laggy servers/clients!
