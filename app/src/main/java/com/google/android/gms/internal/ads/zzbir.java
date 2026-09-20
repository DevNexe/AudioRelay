package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbir {
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();

    public final List zza() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            String str = (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb((zzbiq) it.next());
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        zzbiz.a(arrayList2, zzbka.zzc("gad:dynamite_module:experiment_id", ""));
        zzbiz.a(arrayList2, zzbkl.zza);
        zzbiz.a(arrayList2, zzbkl.zzb);
        zzbiz.a(arrayList2, zzbkl.zzc);
        zzbiz.a(arrayList2, zzbkl.zzd);
        zzbiz.a(arrayList2, zzbkl.zze);
        zzbiz.a(arrayList2, zzbkl.zzu);
        zzbiz.a(arrayList2, zzbkl.zzf);
        zzbiz.a(arrayList2, zzbkl.zzm);
        zzbiz.a(arrayList2, zzbkl.zzn);
        zzbiz.a(arrayList2, zzbkl.zzo);
        zzbiz.a(arrayList2, zzbkl.zzp);
        zzbiz.a(arrayList2, zzbkl.zzq);
        zzbiz.a(arrayList2, zzbkl.zzr);
        zzbiz.a(arrayList2, zzbkl.zzs);
        zzbiz.a(arrayList2, zzbkl.zzt);
        zzbiz.a(arrayList2, zzbkl.zzg);
        zzbiz.a(arrayList2, zzbkl.zzh);
        zzbiz.a(arrayList2, zzbkl.zzi);
        zzbiz.a(arrayList2, zzbkl.zzj);
        zzbiz.a(arrayList2, zzbkl.zzk);
        zzbiz.a(arrayList2, zzbkl.zzl);
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    public final List zzb() {
        List listZza = zza();
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            String str = (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb((zzbiq) it.next());
            if (!TextUtils.isEmpty(str)) {
                listZza.add(str);
            }
        }
        ArrayList arrayList = new ArrayList();
        zzbiz.a(arrayList, zzbky.zza);
        listZza.addAll(arrayList);
        return listZza;
    }

    public final void zzc(zzbiq zzbiqVar) {
        this.b.add(zzbiqVar);
    }

    public final void zzd(zzbiq zzbiqVar) {
        this.a.add(zzbiqVar);
    }

    public final void zze(SharedPreferences.Editor editor, int i, JSONObject jSONObject) {
        for (zzbiq zzbiqVar : this.a) {
            if (zzbiqVar.zze() == 1) {
                zzbiqVar.zzd(editor, zzbiqVar.a(jSONObject));
            }
        }
        if (jSONObject != null) {
            editor.putString("flag_configuration", jSONObject.toString());
        } else {
            zzcgn.zzg("Flag Json is null.");
        }
    }
}
