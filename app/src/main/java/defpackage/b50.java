package defpackage;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class b50 {
    public static Handler a(Looper looper) {
        return Handler.createAsync(looper);
    }
}
