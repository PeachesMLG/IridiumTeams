package com.iridium.iridiumteams.support;

import com.iridium.iridiumcore.dependencies.xseries.XMaterial;
import com.iridium.iridiumteams.database.Team;

import org.bukkit.Chunk;
import org.bukkit.block.Block;

import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public interface StackerSupport<T extends Team> {
    int getExtraBlocks(T team, XMaterial material, List<Block> blocks);
    Map<XMaterial, Integer> getBlocksStacked(Chunk chunk, T team);
    boolean isStackedBlock(Block block);
    int getStackAmount(Block block);
    String supportProvider();
}
