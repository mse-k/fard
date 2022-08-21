package show;

import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.world.meta.*
import mindustry.gen.*;
import mindustry.mod.*;

public class ShowBetaBlocksMod extends Mod {
    @Override
    public void loadContent(){
        Blocks.shieldBreaker.buildVisibility = Blocks.shieldProjector.buildVisibility = Blocks.largeShieldProjector.buildVisibility = BuildVisibility.shown;
    }
}
