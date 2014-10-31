package com.github.trainerguy22.config;

import com.google.common.base.Charsets;
import com.typesafe.config.*;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class ConfigHocon extends ConfigImpl {
    public ConfigHocon(File file) {
        file.createNewFile();
        super(file, ConfigFactory.parseFile(file).root().unwrapped());
    }

    @Override
    public void save() {
        try {
            FileUtils.write(file, ConfigFactory.parseMap(config).root().render(ConfigRenderOptions.defaults().setOriginComments(false).setJson(false)), Charsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
