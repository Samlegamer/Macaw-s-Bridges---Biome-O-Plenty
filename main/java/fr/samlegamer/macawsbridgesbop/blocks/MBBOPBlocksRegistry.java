package fr.samlegamer.macawsbridgesbop.blocks;

import java.util.function.Supplier;

import com.mcwbridges.kikoz.MacawsBridges;
import com.mcwbridges.kikoz.objects.BridgeLog;
import com.mcwbridges.kikoz.objects.BridgeRope;
import com.mcwbridges.kikoz.objects.BridgeStone;

import fr.samlegamer.macawsbridgesbop.MacawsBridgeBOP;
import fr.samlegamer.macawsbridgesbop.items.MBBOPItemsRegistry;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class MBBOPBlocksRegistry
{
	public static final DeferredRegister<Block> BLOCKS_REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MacawsBridgeBOP.MODID);

    public static final RegistryObject<Block> CHERRY_LOG_BRIDGE_MIDDLE = createBlock("cherry_log_bridge_middle", () -> new BridgeLog(AbstractBlock.Properties.of(Material.WOOD)));
    public static final RegistryObject<Block> DEAD_LOG_BRIDGE_MIDDLE = createBlock("dead_log_bridge_middle", () -> new BridgeLog(AbstractBlock.Properties.of(Material.WOOD)));
    public static final RegistryObject<Block> FIR_LOG_BRIDGE_MIDDLE = createBlock("fir_log_bridge_middle", () -> new BridgeLog(AbstractBlock.Properties.of(Material.WOOD)));
    public static final RegistryObject<Block> HELLBARK_LOG_BRIDGE_MIDDLE = createBlock("hellbark_log_bridge_middle", () -> new BridgeLog(AbstractBlock.Properties.of(Material.WOOD)));
    public static final RegistryObject<Block> JACARANDA_LOG_BRIDGE_MIDDLE = createBlock("jacaranda_log_bridge_middle", () -> new BridgeLog(AbstractBlock.Properties.of(Material.WOOD)));
    public static final RegistryObject<Block> MAGIC_LOG_BRIDGE_MIDDLE = createBlock("magic_log_bridge_middle", () -> new BridgeLog(AbstractBlock.Properties.of(Material.WOOD)));
    public static final RegistryObject<Block> MAHOGANY_LOG_BRIDGE_MIDDLE = createBlock("mahogany_log_bridge_middle", () -> new BridgeLog(AbstractBlock.Properties.of(Material.WOOD)));
    public static final RegistryObject<Block> PALM_LOG_BRIDGE_MIDDLE = createBlock("palm_log_bridge_middle", () -> new BridgeLog(AbstractBlock.Properties.of(Material.WOOD)));
    public static final RegistryObject<Block> REDWOOD_LOG_BRIDGE_MIDDLE = createBlock("redwood_log_bridge_middle", () -> new BridgeLog(AbstractBlock.Properties.of(Material.WOOD)));
    public static final RegistryObject<Block> UMBRAN_LOG_BRIDGE_MIDDLE = createBlock("umbran_log_bridge_middle", () -> new BridgeLog(AbstractBlock.Properties.of(Material.WOOD)));
    public static final RegistryObject<Block> WILLOW_LOG_BRIDGE_MIDDLE = createBlock("willow_log_bridge_middle", () -> new BridgeLog(AbstractBlock.Properties.of(Material.WOOD)));
    
    public static final RegistryObject<Block> ORANGE_SANDSTONE_BRIDGE_MIDDLE = createBlock("orange_sandstone_bridge_middle", () -> new BridgeStone(AbstractBlock.Properties.of(Material.STONE)));
    public static final RegistryObject<Block> WHITE_SANDSTONE_BRIDGE_MIDDLE = createBlock("white_sandstone_bridge_middle", () -> new BridgeStone(AbstractBlock.Properties.of(Material.STONE)));
    public static final RegistryObject<Block> BLACK_SANDSTONE_BRIDGE_MIDDLE = createBlock("black_sandstone_bridge_middle", () -> new BridgeStone(AbstractBlock.Properties.of(Material.STONE)));
    public static final RegistryObject<Block> MUD_BRICK_BRIDGE_MIDDLE = createBlock("mud_brick_bridge_middle", () -> new BridgeStone(AbstractBlock.Properties.of(Material.STONE)));

    public static final RegistryObject<Block> CHERRY_LOG_ROPE_BRIDGE_MIDDLE = createBlock("rope_cherry_bridge", () -> new BridgeRope(AbstractBlock.Properties.of(Material.WOOD)));
    public static final RegistryObject<Block> DEAD_LOG_ROPE_BRIDGE_MIDDLE = createBlock("rope_dead_bridge", () -> new BridgeRope(AbstractBlock.Properties.of(Material.WOOD)));
    public static final RegistryObject<Block> FIR_LOG_ROPE_BRIDGE_MIDDLE = createBlock("rope_fir_bridge", () -> new BridgeRope(AbstractBlock.Properties.of(Material.WOOD)));
    public static final RegistryObject<Block> HELLBARK_ROPE_LOG_BRIDGE_MIDDLE = createBlock("rope_hellbark_bridge", () -> new BridgeRope(AbstractBlock.Properties.of(Material.WOOD)));
    public static final RegistryObject<Block> JACARANDA_ROPE_LOG_BRIDGE_MIDDLE = createBlock("rope_jacaranda_bridge", () -> new BridgeRope(AbstractBlock.Properties.of(Material.WOOD)));
    public static final RegistryObject<Block> MAGIC_LOG_ROPE_BRIDGE_MIDDLE = createBlock("rope_magic_bridge", () -> new BridgeRope(AbstractBlock.Properties.of(Material.WOOD)));
    public static final RegistryObject<Block> MAHOGANY_LOG_ROPE_BRIDGE_MIDDLE = createBlock("rope_mahogany_bridge", () -> new BridgeRope(AbstractBlock.Properties.of(Material.WOOD)));
    public static final RegistryObject<Block> PALM_LOG_ROPE_BRIDGE_MIDDLE = createBlock("rope_palm_bridge", () -> new BridgeRope(AbstractBlock.Properties.of(Material.WOOD)));
    public static final RegistryObject<Block> REDWOOD_ROPE_LOG_BRIDGE_MIDDLE = createBlock("rope_redwood_bridge", () -> new BridgeRope(AbstractBlock.Properties.of(Material.WOOD)));
    public static final RegistryObject<Block> UMBRAN_ROPE_LOG_BRIDGE_MIDDLE = createBlock("rope_umbran_bridge", () -> new BridgeRope(AbstractBlock.Properties.of(Material.WOOD)));
    public static final RegistryObject<Block> WILLOW_ROPE_LOG_BRIDGE_MIDDLE = createBlock("rope_willow_bridge", () -> new BridgeRope(AbstractBlock.Properties.of(Material.WOOD)));
    
    
    public static RegistryObject<Block> createBlock(String name, Supplier<? extends Block> supplier)
    {
        RegistryObject<Block> block = BLOCKS_REGISTRY.register(name, supplier);
        MBBOPItemsRegistry.ITEMS_REGISTRY.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(MacawsBridges.BridgesItemGroup.instance)));
        return block;
    }
}