package com.kyleharrington.janelia;

import graphics.scenery.SceneryBase;
import io.scif.SCIFIOService;
import net.imagej.ImageJService;
import org.scijava.Context;
import org.scijava.command.CommandService;
import org.scijava.service.SciJavaService;
import org.scijava.thread.ThreadService;

public class TestProbeCommand extends RenderCommand {
    @Override
    public void run() {
        System.out.println("Child Owner: " + owner + " Project: " + project + " Stack: " + stack);
    }

    public static void main(String[] args) {
        //SceneryBase.xinitThreads();

        Context context = new Context( ImageJService.class, SciJavaService.class, SCIFIOService.class, ThreadService.class);
        CommandService command = context.service(CommandService.class);

        command.run(TestProbeCommand.class, false);
    }
}
