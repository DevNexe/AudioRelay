package defpackage;

import com.google.android.gms.internal.ads.zzaum;

/* JADX INFO: loaded from: classes3.dex */
public final class i36 implements Runnable {
    public final /* synthetic */ int w;
    public final /* synthetic */ zzaum x;

    public /* synthetic */ i36(zzaum zzaumVar, int i) {
        this.w = i;
        this.x = zzaumVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.w) {
            case 0:
                break;
            default:
                this.x.zza();
                break;
        }
    }
}
