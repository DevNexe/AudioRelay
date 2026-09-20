package com.google.android.gms.internal.ads;

import defpackage.kg6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes3.dex */
public final class zzead {
    public final zzdzq a;
    public final zzdvg b;
    public final Object c = new Object();
    public final ArrayList d = new ArrayList();
    public boolean e;

    public zzead(zzdzq zzdzqVar, zzdvg zzdvgVar) {
        this.a = zzdzqVar;
        this.b = zzdvgVar;
    }

    public final void a(List list) {
        zzdvf zzdvfVarZza;
        zzdvf zzdvfVarZza2;
        zzbxl zzbxlVar;
        synchronized (this.c) {
            if (this.e) {
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzbrl zzbrlVar = (zzbrl) it.next();
                String string = (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzhT)).booleanValue() || (zzdvfVarZza2 = this.b.zza(zzbrlVar.zza)) == null || (zzbxlVar = zzdvfVarZza2.zzc) == null) ? "" : zzbxlVar.toString();
                boolean z = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzhU)).booleanValue() && (zzdvfVarZza = this.b.zza(zzbrlVar.zza)) != null && zzdvfVarZza.zzd;
                ArrayList arrayList = this.d;
                String str = zzbrlVar.zza;
                arrayList.add(new kg6(str, string, this.b.zzc(str), zzbrlVar.zzb ? 1 : 0, zzbrlVar.zzd, zzbrlVar.zzc, z));
            }
            this.e = true;
        }
    }

    public final JSONArray zza() {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.c) {
            if (!this.e) {
                if (!this.a.zzt()) {
                    zzc();
                    return jSONArray;
                }
                a(this.a.zzg());
            }
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                jSONArray.put(((kg6) it.next()).a());
            }
            return jSONArray;
        }
    }

    public final void zzc() {
        this.a.zzs(new zzeab(this));
    }
}
