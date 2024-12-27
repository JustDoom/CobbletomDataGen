package com.imjustdoom.minestomdatagen.generators.tags;

import com.google.gson.JsonObject;
import com.imjustdoom.minestomdatagen.DataGenerator;

public class GenericTagGenerator extends DataGenerator {
    private final String path;

    public GenericTagGenerator(String path) {
        this.path = path;
    }

    @Override
    public JsonObject generate() {
        return mergePath(TAGS_FOLDER.resolve(path));
    }
}
