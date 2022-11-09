package dev.ftb.mods.ftbchunks.compat.waystones;

import dev.ftb.mods.ftbchunks.integration.StaticMapIcon;
import dev.ftb.mods.ftblibrary.util.TooltipList;
import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;

public class WaystoneMapIcon extends StaticMapIcon {
	public final String name;
	public final boolean global;

	public WaystoneMapIcon(BlockPos pos, String n, boolean g) {
		super(pos);
		name = n;
		global = g;
		icon = global ? WaystonesCompat.ICON_GLOBAL : WaystonesCompat.ICON;
	}

	@Override
	public int getPriority() {
		return 50;
	}

	@Override
	public void addTooltip(TooltipList list) {
		list.string(name);

		if (global) {
			list.styledString("Global", ChatFormatting.LIGHT_PURPLE);
		}

		super.addTooltip(list);
	}
}