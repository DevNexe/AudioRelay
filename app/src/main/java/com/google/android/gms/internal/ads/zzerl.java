package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzerl implements zzeun {
    public final zzfyy a;

    public zzerl(Context context, zzfyy zzfyyVar) {
        this.a = zzfyyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final int zza() {
        return 19;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final zzfyx zzb() {
        return this.a.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzerk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String strZzj;
                String strZzk;
                String strZze;
                com.google.android.gms.ads.internal.zzt.zzq();
                zzbcl zzbclVarZzg = com.google.android.gms.ads.internal.zzt.zzp().zzh().zzg();
                Bundle bundle = null;
                if (zzbclVarZzg != null && (!com.google.android.gms.ads.internal.zzt.zzp().zzh().zzM() || !com.google.android.gms.ads.internal.zzt.zzp().zzh().zzN())) {
                    if (zzbclVarZzg.zzh()) {
                        zzbclVarZzg.zzg();
                    }
                    zzbcb zzbcbVarZza = zzbclVarZzg.zza();
                    if (zzbcbVarZza != null) {
                        strZzj = zzbcbVarZza.zzd();
                        strZze = zzbcbVarZza.zze();
                        strZzk = zzbcbVarZza.zzf();
                        if (strZzj != null) {
                            com.google.android.gms.ads.internal.zzt.zzp().zzh().zzw(strZzj);
                        }
                        if (strZzk != null) {
                            com.google.android.gms.ads.internal.zzt.zzp().zzh().zzy(strZzk);
                        }
                    } else {
                        strZzj = com.google.android.gms.ads.internal.zzt.zzp().zzh().zzj();
                        strZzk = com.google.android.gms.ads.internal.zzt.zzp().zzh().zzk();
                        strZze = null;
                    }
                    Bundle bundle2 = new Bundle(1);
                    if (!com.google.android.gms.ads.internal.zzt.zzp().zzh().zzN()) {
                        if (strZzk == null || TextUtils.isEmpty(strZzk)) {
                            bundle2.putString("v_fp_vertical", "no_hash");
                        } else {
                            bundle2.putString("v_fp_vertical", strZzk);
                        }
                    }
                    if (strZzj != null && !com.google.android.gms.ads.internal.zzt.zzp().zzh().zzM()) {
                        bundle2.putString("fingerprint", strZzj);
                        if (!strZzj.equals(strZze)) {
                            bundle2.putString("v_fp", strZze);
                        }
                    }
                    if (!bundle2.isEmpty()) {
                        bundle = bundle2;
                    }
                }
                return new zzerm(bundle);
            }
        });
    }
}
