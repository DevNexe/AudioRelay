package defpackage;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbqm;
import com.google.android.gms.internal.ads.zzdyo;
import com.google.android.gms.internal.ads.zzdyt;
import com.google.android.gms.internal.ads.zzdyu;
import com.google.android.gms.internal.ads.zzdyv;
import com.google.android.gms.internal.ads.zzdyx;
import com.google.android.gms.internal.ads.zzguq;
import com.google.android.gms.internal.ads.zzgur;
import com.google.android.gms.internal.ads.zzgus;
import com.google.android.gms.internal.ads.zzgve;

/* JADX INFO: loaded from: classes3.dex */
public final class sb6 implements zzdyx {
    public final Context a;
    public final zzbqm b;
    public final eb6 c;
    public final sb6 d = this;
    public final zzgur e;
    public final zzgur f;
    public final zzgve g;

    public /* synthetic */ sb6(eb6 eb6Var, Context context, zzbqm zzbqmVar) {
        this.c = eb6Var;
        this.a = context;
        this.b = zzbqmVar;
        zzgur zzgurVarZza = zzgus.zza(this);
        this.e = zzgurVarZza;
        zzgur zzgurVarZza2 = zzgus.zza(zzbqmVar);
        this.f = zzgurVarZza2;
        this.g = zzguq.zzc(new zzdyv(zzgurVarZza, new zzdyt(zzgurVarZza2)));
    }

    @Override // com.google.android.gms.internal.ads.zzdyx
    public final zzdyo zzb() {
        return new j95(this.c, this.d);
    }

    @Override // com.google.android.gms.internal.ads.zzdyx
    public final zzdyu zzd() {
        return (zzdyu) this.g.zzb();
    }
}
