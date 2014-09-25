package org.aksw.gerbil.annotators;

import it.acubelab.batframework.problems.TopicSystem;
import it.acubelab.batframework.systemPlugins.TagmeAnnotator;

import org.aksw.gerbil.GerbilConfiguration;
import org.aksw.gerbil.datatypes.ExperimentType;

public class TagmeAnnotatorConfig extends AbstractAnnotatorConfiguration {

    private static final String TAGME_CONFIG_FILE_PROPERTY_NAME = "org.aksw.gerbil.annotators.TagmeAnnotatorConfig.ConfigFile";

    public TagmeAnnotatorConfig() {
        super("Tagme", true, new ExperimentType[] { ExperimentType.D2W });
    }

    @Override
    protected TopicSystem loadAnnotator() throws Exception {
        return new TagmeAnnotator(GerbilConfiguration.getInstance().getString(TAGME_CONFIG_FILE_PROPERTY_NAME));
    }

}