package pl.asie.lib.api.tile;

import cofh.api.energy.IEnergyReceiver;
import ic2.api.energy.tile.IEnergySink;
import net.minecraftforge.fml.common.Optional;
import pl.asie.lib.reference.Mods;

@Optional.InterfaceList({
	//@Optional.Interface(iface = "cofh.api.tileentity.IEnergyInfo", modid = Mods.API.CoFHTileEntities),
	@Optional.Interface(iface = "ic2.api.energy.tile.IEnergySink", modid = Mods.IC2),
	//@Optional.Interface(iface = "ic2classic.api.energy.tile.IEnergySink", modid = Mods.IC2Classic),
	@Optional.Interface(iface = "cofh.api.energy.IEnergyReceiver", modid = Mods.API.CoFHEnergy)
})
public interface IBatteryProvider extends
	IEnergyReceiver, /*IEnergyInfo, /* RF */
	IEnergySink/*, ic2classic.api.energy.tile.IEnergySink*/ /* IC2 */ {

}