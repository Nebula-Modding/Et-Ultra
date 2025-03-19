package io.github.nebulamodding.datagen.assets;

import io.github.nebulamodding.EtUltra;
import net.minecraft.data.PackOutput;
import net.minecraft.server.packs.repository.Pack;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.common.data.SoundDefinition;
import net.neoforged.neoforge.common.data.SoundDefinitionsProvider;

public class EUSoundDefinitionsProvider extends SoundDefinitionsProvider {
    public EUSoundDefinitionsProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, EtUltra.MOD_ID, existingFileHelper);
    }
    @Override
    public void registerSounds() {
        // Sounds go here
    }
    private SoundDefinition addSubtitle(String subtitle) {
        return definition().subtitle("subtitles." + subtitle);
    }
}
