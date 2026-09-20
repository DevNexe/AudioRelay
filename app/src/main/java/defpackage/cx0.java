package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class cx0 implements ek2 {
    public final File a;
    public final String b;
    public final String c;

    public cx0(String str, String str2, File file) {
        this.b = str;
        this.c = str2;
        this.a = file;
    }

    @Override // defpackage.ek2
    public final String a() {
        return this.c;
    }

    @Override // defpackage.ek2
    public final InputStream b() {
        File file = this.a;
        if (file.exists() && file.isFile()) {
            try {
                return new FileInputStream(file);
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }

    @Override // defpackage.ek2
    public final u2 c() {
        byte[] byteArray;
        byte[] bArr = new byte[8192];
        try {
            InputStream inputStreamB = b();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    if (inputStreamB == null) {
                        gZIPOutputStream.close();
                        byteArrayOutputStream.close();
                        if (inputStreamB != null) {
                            inputStreamB.close();
                        }
                        byteArray = null;
                    } else {
                        while (true) {
                            try {
                                int i = inputStreamB.read(bArr);
                                if (i <= 0) {
                                    break;
                                }
                                gZIPOutputStream.write(bArr, 0, i);
                            } catch (Throwable th) {
                                try {
                                    gZIPOutputStream.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                            try {
                                byteArrayOutputStream.close();
                            } catch (Throwable th3) {
                                th.addSuppressed(th3);
                            }
                            throw th;
                        }
                        gZIPOutputStream.finish();
                        byteArray = byteArrayOutputStream.toByteArray();
                        gZIPOutputStream.close();
                        byteArrayOutputStream.close();
                        inputStreamB.close();
                    }
                    if (byteArray == null) {
                        return null;
                    }
                    String str = this.b;
                    if (str != null) {
                        return new u2(str, byteArray);
                    }
                    throw new NullPointerException("Null filename");
                } catch (Throwable th4) {
                    byteArrayOutputStream.close();
                    throw th4;
                }
            } catch (Throwable th5) {
                if (inputStreamB != null) {
                    try {
                        inputStreamB.close();
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                }
                throw th5;
            }
        } catch (IOException unused) {
        }
    }
}
