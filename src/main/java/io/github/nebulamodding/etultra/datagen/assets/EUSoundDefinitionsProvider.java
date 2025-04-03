package io.github.nebulamodding.etultra.datagen.assets;

import io.github.nebulamodding.etultra.EtUltra;
import net.minecraft.data.PackOutput;
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
