package zh.qiushui.QChem.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import zh.qiushui.qchemlib.api.Element;

import static zh.qiushui.qchemlib.api.map.ElementStorageMap.elementMap;

public class LanguageEntriesProvider {
    public static final String MOD_ID = "." + QChemMain.MOD_ID + ".";

    public static class ChineseLanguageProvider extends FabricLanguageProvider {
        protected ChineseLanguageProvider(FabricDataOutput dataOutput) {
            super(dataOutput, "zh_cn");
        }

        @Override
        public void generateTranslations(TranslationBuilder translationBuilder) {
            for (Element values : elementMap.values()) {
                translationBuilder.add("item" + MOD_ID + values.fullName.toLowerCase(), values.fullName);
            }
        }
    }

    public static class EnglishLanguageProvider extends FabricLanguageProvider {
        protected EnglishLanguageProvider(FabricDataOutput dataOutput) {
            super(dataOutput, "en_us");
        }

        @Override
        public void generateTranslations(TranslationBuilder translationBuilder) {
            for (Element values : elementMap.values()) {
                translationBuilder.add("item" + MOD_ID + values.fullName.toLowerCase(), values.fullName);
            }
        }
    }
}
