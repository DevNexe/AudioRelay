package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdvj {
    public final zzfeg a;
    public final zzdvg b;

    public zzdvj(zzfeg zzfegVar, zzdvg zzdvgVar) {
        this.a = zzfegVar;
        this.b = zzdvgVar;
    }

    public final zzbwy zzb(String str) throws RemoteException {
        zzbvf zzbvfVarZzb = this.a.zzb();
        if (zzbvfVarZzb == null) {
            zzcgn.zzj("Unexpected call to adapter creator.");
            throw new RemoteException();
        }
        zzbwy zzbwyVarZzc = zzbvfVarZzb.zzc(str);
        zzdvg zzdvgVar = this.b;
        synchronized (zzdvgVar) {
            if (!zzdvgVar.a.containsKey(str)) {
                try {
                    zzdvgVar.a.put(str, new zzdvf(str, zzbwyVarZzc.zzf(), zzbwyVarZzc.zzg(), true));
                } catch (Throwable unused) {
                }
            }
        }
        return zzbwyVarZzc;
    }

    public final zzfei zzc(String str, JSONObject jSONObject) throws zzfds {
        zzbvi zzbviVarZzb;
        zzdvg zzdvgVar = this.b;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                zzbviVarZzb = new zzbwe(new AdMobAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                zzbviVarZzb = new zzbwe(new zzbxp());
            } else {
                zzbvf zzbvfVarZzb = this.a.zzb();
                if (zzbvfVarZzb == null) {
                    zzcgn.zzj("Unexpected call to adapter creator.");
                    throw new RemoteException();
                }
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    try {
                        String string = jSONObject.getString("class_name");
                        if (zzbvfVarZzb.zze(string)) {
                            zzbviVarZzb = zzbvfVarZzb.zzb("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
                        } else {
                            zzbviVarZzb = zzbvfVarZzb.zzd(string) ? zzbvfVarZzb.zzb(string) : zzbvfVarZzb.zzb("com.google.ads.mediation.customevent.CustomEventAdapter");
                        }
                    } catch (JSONException e) {
                        zzcgn.zzh("Invalid custom event.", e);
                        zzbviVarZzb = zzbvfVarZzb.zzb(str);
                    }
                } else {
                    zzbviVarZzb = zzbvfVarZzb.zzb(str);
                }
            }
            zzfei zzfeiVar = new zzfei(zzbviVarZzb);
            zzdvgVar.a(str, zzfeiVar);
            return zzfeiVar;
        } catch (Throwable th) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzhU)).booleanValue()) {
                zzdvgVar.a(str, null);
            }
            throw new zzfds(th);
        }
    }

    public final boolean zzd() {
        return this.a.zzb() != null;
    }
}
