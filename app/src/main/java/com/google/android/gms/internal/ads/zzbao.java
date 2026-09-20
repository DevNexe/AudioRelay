package com.google.android.gms.internal.ads;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbao {
    public final List zza;
    public final int zzb;
    public final float zzc;

    public zzbao(ArrayList arrayList, int i, float f) {
        this.zza = arrayList;
        this.zzb = i;
        this.zzc = f;
    }

    public static zzbao zza(zzbag zzbagVar) throws zzasv {
        int i;
        try {
            zzbagVar.zzw(4);
            int iZzg = (zzbagVar.zzg() & 3) + 1;
            if (iZzg == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iZzg2 = zzbagVar.zzg() & 31;
            for (int i2 = 0; i2 < iZzg2; i2++) {
                int iZzj = zzbagVar.zzj();
                int iZzc = zzbagVar.zzc();
                zzbagVar.zzw(iZzj);
                arrayList.add(zzazz.zzb(zzbagVar.zza, iZzc, iZzj));
            }
            int iZzg3 = zzbagVar.zzg();
            for (int i3 = 0; i3 < iZzg3; i3++) {
                int iZzj2 = zzbagVar.zzj();
                int iZzc2 = zzbagVar.zzc();
                zzbagVar.zzw(iZzj2);
                arrayList.add(zzazz.zzb(zzbagVar.zza, iZzc2, iZzj2));
            }
            float f = 1.0f;
            if (iZzg2 > 0) {
                zzbah zzbahVar = new zzbah((byte[]) arrayList.get(0), iZzg, ((byte[]) arrayList.get(0)).length);
                zzbahVar.zzd(8);
                int iZza = zzbahVar.zza(8);
                zzbahVar.zzd(16);
                zzbahVar.zzc();
                if (iZza == 100 || iZza == 110 || iZza == 122 || iZza == 244 || iZza == 44 || iZza == 83 || iZza == 86 || iZza == 118 || iZza == 128 || iZza == 138) {
                    int iZzc3 = zzbahVar.zzc();
                    if (iZzc3 == 3) {
                        zzbahVar.zze();
                        i = 3;
                    } else {
                        i = iZzc3;
                    }
                    zzbahVar.zzc();
                    zzbahVar.zzc();
                    zzbahVar.zzd(1);
                    if (zzbahVar.zze()) {
                        int i4 = i != 3 ? 8 : 12;
                        int i5 = 0;
                        while (i5 < i4) {
                            if (zzbahVar.zze()) {
                                int i6 = i5 < 6 ? 16 : 64;
                                int iZzb = 8;
                                int i7 = 8;
                                for (int i8 = 0; i8 < i6; i8++) {
                                    if (iZzb != 0) {
                                        iZzb = ((zzbahVar.zzb() + i7) + 256) % 256;
                                    }
                                    if (iZzb != 0) {
                                        i7 = iZzb;
                                    }
                                }
                            }
                            i5++;
                        }
                    }
                }
                zzbahVar.zzc();
                int iZzc4 = zzbahVar.zzc();
                if (iZzc4 == 0) {
                    zzbahVar.zzc();
                } else if (iZzc4 == 1) {
                    zzbahVar.zze();
                    zzbahVar.zzb();
                    zzbahVar.zzb();
                    long jZzc = zzbahVar.zzc();
                    for (int i9 = 0; i9 < jZzc; i9++) {
                        zzbahVar.zzc();
                    }
                }
                zzbahVar.zzc();
                zzbahVar.zzd(1);
                zzbahVar.zzc();
                zzbahVar.zzc();
                if (!zzbahVar.zze()) {
                    zzbahVar.zzd(1);
                }
                zzbahVar.zzd(1);
                if (zzbahVar.zze()) {
                    zzbahVar.zzc();
                    zzbahVar.zzc();
                    zzbahVar.zzc();
                    zzbahVar.zzc();
                }
                if (zzbahVar.zze() && zzbahVar.zze()) {
                    int iZza2 = zzbahVar.zza(8);
                    if (iZza2 == 255) {
                        int iZza3 = zzbahVar.zza(16);
                        int iZza4 = zzbahVar.zza(16);
                        if (iZza3 != 0 && iZza4 != 0) {
                            f = iZza3 / iZza4;
                        }
                    } else if (iZza2 < 17) {
                        f = zzbae.zzb[iZza2];
                    } else {
                        Log.w("NalUnitUtil", "Unexpected aspect_ratio_idc value: " + iZza2);
                    }
                }
            }
            return new zzbao(arrayList, iZzg, f);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new zzasv("Error parsing AVC config", e);
        }
    }
}
