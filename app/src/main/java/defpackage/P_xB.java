package defpackage;

import com.google.android.gms.internal.ads.zzdah;
import com.google.android.gms.internal.ads.zzdbs;
import com.google.android.gms.internal.ads.zzdcg;
import com.google.android.gms.internal.ads.zzdck;
import com.google.android.gms.internal.ads.zzdik;
import com.google.android.gms.internal.ads.zzdue;
import com.google.android.gms.internal.ads.zzduf;
import com.google.android.gms.internal.ads.zzdyb;
import com.google.android.gms.internal.ads.zzezo;
import com.google.android.gms.internal.ads.zzfan;
import com.google.android.gms.internal.ads.zzfeq;
import com.google.android.gms.internal.ads.zzguz;

/* JADX INFO: loaded from: classes.dex */
public final class P_xB implements zzdue {
    public Object A;
    public final Object w;
    public Object x;
    public Object y;
    public Object z;

    public /* synthetic */ P_xB(eb6 eb6Var) {
        this.w = eb6Var;
    }

    public /* synthetic */ P_xB(wc3 wc3Var, EWe eWe, gR2r gr2r, qu3 qu3Var, yiTP yitp) {
        this.w = wc3Var;
        this.x = eWe;
        this.y = gr2r;
        this.z = qu3Var;
        this.A = yitp;
    }

    @Override // com.google.android.gms.internal.ads.zzdcg
    public final /* synthetic */ zzdcg zza(zzezo zzezoVar) {
        this.y = zzezoVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdcg
    public final /* synthetic */ zzdcg zzb(zzfan zzfanVar) {
        this.x = zzfanVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdue
    public final /* synthetic */ zzdue zzc(zzdik zzdikVar) {
        this.z = zzdikVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdue
    public final /* synthetic */ zzdue zzd(zzdck zzdckVar) {
        this.A = zzdckVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdcg
    /* JADX INFO: renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final zzduf zzh() {
        zzguz.zzc((zzdik) this.z, zzdik.class);
        zzguz.zzc((zzdck) this.A, zzdck.class);
        return new ac6((eb6) this.w, new zzdah(), new zzfeq(), new zzdbs(), new zzdyb(), (zzdik) this.z, (zzdck) this.A, (zzfan) this.x, (zzezo) this.y);
    }
}
