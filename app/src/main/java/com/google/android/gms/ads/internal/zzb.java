package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzcao;
import com.google.android.gms.internal.ads.zzcdo;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes.dex */
@ParametersAreNonnullByDefault
public final class zzb {
    public final Context a;
    public boolean b;
    public final zzcdo c;
    public final zzcao d = new zzcao(false, Collections.emptyList());

    public zzb(Context context, zzcdo zzcdoVar, zzcao zzcaoVar) {
        this.a = context;
        this.c = zzcdoVar;
    }

    public final void zza() {
        this.b = true;
    }

    public final void zzb(String str) {
        List<String> list;
        zzcao zzcaoVar = this.d;
        zzcdo zzcdoVar = this.c;
        if ((zzcdoVar != null && zzcdoVar.zza().zzf) || zzcaoVar.zza) {
            if (str == null) {
                str = "";
            }
            if (zzcdoVar != null) {
                zzcdoVar.zzd(str, null, 3);
                return;
            }
            if (!zzcaoVar.zza || (list = zzcaoVar.zzb) == null) {
                return;
            }
            for (String str2 : list) {
                if (!TextUtils.isEmpty(str2)) {
                    String strReplace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                    zzt.zzq();
                    com.google.android.gms.ads.internal.util.zzs.zzH(this.a, "", strReplace);
                }
            }
        }
    }

    public final boolean zzc() {
        zzcdo zzcdoVar = this.c;
        return !((zzcdoVar != null && zzcdoVar.zza().zzf) || this.d.zza) || this.b;
    }
}
