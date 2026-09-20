package defpackage;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes3.dex */
public final class h17 {
    public final Context a;

    public h17(Context context) {
        oa3.h(context);
        this.a = context;
    }

    public final void a(Intent intent) {
        if (intent == null) {
            c().f.b("onRebind called with null intent");
        } else {
            c().n.c(intent.getAction(), "onRebind called. action");
        }
    }

    public final void b(Intent intent) {
        if (intent == null) {
            c().f.b("onUnbind called with null intent");
        } else {
            c().n.c(intent.getAction(), "onUnbind called for intent. action");
        }
    }

    public final bi6 c() {
        bi6 bi6Var = dq6.p(this.a, null, null).i;
        dq6.h(bi6Var);
        return bi6Var;
    }
}
