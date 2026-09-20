package defpackage;

import com.google.android.gms.internal.ads.zzcwn;
import com.google.android.gms.internal.ads.zzdah;
import com.google.android.gms.internal.ads.zzdbs;
import com.google.android.gms.internal.ads.zzdcg;
import com.google.android.gms.internal.ads.zzdck;
import com.google.android.gms.internal.ads.zzdik;
import com.google.android.gms.internal.ads.zzdyb;
import com.google.android.gms.internal.ads.zzdyp;
import com.google.android.gms.internal.ads.zzdyt;
import com.google.android.gms.internal.ads.zzdyz;
import com.google.android.gms.internal.ads.zzdza;
import com.google.android.gms.internal.ads.zzdzd;
import com.google.android.gms.internal.ads.zzdze;
import com.google.android.gms.internal.ads.zzezo;
import com.google.android.gms.internal.ads.zzfan;
import com.google.android.gms.internal.ads.zzfeq;
import com.google.android.gms.internal.ads.zzguz;

/* JADX INFO: loaded from: classes.dex */
public final class eg4 implements zzcwn, zzdyp {
    public Object A;
    public final Object w;
    public Object x;
    public Object y;
    public Object z;

    public eg4(dc4 dc4Var, pq2 pq2Var, ps psVar, w50 w50Var) {
        this.w = dc4Var;
        this.x = pq2Var;
        this.y = psVar;
        this.z = w50Var;
        this.A = psVar.a.getInetAddress().getHostAddress();
    }

    public /* synthetic */ eg4(eb6 eb6Var) {
        this.w = eb6Var;
    }

    public /* synthetic */ eg4(eb6 eb6Var, sb6 sb6Var, Long l, String str) {
        this.z = this;
        this.x = eb6Var;
        this.y = sb6Var;
        this.w = l;
        this.A = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdcg
    public final /* synthetic */ zzdcg zza(zzezo zzezoVar) {
        this.y = zzezoVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdyp
    public final zzdyz zza() {
        long jLongValue = ((Long) this.w).longValue();
        sb6 sb6Var = (sb6) this.y;
        return zzdza.zza(jLongValue, sb6Var.a, zzdyt.zzc(sb6Var.b), (eb6) this.x, (String) this.A);
    }

    @Override // com.google.android.gms.internal.ads.zzdcg
    public final /* synthetic */ zzdcg zzb(zzfan zzfanVar) {
        this.x = zzfanVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdyp
    public final zzdzd zzb() {
        long jLongValue = ((Long) this.w).longValue();
        sb6 sb6Var = (sb6) this.y;
        return zzdze.zza(jLongValue, sb6Var.a, zzdyt.zzc(sb6Var.b), (eb6) this.x, (String) this.A);
    }

    @Override // com.google.android.gms.internal.ads.zzcwn
    public final /* synthetic */ zzcwn zzc(zzdik zzdikVar) {
        this.z = zzdikVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcwn
    public final /* synthetic */ zzcwn zzd(zzdck zzdckVar) {
        this.A = zzdckVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdcg
    public final /* bridge */ /* synthetic */ Object zzh() {
        zzguz.zzc((zzdik) this.z, zzdik.class);
        zzguz.zzc((zzdck) this.A, zzdck.class);
        return new hb6((eb6) this.w, new zzdah(), new zzfeq(), new zzdbs(), new zzdyb(), (zzdik) this.z, (zzdck) this.A, (zzfan) this.x, (zzezo) this.y);
    }
}
