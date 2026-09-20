package defpackage;

import java.io.File;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class g90 {
    public static final HashMap e = new HashMap();
    public final File a;
    public final Lock b;
    public final boolean c;
    public FileChannel d;

    public g90(String str, File file, boolean z) {
        Lock reentrantLock;
        File file2 = new File(file, rz.a(str, ".lck"));
        this.a = file2;
        String absolutePath = file2.getAbsolutePath();
        HashMap map = e;
        synchronized (map) {
            reentrantLock = (Lock) map.get(absolutePath);
            if (reentrantLock == null) {
                reentrantLock = new ReentrantLock();
                map.put(absolutePath, reentrantLock);
            }
        }
        this.b = reentrantLock;
        this.c = z;
    }

    public final void a() {
        FileChannel fileChannel = this.d;
        if (fileChannel != null) {
            try {
                fileChannel.close();
            } catch (IOException unused) {
            }
        }
        this.b.unlock();
    }
}
