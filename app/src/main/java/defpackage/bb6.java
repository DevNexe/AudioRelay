package defpackage;

import com.google.android.gms.internal.ads.zzcwx;
import com.google.android.gms.internal.ads.zzdah;
import com.google.android.gms.internal.ads.zzdbs;
import com.google.android.gms.internal.ads.zzdcg;
import com.google.android.gms.internal.ads.zzdck;
import com.google.android.gms.internal.ads.zzdik;
import com.google.android.gms.internal.ads.zzdmw;
import com.google.android.gms.internal.ads.zzdna;
import com.google.android.gms.internal.ads.zzdnb;
import com.google.android.gms.internal.ads.zzdyb;
import com.google.android.gms.internal.ads.zzezo;
import com.google.android.gms.internal.ads.zzfan;
import com.google.android.gms.internal.ads.zzfeq;
import com.google.android.gms.internal.ads.zzguz;

/* JADX INFO: loaded from: classes3.dex */
public final class bb6 implements zzdna {
    public zzdck A;
    public zzdmw B;
    public zzcwx C;
    public final eb6 w;
    public zzfan x;
    public zzezo y;
    public zzdik z;

    public /* synthetic */ bb6(eb6 eb6Var) {
        this.w = eb6Var;
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

    @Override // com.google.android.gms.internal.ads.zzdna
    public final /* synthetic */ zzdna zzc(zzcwx zzcwxVar) {
        this.C = zzcwxVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdna
    public final /* synthetic */ zzdna zzd(zzdmw zzdmwVar) {
        this.B = zzdmwVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdna
    public final /* synthetic */ zzdna zze(zzdik zzdikVar) {
        this.z = zzdikVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdna
    public final /* synthetic */ zzdna zzf(zzdck zzdckVar) {
        this.A = zzdckVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdcg
    /* JADX INFO: renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final zzdnb zzh() {
        zzguz.zzc(this.z, zzdik.class);
        zzguz.zzc(this.A, zzdck.class);
        zzguz.zzc(this.B, zzdmw.class);
        zzguz.zzc(this.C, zzcwx.class);
        return new cb6(this.w, this.C, this.B, new zzdah(), new zzfeq(), new zzdbs(), new zzdyb(), this.z, this.A, this.x, this.y);
    }
}
