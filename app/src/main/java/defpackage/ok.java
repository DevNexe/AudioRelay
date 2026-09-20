package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class ok implements ek2 {
    public final byte[] a;

    public ok(byte[] bArr) {
        this.a = bArr;
    }

    @Override // defpackage.ek2
    public final String a() {
        return "logs";
    }

    @Override // defpackage.ek2
    public final InputStream b() {
        byte[] bArr = this.a;
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        return new ByteArrayInputStream(bArr);
    }

    @Override // defpackage.ek2
    public final u2 c() {
        byte[] byteArray;
        byte[] bArr = this.a;
        if (bArr == null || bArr.length == 0) {
            byteArray = null;
        } else {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    try {
                        gZIPOutputStream.write(bArr);
                        gZIPOutputStream.finish();
                        byteArray = byteArrayOutputStream.toByteArray();
                        gZIPOutputStream.close();
                        byteArrayOutputStream.close();
                    } catch (Throwable th) {
                        try {
                            gZIPOutputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (IOException unused) {
                byteArray = null;
            }
        }
        if (byteArray == null) {
            return null;
        }
        return new u2("logs_file", byteArray);
    }
}
