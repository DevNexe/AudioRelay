package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import defpackage.jl6;
import defpackage.pz5;
import defpackage.uy5;
import java.util.ArrayList;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzflq implements zzfkv {
    public static final zzflq g = new zzflq();
    public static final Handler h = new Handler(Looper.getMainLooper());
    public static Handler i = null;
    public static final uy5 j = new uy5();
    public static final jl6 k = new jl6();
    public long f;
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final zzflj d = new zzflj();
    public final zzfkx c = new zzfkx();
    public final zzflk e = new zzflk(new zzflt());

    public static zzflq zzd() {
        return g;
    }

    @Override // com.google.android.gms.internal.ads.zzfkv
    public final void zza(View view, zzfkw zzfkwVar, JSONObject jSONObject, boolean z) {
        zzflj zzfljVar;
        int iZzk;
        boolean z2;
        if (zzflh.zzb(view) != null || (iZzk = (zzfljVar = this.d).zzk(view)) == 3) {
            return;
        }
        JSONObject jSONObjectZza = zzfkwVar.zza(view);
        zzfle.zzc(jSONObject, jSONObjectZza);
        String strZzd = zzfljVar.zzd(view);
        if (strZzd != null) {
            zzfle.zzb(jSONObjectZza, strZzd);
            zzfle.zze(jSONObjectZza, Boolean.valueOf(zzfljVar.zzj(view)));
            zzfljVar.zzh();
            return;
        }
        zzfli zzfliVarZzb = zzfljVar.zzb(view);
        if (zzfliVarZzb != null) {
            zzfle.zzd(jSONObjectZza, zzfliVarZzb);
            z2 = true;
        } else {
            z2 = false;
        }
        zzfkwVar.zzb(view, jSONObjectZza, this, iZzk == 1, z || z2);
    }

    public final void zzh() {
        Handler handler = i;
        if (handler != null) {
            handler.removeCallbacks(k);
            i = null;
        }
    }

    public final void zzi() {
        if (i == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            i = handler;
            handler.post(j);
            i.postDelayed(k, 200L);
        }
    }

    public final void zzj() {
        Handler handler = i;
        if (handler != null) {
            handler.removeCallbacks(k);
            i = null;
        }
        this.a.clear();
        h.post(new pz5(this, 6));
    }
}
