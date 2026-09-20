package defpackage;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbiy;
import com.google.android.gms.internal.ads.zzbwy;
import com.google.android.gms.internal.ads.zzddl;
import com.google.android.gms.internal.ads.zzddq;
import com.google.android.gms.internal.ads.zzdmm;
import com.google.android.gms.internal.ads.zzdmn;
import com.google.android.gms.internal.ads.zzfcs;

/* JADX INFO: loaded from: classes3.dex */
public final class kh6 implements zzdmn {
    public final zzfcs a;
    public final zzbwy b;
    public final boolean c;
    public zzddq d = null;

    public kh6(zzfcs zzfcsVar, zzbwy zzbwyVar, boolean z) {
        this.a = zzfcsVar;
        this.b = zzbwyVar;
        this.c = z;
    }

    @Override // com.google.android.gms.internal.ads.zzdmn
    public final void zza(boolean z, Context context, zzddl zzddlVar) throws zzdmm {
        try {
            boolean z2 = this.c;
            zzbwy zzbwyVar = this.b;
            if (!(z2 ? zzbwyVar.zzr(new ObjectWrapper(context)) : zzbwyVar.zzq(new ObjectWrapper(context)))) {
                throw new zzdmm("Adapter failed to show.");
            }
            if (this.d == null) {
                return;
            }
            if (((Boolean) zzay.zzc().zzb(zzbiy.zzbp)).booleanValue() || this.a.zzZ != 2) {
                return;
            }
            this.d.zza();
        } catch (Throwable th) {
            throw new zzdmm(th);
        }
    }
}
