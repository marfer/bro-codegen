package com.bro.swagger.codegen;

import io.swagger.codegen.CodegenType;
import io.swagger.codegen.languages.AbstractJavaCodegen;


public class BroModelCodegen extends AbstractJavaCodegen {

    public BroModelCodegen() {
        embeddedTemplateDir = templateDir = "bro-model";
        apiTemplateFiles().clear();
        apiTestTemplateFiles().clear();
        apiDocTemplateFiles().clear();
        modelDocTemplateFiles().clear();
    }

    public CodegenType getTag() {
        return CodegenType.OTHER;
    }

    public String getName() {
        return "bro-model";
    }

    public String getHelp() {
        return "Generates model classes";
    }
}
