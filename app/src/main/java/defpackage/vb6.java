package defpackage;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.internal.ads.zzenp;
import com.google.android.gms.internal.ads.zzenw;
import com.google.android.gms.internal.ads.zzenx;
import com.google.android.gms.internal.ads.zzfaw;
import com.google.android.gms.internal.ads.zzfay;
import com.google.android.gms.internal.ads.zzfbw;
import com.google.android.gms.internal.ads.zzfdp;
import com.google.android.gms.internal.ads.zzguq;
import com.google.android.gms.internal.ads.zzgur;
import com.google.android.gms.internal.ads.zzgus;
import com.google.android.gms.internal.ads.zzgve;

/* JADX INFO: loaded from: classes3.dex */
public final class vb6 implements zzfay {
    public final zzgur a;
    public final zzgur b;
    public final zzgur c;
    public final zzgve d;
    public final zzgve e;
    public final zzgve f;
    public final zzgve g;

    public /* synthetic */ vb6(eb6 eb6Var, Context context, String str, zzq zzqVar) {
        zzgur zzgurVarZza = zzgus.zza(context);
        this.a = zzgurVarZza;
        zzgur zzgurVarZza2 = zzgus.zza(zzqVar);
        this.b = zzgurVarZza2;
        zzgur zzgurVarZza3 = zzgus.zza(str);
        this.c = zzgurVarZza3;
        zzgve zzgveVarZzc = zzguq.zzc(new zzenp(eb6Var.l));
        this.d = zzgveVarZzc;
        zzgve zzgveVarZzc2 = zzguq.zzc(new zzfbw(eb6Var.o0));
        this.e = zzgveVarZzc2;
        zzgve zzgveVarZzc3 = zzguq.zzc(new zzfaw(zzgurVarZza, eb6Var.m, eb6Var.I, zzgveVarZzc, zzgveVarZzc2, zzfdp.zza()));
        this.f = zzgveVarZzc3;
        this.g = zzguq.zzc(new zzenx(zzgurVarZza, zzgurVarZza2, zzgurVarZza3, zzgveVarZzc3, zzgveVarZzc, zzgveVarZzc2, eb6Var.h));
    }

    @Override // com.google.android.gms.internal.ads.zzfay
    public final zzenw zza() {
        return (zzenw) this.g.zzb();
    }
}
