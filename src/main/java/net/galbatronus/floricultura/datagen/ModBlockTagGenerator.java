package net.galbatronus.floricultura.datagen;

import net.galbatronus.floricultura.block.ModBlocks;
import net.galbatronus.floricultura.floricultura;
import net.galbatronus.floricultura.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

    public class ModBlockTagGenerator extends BlockTagsProvider {
        public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
            super(output, lookupProvider, floricultura.MOD_ID, existingFileHelper);
        }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {

    }
}