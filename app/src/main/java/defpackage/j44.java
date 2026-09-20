package defpackage;

import android.app.Activity;

/* JADX INFO: loaded from: classes3.dex */
public final class j44 implements Runnable {
    public final /* synthetic */ Activity w;
    public final /* synthetic */ k44 x;

    public j44(k44 k44Var, Activity activity) {
        this.x = k44Var;
        this.w = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.x.c.a(this.w);
    }
}
