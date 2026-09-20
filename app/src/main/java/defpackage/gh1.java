package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class gh1 {
    public static void a(@Nullable Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    @Deprecated
    public static long b(InputStream inputStream, OutputStream outputStream, boolean z) {
        byte[] bArr = new byte[1024];
        long j = 0;
        while (true) {
            try {
                int i = inputStream.read(bArr, 0, 1024);
                if (i == -1) {
                    break;
                }
                j += (long) i;
                outputStream.write(bArr, 0, i);
            } catch (Throwable th) {
                if (z) {
                    a(inputStream);
                    a(outputStream);
                }
                throw th;
            }
        }
        if (z) {
            a(inputStream);
            a(outputStream);
        }
        return j;
    }
}
