package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes3.dex */
@ParametersAreNonnullByDefault
@Deprecated
public final class zzbjn {
    public final LinkedList a = new LinkedList();
    public final LinkedHashMap b;
    public final Object c;

    public zzbjn(boolean z, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.b = linkedHashMap;
        this.c = new Object();
        linkedHashMap.put("action", "make_wv");
        linkedHashMap.put("ad_format", str2);
    }

    public static final zzbjk zzf() {
        return new zzbjk(com.google.android.gms.ads.internal.zzt.zzB().c(), null, null);
    }

    public final zzbjm zza() {
        zzbjm zzbjmVar;
        boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzbB)).booleanValue();
        StringBuilder sb = new StringBuilder();
        HashMap map = new HashMap();
        synchronized (this.c) {
            for (zzbjk zzbjkVar : this.a) {
                long jZza = zzbjkVar.zza();
                String strZzc = zzbjkVar.zzc();
                zzbjk zzbjkVarZzb = zzbjkVar.zzb();
                if (zzbjkVarZzb != null && jZza > 0) {
                    long jZza2 = jZza - zzbjkVarZzb.zza();
                    sb.append(strZzc);
                    sb.append('.');
                    sb.append(jZza2);
                    sb.append(',');
                    if (zBooleanValue) {
                        if (map.containsKey(Long.valueOf(zzbjkVarZzb.zza()))) {
                            StringBuilder sb2 = (StringBuilder) map.get(Long.valueOf(zzbjkVarZzb.zza()));
                            sb2.append('+');
                            sb2.append(strZzc);
                        } else {
                            map.put(Long.valueOf(zzbjkVarZzb.zza()), new StringBuilder(strZzc));
                        }
                    }
                }
            }
            this.a.clear();
            String string = null;
            if (!TextUtils.isEmpty(null)) {
                sb.append((String) null);
            } else if (sb.length() > 0) {
                sb.setLength(sb.length() - 1);
            }
            StringBuilder sb3 = new StringBuilder();
            if (zBooleanValue) {
                for (Map.Entry entry : map.entrySet()) {
                    sb3.append((CharSequence) entry.getValue());
                    sb3.append('.');
                    sb3.append((((Long) entry.getKey()).longValue() - com.google.android.gms.ads.internal.zzt.zzB().c()) + com.google.android.gms.ads.internal.zzt.zzB().b());
                    sb3.append(',');
                }
                if (sb3.length() > 0) {
                    sb3.setLength(sb3.length() - 1);
                }
                string = sb3.toString();
            }
            zzbjmVar = new zzbjm(sb.toString(), string);
        }
        return zzbjmVar;
    }

    public final Map zzb() {
        LinkedHashMap linkedHashMap;
        synchronized (this.c) {
            com.google.android.gms.ads.internal.zzt.zzp().zzf();
            linkedHashMap = this.b;
        }
        return linkedHashMap;
    }

    public final void zzc(zzbjn zzbjnVar) {
        synchronized (this.c) {
        }
    }

    public final void zzd(String str, String str2) {
        zzbjd zzbjdVarZzf;
        if (TextUtils.isEmpty(str2) || (zzbjdVarZzf = com.google.android.gms.ads.internal.zzt.zzp().zzf()) == null) {
            return;
        }
        synchronized (this.c) {
            zzbjj zzbjjVarZza = zzbjdVarZzf.zza(str);
            LinkedHashMap linkedHashMap = this.b;
            linkedHashMap.put(str, zzbjjVarZza.zza((String) linkedHashMap.get(str), str2));
        }
    }

    public final boolean zze(zzbjk zzbjkVar, long j, String... strArr) {
        synchronized (this.c) {
            for (int i = 0; i <= 0; i++) {
                this.a.add(new zzbjk(j, strArr[i], zzbjkVar));
            }
        }
        return true;
    }
}
