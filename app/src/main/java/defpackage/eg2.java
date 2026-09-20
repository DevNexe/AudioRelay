package defpackage;

import com.google.android.gms.internal.ads.zzcg;
import com.google.android.gms.internal.ads.zzck;
import com.google.android.gms.internal.ads.zzcn;
import com.google.android.gms.internal.ads.zzel;
import com.google.android.gms.internal.ads.zzfsa;
import com.google.android.gms.internal.ads.zzfuv;
import com.google.android.gms.internal.ads.zzfux;
import com.google.android.gms.internal.ads.zzfuy;
import com.google.android.gms.internal.ads.zzsg;

/* JADX INFO: loaded from: classes.dex */
public final class eg2 {
    public final Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public /* synthetic */ eg2(zzck zzckVar) {
        this.a = zzckVar;
        this.b = zzfuv.zzo();
        this.c = zzfuy.zzd();
    }

    public static zzsg a(zzcg zzcgVar, zzfuv zzfuvVar, zzsg zzsgVar, zzck zzckVar) {
        zzcn zzcnVarZzn = zzcgVar.zzn();
        int iZzg = zzcgVar.zzg();
        Object objZzf = zzcnVarZzn.zzo() ? null : zzcnVarZzn.zzf(iZzg);
        int iZzc = (zzcgVar.zzs() || zzcnVarZzn.zzo()) ? -1 : zzcnVarZzn.zzd(iZzg, zzckVar, false).zzc(zzel.zzv(zzcgVar.zzl()));
        for (int i = 0; i < zzfuvVar.size(); i++) {
            zzsg zzsgVar2 = (zzsg) zzfuvVar.get(i);
            if (d(zzsgVar2, objZzf, zzcgVar.zzs(), zzcgVar.zzd(), zzcgVar.zze(), iZzc)) {
                return zzsgVar2;
            }
        }
        if (zzfuvVar.isEmpty() && zzsgVar != null) {
            if (d(zzsgVar, objZzf, zzcgVar.zzs(), zzcgVar.zzd(), zzcgVar.zze(), iZzc)) {
                return zzsgVar;
            }
        }
        return null;
    }

    public static boolean d(zzsg zzsgVar, Object obj, boolean z, int i, int i2, int i3) {
        if (!zzsgVar.zza.equals(obj)) {
            return false;
        }
        if (z) {
            if (zzsgVar.zzb != i || zzsgVar.zzc != i2) {
                return false;
            }
        } else if (zzsgVar.zzb != -1 || zzsgVar.zze != i3) {
            return false;
        }
        return true;
    }

    public final void b(zzfux zzfuxVar, zzsg zzsgVar, zzcn zzcnVar) {
        if (zzsgVar == null) {
            return;
        }
        if (zzcnVar.zza(zzsgVar.zza) != -1) {
            zzfuxVar.zza(zzsgVar, zzcnVar);
            return;
        }
        zzcn zzcnVar2 = (zzcn) ((zzfuy) this.c).get(zzsgVar);
        if (zzcnVar2 != null) {
            zzfuxVar.zza(zzsgVar, zzcnVar2);
        }
    }

    public final void c(zzcn zzcnVar) {
        zzfux zzfuxVar = new zzfux();
        if (((zzfuv) this.b).isEmpty()) {
            b(zzfuxVar, (zzsg) this.e, zzcnVar);
            if (!zzfsa.zza((zzsg) this.f, (zzsg) this.e)) {
                b(zzfuxVar, (zzsg) this.f, zzcnVar);
            }
            if (!zzfsa.zza((zzsg) this.d, (zzsg) this.e) && !zzfsa.zza((zzsg) this.d, (zzsg) this.f)) {
                b(zzfuxVar, (zzsg) this.d, zzcnVar);
            }
        } else {
            for (int i = 0; i < ((zzfuv) this.b).size(); i++) {
                b(zzfuxVar, (zzsg) ((zzfuv) this.b).get(i), zzcnVar);
            }
            if (!((zzfuv) this.b).contains((zzsg) this.d)) {
                b(zzfuxVar, (zzsg) this.d, zzcnVar);
            }
        }
        this.c = zzfuxVar.zzc();
    }

    public /* synthetic */ eg2(Wh wh, h75 h75Var, hl1 hl1Var, ig2 ig2Var, il1.QnHx qnHx, jg2 jg2Var) {
        this.a = wh;
        this.b = h75Var;
        this.c = hl1Var;
        this.e = ig2Var;
        this.d = qnHx;
        this.f = jg2Var;
    }
}
