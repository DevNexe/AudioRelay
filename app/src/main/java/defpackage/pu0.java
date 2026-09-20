package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class pu0 implements iw0<String> {
    public final og3<Context> a;

    public pu0(og3<Context> og3Var) {
        this.a = og3Var;
    }

    @Override // defpackage.og3
    public final Object get() {
        String packageName = this.a.get().getPackageName();
        if (packageName != null) {
            return packageName;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
