package defpackage;

import com.android.billingclient.api.NUlFixed;
import com.android.billingclient.api.T23;
import com.android.billingclient.api.auxFixed;
import com.google.android.gms.ads.internal.util.zzb;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wv5 implements Runnable {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;

    public /* synthetic */ wv5(Object obj, int i) {
        this.w = i;
        this.x = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.w) {
            case 0:
                auxFixed auxVar = (auxFixed) this.x;
                auxVar.d.a = 0;
                auxVar.d.f = null;
                auxVar.a(T23.m);
                break;
            case 1:
                ah3 ah3Var = (ah3) this.x;
                NUlFixed nUl = T23.m;
                ra7 ra7Var = qb7.x;
                ah3Var.b(nUl, es5.A);
                break;
            default:
                zzb zzbVar = (zzb) this.x;
                Thread.currentThread();
                zzbVar.getClass();
                zzbVar.zza();
                break;
        }
    }
}
