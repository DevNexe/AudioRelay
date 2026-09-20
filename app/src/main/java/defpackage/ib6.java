package defpackage;

import android.view.View;
import com.google.android.gms.ads.internal.zzf;
import com.google.android.gms.internal.ads.zzchf;
import com.google.android.gms.internal.ads.zzcwc;
import com.google.android.gms.internal.ads.zzdah;
import com.google.android.gms.internal.ads.zzdbs;
import com.google.android.gms.internal.ads.zzdcg;
import com.google.android.gms.internal.ads.zzdck;
import com.google.android.gms.internal.ads.zzdik;
import com.google.android.gms.internal.ads.zzdyb;
import com.google.android.gms.internal.ads.zzelw;
import com.google.android.gms.internal.ads.zzemb;
import com.google.android.gms.internal.ads.zzezo;
import com.google.android.gms.internal.ads.zzfan;
import com.google.android.gms.internal.ads.zzfcs;
import com.google.android.gms.internal.ads.zzfde;
import com.google.android.gms.internal.ads.zzfeq;
import com.google.android.gms.internal.ads.zzguz;

/* JADX INFO: loaded from: classes3.dex */
public final class ib6 implements zzcwc, zzf {
    public Object A;
    public final Object w;
    public Object x;
    public Object y;
    public Object z;

    public /* synthetic */ ib6(zzelw zzelwVar, zzchf zzchfVar, zzfde zzfdeVar, zzfcs zzfcsVar, zzemb zzembVar) {
        this.A = zzelwVar;
        this.w = zzchfVar;
        this.x = zzfdeVar;
        this.y = zzfcsVar;
        this.z = zzembVar;
    }

    public /* synthetic */ ib6(eb6 eb6Var) {
        this.w = eb6Var;
    }

    @Override // com.google.android.gms.internal.ads.zzdcg
    public final /* synthetic */ zzdcg zza(zzezo zzezoVar) {
        this.y = zzezoVar;
        return this;
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zza(View view) {
        ((zzchf) this.w).zzd(((zzelw) this.A).d.zza((zzfde) this.x, (zzfcs) this.y, view, (zzemb) this.z));
    }

    @Override // com.google.android.gms.internal.ads.zzdcg
    public final /* synthetic */ zzdcg zzb(zzfan zzfanVar) {
        this.x = zzfanVar;
        return this;
    }

    @Override // com.google.android.gms.ads.internal.zzf
    /* JADX INFO: renamed from: zzb */
    public final void mo44zzb() {
    }

    @Override // com.google.android.gms.internal.ads.zzcwc
    public final /* synthetic */ zzcwc zzc(zzdik zzdikVar) {
        this.z = zzdikVar;
        return this;
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzcwc
    public final /* synthetic */ zzcwc zzd(zzdck zzdckVar) {
        this.A = zzdckVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdcg
    public final /* bridge */ /* synthetic */ Object zzh() {
        zzguz.zzc((zzdik) this.z, zzdik.class);
        zzguz.zzc((zzdck) this.A, zzdck.class);
        return new jb6((eb6) this.w, new zzdah(), new zzfeq(), new zzdbs(), new zzdyb(), (zzdik) this.z, (zzdck) this.A, (zzfan) this.x, (zzezo) this.y);
    }
}
