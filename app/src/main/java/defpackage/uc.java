package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class uc implements yl0 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ ORW b;

    public uc(Context context, ORW orw) {
        this.a = context;
        this.b = orw;
    }

    @Override // defpackage.yl0
    public final void a() {
        this.a.getApplicationContext().unregisterComponentCallbacks(this.b);
    }
}
