package defpackage;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.internal.ads.zzbbl;
import com.google.android.gms.internal.ads.zzbbm;
import com.google.android.gms.internal.ads.zzbiy;
import com.google.android.gms.internal.ads.zzdoj;

/* JADX INFO: loaded from: classes3.dex */
public final class re6 implements zzbbm {
    public final /* synthetic */ String w;
    public final /* synthetic */ zzdoj x;

    public re6(zzdoj zzdojVar, String str) {
        this.x = zzdojVar;
        this.w = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbbm
    public final void zzc(zzbbl zzbblVar) {
        if (!((Boolean) zzay.zzc().zzb(zzbiy.zzbv)).booleanValue()) {
            if (zzbblVar.zzj) {
                this.x.D.put(this.w, Boolean.TRUE);
                zzdoj zzdojVar = this.x;
                zzdojVar.zzv(zzdojVar.t.zzf(), this.x.t.zzl(), this.x.t.zzm(), true);
                return;
            }
            return;
        }
        synchronized (this) {
            if (zzbblVar.zzj) {
                zzdoj zzdojVar2 = this.x;
                if (zzdojVar2.t == null) {
                    return;
                }
                zzdojVar2.D.put(this.w, Boolean.TRUE);
                zzdoj zzdojVar3 = this.x;
                zzdojVar3.zzv(zzdojVar3.t.zzf(), this.x.t.zzl(), this.x.t.zzm(), true);
            }
        }
    }
}
