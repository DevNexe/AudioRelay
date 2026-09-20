package defpackage;

import com.google.android.gms.internal.ads.zzaag;
import com.google.android.gms.internal.ads.zzaai;
import com.google.android.gms.internal.ads.zzaaj;
import com.google.android.gms.internal.ads.zzaby;

/* JADX INFO: loaded from: classes3.dex */
public final class at5 implements zzaai {
    public final /* synthetic */ zzaai a;
    public final /* synthetic */ zzaby b;

    public at5(zzaby zzabyVar, zzaai zzaaiVar) {
        this.b = zzabyVar;
        this.a = zzaaiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaai
    public final long zze() {
        return this.a.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzaai
    public final zzaag zzg(long j) {
        zzaag zzaagVarZzg = this.a.zzg(j);
        zzaaj zzaajVar = zzaagVarZzg.zza;
        long j2 = zzaajVar.zzb;
        long j3 = zzaajVar.zzc;
        zzaby zzabyVar = this.b;
        zzaaj zzaajVar2 = new zzaaj(j2, j3 + zzabyVar.w);
        zzaaj zzaajVar3 = zzaagVarZzg.zzb;
        return new zzaag(zzaajVar2, new zzaaj(zzaajVar3.zzb, zzaajVar3.zzc + zzabyVar.w));
    }

    @Override // com.google.android.gms.internal.ads.zzaai
    public final boolean zzh() {
        return this.a.zzh();
    }
}
