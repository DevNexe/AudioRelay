package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class zzapa extends zzaoz {
    public zzapa(Context context, String str, boolean z) {
        super(context, str, z);
    }

    public static zzapa zzs(String str, Context context, boolean z) {
        zzaoz.l(context, false);
        return new zzapa(context, str, false);
    }

    @Deprecated
    public static zzapa zzt(String str, Context context, boolean z, int i) {
        zzaoz.l(context, z);
        return new zzapa(context, str, z);
    }

    @Override // com.google.android.gms.internal.ads.zzaoz
    public final ArrayList j(zzaqb zzaqbVar, Context context, zzamh zzamhVar) {
        if (zzaqbVar.zzk() == null || !this.Q) {
            return super.j(zzaqbVar, context, zzamhVar);
        }
        int iZza = zzaqbVar.zza();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(super.j(zzaqbVar, context, zzamhVar));
        arrayList.add(new zzaqs(zzaqbVar, "f39Hbu/3ZHOuknzzffAN3L/wmMd3z47Qz3PAKZYAx1YBPOpdL/44XYH2Sf+BtSh+", "LWwi57CIM0frlO/aZZoO3fCsCmO9IloxmiaKJl7K70k=", zzamhVar, iZza, 24));
        return arrayList;
    }
}
