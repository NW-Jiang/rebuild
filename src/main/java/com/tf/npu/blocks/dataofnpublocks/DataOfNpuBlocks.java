package com.tf.npu.blocks.dataofnpublocks;

import com.tf.npu.blocks.NpuBlocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class DataOfNpuBlocks
{
    public String StructureType;
    public String ID;

    //structure
    public String modelPath;
    public String loadMethod;
    //structure

    //MultipleDirection
    public String modelPath0;
    public String modelPath15;
    public String modelPath30;
    public String modelPath45;
    public String modelPath60;
    public String modelPath75;
    //MultipleDirection

    //HalfSlab
    public boolean double_enable;
    //HalfSlab

    //DoorAndWindow
    public String open_modelPath;
    public String close_modelPath;
    //DoorAndWindow

    public String Material;
    public boolean noOcclusion;
    public boolean noCollision;
    public boolean noLootTable;
    public boolean noParticlesOnBreak;

    public BlockBehaviour.Properties createBlockProperties()
    {

        BlockBehaviour.Properties properties = NpuBlocks.createBlockProperties(NpuBlocks.EnumMaterial.valueOf(Material));
        if (noOcclusion) properties.noOcclusion();
        if (noCollision) properties.noCollission();
        if (noLootTable) properties.noLootTable();
        if (noParticlesOnBreak) properties.noParticlesOnBreak();

        return properties;
    }
}
