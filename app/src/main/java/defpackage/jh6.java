package defpackage;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.overlay.zzz;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzj;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbpt;
import com.google.android.gms.internal.ads.zzcgt;
import com.google.android.gms.internal.ads.zzchf;
import com.google.android.gms.internal.ads.zzcmn;
import com.google.android.gms.internal.ads.zzddl;
import com.google.android.gms.internal.ads.zzdlf;
import com.google.android.gms.internal.ads.zzdmc;
import com.google.android.gms.internal.ads.zzdmn;
import com.google.android.gms.internal.ads.zzfcs;
import com.google.android.gms.internal.ads.zzfcx;
import com.google.android.gms.internal.ads.zzfdn;
import com.google.android.gms.internal.ads.zzfyo;
import com.google.android.gms.internal.ads.zzfyx;

/* JADX INFO: loaded from: classes3.dex */
public final class jh6 implements zzdmn {
    public final Context a;
    public final zzcgt b;
    public final zzfyx c;
    public final zzfcs d;
    public final zzcmn e;
    public final zzfdn f;
    public final zzbpt g;
    public final boolean h;

    public jh6(Context context, zzcgt zzcgtVar, zzchf zzchfVar, zzfcs zzfcsVar, zzcmn zzcmnVar, zzfdn zzfdnVar, boolean z, zzbpt zzbptVar) {
        this.a = context;
        this.b = zzcgtVar;
        this.c = zzchfVar;
        this.d = zzfcsVar;
        this.e = zzcmnVar;
        this.f = zzfdnVar;
        this.g = zzbptVar;
        this.h = z;
    }

    @Override // com.google.android.gms.internal.ads.zzdmn
    public final void zza(boolean z, Context context, zzddl zzddlVar) {
        zzdlf zzdlfVar = (zzdlf) zzfyo.zzq(this.c);
        this.e.zzap(true);
        zzbpt zzbptVar = this.g;
        boolean z2 = this.h;
        boolean zZze = z2 ? zzbptVar.zze(false) : false;
        zzt.zzq();
        boolean zZzE = zzs.zzE(this.a);
        boolean zZzd = z2 ? zzbptVar.zzd() : false;
        float fZza = z2 ? zzbptVar.zza() : 0.0f;
        zzfcs zzfcsVar = this.d;
        zzj zzjVar = new zzj(zZze, zZzE, zZzd, fZza, -1, z, zzfcsVar.zzP, false);
        if (zzddlVar != null) {
            zzddlVar.zzf();
        }
        zzt.zzj();
        zzdmc zzdmcVarZzj = zzdlfVar.zzj();
        zzcmn zzcmnVar = this.e;
        int i = zzfcsVar.zzR;
        zzcgt zzcgtVar = this.b;
        String str = zzfcsVar.zzC;
        zzfcx zzfcxVar = zzfcsVar.zzt;
        zzm.zza(context, new AdOverlayInfoParcel((zza) null, zzdmcVarZzj, (zzz) null, zzcmnVar, i, zzcgtVar, str, zzjVar, zzfcxVar.zzb, zzfcxVar.zza, this.f.zzf, zzddlVar), true);
    }
}
