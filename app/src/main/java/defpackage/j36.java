package defpackage;

import com.google.android.gms.internal.ads.zzbbg;

/* JADX INFO: loaded from: classes3.dex */
public final class j36 implements Runnable {
    public final /* synthetic */ int w;
    public final /* synthetic */ long x;
    public final /* synthetic */ zzbbg y;

    public j36(zzbbg zzbbgVar, int i, long j) {
        this.y = zzbbgVar;
        this.w = i;
        this.x = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.y.b.zzl(this.w, this.x);
    }
}
