package defpackage;

import android.content.Context;
import android.content.ContextWrapper;

/* JADX INFO: loaded from: classes.dex */
public final class d85 extends ContextWrapper {
    public static final Object a = new Object();

    public static void a(Context context) {
        if ((context instanceof d85) || (context.getResources() instanceof f85)) {
            return;
        }
        context.getResources();
        int i = pg5.a;
    }
}
