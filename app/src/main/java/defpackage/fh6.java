package defpackage;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.overlay.zzz;
import com.google.android.gms.ads.internal.zzj;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbpt;
import com.google.android.gms.internal.ads.zzcgn;
import com.google.android.gms.internal.ads.zzcgt;
import com.google.android.gms.internal.ads.zzchf;
import com.google.android.gms.internal.ads.zzcmn;
import com.google.android.gms.internal.ads.zzcwl;
import com.google.android.gms.internal.ads.zzddl;
import com.google.android.gms.internal.ads.zzdmc;
import com.google.android.gms.internal.ads.zzdmn;
import com.google.android.gms.internal.ads.zzfcs;
import com.google.android.gms.internal.ads.zzfcx;
import com.google.android.gms.internal.ads.zzfdn;
import com.google.android.gms.internal.ads.zzfyo;
import com.google.android.gms.internal.ads.zzfyx;

/* JADX INFO: loaded from: classes3.dex */
public final class fh6 implements zzdmn {
    public final zzcgt a;
    public final zzfyx b;
    public final zzfcs c;
    public final zzcmn d;
    public final zzfdn e;
    public final zzbpt f;
    public final boolean g;

    public fh6(zzcgt zzcgtVar, zzchf zzchfVar, zzfcs zzfcsVar, zzcmn zzcmnVar, zzfdn zzfdnVar, boolean z, zzbpt zzbptVar) {
        this.a = zzcgtVar;
        this.b = zzchfVar;
        this.c = zzfcsVar;
        this.d = zzcmnVar;
        this.e = zzfdnVar;
        this.g = z;
        this.f = zzbptVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdmn
    public final void zza(boolean z, Context context, zzddl zzddlVar) {
        int i;
        zzcwl zzcwlVar = (zzcwl) zzfyo.zzq(this.b);
        this.d.zzap(true);
        zzbpt zzbptVar = this.f;
        boolean z2 = this.g;
        boolean zZze = z2 ? zzbptVar.zze(true) : true;
        boolean zZzd = z2 ? zzbptVar.zzd() : false;
        float fZza = z2 ? zzbptVar.zza() : 0.0f;
        zzfcs zzfcsVar = this.c;
        zzj zzjVar = new zzj(zZze, true, zZzd, fZza, -1, z, zzfcsVar.zzP, false);
        if (zzddlVar != null) {
            zzddlVar.zzf();
        }
        zzt.zzj();
        zzdmc zzdmcVarZzg = zzcwlVar.zzg();
        zzcmn zzcmnVar = this.d;
        int i2 = zzfcsVar.zzR;
        zzfdn zzfdnVar = this.e;
        if (i2 == -1) {
            zzw zzwVar = zzfdnVar.zzj;
            if (zzwVar != null) {
                int i3 = zzwVar.zza;
                if (i3 == 1) {
                    i = 7;
                } else if (i3 == 2) {
                    i = 6;
                }
            }
            zzcgn.zze("Error setting app open orientation; no targeting orientation available.");
            i2 = zzfcsVar.zzR;
            i = i2;
        } else {
            i = i2;
        }
        zzcgt zzcgtVar = this.a;
        String str = zzfcsVar.zzC;
        zzfcx zzfcxVar = zzfcsVar.zzt;
        zzm.zza(context, new AdOverlayInfoParcel((zza) null, zzdmcVarZzg, (zzz) null, zzcmnVar, i, zzcgtVar, str, zzjVar, zzfcxVar.zzb, zzfcxVar.zza, zzfdnVar.zzf, zzddlVar), true);
    }
}
