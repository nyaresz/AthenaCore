package com.github.u3games.eventengine.events.types.survive;

import com.github.u3games.eventengine.config.interfaces.EventConfig;
import com.github.u3games.eventengine.model.EItemHolder;
import com.github.u3games.eventengine.model.ELocation;
import com.github.u3games.eventengine.util.ConvertUtils;
import com.l2jserver.gameserver.model.holders.ItemHolder;

import java.util.List;

public class SurviveEventConfig implements EventConfig {

    private boolean enabled;
    private String instanceFile;
    private List<EItemHolder> reward;
    private List<ELocation> coordinatesMobs;
    private List<Integer> mobsID;
    private int mobsSpawnForStage;
    private List<ELocation> coordinates;

    public boolean isEnabled() {
        return enabled;
    }

    public String getInstanceFile() {
        return instanceFile;
    }

    public List<ItemHolder> getReward() {
        return ConvertUtils.convertToListItemsHolders(reward);
    }

    public List<ELocation> getCoordinatesMobs() {
        return coordinatesMobs;
    }

    public List<Integer> getMobsID() {
        return mobsID;
    }

    public int getMobsSpawnForStage() {
        return mobsSpawnForStage;
    }

    public List<ELocation> getCoordinates() {
        return coordinates;
    }
}
