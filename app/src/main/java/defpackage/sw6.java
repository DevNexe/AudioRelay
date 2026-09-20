package defpackage;

import android.content.Context;
import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class sw6 {
    public final Context a;
    public final String b;
    public final String c;
    public final String d;
    public final Boolean e;
    public final long f;
    public final w96 g;
    public final boolean h;
    public final Long i;
    public final String j;

    public sw6(Context context, w96 w96Var, Long l) {
        this.h = true;
        oa3.h(context);
        Context applicationContext = context.getApplicationContext();
        oa3.h(applicationContext);
        this.a = applicationContext;
        this.i = l;
        if (w96Var != null) {
            this.g = w96Var;
            this.b = w96Var.B;
            this.c = w96Var.A;
            this.d = w96Var.z;
            this.h = w96Var.y;
            this.f = w96Var.x;
            this.j = w96Var.D;
            Bundle bundle = w96Var.C;
            if (bundle != null) {
                this.e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
