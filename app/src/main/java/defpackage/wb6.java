package defpackage;

import android.content.Context;
import com.google.android.gms.internal.ads.zzfam;
import com.google.android.gms.internal.ads.zzfbw;
import com.google.android.gms.internal.ads.zzfcg;
import com.google.android.gms.internal.ads.zzfcj;
import com.google.android.gms.internal.ads.zzfck;
import com.google.android.gms.internal.ads.zzfcm;
import com.google.android.gms.internal.ads.zzfcp;
import com.google.android.gms.internal.ads.zzfcq;
import com.google.android.gms.internal.ads.zzfdk;
import com.google.android.gms.internal.ads.zzfdp;
import com.google.android.gms.internal.ads.zzguq;
import com.google.android.gms.internal.ads.zzgur;
import com.google.android.gms.internal.ads.zzgus;
import com.google.android.gms.internal.ads.zzgve;

/* JADX INFO: loaded from: classes3.dex */
public final class wb6 implements zzfcm {
    public final zzgur a;
    public final zzgve b;
    public final zzgve c;
    public final zzgve d;
    public final zzgve e;
    public final zzgur f;
    public final zzgve g;

    public /* synthetic */ wb6(eb6 eb6Var, Context context, String str) {
        zzgur zzgurVarZza = zzgus.zza(context);
        this.a = zzgurVarZza;
        zzfam zzfamVar = new zzfam(zzgurVarZza, eb6Var.o0, eb6Var.p0);
        zzgve zzgveVarZzc = zzguq.zzc(new zzfbw(eb6Var.o0));
        this.b = zzgveVarZzc;
        zzgve zzgveVarZzc2 = zzguq.zzc(zzfdk.zza());
        this.c = zzgveVarZzc2;
        zzgve zzgveVarZzc3 = zzguq.zzc(new zzfcg(zzgurVarZza, eb6Var.m, eb6Var.I, zzfamVar, zzgveVarZzc, zzfdp.zza(), zzgveVarZzc2));
        this.d = zzgveVarZzc3;
        this.e = zzguq.zzc(new zzfcq(zzgveVarZzc3, zzgveVarZzc, zzgveVarZzc2));
        zzgur zzgurVarZzc = zzgus.zzc(str);
        this.f = zzgurVarZzc;
        this.g = zzguq.zzc(new zzfck(zzgurVarZzc, zzgveVarZzc3, zzgurVarZza, zzgveVarZzc, zzgveVarZzc2, eb6Var.h));
    }

    @Override // com.google.android.gms.internal.ads.zzfcm
    public final zzfcj zza() {
        return (zzfcj) this.g.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzfcm
    public final zzfcp zzb() {
        return (zzfcp) this.e.zzb();
    }
}
