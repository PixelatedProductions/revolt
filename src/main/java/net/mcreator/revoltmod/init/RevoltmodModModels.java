
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.revoltmod.init;

import net.mcreator.revoltmod.client.model.Modeltrident_Converted_Converted;
import net.mcreator.revoltmod.client.model.Modelocelot;

import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

@Environment(EnvType.CLIENT)
public class RevoltmodModModels {
	public static void load() {
		EntityModelLayerRegistry.registerModelLayer(Modelocelot.LAYER_LOCATION, Modelocelot::createBodyLayer);
		EntityModelLayerRegistry.registerModelLayer(Modeltrident_Converted_Converted.LAYER_LOCATION, Modeltrident_Converted_Converted::createBodyLayer);
	}
}
