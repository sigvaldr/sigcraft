
package lol.sigvaldr.sigcraft.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import lol.sigvaldr.sigcraft.item.Lorebook0Item;
import lol.sigvaldr.sigcraft.SigcraftModElements;

@SigcraftModElements.ModElement.Tag
public class SigcraftCreativeTabItemGroup extends SigcraftModElements.ModElement {
	public SigcraftCreativeTabItemGroup(SigcraftModElements instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabsigcraft_creative_tab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(Lorebook0Item.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
