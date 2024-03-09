package com.iridium.iridiumteams.support;

import com.bgsoftware.wildstacker.api.WildStackerAPI;
import com.bgsoftware.wildstacker.api.objects.StackedBarrel;
import com.bgsoftware.wildstacker.api.objects.StackedSpawner;
import com.iridium.iridiumcore.dependencies.xseries.XMaterial;
import com.iridium.iridiumteams.IridiumTeams;
import com.iridium.iridiumteams.database.IridiumUser;
import com.iridium.iridiumteams.database.Team;
import org.bukkit.block.Block;
import org.bukkit.entity.EntityType;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WildStackerSupport<T extends Team, U extends IridiumUser<T>> implements StackerSupport<T>, SpawnerSupport<T> {

    private final IridiumTeams<T, U> iridiumTeams;

    public WildStackerSupport(IridiumTeams<T, U> iridiumTeams) {
        this.iridiumTeams = iridiumTeams;
    }

    @Override
    public String supportProvider() {
        return "WildStacker";
    }

    @Override
    public boolean isStackedBlock(Block block) {
        return WildStackerAPI.getWildStacker().getSystemManager().isStackedBarrel(block);
    }

    @Override
    public boolean isStackedSpawner(Block block) {
        return WildStackerAPI.getWildStacker().getSystemManager().isStackedSpawner(block);
    }

    private StackedBarrel getStackedBlock(Block block) {
        return WildStackerAPI.getWildStacker().getSystemManager().getStackedBarrel(block);
    }

    private StackedSpawner getStackedSpawner(Block block) {
        return WildStackerAPI.getWildStacker().getSystemManager().getStackedSpawner(block.getLocation());
    }

    private List<StackedBarrel> getStackedBarrels(List<Block> blocks) {
        List<StackedBarrel> stackedBarrels = new ArrayList<>(Collections.emptyList());
        for(Block block : blocks) {
            stackedBarrels.add(getStackedBlock(block));
        }
        return stackedBarrels;
    }

    private List<StackedSpawner> getStackedSpawners(List<Block> blocks) {
        List<StackedSpawner> stackedSpawners = new ArrayList<>(Collections.emptyList());
        for(Block block : blocks) {
            stackedSpawners.add(getStackedSpawner(block));
        }
        return stackedSpawners;
    }

    @Override
    public int getExtraBlocks(T team, XMaterial material, List<Block> blocks) {

        int stackedBlocks = 0;
        for (StackedBarrel stackedBarrel : getStackedBarrels(blocks)) {
            if (!iridiumTeams.getTeamManager().isInTeam(team, stackedBarrel.getLocation())) continue;
            if (material != XMaterial.matchXMaterial(stackedBarrel.getType())) continue;
            stackedBlocks += stackedBarrel.getStackAmount();
        }

        return stackedBlocks;
    }

    @Override
    public int getExtraSpawners(T team, EntityType entityType, List<Block> blocks) {

        int stackedSpawners = 0;
        for (StackedSpawner stackedSpawner : getStackedSpawners(blocks)) {
            if (!iridiumTeams.getTeamManager().isInTeam(team, stackedSpawner.getLocation())) continue;
            if (stackedSpawner.getSpawnedType() != entityType) continue;
            stackedSpawners += stackedSpawner.getStackAmount();
        }

        return stackedSpawners;
    }
}