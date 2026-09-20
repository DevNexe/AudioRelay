package androidx.fragment.app;

import defpackage.Bt7j;

/* JADX INFO: loaded from: classes.dex */
public final class auxFixed implements Runnable {
    public final /* synthetic */ ck32.CQf w;
    public final /* synthetic */ ck32.CQf x;
    public final /* synthetic */ boolean y;

    public auxFixed(ck32.CQf cQf, ck32.CQf cQf2, boolean z, Bt7j bt7j) {
        this.w = cQf;
        this.x = cQf2;
        this.y = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ta.a(this.w.c, this.x.c, this.y);
    }
}
