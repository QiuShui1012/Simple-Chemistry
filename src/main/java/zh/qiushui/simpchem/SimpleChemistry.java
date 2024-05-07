package zh.qiushui.simpchem;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleChemistry implements ModInitializer {
	public static final String MOD_ID = "simpchem";
    public static final Logger LOGGER = LoggerFactory.getLogger("Simple Chemistry");

	@Override
	public void onInitialize() {
		zh.qiushui.QChem.element.AlkaliMetal
		LOGGER.info("Hello Fabric world!");
	}
}