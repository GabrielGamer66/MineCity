package br.com.gamemods.minecity.forge.base.core.transformer.mod;

import br.com.gamemods.minecity.forge.base.core.Referenced;
import br.com.gamemods.minecity.forge.base.core.transformer.InsertInterfaceTransformer;

import java.util.HashMap;
import java.util.Map;

@Referenced
public class ModInterfacesTransformer extends InsertInterfaceTransformer
{
    @Referenced("br.com.gamemods.minecity.forge.mc_1_7_10.core.MineCitySevenCoreMod")
    @Referenced("br.com.gamemods.minecity.forge.mc_1_10_2.core.MineCityFrostCoreMod")
    public ModInterfacesTransformer()
    {
        Map<String, String> r = new HashMap<>();

        r.put("li.cil.oc.common.block.Keyboard",
                "br.com.gamemods.minecity.forge.base.protection.opencomputers.IKeyboard");

        r.put("li.cil.oc.common.tileentity.traits.Rotatable",
                "br.com.gamemods.minecity.forge.base.protection.opencomputers.IRotatable");

        r.put("li.cil.oc.common.block.Screen",
                "br.com.gamemods.minecity.forge.base.protection.opencomputers.IScreen");

        r.put("li.cil.oc.common.block.SimpleBlock",
                "br.com.gamemods.minecity.forge.base.protection.opencomputers.ISimpleBlock");

        r.put("li.cil.oc.common.tileentity.traits.Colored",
                "br.com.gamemods.minecity.forge.base.protection.opencomputers.IColored");

        r.put("com.pam.harvestcraft.BlockPamCrop",
                "br.com.gamemods.minecity.forge.base.protection.pamharvestcraft.IBlockPamCrop");

        r.put("com.pam.harvestcraft.ItemPamSeedFood",
                "br.com.gamemods.minecity.forge.base.accessors.item.IItemSeedFood");

        r.put("com.pam.harvestcraft.BlockPamFruit",
                "br.com.gamemods.minecity.forge.base.protection.pamharvestcraft.IBlockFruit");

        r.put("com.pam.harvestcraft.BlockPamWaterGarden",
                "br.com.gamemods.minecity.forge.base.protection.pamharvestcraft.IBlockGardern");

        r.put("com.pam.harvestcraft.BlockPamNormalGarden",
                "br.com.gamemods.minecity.forge.base.protection.pamharvestcraft.IBlockGardern");

        r.put("com.pam.harvestcraft.BlockPamMushroomGarden",
                "br.com.gamemods.minecity.forge.base.protection.pamharvestcraft.IBlockGardern");

        r.put("com.pam.harvestcraft.BlockPamDesertGarden",
                "br.com.gamemods.minecity.forge.base.protection.pamharvestcraft.IBlockGardern");

        r.put("com.pam.harvestcraft.BlockPamSink",
                "br.com.gamemods.minecity.forge.base.protection.pamharvestcraft.IBlockPamSink");

        r.put("com.pam.harvestcraft.BlockPamQuern",
                "br.com.gamemods.minecity.forge.base.accessors.block.IBlockOpenGUIReactor");

        r.put("com.pam.harvestcraft.BlockPamPresser",
                "br.com.gamemods.minecity.forge.base.accessors.block.IBlockOpenGUIReactor");

        r.put("com.pam.harvestcraft.BlockPamPot",
                "br.com.gamemods.minecity.forge.base.accessors.block.IBlockClickGUIReactor");

        r.put("com.pam.harvestcraft.BlockPamOven",
                "br.com.gamemods.minecity.forge.base.accessors.block.IBlockOpenGUIReactor");

        r.put("com.pam.harvestcraft.BlockPamMarket",
                "br.com.gamemods.minecity.forge.base.accessors.block.IBlockClickGUIReactor");

        r.put("com.pam.harvestcraft.BlockPamFishTrap",
                "br.com.gamemods.minecity.forge.base.accessors.block.IBlockOpenGUIReactor");

        r.put("com.pam.harvestcraft.BlockPamCuttingBoard",
                "br.com.gamemods.minecity.forge.base.accessors.block.IBlockClickGUIReactor");

        r.put("com.pam.harvestcraft.BlockPamChurn",
                "br.com.gamemods.minecity.forge.base.accessors.block.IBlockOpenGUIReactor");

        r.put("com.pam.harvestcraft.BlockPamApiary",
                "br.com.gamemods.minecity.forge.base.accessors.block.IBlockOpenGUIReactor");

        r.put("com.pam.harvestcraft.BlockPamAnimalTrap",
                "br.com.gamemods.minecity.forge.base.accessors.block.IBlockOpenGUIReactor");

        r.put("com.mrcrayfish.furniture.blocks.BlockWindowDecorationClosed",
                "br.com.gamemods.minecity.forge.base.accessors.block.IBlockClickReactor");

        r.put("com.mrcrayfish.furniture.blocks.BlockWindowDecoration",
                "br.com.gamemods.minecity.forge.base.accessors.block.IBlockClickReactor");

        r.put("com.mrcrayfish.furniture.blocks.BlockWallCabinet",
                "br.com.gamemods.minecity.forge.base.accessors.block.IBlockOpenGUIReactor");

        r.put("com.mrcrayfish.furniture.blocks.BlockToaster",
                "br.com.gamemods.minecity.forge.base.accessors.block.IBlockOpenForceSyncReactor");

        r.put("com.mrcrayfish.furniture.blocks.BlockTap",
                "br.com.gamemods.minecity.forge.base.protection.mrcrayfishfurniture.IBlockTap");

        r.put("com.mrcrayfish.furniture.blocks.BlockTV",
                "br.com.gamemods.minecity.forge.base.accessors.block.IBlockClickExtendsOpen");

        r.put("com.mrcrayfish.furniture.blocks.BlockStereo",
                "br.com.gamemods.minecity.forge.base.accessors.block.IBlockClickExtendsOpen");

        r.put("com.mrcrayfish.furniture.blocks.BlockShowerHead",
                "br.com.gamemods.minecity.forge.base.accessors.block.IBlockClickReactor");

        r.put("com.mrcrayfish.furniture.blocks.BlockShower",
                "br.com.gamemods.minecity.forge.base.protection.mrcrayfishfurniture.IBlockBath");

        r.put("com.mrcrayfish.furniture.blocks.BlockPlate",
                "br.com.gamemods.minecity.forge.base.accessors.block.IBlockOpenForceSyncReactor");

        r.put("com.mrcrayfish.furniture.blocks.BlockMicrowave",
                "br.com.gamemods.minecity.forge.base.accessors.block.IBlockOpenGUIReactor");

        r.put("com.mrcrayfish.furniture.blocks.BlockLampOff",
                "br.com.gamemods.minecity.forge.base.accessors.block.IBlockClickExtendsOpen");

        r.put("com.mrcrayfish.furniture.blocks.BlockLampOn",
                "br.com.gamemods.minecity.forge.base.accessors.block.IBlockClickExtendsOpen");

        r.put("com.mrcrayfish.furniture.blocks.BlockFridge",
                "br.com.gamemods.minecity.forge.base.accessors.block.IBlockOpenGUIReactor");

        r.put("com.mrcrayfish.furniture.blocks.BlockCookieJar",
                "br.com.gamemods.minecity.forge.base.accessors.block.IBlockOpenForceSyncReactor");

        r.put("com.mrcrayfish.furniture.blocks.BlockComputer",
                "br.com.gamemods.minecity.forge.base.accessors.block.IBlockClickExtendsOpen");

        r.put("com.mrcrayfish.furniture.blocks.BlockChoppingBoard",
                "br.com.gamemods.minecity.forge.base.accessors.block.IBlockOpenForceSyncReactor");

        r.put("com.mrcrayfish.furniture.blocks.BlockCabinetKitchen",
                "br.com.gamemods.minecity.forge.base.accessors.block.IBlockOpenGUIReactor");

        r.put("com.mrcrayfish.furniture.blocks.BlockCabinet",
                "br.com.gamemods.minecity.forge.base.accessors.block.IBlockOpenGUIReactor");

        r.put("com.mrcrayfish.furniture.blocks.BlockBlender",
                "br.com.gamemods.minecity.forge.base.accessors.block.IBlockOpenForceSyncReactor");

        r.put("com.mrcrayfish.furniture.blocks.BlockBin",
                "br.com.gamemods.minecity.forge.base.accessors.block.IBlockNoReactionExtendsOpen");

        r.put("com.mrcrayfish.furniture.blocks.BlockBin",
                "br.com.gamemods.minecity.forge.base.accessors.block.IBlockNoReactionExtendsOpen");

        r.put("com.mrcrayfish.furniture.blocks.BlockBedsideCabinet",
                "br.com.gamemods.minecity.forge.base.accessors.block.IBlockOpenGUIReactor");

        r.put("com.mrcrayfish.furniture.blocks.BlockBath",
                "br.com.gamemods.minecity.forge.base.protection.mrcrayfishfurniture.IBlockBath");

        r.put("com.mrcrayfish.furniture.blocks.BlockBasin",
                "br.com.gamemods.minecity.forge.base.protection.mrcrayfishfurniture.IBlockBasin");

        r.put("com.mrcrayfish.furniture.blocks.BlockCouch",
                "br.com.gamemods.minecity.forge.base.protection.mrcrayfishfurniture.IBlockSitRecolor");

        r.put("com.mrcrayfish.furniture.blocks.BlockBarStool",
                "br.com.gamemods.minecity.forge.base.protection.mrcrayfishfurniture.IBlockSitRecolor");

        r.put("com.mrcrayfish.furniture.blocks.BlockSittable",
                "br.com.gamemods.minecity.forge.base.protection.mrcrayfishfurniture.IBlockSittable");

        r.put("com.mrcrayfish.furniture.entity.EntitySittableBlock",
                "br.com.gamemods.minecity.forge.base.protection.mrcrayfishfurniture.IEntitySittableBlock");

        r.put("com.goldensilver853.vehicles.items.VehicularItem",
                "br.com.gamemods.minecity.forge.base.protection.vehicularmovement.IVehicularItem");

        r.put("com.goldensilver853.vehicles.entity.VehicularEntity",
                "br.com.gamemods.minecity.forge.base.protection.vehicularmovement.IVehicularEntity");

        r.put("codechicken.wirelessredstone.logic.ReceiverPart",
                "br.com.gamemods.minecity.forge.base.protection.wrcbe.DevicePart");

        r.put("codechicken.wirelessredstone.logic.WirelessPart",
                "br.com.gamemods.minecity.forge.base.protection.wrcbe.DevicePart");

        r.put("br.com.gamemods.universalcoinsserver.blocks.BlockTradeStation",
                "br.com.gamemods.minecity.forge.base.accessors.block.IBlockNoReactionExtendsOpen");

        r.put("br.com.gamemods.universalcoinsserver.blocks.BlockSlots",
                "br.com.gamemods.minecity.forge.base.accessors.block.IBlockNoReactionExtendsOpen");

        r.put("br.com.gamemods.universalcoinsserver.blocks.BlockPackager",
                "br.com.gamemods.minecity.forge.base.accessors.block.IBlockNoReactionExtendsOpen");

        r.put("br.com.gamemods.universalcoinsserver.blocks.BlockCardStation",
                "br.com.gamemods.minecity.forge.base.accessors.block.IBlockNoReactionExtendsOpen");

        r.put("br.com.gamemods.universalcoinsserver.blocks.BlockOwned",
                "br.com.gamemods.minecity.forge.base.protection.universalcoinsserver.IBlockOwned");

        r.put("br.com.gamemods.universalcoinsserver.blocks.PlayerOwned",
                "br.com.gamemods.minecity.forge.base.protection.universalcoinsserver.IPlayerOwned");

        r.put("br.com.gamemods.universalcoinsserver.blocks.BlockAdvSign",
                "br.com.gamemods.minecity.forge.base.protection.universalcoinsserver.IBlockAdvSign");

        r.put("cpw.mods.ironchest.ItemChestChanger",
                "br.com.gamemods.minecity.forge.base.accessors.item.IItemModifyFirstReactor");

        r.put("unwrittenfun.minecraft.immersiveintegration.blocks.BlockItemRobin",
                "br.com.gamemods.minecity.forge.base.accessors.block.IBlockModifyExtendsOpen");

        r.put("unwrittenfun.minecraft.immersiveintegration.blocks.BlockExtendablePost",
                "br.com.gamemods.minecity.forge.base.protection.immersiveintegrations.IBlockExtendablePost");

        r.put("com.bymarcin.zettaindustries.mods.ecatalogue.ECatalogueBlock",
                "br.com.gamemods.minecity.forge.base.accessors.block.IBlockClickExtendsOpen");

        r.put("com.bymarcin.zettaindustries.mods.nfc.block.BlockNFCReader",
                "br.com.gamemods.minecity.forge.base.accessors.block.IBlockClickExtendsOpen");

        r.put("com.bymarcin.zettaindustries.mods.nfc.block.BlockNFCProgrammer",
                "br.com.gamemods.minecity.forge.base.accessors.block.IBlockClickExtendsOpen");

        r.put("com.bymarcin.zettaindustries.mods.nfc.smartcard.SmartCardTerminalBlock",
                "br.com.gamemods.minecity.forge.base.accessors.block.IBlockClickExtendsOpen");

        r.put("com.bymarcin.zettaindustries.mods.battery.block.BlockBigBatteryPowerTap",
                "br.com.gamemods.minecity.forge.base.protection.zettaindustries.IBlockBigBatteryPowerTap");

        r.put("com.bymarcin.zettaindustries.mods.battery.block.BlockBigBatteryController",
                "br.com.gamemods.minecity.forge.base.protection.zettaindustries.IBigBatteryController");

        r.put("com.bymarcin.zettaindustries.mods.battery.block.BasicBlockMultiblockBase",
                "br.com.gamemods.minecity.forge.base.protection.zettaindustries.IBigBattery");

        r.put("com.bymarcin.zettaindustries.mods.vanillautils.block.VariableRedstoneEmitter",
                "br.com.gamemods.minecity.forge.base.accessors.block.IBlockModifyExtendsOpen");

        r.put("com.bymarcin.zettaindustries.mods.rfpowermeter.RFMeterBlock",
                "br.com.gamemods.minecity.forge.base.protection.zettaindustries.IRFMeterBlock");

        r.put("com.bymarcin.zettaindustries.mods.wiregun.EntityHookBullet",
                "br.com.gamemods.minecity.forge.base.protection.zettaindustries.IEntityHookBullet");

        r.put("blusunrize.immersiveengineering.common.entities.EntityRevolvershot",
                "br.com.gamemods.minecity.forge.base.protection.immersiveengineering.IEntityRevolverShot");

        r.put("blusunrize.immersiveengineering.common.items.ItemIETool",
                "br.com.gamemods.minecity.forge.base.protection.immersiveengineering.IItemIETool");

        r.put("blusunrize.immersiveengineering.common.blocks.metal.BlockMetalDecoration2",
                "br.com.gamemods.minecity.forge.base.protection.immersiveengineering.IBlockDecoration");

        r.put("blusunrize.immersiveengineering.common.blocks.metal.BlockMetalDecoration",
                "br.com.gamemods.minecity.forge.base.protection.immersiveengineering.IBlockDecoration");

        r.put("blusunrize.immersiveengineering.common.blocks.wooden.BlockWoodenDecoration",
                "br.com.gamemods.minecity.forge.base.protection.immersiveengineering.IBlockDecoration");

        r.put("blusunrize.immersiveengineering.common.blocks.stone.BlockStoneDecoration",
                "br.com.gamemods.minecity.forge.base.protection.immersiveengineering.IBlockDecoration");

        r.put("blusunrize.immersiveengineering.common.blocks.cloth.BlockClothDevices",
                "br.com.gamemods.minecity.forge.base.accessors.block.IBlockModifyExtendsOpen");

        r.put("blusunrize.immersiveengineering.common.blocks.wooden.TileEntityWindmill",
                "br.com.gamemods.minecity.forge.base.protection.immersiveengineering.ITileEntityWindmill");

        r.put("blusunrize.immersiveengineering.common.blocks.wooden.TileEntityModWorkbench",
                "br.com.gamemods.minecity.forge.base.protection.immersiveengineering.ImmersiveTileOpenOnClick");

        r.put("blusunrize.immersiveengineering.common.blocks.wooden.TileEntityWoodenCrate",
                "br.com.gamemods.minecity.forge.base.protection.immersiveengineering.ImmersiveTileOpenOnClick");

        r.put("blusunrize.immersiveengineering.common.blocks.wooden.TileEntityWoodenPost",
                "br.com.gamemods.minecity.forge.base.protection.immersiveengineering.ImmersiveTileModifyOnHammer");

        r.put("blusunrize.immersiveengineering.common.blocks.wooden.BlockWoodenDevices",
                "br.com.gamemods.minecity.forge.base.protection.immersiveengineering.IBlockWoodenDevices");

        r.put("blusunrize.immersiveengineering.common.blocks.wooden.TileEntityWoodenBarrel",
                "br.com.gamemods.minecity.forge.base.protection.immersiveengineering.ITileEntityWoodenBarrel");

        r.put("blusunrize.immersiveengineering.common.blocks.metal.TileEntityChargingStation",
                "br.com.gamemods.minecity.forge.base.protection.immersiveengineering.ITileEntityChargingStation");

        r.put("blusunrize.immersiveengineering.common.blocks.metal.TileEntityFluidPipe",
                "br.com.gamemods.minecity.forge.base.protection.immersiveengineering.ImmersiveTileModifyOnHammer");

        r.put("blusunrize.immersiveengineering.common.blocks.metal.TileEntityFluidPump",
                "br.com.gamemods.minecity.forge.base.protection.immersiveengineering.ImmersiveTileModifyOnHammer");

        r.put("blusunrize.immersiveengineering.common.blocks.metal.TileEntityFloodlight",
                "br.com.gamemods.minecity.forge.base.protection.immersiveengineering.ImmersiveTileModifyOnHammer");

        r.put("blusunrize.immersiveengineering.common.blocks.metal.TileEntityEnergyMeter",
                "br.com.gamemods.minecity.forge.base.protection.immersiveengineering.ITileEntityEnergyMeter");

        r.put("blusunrize.immersiveengineering.common.blocks.metal.TileEntityRedstoneBreaker",
                "br.com.gamemods.minecity.forge.base.protection.immersiveengineering.ITileEntityRedstoneBreaker");

        r.put("blusunrize.immersiveengineering.common.blocks.metal.TileEntityBreakerSwitch",
                "br.com.gamemods.minecity.forge.base.protection.immersiveengineering.ITileEntityBreakerSwitch");

        r.put("blusunrize.immersiveengineering.common.blocks.IEBlockInterfaces$IColouredTile",
                "br.com.gamemods.minecity.forge.base.protection.immersiveengineering.IIColouredTile");

        r.put("blusunrize.immersiveengineering.api.tool.ChemthrowerHandler$ChemthrowerEffect",
                "br.com.gamemods.minecity.forge.base.protection.immersiveengineering.IChemthrowerEffect");

        r.put("blusunrize.immersiveengineering.common.items.ItemIESeed",
                "br.com.gamemods.minecity.forge.base.protection.immersiveengineering.IItemIESeed");

        r.put("blusunrize.immersiveengineering.common.items.ItemIEBase",
                "br.com.gamemods.minecity.forge.base.protection.immersiveengineering.IItemIEBase");

        r.put("blusunrize.immersiveengineering.common.blocks.plant.BlockIECrop",
                "br.com.gamemods.minecity.forge.base.protection.immersiveengineering.IBlockIECrop");

        r.put("blusunrize.immersiveengineering.common.blocks.metal.BlockMetalDevices2",
                "br.com.gamemods.minecity.forge.base.protection.immersiveengineering.IBlockMetalDevices2");

        r.put("blusunrize.immersiveengineering.common.blocks.metal.BlockMetalDevices",
                "br.com.gamemods.minecity.forge.base.protection.immersiveengineering.IBlockMetalDevices");

        r.put("blusunrize.immersiveengineering.common.blocks.metal.TileEntitySampleDrill",
                "br.com.gamemods.minecity.forge.base.protection.immersiveengineering.ITileEntitySampleDrill");

        r.put("blusunrize.immersiveengineering.common.blocks.metal.TileEntityConveyorSorter",
                "br.com.gamemods.minecity.forge.base.protection.immersiveengineering.ITileEntityConveyorSorter");

        r.put("blusunrize.immersiveengineering.common.blocks.metal.TileEntityFurnaceHeater",
                "br.com.gamemods.minecity.forge.base.protection.immersiveengineering.ImmersiveTileModifyOnHammer");

        r.put("blusunrize.immersiveengineering.common.blocks.metal.TileEntityConveyorBelt",
                "br.com.gamemods.minecity.forge.base.protection.immersiveengineering.ImmersiveTileModifyOnHammer");

        r.put("blusunrize.immersiveengineering.common.blocks.metal.TileEntityCapacitorLV",
                "br.com.gamemods.minecity.forge.base.protection.immersiveengineering.ImmersiveTileModifyOnHammer");

        r.put("blusunrize.immersiveengineering.api.energy.IWireCoil",
                "br.com.gamemods.minecity.forge.base.protection.immersiveengineering.IItemWireCoil");

        r.put("blusunrize.immersiveengineering.api.energy.IImmersiveConnectable",
                "br.com.gamemods.minecity.forge.base.protection.immersiveengineering.IConnectable");

        r.put("codechicken.microblock.ItemMicroPart",
                "br.com.gamemods.minecity.forge.base.protection.forgemultipart.IItemMicroPart");

        r.put("codechicken.multipart.minecraft.ButtonPart",
                "br.com.gamemods.minecity.forge.base.protection.forgemultipart.IButtonPart");

        r.put("codechicken.multipart.minecraft.LeverPart",
                "br.com.gamemods.minecity.forge.base.protection.forgemultipart.ILeverPart");

        r.put("codechicken.multipart.TileMultipart",
                "br.com.gamemods.minecity.forge.base.protection.forgemultipart.ITileMultiPart");

        r.put("codechicken.multipart.TMultiPart",
                "br.com.gamemods.minecity.forge.base.protection.forgemultipart.ITMultiPart");

        r.put("codechicken.multipart.JItemMultiPart",
                "br.com.gamemods.minecity.forge.base.protection.forgemultipart.IJItemMultiPart");

        r.put("codechicken.multipart.BlockMultipart",
                "br.com.gamemods.minecity.forge.base.protection.forgemultipart.IBlockMultipart");

        r.put("codechicken.translocator.BlockTranslocator",
                "br.com.gamemods.minecity.forge.base.protection.translocators.IBlockTranslocator");

        r.put("codechicken.enderstorage.storage.item.ItemEnderPouch",
                "br.com.gamemods.minecity.forge.base.protection.enderstorage.IItemEnderPouch");

        r.put("codechicken.enderstorage.common.ItemEnderStorage",
                "br.com.gamemods.minecity.forge.base.protection.enderstorage.IItemEnderStorage");

        r.put("codechicken.enderstorage.common.TileFrequencyOwner",
                "br.com.gamemods.minecity.forge.base.protection.enderstorage.ITileFrequencyOwner");

        r.put("codechicken.enderstorage.common.BlockEnderStorage",
                "br.com.gamemods.minecity.forge.base.protection.enderstorage.IBlockEnderStorage");

        setReplacements(r);
        printReplacements();
    }
}