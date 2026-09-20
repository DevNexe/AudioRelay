package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import defpackage.hk0;
import defpackage.lk0;
import defpackage.ye3;
import java.io.File;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class QnHx {
    public final Executor a;
    public final CQf.F1 b;
    public final byte[] c;
    public final File d;
    public boolean e = false;
    public lk0[] f;
    public byte[] g;

    /* JADX WARN: Code duplicated, block: B:12:0x0026  */
    public QnHx(AssetManager assetManager, Executor executor, CQf.F1 f1, String str, File file) {
        byte[] bArr;
        this.a = executor;
        this.b = f1;
        this.d = file;
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            switch (i) {
                case 24:
                case 25:
                    bArr = ye3.e;
                    break;
                case 26:
                    bArr = ye3.d;
                    break;
                case 27:
                    bArr = ye3.c;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = ye3.b;
                    break;
                case 31:
                    bArr = ye3.a;
                    break;
                default:
                    bArr = null;
                    break;
            }
        } else {
            bArr = null;
        }
        this.c = bArr;
    }

    public final void a(int i, Serializable serializable) {
        this.a.execute(new hk0(i, 0, this, serializable));
    }
}
