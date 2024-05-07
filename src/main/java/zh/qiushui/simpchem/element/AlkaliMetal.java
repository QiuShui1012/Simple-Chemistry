package zh.qiushui.simpchem.element;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import zh.qiushui.qchemlib.api.Element;
import zh.qiushui.qchemlib.api.ElementItem;

import static zh.qiushui.QChem.QChemMain.MOD_ID;
import static zh.qiushui.qchemlib.api.MetalTypes.ALKALI_METAL;

public class AlkaliMetal {
    public static final ElementItem LITHIUM = new ElementItem(new FabricItemSettings(), new Element("Lithium", "Li", 3, 6.94,ALKALI_METAL));
    public static final ElementItem SODIUM = new ElementItem(new FabricItemSettings(), new Element("Sodium", "Na", 11, 22.99, ALKALI_METAL));
    public static final ElementItem POTASSIUM = new ElementItem(new FabricItemSettings(), new Element("Potassium", "K", 19, 39.098, ALKALI_METAL));
    public static final ElementItem RUBIDIUM = new ElementItem(new FabricItemSettings(), new Element("Rubidium", "Rb", 37, 85.468, ALKALI_METAL));
    public static final ElementItem CESIUM = new ElementItem(new FabricItemSettings(), new Element("Cesium", "Cs", 55, 132.91, ALKALI_METAL));
    public static final ElementItem FRANCIUM = new ElementItem(new FabricItemSettings(), new Element("Francium", "Fr", 87, 223, false, ALKALI_METAL));

    public static void registerAll() {
        LITHIUM.registerItem(MOD_ID);
        SODIUM.registerItem(MOD_ID);
        POTASSIUM.registerItem(MOD_ID);
        RUBIDIUM.registerItem(MOD_ID);
        CESIUM.registerItem(MOD_ID);
        FRANCIUM.registerItem(MOD_ID);
    }
}
