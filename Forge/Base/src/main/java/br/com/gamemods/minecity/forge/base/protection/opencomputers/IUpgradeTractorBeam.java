package br.com.gamemods.minecity.forge.base.protection.opencomputers;

import br.com.gamemods.minecity.forge.base.core.Referenced;
import br.com.gamemods.minecity.forge.base.core.transformer.mod.opencomputers.UpgradeTractorBeamTransformer;

@Referenced(at = UpgradeTractorBeamTransformer.class)
public interface IUpgradeTractorBeam extends Hosted
{
    @Referenced(at = UpgradeTractorBeamTransformer.class)
    IEnvironmentHost host();
}
