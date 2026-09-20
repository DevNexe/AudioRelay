package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class cx6 implements Runnable {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ String D = null;
    public final /* synthetic */ dy6 E;
    public final /* synthetic */ String w;
    public final /* synthetic */ String x;
    public final /* synthetic */ long y;
    public final /* synthetic */ Bundle z;

    public cx6(dy6 dy6Var, String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3) {
        this.E = dy6Var;
        this.w = str;
        this.x = str2;
        this.y = j;
        this.z = bundle;
        this.A = z;
        this.B = z2;
        this.C = z3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.E.n(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D);
    }
}
