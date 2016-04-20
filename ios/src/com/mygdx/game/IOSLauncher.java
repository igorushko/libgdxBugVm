package com.mygdx.game;

import com.bugvm.apple.foundation.NSAutoreleasePool;
import com.bugvm.apple.uikit.UIApplication;

import com.badlogic.gdx.backends.iosbugvm.IOSApplication;
import com.badlogic.gdx.backends.iosbugvm.IOSApplicationConfiguration;
import com.mygdx.game.LibgdxBugVmGame;

public class IOSLauncher extends IOSApplication.Delegate {
    @Override
    protected IOSApplication createApplication() {
        IOSApplicationConfiguration config = new IOSApplicationConfiguration();
        return new IOSApplication(new LibgdxBugVmGame(), config);
    }

    public static void main(String[] argv) {
        NSAutoreleasePool pool = new NSAutoreleasePool();
        UIApplication.main(argv, null, IOSLauncher.class);
        pool.close();
    }
}