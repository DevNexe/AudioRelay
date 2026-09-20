package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdvg {

    @GuardedBy("this")
    public final HashMap a = new HashMap();

    public final synchronized void a(String str, @Nullable zzfei zzfeiVar) {
        zzbxl zzbxlVarZze;
        boolean z;
        if (this.a.containsKey(str)) {
            return;
        }
        zzbxl zzbxlVarZzf = null;
        if (zzfeiVar == null) {
            zzbxlVarZze = null;
        } else {
            try {
                zzbxlVarZze = zzfeiVar.zze();
            } catch (zzfds unused) {
                zzbxlVarZze = null;
            }
        }
        if (zzfeiVar != null) {
            try {
                zzbxlVarZzf = zzfeiVar.zzf();
            } catch (zzfds unused2) {
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzhU)).booleanValue()) {
            if (zzfeiVar != null) {
                try {
                    zzfeiVar.zzA();
                    z = true;
                } catch (zzfds unused3) {
                    z = false;
                }
            }
            z = false;
        } else {
            z = true;
        }
        this.a.put(str, new zzdvf(str, zzbxlVarZze, zzbxlVarZzf, z));
    }

    @Nullable
    public final synchronized zzdvf zza(String str) {
        return (zzdvf) this.a.get(str);
    }

    @Nullable
    public final zzdvf zzb(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzdvf zzdvfVarZza = zza((String) it.next());
            if (zzdvfVarZza != null) {
                return zzdvfVarZza;
            }
        }
        return null;
    }

    public final String zzc(String str) {
        zzbxl zzbxlVar;
        zzdvf zzdvfVarZza = zza(str);
        return (zzdvfVarZza == null || (zzbxlVar = zzdvfVarZza.zzb) == null) ? "" : zzbxlVar.toString();
    }
}
