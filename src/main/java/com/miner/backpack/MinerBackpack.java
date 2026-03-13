package com.miner.backpack;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MinerBackpack implements ModInitializer {
	public static final String MOD_ID = "minerbackpack";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("MinerBackpack 初始化成功！堆叠上限调整功能已启用。");
	}
}