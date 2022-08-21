package show;

import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.blocks.*;
import mindustry.world.meta.*;
import mindustry.gen.*;
import mindustry.mod.*;

public class ShowBetaBlocksMod extends Mod {
    @Override
    public void loadContent(){
        Blocks.shieldBreaker.buildVisibility = Blocks.shieldProjector.buildVisibility = Blocks.largeShieldProjector.buildVisibility = Blocks.beamLink.buildVisibility = BuildVisibility.shown;
    }
}
