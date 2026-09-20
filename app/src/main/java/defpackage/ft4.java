package defpackage;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class ft4 {
    public static final gt4 a;

    static {
        a = Build.VERSION.SDK_INT >= 23 ? new bt4() : new ht4();
    }
}
