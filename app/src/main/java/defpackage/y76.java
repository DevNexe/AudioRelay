package defpackage;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.internal.ads.zzcdq;
import com.google.android.gms.internal.ads.zzcdr;
import com.google.android.gms.internal.ads.zzcdt;
import com.google.android.gms.internal.ads.zzcdu;
import com.google.android.gms.internal.ads.zzcdv;
import com.google.android.gms.internal.ads.zzces;
import com.google.android.gms.internal.ads.zzcet;
import com.google.android.gms.internal.ads.zzcey;
import com.google.android.gms.internal.ads.zzguq;
import com.google.android.gms.internal.ads.zzgur;
import com.google.android.gms.internal.ads.zzgus;
import com.google.android.gms.internal.ads.zzgve;

/* JADX INFO: loaded from: classes3.dex */
public final class y76 extends zzcet {
    public final ft b;
    public final zzgur c;
    public final zzgur d;
    public final zzgur e;
    public final zzgve f;
    public final zzgur g;
    public final zzgve h;
    public final zzgve i;

    public /* synthetic */ y76(Context context, ft ftVar, zzg zzgVar, zzces zzcesVar) {
        this.b = ftVar;
        zzgur zzgurVarZza = zzgus.zza(context);
        this.c = zzgurVarZza;
        zzgur zzgurVarZza2 = zzgus.zza(zzgVar);
        this.d = zzgurVarZza2;
        zzgur zzgurVarZza3 = zzgus.zza(zzcesVar);
        this.e = zzgurVarZza3;
        this.f = zzguq.zzc(new zzcdr(zzgurVarZza, zzgurVarZza2, zzgurVarZza3));
        zzgur zzgurVarZza4 = zzgus.zza(ftVar);
        this.g = zzgurVarZza4;
        zzgve zzgveVarZzc = zzguq.zzc(new zzcdt(zzgurVarZza4, zzgurVarZza2, zzgurVarZza3));
        this.h = zzgveVarZzc;
        this.i = zzguq.zzc(new zzcey(zzgurVarZza, new zzcdv(zzgurVarZza4, zzgveVarZzc)));
    }

    @Override // com.google.android.gms.internal.ads.zzcet
    public final zzcdu a() {
        return new zzcdu(this.b, (x76) this.h.zzb());
    }

    public final zzcdq b() {
        return (zzcdq) this.f.zzb();
    }

    public final d86 c() {
        return (d86) this.i.zzb();
    }
}
