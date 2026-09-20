package defpackage;

import com.google.android.gms.internal.ads.zzdu;
import com.google.android.gms.internal.ads.zzjx;
import com.google.android.gms.internal.ads.zznt;
import com.google.android.gms.internal.ads.zzoy;

/* JADX INFO: loaded from: classes3.dex */
public final class e87 implements zznt {
    public final /* synthetic */ zzoy a;

    public /* synthetic */ e87(zzoy zzoyVar) {
        this.a = zzoyVar;
    }

    @Override // com.google.android.gms.internal.ads.zznt
    public final void zza(Exception exc) {
        zzdu.zza("MediaCodecAudioRenderer", "Audio sink error", exc);
        this.a.W0.zzb(exc);
    }

    @Override // com.google.android.gms.internal.ads.zznt
    public final void zzb() {
        zzjx zzjxVar = this.a.f1;
        if (zzjxVar != null) {
            zzjxVar.zzb();
        }
    }
}
