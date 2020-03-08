package org.jubaroo.mods.wurm.modeltesting;

import com.wurmonline.server.TimeConstants;
import com.wurmonline.server.behaviours.BehaviourList;
import com.wurmonline.server.items.*;
import com.wurmonline.server.skills.SkillList;
import com.wurmonline.shared.constants.IconConstants;
import com.wurmonline.shared.constants.ItemMaterials;
import org.gotti.wurmunlimited.modsupport.ItemTemplateBuilder;

import java.io.IOException;

public class Items {
    public static int TEST_ITEM_0, TEST_ITEM_1, TEST_ITEM_2, TEST_ITEM_3, TEST_ITEM_4, TEST_ITEM_5, TEST_ITEM_6, TEST_ITEM_7, TEST_ITEM_8, TEST_ITEM_9;

    public static void registerMiscBulkItems() throws IOException {
        registerTestItem0();
        registerTestItem1();
        registerTestItem2();
        registerTestItem3();
        registerTestItem4();
        registerTestItem5();
        registerTestItem6();
        registerTestItem7();
        registerTestItem8();
        registerTestItem9();
    }

    private static void registerTestItem0() throws IOException {
        ItemTemplate temp = new ItemTemplateBuilder("model.testing.0")
                .name("test item 0", "test items 0", "An item used to test models or textures.")
                .modelName("model.test.0.")
                .imageNumber((short) IconConstants.ICON_NONE)
                .weightGrams(100)
                .value(1)
                .dimensions(250, 250, 250)
                .decayTime(TimeConstants.DECAYTIME_NEVER)
                .material(ItemMaterials.MATERIAL_WOOD_BIRCH)
                .behaviourType(BehaviourList.itemBehaviour)
                .itemTypes(new short[]{
                        ItemTypes.ITEM_TYPE_HASDATA
                })
                .build();
        TEST_ITEM_0 = temp.getTemplateId();
    }

    private static void registerTestItem1() throws IOException {
        ItemTemplate temp = new ItemTemplateBuilder("model.testing.1")
                .name("test item 1", "test items 1", "An item used to test models or textures.")
                .modelName("model.test.1.")
                .imageNumber((short) IconConstants.ICON_NONE)
                .weightGrams(100)
                .value(1)
                .dimensions(250, 250, 250)
                .decayTime(TimeConstants.DECAYTIME_NEVER)
                .material(ItemMaterials.MATERIAL_WOOD_BIRCH)
                .behaviourType(BehaviourList.itemBehaviour)
                .itemTypes(new short[]{
                        ItemTypes.ITEM_TYPE_HASDATA
                })
                .build();
        TEST_ITEM_1 = temp.getTemplateId();
    }

    private static void registerTestItem2() throws IOException {
        ItemTemplate temp = new ItemTemplateBuilder("model.testing.2")
                .name("test item 2", "test items 2", "An item used to test models or textures.")
                .modelName("model.test.2.")
                .imageNumber((short) IconConstants.ICON_NONE)
                .weightGrams(100)
                .value(1)
                .dimensions(250, 250, 250)
                .decayTime(TimeConstants.DECAYTIME_NEVER)
                .material(ItemMaterials.MATERIAL_WOOD_BIRCH)
                .behaviourType(BehaviourList.itemBehaviour)
                .itemTypes(new short[]{
                        ItemTypes.ITEM_TYPE_HASDATA
                })
                .build();
        TEST_ITEM_2 = temp.getTemplateId();
    }

    private static void registerTestItem3() throws IOException {
        ItemTemplate temp = new ItemTemplateBuilder("model.testing.3")
                .name("test item 3", "test items 3", "An item used to test models or textures.")
                .modelName("model.test.3.")
                .imageNumber((short) IconConstants.ICON_NONE)
                .weightGrams(100)
                .value(1)
                .dimensions(250, 250, 250)
                .decayTime(TimeConstants.DECAYTIME_NEVER)
                .material(ItemMaterials.MATERIAL_WOOD_BIRCH)
                .behaviourType(BehaviourList.itemBehaviour)
                .itemTypes(new short[]{
                        ItemTypes.ITEM_TYPE_HASDATA
                })
                .build();
        TEST_ITEM_3 = temp.getTemplateId();
    }

    private static void registerTestItem4() throws IOException {
        ItemTemplate temp = new ItemTemplateBuilder("model.testing.4")
                .name("test item 4", "test items 4", "An item used to test models or textures.")
                .modelName("model.test.4.")
                .imageNumber((short) IconConstants.ICON_NONE)
                .weightGrams(100)
                .value(1)
                .dimensions(250, 250, 250)
                .decayTime(TimeConstants.DECAYTIME_NEVER)
                .material(ItemMaterials.MATERIAL_WOOD_BIRCH)
                .behaviourType(BehaviourList.itemBehaviour)
                .itemTypes(new short[]{
                        ItemTypes.ITEM_TYPE_HASDATA
                })
                .build();
        TEST_ITEM_4 = temp.getTemplateId();
    }

    private static void registerTestItem5() throws IOException {
        ItemTemplate temp = new ItemTemplateBuilder("model.testing.5")
                .name("test item 5", "test items 5", "An item used to test models or textures.")
                .modelName("model.test.5.")
                .imageNumber((short) IconConstants.ICON_NONE)
                .weightGrams(100)
                .value(1)
                .dimensions(250, 250, 250)
                .decayTime(TimeConstants.DECAYTIME_NEVER)
                .material(ItemMaterials.MATERIAL_WOOD_BIRCH)
                .behaviourType(BehaviourList.itemBehaviour)
                .itemTypes(new short[]{
                        ItemTypes.ITEM_TYPE_HASDATA
                })
                .build();
        TEST_ITEM_5 = temp.getTemplateId();
    }

    private static void registerTestItem6() throws IOException {
        ItemTemplate temp = new ItemTemplateBuilder("model.testing.6")
                .name("test item 6", "test items 6", "An item used to test models or textures.")
                .modelName("model.test.6.")
                .imageNumber((short) IconConstants.ICON_NONE)
                .weightGrams(100)
                .value(1)
                .dimensions(250, 250, 250)
                .decayTime(TimeConstants.DECAYTIME_NEVER)
                .material(ItemMaterials.MATERIAL_WOOD_BIRCH)
                .behaviourType(BehaviourList.itemBehaviour)
                .itemTypes(new short[]{
                        ItemTypes.ITEM_TYPE_HASDATA
                })
                .build();
        TEST_ITEM_6 = temp.getTemplateId();
    }

    private static void registerTestItem7() throws IOException {
        ItemTemplate temp = new ItemTemplateBuilder("model.testing.7")
                .name("test item 7", "test items 7", "An item used to test models or textures.")
                .modelName("model.test.7.")
                .imageNumber((short) IconConstants.ICON_NONE)
                .weightGrams(100)
                .value(1)
                .dimensions(250, 250, 250)
                .decayTime(TimeConstants.DECAYTIME_NEVER)
                .material(ItemMaterials.MATERIAL_WOOD_BIRCH)
                .behaviourType(BehaviourList.itemBehaviour)
                .itemTypes(new short[]{
                        ItemTypes.ITEM_TYPE_HASDATA
                })
                .build();
        TEST_ITEM_7 = temp.getTemplateId();
    }

    private static void registerTestItem8() throws IOException {
        ItemTemplate temp = new ItemTemplateBuilder("model.testing.8")
                .name("test item 8", "test items 8", "An item used to test models or textures.")
                .modelName("model.test.8.")
                .imageNumber((short) IconConstants.ICON_NONE)
                .weightGrams(100)
                .value(1)
                .dimensions(250, 250, 250)
                .decayTime(TimeConstants.DECAYTIME_NEVER)
                .material(ItemMaterials.MATERIAL_WOOD_BIRCH)
                .behaviourType(BehaviourList.itemBehaviour)
                .itemTypes(new short[]{
                        ItemTypes.ITEM_TYPE_HASDATA
                })
                .build();
        TEST_ITEM_8 = temp.getTemplateId();
    }

    private static void registerTestItem9() throws IOException {
        ItemTemplate temp = new ItemTemplateBuilder("model.testing.9")
                .name("test item 9", "test items 9", "An item used to test models or textures.")
                .modelName("model.test.9.")
                .imageNumber((short) IconConstants.ICON_NONE)
                .weightGrams(100)
                .value(1)
                .dimensions(250, 250, 250)
                .decayTime(TimeConstants.DECAYTIME_NEVER)
                .material(ItemMaterials.MATERIAL_WOOD_BIRCH)
                .behaviourType(BehaviourList.itemBehaviour)
                .itemTypes(new short[]{
                        ItemTypes.ITEM_TYPE_HASDATA
                })
                .build();
        TEST_ITEM_9 = temp.getTemplateId();
    }

}