package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.android.billingclient.api.CQf;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbke;
import com.google.android.gms.internal.ads.zzcbe;
import com.google.android.gms.internal.ads.zzcbf;
import com.google.android.gms.internal.ads.zzcbi;
import com.google.android.gms.internal.play_billing.zze;
import com.google.android.gms.measurement.internal.zzgq;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import java.util.HashMap;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p87 implements Callable {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    public /* synthetic */ p87(int i, Object obj, String str) {
        this.w = i;
        this.x = obj;
        this.y = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Throwable {
        switch (this.w) {
            case 0:
                CQf cQf = (CQf) this.x;
                String str = (String) this.y;
                zze zzeVar = cQf.f;
                String packageName = cQf.e.getPackageName();
                Bundle bundle = new Bundle();
                bundle.putBoolean("vr", true);
                return Integer.valueOf(zzeVar.w0(7, packageName, str, bundle));
            case 1:
                zzcbi zzcbiVar = (zzcbi) this.y;
                WeakHashMap weakHashMap = zzcbiVar.a;
                Context context = (Context) this.x;
                r76 r76Var = (r76) weakHashMap.get(context);
                zzcbf zzcbfVarZza = (r76Var == null || ((Long) zzbke.zza.zze()).longValue() + r76Var.a < zzt.zzB().b()) ? new zzcbe(context).zza() : new zzcbe(context, r76Var.b).zza();
                zzcbiVar.a.put(context, new r76(zzcbfVarZza));
                return zzcbfVarZza;
            case 2:
                wl6 wl6Var = (wl6) this.x;
                String str2 = (String) this.y;
                iy5 iy5Var = wl6Var.b.c;
                r27.E(iy5Var);
                ow6 ow6VarY = iy5Var.y(str2);
                HashMap map = new HashMap();
                map.put("platform", MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID);
                map.put("package_name", str2);
                wl6Var.a.g.j();
                map.put("gmp_version", 73000L);
                if (ow6VarY != null) {
                    String strF = ow6VarY.F();
                    if (strF != null) {
                        map.put("app_version", strF);
                    }
                    map.put("app_version_int", Long.valueOf(ow6VarY.z()));
                    map.put("dynamite_version", Long.valueOf(ow6VarY.A()));
                }
                return map;
            default:
                zzgq zzgqVar = (zzgq) this.x;
                zzgqVar.w.a();
                iy5 iy5Var2 = zzgqVar.w.c;
                r27.E(iy5Var2);
                return iy5Var2.I((String) this.y);
        }
    }

    public p87(zzcbi zzcbiVar, Context context) {
        this.w = 1;
        this.y = zzcbiVar;
        this.x = context;
    }
}
