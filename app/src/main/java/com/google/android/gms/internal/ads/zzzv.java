package com.google.android.gms.internal.ads;

import android.util.Log;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzzv {
    public final List zza;
    public final int zzb;
    public final float zzc;
    public final String zzd;

    public zzzv(List list, int i, float f, String str) {
        this.zza = list;
        this.zzb = i;
        this.zzc = f;
        this.zzd = str;
    }

    /* JADX WARN: Code duplicated, block: B:122:0x0261  */
    public static zzzv zza(zzed zzedVar) throws zzbu {
        int i;
        float f;
        try {
            zzedVar.zzG(21);
            int iZzk = zzedVar.zzk() & 3;
            int iZzk2 = zzedVar.zzk();
            int iZzc = zzedVar.zzc();
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < iZzk2; i4++) {
                zzedVar.zzG(1);
                int iZzo = zzedVar.zzo();
                for (int i5 = 0; i5 < iZzo; i5++) {
                    int iZzo2 = zzedVar.zzo();
                    i3 += iZzo2 + 4;
                    zzedVar.zzG(iZzo2);
                }
            }
            zzedVar.zzF(iZzc);
            byte[] bArr = new byte[i3];
            String strZzb = null;
            int i6 = 0;
            float f2 = 1.0f;
            int i7 = 0;
            while (i6 < iZzk2) {
                int iZzk3 = zzedVar.zzk() & 127;
                int iZzo3 = zzedVar.zzo();
                int i8 = 0;
                while (i8 < iZzo3) {
                    int iZzo4 = zzedVar.zzo();
                    System.arraycopy(zzaac.zza, i2, bArr, i7, 4);
                    int i9 = i7 + 4;
                    System.arraycopy(zzedVar.zzH(), zzedVar.zzc(), bArr, i9, iZzo4);
                    if (iZzk3 == 33 && i8 == 0) {
                        zzaae zzaaeVar = new zzaae(bArr, i9 + 2, i9 + iZzo4);
                        zzaaeVar.zze(4);
                        int iZza = zzaaeVar.zza(3);
                        zzaaeVar.zzd();
                        int iZza2 = zzaaeVar.zza(2);
                        boolean zZzf = zzaaeVar.zzf();
                        int iZza3 = zzaaeVar.zza(5);
                        int i10 = 0;
                        for (int i11 = 0; i11 < 32; i11++) {
                            if (zzaaeVar.zzf()) {
                                i10 |= 1 << i11;
                            }
                        }
                        int[] iArr = new int[6];
                        for (int i12 = 0; i12 < 6; i12++) {
                            iArr[i12] = zzaaeVar.zza(8);
                        }
                        int iZza4 = zzaaeVar.zza(8);
                        int i13 = 0;
                        for (int i14 = 0; i14 < iZza; i14++) {
                            if (zzaaeVar.zzf()) {
                                i13 += 89;
                            }
                            if (zzaaeVar.zzf()) {
                                i13 += 8;
                            }
                        }
                        zzaaeVar.zze(i13);
                        if (iZza > 0) {
                            int i15 = 8 - iZza;
                            zzaaeVar.zze(i15 + i15);
                        }
                        zzaaeVar.zzc();
                        int iZzc2 = zzaaeVar.zzc();
                        if (iZzc2 == 3) {
                            zzaaeVar.zzd();
                            iZzc2 = 3;
                        }
                        zzaaeVar.zzc();
                        zzaaeVar.zzc();
                        if (zzaaeVar.zzf()) {
                            zzaaeVar.zzc();
                            zzaaeVar.zzc();
                            zzaaeVar.zzc();
                            zzaaeVar.zzc();
                            if (iZzc2 != 1) {
                            }
                        }
                        zzaaeVar.zzc();
                        zzaaeVar.zzc();
                        int iZzc3 = zzaaeVar.zzc();
                        for (int i16 = true != zzaaeVar.zzf() ? iZza : 0; i16 <= iZza; i16++) {
                            zzaaeVar.zzc();
                            zzaaeVar.zzc();
                            zzaaeVar.zzc();
                        }
                        zzaaeVar.zzc();
                        zzaaeVar.zzc();
                        zzaaeVar.zzc();
                        zzaaeVar.zzc();
                        zzaaeVar.zzc();
                        zzaaeVar.zzc();
                        if (zzaaeVar.zzf() && zzaaeVar.zzf()) {
                            int i17 = 0;
                            while (i17 < 4) {
                                int i18 = 0;
                                while (i18 < 6) {
                                    if (zzaaeVar.zzf()) {
                                        int iMin = Math.min(64, 1 << ((i17 + i17) + 4));
                                        if (i17 > 1) {
                                            zzaaeVar.zzb();
                                        }
                                        for (int i19 = 0; i19 < iMin; i19++) {
                                            zzaaeVar.zzb();
                                        }
                                    } else {
                                        zzaaeVar.zzc();
                                    }
                                    i18 += i17 == 3 ? 3 : 1;
                                    iZzk3 = iZzk3;
                                }
                                i17++;
                                iZzk3 = iZzk3;
                            }
                        }
                        i = iZzk3;
                        zzaaeVar.zze(2);
                        if (zzaaeVar.zzf()) {
                            zzaaeVar.zze(8);
                            zzaaeVar.zzc();
                            zzaaeVar.zzc();
                            zzaaeVar.zzd();
                        }
                        int iZzc4 = zzaaeVar.zzc();
                        int i20 = 0;
                        boolean zZzf2 = false;
                        int i21 = 0;
                        while (i20 < iZzc4) {
                            if (i20 != 0) {
                                zZzf2 = zzaaeVar.zzf();
                            }
                            if (zZzf2) {
                                zzaaeVar.zzd();
                                zzaaeVar.zzc();
                                for (int i22 = 0; i22 <= i21; i22++) {
                                    if (!zzaaeVar.zzf()) {
                                        zzaaeVar.zzd();
                                    }
                                }
                            } else {
                                int iZzc5 = zzaaeVar.zzc();
                                int iZzc6 = zzaaeVar.zzc();
                                int i23 = iZzc5 + iZzc6;
                                for (int i24 = 0; i24 < iZzc5; i24++) {
                                    zzaaeVar.zzc();
                                    zzaaeVar.zzd();
                                }
                                for (int i25 = 0; i25 < iZzc6; i25++) {
                                    zzaaeVar.zzc();
                                    zzaaeVar.zzd();
                                }
                                i21 = i23;
                            }
                            i20++;
                            iZzc4 = iZzc4;
                            zZzf2 = zZzf2;
                        }
                        if (zzaaeVar.zzf()) {
                            for (int i26 = 0; i26 < zzaaeVar.zzc(); i26++) {
                                zzaaeVar.zze(iZzc3 + 5);
                            }
                        }
                        zzaaeVar.zze(2);
                        if (zzaaeVar.zzf()) {
                            if (zzaaeVar.zzf()) {
                                int iZza5 = zzaaeVar.zza(8);
                                if (iZza5 == 255) {
                                    int iZza6 = zzaaeVar.zza(16);
                                    int iZza7 = zzaaeVar.zza(16);
                                    if (iZza6 == 0 || iZza7 == 0) {
                                        f = 1.0f;
                                    } else {
                                        f = iZza6 / iZza7;
                                    }
                                } else if (iZza5 < 17) {
                                    f = zzaac.zzb[iZza5];
                                } else {
                                    Log.w("NalUnitUtil", "Unexpected aspect_ratio_idc value: " + iZza5);
                                    f = 1.0f;
                                }
                            } else {
                                f = 1.0f;
                            }
                            if (zzaaeVar.zzf()) {
                                zzaaeVar.zzd();
                            }
                            if (zzaaeVar.zzf()) {
                                zzaaeVar.zze(4);
                                if (zzaaeVar.zzf()) {
                                    zzaaeVar.zze(24);
                                }
                            }
                            if (zzaaeVar.zzf()) {
                                zzaaeVar.zzc();
                                zzaaeVar.zzc();
                            }
                            zzaaeVar.zzd();
                            zzaaeVar.zzf();
                        } else {
                            f = 1.0f;
                        }
                        strZzb = zzdf.zzb(iZza2, zZzf, iZza3, i10, iArr, iZza4);
                        f2 = f;
                        i8 = 0;
                    } else {
                        i = iZzk3;
                    }
                    i7 = i9 + iZzo4;
                    zzedVar.zzG(iZzo4);
                    i8++;
                    iZzk2 = iZzk2;
                    iZzk3 = i;
                    i2 = 0;
                }
                i6++;
                i2 = 0;
            }
            return new zzzv(i3 == 0 ? Collections.emptyList() : Collections.singletonList(bArr), iZzk + 1, f2, strZzb);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw zzbu.zza("Error parsing HEVC config", e);
        }
    }
}
