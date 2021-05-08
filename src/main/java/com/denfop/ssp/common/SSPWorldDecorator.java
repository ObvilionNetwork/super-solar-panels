package com.denfop.ssp.common;

import com.google.common.base.Predicate;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class SSPWorldDecorator implements IWorldGenerator {
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {

	}

	private void runGenerator(IBlockState blockToGen, int blockAmount, Predicate<IBlockState> blockToReplace, World world, Random rand, int chunk_X, int chunk_Z) {
		WorldGenMinable generator = new WorldGenMinable(blockToGen, blockAmount, blockToReplace);
		int heightdiff = 26 - 12 + 1;
		for (int i = 0; i < 3; i++) {
			int x = chunk_X * 16 + rand.nextInt(16);
			int y = 12 + rand.nextInt(heightdiff);
			int z = chunk_Z * 16 + rand.nextInt(16);
			generator.generate(world, rand, new BlockPos(x, y, z));
		}
	}
}
