package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class bf5 implements af5 {
    public final Context a;
    public final ww0 b;

    public bf5(Context context, dr0 dr0Var) {
        this.a = context;
        this.b = dr0Var;
    }

    @Override // defpackage.af5
    public final fx a(String str) {
        return new fx(new z0(4, this, str));
    }

    @Override // defpackage.af5
    public final qw b() {
        return this.b.a();
    }
}
