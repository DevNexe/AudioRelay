package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.internal.ads.zzcba;
import com.google.android.gms.internal.ads.zzces;
import com.google.android.gms.internal.ads.zzdft;
import com.google.android.gms.internal.ads.zzfde;

/* JADX INFO: loaded from: classes3.dex */
public final class pg6 implements zzdft {
    public final Context w;
    public final zzces x;

    public pg6(zzces zzcesVar, Context context) {
        this.w = context;
        this.x = zzcesVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdft
    public final void zzb(zzfde zzfdeVar) {
        if (TextUtils.isEmpty(zzfdeVar.zzb.zzb.zzd)) {
            return;
        }
        zzl zzlVar = zzfdeVar.zza.zza.zzd;
        zzces zzcesVar = this.x;
        Context context = this.w;
        zzcesVar.zzp(context, zzlVar);
        zzcesVar.zzl(context, zzfdeVar.zzb.zzb.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzdft
    public final void zzbE(zzcba zzcbaVar) {
    }
}
