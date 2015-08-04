package leacock.mrnom.framework;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/*
    File IO class.  Uses InputStream and OutputStream to load assets such as bitmaps
    or load files for storing high scores
 */

public interface FileIO {
    public InputStream readAsset(String fileName) throws IOException;

    public InputStream readFile(String fileName) throws IOException;

    public OutputStream writeFile(String fileName) throws IOException;
}
