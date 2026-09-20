package defpackage;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public interface h2 {

    @Deprecated
    public static final boolean b;

    static {
        b = Build.VERSION.SDK_INT >= 27;
    }
}
