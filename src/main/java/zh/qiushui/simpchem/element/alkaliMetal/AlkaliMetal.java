package zh.qiushui.simpchem.element.alkaliMetal;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import zh.qiushui.simpchemlib.SimpChemLib;
import zh.qiushui.simpchemlib.api.definition.MatterStates;
import zh.qiushui.simpchemlib.api.definition.MetalTypes;
import zh.qiushui.simpchemlib.api.information.Element;
import zh.qiushui.simpchemlib.api.information.language.I18nNameMap;
import zh.qiushui.simpchemlib.api.object.ElementItem;

import static zh.qiushui.simpchemlib.api.definition.MetalTypes.ALKALI_METAL;

public class AlkaliMetal {
    public static final ElementItem LITHIUM = new ElementItem(
            new FabricItemSettings(),
            new Element(I18nNameMap.createNameMap("Lithium"), "Li", 3, 6.94,ALKALI_METAL, , 180.5, )
    );
    public static final ElementItem SODIUM = new ElementItem(
            new FabricItemSettings(),
            new Element(I18nNameMap.createNameMap("Sodium"), "Na", 11, 22.99, ALKALI_METAL)
    );
    public static final ElementItem POTASSIUM = new ElementItem(
            new FabricItemSettings(),
            new Element(I18nNameMap.createNameMap("Potassium"), "K", 19, 39.098, ALKALI_METAL)
    );
    public static final ElementItem RUBIDIUM = new ElementItem(
            new FabricItemSettings(),
            new Element(I18nNameMap.createNameMap("Rubidium"), "Rb", 37, 85.468, ALKALI_METAL)
    );
    public static final ElementItem CESIUM = new ElementItem(
            new FabricItemSettings(),
            new Element(I18nNameMap.createNameMap("Cesium"), "Cs", 55, 132.91, ALKALI_METAL)
    );
    public static final ElementItem FRANCIUM = new ElementItem(
            new FabricItemSettings(),
            new Element(I18nNameMap.createNameMap("Francium"), "Fr", 87, 223, false, ALKALI_METAL)
    );
    public static final Element LITHIUM = Element.builder()
            .name("Lithium")
            .symbol("Li")
            .zNumber(3)
            .mass(22.99)
            .metalType(MetalTypes.ALKALI_METAL)
            .matterStateAtRoomTemp(MatterStates.SOLID)
            .threeStatesTemp(1342.0, 180.54, SimpChemLib.ROOM_TEMPERATURE)
            .build();
}
