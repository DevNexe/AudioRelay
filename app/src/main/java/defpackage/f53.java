package defpackage;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class f53 {
    public static final e53 a;

    static {
        a = Build.VERSION.SDK_INT >= 24 ? new ko6() : new fTO$();
    }
}
