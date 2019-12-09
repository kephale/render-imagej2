package com.kyleharrington.janelia;

import org.scijava.command.Command;
import org.scijava.plugin.Parameter;

/**
 * Class for providing an interface to Render via SciJava/ImageJ2
 *
 * This should probably be generalized to mirror swagger:
 *   http://tem-services.int.janelia.org:8080/swagger-ui/
 */
public class RenderCommand implements Command {
    @Parameter
    protected String owner;

    @Parameter
    protected String project;

    @Parameter
    protected String stack;

    @Override
    public void run() {
        System.out.println("Parent Owner: " + owner + " Project: " + project + " Stack: " + stack);
    }
}
