package defpackage;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbzg;
import com.google.android.gms.internal.ads.zzddt;
import com.google.android.gms.internal.ads.zzdem;
import com.google.android.gms.internal.ads.zzfcs;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class td6 implements zzdem, zzddt {
    public final zzfcs w;

    public td6(zzfcs zzfcsVar) {
        this.w = zzfcsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzddt
    public final void zzbq(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzddt
    public final void zzbs(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzddt
    public final void zzbt(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzdem
    public final void zzn() {
        zzfcs zzfcsVar = this.w;
        zzbzg zzbzgVar = zzfcsVar.zzae;
        if (zzbzgVar == null || !zzbzgVar.zza) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (zzfcsVar.zzae.zzb.isEmpty()) {
            return;
        }
        arrayList.add(zzfcsVar.zzae.zzb);
    }
}
