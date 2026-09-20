package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzyk {
    public final List zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final float zze;
    public final String zzf;

    public zzyk(ArrayList arrayList, int i, int i2, int i3, float f, String str) {
        this.zza = arrayList;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = i3;
        this.zze = f;
        this.zzf = str;
    }

    public static zzyk zza(zzed zzedVar) throws zzbu {
        String strZza;
        int i;
        int i2;
        float f;
        try {
            zzedVar.zzG(4);
            int iZzk = (zzedVar.zzk() & 3) + 1;
            if (iZzk == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iZzk2 = zzedVar.zzk() & 31;
            for (int i3 = 0; i3 < iZzk2; i3++) {
                int iZzo = zzedVar.zzo();
                int iZzc = zzedVar.zzc();
                zzedVar.zzG(iZzo);
                arrayList.add(zzdf.zzc(zzedVar.zzH(), iZzc, iZzo));
            }
            int iZzk3 = zzedVar.zzk();
            for (int i4 = 0; i4 < iZzk3; i4++) {
                int iZzo2 = zzedVar.zzo();
                int iZzc2 = zzedVar.zzc();
                zzedVar.zzG(iZzo2);
                arrayList.add(zzdf.zzc(zzedVar.zzH(), iZzc2, iZzo2));
            }
            if (iZzk2 > 0) {
                zzaab zzaabVarZzd = zzaac.zzd((byte[]) arrayList.get(0), iZzk + 1, ((byte[]) arrayList.get(0)).length);
                int i5 = zzaabVarZzd.zze;
                int i6 = zzaabVarZzd.zzf;
                float f2 = zzaabVarZzd.zzg;
                strZza = zzdf.zza(zzaabVarZzd.zza, zzaabVarZzd.zzb, zzaabVarZzd.zzc);
                i = i5;
                i2 = i6;
                f = f2;
            } else {
                strZza = null;
                i = -1;
                i2 = -1;
                f = 1.0f;
            }
            return new zzyk(arrayList, iZzk, i, i2, f, strZza);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw zzbu.zza("Error parsing AVC config", e);
        }
    }
}
