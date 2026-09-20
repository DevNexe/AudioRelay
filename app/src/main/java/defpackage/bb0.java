package defpackage;

import android.content.Context;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class bb0 {
    public static void a(Context context, Throwable th) {
        try {
            oa3.h(context);
            oa3.h(th);
        } catch (Exception e) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e);
        }
    }
}
