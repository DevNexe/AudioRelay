package defpackage;

import android.os.Build;
import android.os.UserManager;

/* JADX INFO: loaded from: classes3.dex */
public final class rw6 {
    public static UserManager a;
    public static volatile boolean b;

    static {
        b = !(Build.VERSION.SDK_INT >= 24);
    }
}
