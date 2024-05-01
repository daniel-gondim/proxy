package org.ads;

import java.awt.*;
import java.io.IOException;

public interface Graphic {
    void Draw(Point at);

    void HandleMouse(AWTEvent event);

    Point GetExtent();

    void Load(java.io.InputStream from);

    void Save(java.io.OutputStream to) throws IOException;
}

