package show;

import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.world.meta.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.world.blocks.power.LongPowerNode;
import mindustry.world.blocks.defense.ShieldBreaker;
import mindustry.world.blocks.defense.BaseShield;

public class ShowBetaBlocksMod extends Mod {
    @Override
    public void loadContent(){
        Vars.content.blocks().each(b -> b instanceof BaseShield || b instanceof ShieldBreaker || b instanceof LongPowerNode, b -> {
            b.buildVisibility = BuildVisibility.shown;
        });
    }
}
