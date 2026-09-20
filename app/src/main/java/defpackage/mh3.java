package defpackage;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Locale;
import lh3.CQf;

/* JADX INFO: loaded from: classes3.dex */
public final class mh3 implements dx0 {
    public static final Charset d = Charset.forName("UTF-8");
    public final File a;
    public final int b = 65536;
    public lh3 c;

    public static class QnHx {
        public final byte[] a;
        public final int b;

        public QnHx(byte[] bArr, int i) {
            this.a = bArr;
            this.b = i;
        }
    }

    public mh3(File file) {
        this.a = file;
    }

    @Override // defpackage.dx0
    public final void a() {
        kw.a(this.c, "There was a problem closing the Crashlytics log file.");
        this.c = null;
    }

    @Override // defpackage.dx0
    public final String b() {
        byte[] bArrC = c();
        if (bArrC != null) {
            return new String(bArrC, d);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0012  */
    @Override // defpackage.dx0
    public final byte[] c() {
        QnHx qnHx;
        if (this.a.exists()) {
            f();
            lh3 lh3Var = this.c;
            if (lh3Var == null) {
                qnHx = null;
            } else {
                int[] iArr = {0};
                byte[] bArr = new byte[lh3Var.j()];
                try {
                    lh3 lh3Var2 = this.c;
                    synchronized (lh3Var2) {
                        try {
                            int iM = lh3Var2.z.a;
                            for (int i = 0; i < lh3Var2.y; i++) {
                                lh3.QnHx qnHxE = lh3Var2.e(iM);
                                lh3.CQf cQf = lh3Var2.new CQf(qnHxE);
                                int i2 = qnHxE.b;
                                try {
                                    cQf.read(bArr, iArr[0], i2);
                                    iArr[0] = iArr[0] + i2;
                                    cQf.close();
                                    iM = lh3Var2.m(qnHxE.a + 4 + qnHxE.b);
                                } catch (Throwable th) {
                                    cQf.close();
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                } catch (IOException e) {
                    Log.e("FirebaseCrashlytics", "A problem occurred while reading the Crashlytics log file.", e);
                }
                qnHx = new QnHx(bArr, iArr[0]);
            }
        } else {
            qnHx = null;
        }
        if (qnHx == null) {
            return null;
        }
        int i3 = qnHx.b;
        byte[] bArr2 = new byte[i3];
        System.arraycopy(qnHx.a, 0, bArr2, 0, i3);
        return bArr2;
    }

    @Override // defpackage.dx0
    public final void d() {
        a();
        this.a.delete();
    }

    @Override // defpackage.dx0
    public final void e(String str, long j) {
        boolean z;
        f();
        int i = this.b;
        if (this.c == null) {
            return;
        }
        if (str == null) {
            str = "null";
        }
        try {
            int i2 = i / 4;
            if (str.length() > i2) {
                str = "..." + str.substring(str.length() - i2);
            }
            this.c.b(String.format(Locale.US, "%d %s%n", Long.valueOf(j), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(d));
            while (true) {
                lh3 lh3Var = this.c;
                synchronized (lh3Var) {
                    try {
                        z = lh3Var.y == 0;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (z || this.c.j() <= i) {
                    return;
                } else {
                    this.c.g();
                }
            }
        } catch (IOException e) {
            Log.e("FirebaseCrashlytics", "There was a problem writing to the Crashlytics log.", e);
        }
    }

    public final void f() {
        File file = this.a;
        if (this.c == null) {
            try {
                this.c = new lh3(file);
            } catch (IOException e) {
                Log.e("FirebaseCrashlytics", "Could not open log file: " + file, e);
            }
        }
    }
}
