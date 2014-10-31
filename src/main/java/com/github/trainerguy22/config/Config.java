package com.github.trainerguy22.config;

import com.typesafe.config.ConfigFactory;
import cpw.mods.fml.client.config.IConfigElement;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public abstract class Config {

    public abstract void require(String group, String key, ConfigReference defaultValue);

    public abstract Object get(String group, String key);

    public abstract Integer getInt(String group, String key);

    public abstract boolean getBool(String group, String key);

    public abstract List<String> getGroups();

    public abstract Map<String, Object> getGroup(String group);

    public abstract List<Object> getKeys(String group);

    public abstract File getFile();

    public abstract void set(String group, String key, Object value);

    public abstract List<IConfigElement> toGui(String mod_id);

    public abstract void save();

}
