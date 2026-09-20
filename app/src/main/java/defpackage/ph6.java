package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.overlay.zzz;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzj;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbiy;
import com.google.android.gms.internal.ads.zzbpt;
import com.google.android.gms.internal.ads.zzbqg;
import com.google.android.gms.internal.ads.zzcgn;
import com.google.android.gms.internal.ads.zzcgt;
import com.google.android.gms.internal.ads.zzchf;
import com.google.android.gms.internal.ads.zzcmn;
import com.google.android.gms.internal.ads.zzcmy;
import com.google.android.gms.internal.ads.zzcny;
import com.google.android.gms.internal.ads.zzcnz;
import com.google.android.gms.internal.ads.zzddl;
import com.google.android.gms.internal.ads.zzdmc;
import com.google.android.gms.internal.ads.zzdmn;
import com.google.android.gms.internal.ads.zzdub;
import com.google.android.gms.internal.ads.zzduw;
import com.google.android.gms.internal.ads.zzdva;
import com.google.android.gms.internal.ads.zzfcs;
import com.google.android.gms.internal.ads.zzfcx;
import com.google.android.gms.internal.ads.zzfdn;
import com.google.android.gms.internal.ads.zzfyo;
import com.google.android.gms.internal.ads.zzfyx;

/* JADX INFO: loaded from: classes3.dex */
public final class ph6 implements zzdmn {
    public final Context a;
    public final zzduw b;
    public final zzfdn c;
    public final zzcgt d;
    public final zzfcs e;
    public final zzfyx f;
    public final zzcmn g;
    public final zzbpt h;
    public final boolean i;

    public ph6(Context context, zzduw zzduwVar, zzfdn zzfdnVar, zzcgt zzcgtVar, zzfcs zzfcsVar, zzchf zzchfVar, zzcmn zzcmnVar, zzbpt zzbptVar, boolean z) {
        this.a = context;
        this.b = zzduwVar;
        this.c = zzfdnVar;
        this.d = zzcgtVar;
        this.e = zzfcsVar;
        this.f = zzchfVar;
        this.g = zzcmnVar;
        this.h = zzbptVar;
        this.i = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzdmn
    public final void zza(boolean z, Context context, zzddl zzddlVar) {
        zzcmn zzcmnVar = this.g;
        zzdub zzdubVar = (zzdub) zzfyo.zzq(this.f);
        try {
            boolean zZzaD = zzcmnVar.zzaD();
            zzfdn zzfdnVar = this.c;
            Context context2 = this.a;
            boolean z2 = this.i;
            zzfcs zzfcsVar = this.e;
            zzbpt zzbptVar = this.h;
            zzcmn zzcmnVar2 = zzcmnVar;
            if (zZzaD) {
                if (((Boolean) zzay.zzc().zzb(zzbiy.zzaG)).booleanValue()) {
                    final zzcmn zzcmnVarZza = this.b.zza(zzfdnVar.zze, null, null);
                    zzbqg.zzb(zzcmnVarZza, zzdubVar.zzg());
                    final zzdva zzdvaVar = new zzdva();
                    zzdvaVar.zza(context2, (View) zzcmnVarZza);
                    zzdubVar.zzl().zzi(zzcmnVarZza, true, z2 ? zzbptVar : null);
                    zzcmnVarZza.zzP().zzz(new zzcny() { // from class: com.google.android.gms.internal.ads.zzeks
                        @Override // com.google.android.gms.internal.ads.zzcny
                        public final void zza(boolean z3) {
                            zzdva zzdvaVar2 = zzdvaVar;
                            zzcmn zzcmnVar3 = zzcmnVarZza;
                            zzdvaVar2.zzb();
                            zzcmnVar3.zzaa();
                            zzcmnVar3.zzP().zzp();
                        }
                    });
                    zzcmnVarZza.zzP().zzF(new zzcnz() { // from class: com.google.android.gms.internal.ads.zzekt
                        @Override // com.google.android.gms.internal.ads.zzcnz
                        public final void zza() {
                            zzcmnVarZza.zzZ();
                        }
                    });
                    zzfcx zzfcxVar = zzfcsVar.zzt;
                    zzcmnVarZza.zzad(zzfcxVar.zzb, zzfcxVar.zza, null);
                    zzcmnVar2 = zzcmnVarZza;
                } else {
                    zzcmnVar2 = zzcmnVar;
                }
            }
            zzcmnVar2.zzap(true);
            boolean zZze = z2 ? zzbptVar.zze(false) : false;
            zzt.zzq();
            zzj zzjVar = new zzj(zZze, zzs.zzE(context2), z2 ? zzbptVar.zzd() : false, z2 ? zzbptVar.zza() : 0.0f, -1, z, zzfcsVar.zzP, zzfcsVar.zzQ);
            if (zzddlVar != null) {
                zzddlVar.zzf();
            }
            zzt.zzj();
            zzdmc zzdmcVarZzj = zzdubVar.zzj();
            int i = zzfcsVar.zzR;
            zzcgt zzcgtVar = this.d;
            String str = zzfcsVar.zzC;
            zzfcx zzfcxVar2 = zzfcsVar.zzt;
            zzm.zza(context, new AdOverlayInfoParcel((zza) null, zzdmcVarZzj, (zzz) null, zzcmnVar2, i, zzcgtVar, str, zzjVar, zzfcxVar2.zzb, zzfcxVar2.zza, zzfdnVar.zzf, zzddlVar), true);
        } catch (zzcmy e) {
            zzcgn.zzh("", e);
        }
    }
}
