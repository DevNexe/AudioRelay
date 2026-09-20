package defpackage;

import com.google.android.gms.internal.ads.zzbbg;

/* JADX INFO: loaded from: classes3.dex */
public final class k36 implements Runnable {
    public final /* synthetic */ zzbbg A;
    public final /* synthetic */ int w;
    public final /* synthetic */ int x;
    public final /* synthetic */ int y;
    public final /* synthetic */ float z;

    public k36(zzbbg zzbbgVar, int i, int i2, int i3, float f) {
        this.A = zzbbgVar;
        this.w = i;
        this.x = i2;
        this.y = i3;
        this.z = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A.b.zzo(this.w, this.x, this.y, this.z);
    }
}
