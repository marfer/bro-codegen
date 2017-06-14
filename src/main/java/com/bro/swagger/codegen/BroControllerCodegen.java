package com.bro.swagger.codegen;

import io.swagger.codegen.CodegenType;
import io.swagger.codegen.languages.AbstractJavaCodegen;


public class BroControllerCodegen extends AbstractJavaCodegen {


    public BroControllerCodegen() {
       embeddedTemplateDir = templateDir = "bro-controller";
        apiTestTemplateFiles().clear();
        apiDocTemplateFiles().clear();
        modelDocTemplateFiles().clear();
        modelTemplateFiles().clear();
        apiTemplateFiles.put("apiController.mustache", "Controller.java");
    }

    public CodegenType getTag() {
        return CodegenType.OTHER;
    }

    public String getName() {
        return "bro-controller";
    }

    public String getHelp() {
        return "Generates controllers";
    }
}
