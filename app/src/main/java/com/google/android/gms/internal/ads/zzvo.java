package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import defpackage.cc7;
import defpackage.dc7;
import defpackage.ec7;
import defpackage.fc7;
import defpackage.vb7;
import defpackage.wb7;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class zzvo extends zzvt {
    public static final zzfwd i = zzfwd.zzb(new Comparator() { // from class: com.google.android.gms.internal.ads.zzuu
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            Integer num = (Integer) obj;
            Integer num2 = (Integer) obj2;
            zzfwd zzfwdVar = zzvo.i;
            if (num.intValue() == -1) {
                return num2.intValue() == -1 ? 0 : -1;
            }
            if (num2.intValue() == -1) {
                return 1;
            }
            return num.intValue() - num2.intValue();
        }
    });
    public static final zzfwd j = zzfwd.zzb(new Comparator() { // from class: com.google.android.gms.internal.ads.zzuv
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            zzfwd zzfwdVar = zzvo.i;
            return 0;
        }
    });
    public static final /* synthetic */ int zzb = 0;
    public final Object c;
    public final boolean d;
    public zzvc e;
    public final cc7 f;
    public zzk g;
    public final zzuj h;
    public final Context zza;

    @Deprecated
    public zzvo() {
        zzvc zzvcVar = zzvc.zzD;
        throw null;
    }

    public static int b(zzaf zzafVar, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(zzafVar.zzd)) {
            return 4;
        }
        String strC = c(str);
        String strC2 = c(zzafVar.zzd);
        if (strC2 == null || strC == null) {
            return (z && strC2 == null) ? 1 : 0;
        }
        if (strC2.startsWith(strC) || strC.startsWith(strC2)) {
            return 3;
        }
        return zzel.zzah(strC2, "-")[0].equals(zzel.zzah(strC, "-")[0]) ? 2 : 0;
    }

    public static String c(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static boolean d(int i2, boolean z) {
        int i3 = i2 & 7;
        if (i3 != 4) {
            return z && i3 == 3;
        }
        return true;
    }

    public static final Pair f(int i2, zzvs zzvsVar, int[][][] iArr, zzvj zzvjVar, Comparator comparator) {
        RandomAccess randomAccessZzp;
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < 2; i3++) {
            if (i2 == zzvsVar.zzc(i3)) {
                zzue zzueVarZzd = zzvsVar.zzd(i3);
                for (int i4 = 0; i4 < zzueVarZzd.zzc; i4++) {
                    zzcp zzcpVarZzb = zzueVarZzd.zzb(i4);
                    List listZza = zzvjVar.zza(i3, zzcpVarZzb, iArr[i3][i4]);
                    int i5 = zzcpVarZzb.zzb;
                    int i6 = 1;
                    boolean[] zArr = new boolean[1];
                    int i7 = 0;
                    while (i7 <= 0) {
                        ec7 ec7Var = (ec7) listZza.get(i7);
                        int iA = ec7Var.a();
                        if (!zArr[i7] && iA != 0) {
                            if (iA == i6) {
                                randomAccessZzp = zzfuv.zzp(ec7Var);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(ec7Var);
                                for (int i8 = i7 + 1; i8 <= 0; i8++) {
                                    ec7 ec7Var2 = (ec7) listZza.get(i8);
                                    if (ec7Var2.a() == 2 && ec7Var.c(ec7Var2)) {
                                        arrayList2.add(ec7Var2);
                                        zArr[i8] = true;
                                    }
                                }
                                randomAccessZzp = arrayList2;
                            }
                            arrayList.add(randomAccessZzp);
                        }
                        i7++;
                        i6 = 1;
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i9 = 0; i9 < list.size(); i9++) {
            iArr2[i9] = ((ec7) list.get(i9)).y;
        }
        ec7 ec7Var3 = (ec7) list.get(0);
        return Pair.create(new zzvp(ec7Var3.x, iArr2, 0), Integer.valueOf(ec7Var3.w));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x004c  */
    public static boolean zzk(zzvo zzvoVar, zzaf zzafVar) {
        boolean z;
        byte b;
        cc7 cc7Var;
        cc7 cc7Var2;
        synchronized (zzvoVar.c) {
            try {
                z = true;
                if (zzvoVar.e.zzP && !zzvoVar.d && zzafVar.zzz > 2) {
                    String str = zzafVar.zzm;
                    if (str != null) {
                        switch (str) {
                            case "audio/eac3-joc":
                                b = 2;
                                break;
                            case "audio/ac3":
                                b = 0;
                                break;
                            case "audio/ac4":
                                b = 3;
                                break;
                            case "audio/eac3":
                                b = 1;
                                break;
                            default:
                                b = -1;
                                break;
                        }
                        if ((b != 0 && b != 1 && b != 2 && b != 3) || (zzel.zza >= 32 && (cc7Var = zzvoVar.f) != null && cc7Var.b)) {
                        }
                    }
                    if (zzel.zza < 32 || (cc7Var2 = zzvoVar.f) == null || !cc7Var2.b || !cc7Var2.e() || !zzvoVar.f.f() || !zzvoVar.f.d(zzvoVar.g, zzafVar)) {
                        z = false;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    public final Pair a(zzvs zzvsVar, int[][][] iArr, final int[] iArr2) {
        final zzvc zzvcVar;
        int i2;
        final boolean z;
        final String str;
        int[] iArr3;
        int length;
        cc7 cc7Var;
        int[][][] iArr4 = iArr;
        synchronized (this.c) {
            zzvcVar = this.e;
            if (zzvcVar.zzP && zzel.zza >= 32 && (cc7Var = this.f) != null) {
                Looper looperMyLooper = Looper.myLooper();
                zzdd.zzb(looperMyLooper);
                cc7Var.b(this, looperMyLooper);
            }
        }
        int i3 = 2;
        zzvp[] zzvpVarArr = new zzvp[2];
        Pair pairF = f(2, zzvsVar, iArr4, new zzvj() { // from class: com.google.android.gms.internal.ads.zzuq
            /* JADX WARN: Code duplicated, block: B:22:0x0040  */
            @Override // com.google.android.gms.internal.ads.zzvj
            public final List zza(int i4, zzcp zzcpVar, int[] iArr5) {
                int i5;
                int i6;
                int i7;
                int i8;
                zzvc zzvcVar2 = zzvcVar;
                int[] iArr6 = iArr2;
                zzfwd zzfwdVar = zzvo.i;
                int i9 = iArr6[i4];
                int i10 = zzvcVar2.zzl;
                int i11 = zzvcVar2.zzm;
                boolean z2 = zzvcVar2.zzn;
                if (i10 == Integer.MAX_VALUE || i11 == Integer.MAX_VALUE) {
                    i5 = Integer.MAX_VALUE;
                } else {
                    int i12 = 0;
                    int i13 = Integer.MAX_VALUE;
                    while (true) {
                        int i14 = zzcpVar.zzb;
                        if (i12 > 0) {
                            break;
                        }
                        zzaf zzafVarZzb = zzcpVar.zzb(i12);
                        int i15 = zzafVarZzb.zzr;
                        if (i15 > 0 && (i6 = zzafVarZzb.zzs) > 0) {
                            if (z2) {
                                if ((i15 > i6) != (i10 > i11)) {
                                    i8 = i10;
                                    i7 = i11;
                                } else {
                                    i7 = i10;
                                    i8 = i11;
                                }
                            } else {
                                i7 = i10;
                                i8 = i11;
                            }
                            int i16 = i15 * i8;
                            int i17 = i6 * i7;
                            Point point = i16 >= i17 ? new Point(i7, zzel.zze(i17, i15)) : new Point(zzel.zze(i16, i6), i8);
                            int i18 = zzafVarZzb.zzr;
                            int i19 = zzafVarZzb.zzs;
                            int i20 = i18 * i19;
                            if (i18 >= ((int) (point.x * 0.98f)) && i19 >= ((int) (point.y * 0.98f)) && i20 < i13) {
                                i13 = i20;
                            }
                        }
                        i12++;
                    }
                    i5 = i13;
                }
                zzfus zzfusVarZzi = zzfuv.zzi();
                int i21 = 0;
                while (true) {
                    int i22 = zzcpVar.zzb;
                    if (i21 > 0) {
                        return zzfusVarZzi.zzg();
                    }
                    int iZza = zzcpVar.zzb(i21).zza();
                    zzfusVarZzi.zze(new fc7(i4, zzcpVar, i21, zzvcVar2, iArr5[i21], i5 == Integer.MAX_VALUE || (iZza != -1 && iZza <= i5)));
                    i21++;
                }
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzur
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                List list = (List) obj;
                List list2 = (List) obj2;
                zzfuk zzfukVarZzj = zzfuk.zzj();
                zzvl zzvlVar = new Comparator() { // from class: com.google.android.gms.internal.ads.zzvl
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        fc7 fc7Var = (fc7) obj3;
                        fc7 fc7Var2 = (fc7) obj4;
                        zzfuk zzfukVarZzc = zzfuk.zzj().zzd(fc7Var.D, fc7Var2.D).zzb(fc7Var.H, fc7Var2.H).zzd(true, true).zzd(fc7Var.A, fc7Var2.A).zzd(fc7Var.C, fc7Var2.C).zzc(Integer.valueOf(fc7Var.G), Integer.valueOf(fc7Var2.G), zzfwd.zzc().zza());
                        boolean z2 = fc7Var.J;
                        zzfuk zzfukVarZzd = zzfukVarZzc.zzd(z2, fc7Var2.J);
                        boolean z3 = fc7Var.K;
                        zzfuk zzfukVarZzd2 = zzfukVarZzd.zzd(z3, fc7Var2.K);
                        if (z2 && z3) {
                            zzfukVarZzd2 = zzfukVarZzd2.zzb(fc7Var.L, fc7Var2.L);
                        }
                        return zzfukVarZzd2.zza();
                    }
                };
                zzfuk zzfukVarZzb = zzfukVarZzj.zzc((fc7) Collections.max(list, zzvlVar), (fc7) Collections.max(list2, zzvlVar), zzvlVar).zzb(list.size(), list2.size());
                zzvm zzvmVar = new Comparator() { // from class: com.google.android.gms.internal.ads.zzvm
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        fc7 fc7Var = (fc7) obj3;
                        fc7 fc7Var2 = (fc7) obj4;
                        zzfwd zzfwdVarZza = (fc7Var.A && fc7Var.D) ? zzvo.i : zzvo.i.zza();
                        zzfuk zzfukVarZzj2 = zzfuk.zzj();
                        int i4 = fc7Var.E;
                        Integer numValueOf = Integer.valueOf(i4);
                        Integer numValueOf2 = Integer.valueOf(fc7Var2.E);
                        boolean z2 = fc7Var.B.zzz;
                        return zzfukVarZzj2.zzc(numValueOf, numValueOf2, zzvo.j).zzc(Integer.valueOf(fc7Var.F), Integer.valueOf(fc7Var2.F), zzfwdVarZza).zzc(Integer.valueOf(i4), Integer.valueOf(fc7Var2.E), zzfwdVarZza).zza();
                    }
                };
                return zzfukVarZzb.zzc((fc7) Collections.max(list, zzvmVar), (fc7) Collections.max(list2, zzvmVar), zzvmVar).zza();
            }
        });
        if (pairF != null) {
            zzvpVarArr[((Integer) pairF.second).intValue()] = (zzvp) pairF.first;
        }
        int i4 = 0;
        while (true) {
            i2 = 1;
            if (i4 >= 2) {
                z = false;
                break;
            }
            if (zzvsVar.zzc(i4) == 2 && zzvsVar.zzd(i4).zzc > 0) {
                z = true;
                break;
            }
            i4++;
        }
        Pair pairF2 = f(1, zzvsVar, iArr4, new zzvj() { // from class: com.google.android.gms.internal.ads.zzuo
            /* JADX WARN: Type inference failed for: r12v0, types: [com.google.android.gms.internal.ads.zzun] */
            @Override // com.google.android.gms.internal.ads.zzvj
            public final List zza(int i5, zzcp zzcpVar, int[] iArr5) {
                final zzvo zzvoVar = this.zza;
                zzvc zzvcVar2 = zzvcVar;
                boolean z2 = z;
                ?? r12 = new zzfsg() { // from class: com.google.android.gms.internal.ads.zzun
                    @Override // com.google.android.gms.internal.ads.zzfsg
                    public final boolean zza(Object obj) {
                        return zzvo.zzk(zzvoVar, (zzaf) obj);
                    }
                };
                zzfus zzfusVarZzi = zzfuv.zzi();
                int i6 = 0;
                while (true) {
                    int i7 = zzcpVar.zzb;
                    if (i6 > 0) {
                        return zzfusVarZzi.zzg();
                    }
                    zzfusVarZzi.zze(new vb7(i5, zzcpVar, i6, zzvcVar2, iArr5[i6], z2, r12));
                    i6++;
                }
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzup
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((vb7) Collections.max((List) obj)).d((vb7) Collections.max((List) obj2));
            }
        });
        if (pairF2 != null) {
            zzvpVarArr[((Integer) pairF2.second).intValue()] = (zzvp) pairF2.first;
        }
        if (pairF2 == null) {
            str = null;
        } else {
            zzvp zzvpVar = (zzvp) pairF2.first;
            str = zzvpVar.zza.zzb(zzvpVar.zzb[0]).zzd;
        }
        int i5 = 3;
        Pair pairF3 = f(3, zzvsVar, iArr4, new zzvj() { // from class: com.google.android.gms.internal.ads.zzus
            @Override // com.google.android.gms.internal.ads.zzvj
            public final List zza(int i6, zzcp zzcpVar, int[] iArr5) {
                zzvc zzvcVar2 = zzvcVar;
                String str2 = str;
                zzfwd zzfwdVar = zzvo.i;
                zzfus zzfusVarZzi = zzfuv.zzi();
                int i7 = 0;
                while (true) {
                    int i8 = zzcpVar.zzb;
                    if (i7 > 0) {
                        return zzfusVarZzi.zzg();
                    }
                    zzfusVarZzi.zze(new dc7(i6, zzcpVar, i7, zzvcVar2, iArr5[i7], str2));
                    i7++;
                }
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzut
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((dc7) ((List) obj).get(0)).d((dc7) ((List) obj2).get(0));
            }
        });
        if (pairF3 != null) {
            zzvpVarArr[((Integer) pairF3.second).intValue()] = (zzvp) pairF3.first;
        }
        int i6 = 0;
        while (i6 < i3) {
            int iZzc = zzvsVar.zzc(i6);
            if (iZzc != i3 && iZzc != i2 && iZzc != i5) {
                zzue zzueVarZzd = zzvsVar.zzd(i6);
                int[][] iArr5 = iArr4[i6];
                zzcp zzcpVar = null;
                wb7 wb7Var = null;
                int i7 = 0;
                for (int i8 = 0; i8 < zzueVarZzd.zzc; i8++) {
                    zzcp zzcpVarZzb = zzueVarZzd.zzb(i8);
                    int[] iArr6 = iArr5[i8];
                    int i9 = 0;
                    while (true) {
                        int i10 = zzcpVarZzb.zzb;
                        if (i9 <= 0) {
                            if (d(iArr6[i9], zzvcVar.zzQ)) {
                                wb7 wb7Var2 = new wb7(zzcpVarZzb.zzb(i9), iArr6[i9]);
                                if (wb7Var == null || zzfuk.zzj().zzd(wb7Var2.x, wb7Var.x).zzd(wb7Var2.w, wb7Var.w).zza() > 0) {
                                    wb7Var = wb7Var2;
                                    i7 = i9;
                                    zzcpVar = zzcpVarZzb;
                                }
                            }
                            i9++;
                        }
                    }
                }
                zzvpVarArr[i6] = zzcpVar == null ? null : new zzvp(zzcpVar, new int[]{i7}, 0);
            }
            i6++;
            iArr4 = iArr;
            i3 = 2;
            i2 = 1;
            i5 = 3;
        }
        HashMap map = new HashMap();
        for (int i11 = 0; i11 < 2; i11++) {
            zzue zzueVarZzd2 = zzvsVar.zzd(i11);
            for (int i12 = 0; i12 < zzueVarZzd2.zzc; i12++) {
                if (((zzcr) zzvcVar.zzB.get(zzueVarZzd2.zzb(i12))) != null) {
                    throw null;
                }
            }
        }
        zzue zzueVarZze = zzvsVar.zze();
        for (int i13 = 0; i13 < zzueVarZze.zzc; i13++) {
            if (((zzcr) zzvcVar.zzB.get(zzueVarZze.zzb(i13))) != null) {
                throw null;
            }
        }
        for (int i14 = 0; i14 < 2; i14++) {
            if (((zzcr) map.get(Integer.valueOf(zzvsVar.zzc(i14)))) != null) {
                throw null;
            }
        }
        int i15 = 0;
        for (int i16 = 2; i15 < i16; i16 = 2) {
            zzue zzueVarZzd3 = zzvsVar.zzd(i15);
            if (zzvcVar.zzg(i15, zzueVarZzd3)) {
                if (zzvcVar.zze(i15, zzueVarZzd3) != null) {
                    throw null;
                }
                zzvpVarArr[i15] = null;
            }
            i15++;
        }
        for (int i17 = 0; i17 < 2; i17++) {
            int iZzc2 = zzvsVar.zzc(i17);
            if (zzvcVar.zzf(i17) || zzvcVar.zzC.contains(Integer.valueOf(iZzc2))) {
                zzvpVarArr[i17] = null;
            }
        }
        zzuj zzujVar = this.h;
        zzwe zzweVar = this.b;
        zzdd.zzb(zzweVar);
        ArrayList arrayList = new ArrayList();
        for (int i18 = 0; i18 < 2; i18++) {
            zzvp zzvpVar2 = zzvpVarArr[i18];
            if (zzvpVar2 == null || zzvpVar2.zzb.length <= 1) {
                arrayList.add(null);
            } else {
                zzfus zzfusVarZzi = zzfuv.zzi();
                zzfusVarZzi.zze(new zzui(0L, 0L));
                arrayList.add(zzfusVarZzi);
            }
        }
        int i19 = 2;
        long[][] jArr = new long[2][];
        int i20 = 0;
        while (i20 < i19) {
            zzvp zzvpVar3 = zzvpVarArr[i20];
            if (zzvpVar3 == null) {
                jArr[i20] = new long[0];
            } else {
                jArr[i20] = new long[zzvpVar3.zzb.length];
                int i21 = 0;
                while (true) {
                    int[] iArr7 = zzvpVar3.zzb;
                    if (i21 >= iArr7.length) {
                        break;
                    }
                    jArr[i20][i21] = zzvpVar3.zza.zzb(iArr7[i21]).zzi;
                    i21++;
                }
                Arrays.sort(jArr[i20]);
            }
            i20++;
            i19 = 2;
        }
        int[] iArr8 = new int[i19];
        long[] jArr2 = new long[i19];
        int i22 = 0;
        while (i22 < i19) {
            long[] jArr3 = jArr[i22];
            jArr2[i22] = jArr3.length == 0 ? 0L : jArr3[0];
            i22++;
            i19 = 2;
        }
        zzuk.a(arrayList, jArr2);
        zzfvg zzfvgVarZza = zzfvy.zzc(zzfwd.zzc()).zzb(2).zza();
        int i23 = 0;
        for (int i24 = 2; i23 < i24; i24 = 2) {
            int length2 = jArr[i23].length;
            if (length2 > 1) {
                double[] dArr = new double[length2];
                int i25 = 0;
                while (true) {
                    long[] jArr4 = jArr[i23];
                    double dLog = 0.0d;
                    if (i25 >= jArr4.length) {
                        break;
                    }
                    long j2 = jArr4[i25];
                    if (j2 != -1) {
                        dLog = Math.log(j2);
                    }
                    dArr[i25] = dLog;
                    i25++;
                }
                int i26 = length2 - 1;
                double d = dArr[i26] - dArr[0];
                int i27 = 0;
                while (i27 < i26) {
                    int i28 = i27 + 1;
                    zzfvgVarZza.zzs(Double.valueOf(d == 0.0d ? 1.0d : (((dArr[i27] + dArr[i28]) * 0.5d) - dArr[0]) / d), Integer.valueOf(i23));
                    d = d;
                    i27 = i28;
                }
            }
            i23++;
        }
        zzfuv zzfuvVarZzm = zzfuv.zzm(zzfvgVarZza.zzt());
        for (int i29 = 0; i29 < zzfuvVarZzm.size(); i29++) {
            int iIntValue = ((Integer) zzfuvVarZzm.get(i29)).intValue();
            int i30 = iArr8[iIntValue] + 1;
            iArr8[iIntValue] = i30;
            jArr2[iIntValue] = jArr[iIntValue][i30];
            zzuk.a(arrayList, jArr2);
        }
        for (int i31 = 0; i31 < 2; i31++) {
            if (arrayList.get(i31) != null) {
                long j3 = jArr2[i31];
                jArr2[i31] = j3 + j3;
            }
        }
        zzuk.a(arrayList, jArr2);
        zzfus zzfusVarZzi2 = zzfuv.zzi();
        for (int i32 = 0; i32 < arrayList.size(); i32++) {
            zzfus zzfusVar = (zzfus) arrayList.get(i32);
            zzfusVarZzi2.zze(zzfusVar == null ? zzfuv.zzo() : zzfusVar.zzg());
        }
        zzfuv zzfuvVarZzg = zzfusVarZzi2.zzg();
        int i33 = 2;
        zzvq[] zzvqVarArr = new zzvq[2];
        int i34 = 0;
        while (i34 < i33) {
            zzvp zzvpVar4 = zzvpVarArr[i34];
            if (zzvpVar4 != null && (length = (iArr3 = zzvpVar4.zzb).length) != 0) {
                zzvqVarArr[i34] = length == 1 ? new zzvr(zzvpVar4.zza, iArr3[0], 0, 0, null) : new zzuk(zzvpVar4.zza, iArr3, zzweVar, (zzfuv) zzfuvVarZzg.get(i34), zzujVar.a);
            }
            i34++;
            i33 = 2;
        }
        zzka[] zzkaVarArr = new zzka[i33];
        for (int i35 = 0; i35 < i33; i35++) {
            zzkaVarArr[i35] = (zzvcVar.zzf(i35) || zzvcVar.zzC.contains(Integer.valueOf(zzvsVar.zzc(i35))) || (zzvsVar.zzc(i35) != -2 && zzvqVarArr[i35] == null)) ? null : zzka.zza;
        }
        return Pair.create(zzkaVarArr, zzvqVarArr);
    }

    public final void e() {
        boolean z;
        zzvv zzvvVar;
        cc7 cc7Var;
        synchronized (this.c) {
            z = this.e.zzP && !this.d && zzel.zza >= 32 && (cc7Var = this.f) != null && cc7Var.b;
        }
        if (!z || (zzvvVar = this.a) == null) {
            return;
        }
        zzvvVar.zzj();
    }

    public final zzvc zzc() {
        zzvc zzvcVar;
        synchronized (this.c) {
            zzvcVar = this.e;
        }
        return zzvcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    public final void zzh() {
        cc7 cc7Var;
        synchronized (this.c) {
            if (zzel.zza >= 32 && (cc7Var = this.f) != null) {
                cc7Var.c();
            }
        }
        super.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    public final void zzi(zzk zzkVar) {
        boolean z;
        synchronized (this.c) {
            z = !this.g.equals(zzkVar);
            this.g = zzkVar;
        }
        if (z) {
            e();
        }
    }

    public final void zzj(zzva zzvaVar) {
        boolean z;
        zzvc zzvcVar = new zzvc(zzvaVar);
        synchronized (this.c) {
            z = !this.e.equals(zzvcVar);
            this.e = zzvcVar;
        }
        if (z) {
            if (zzvcVar.zzP && this.zza == null) {
                Log.w("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
            }
            zzvv zzvvVar = this.a;
            if (zzvvVar != null) {
                zzvvVar.zzj();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    public final boolean zzl() {
        return true;
    }

    public zzvo(Context context) {
        zzuj zzujVar = new zzuj();
        zzvc zzvcVarZzd = zzvc.zzd(context);
        this.c = new Object();
        this.zza = context != null ? context.getApplicationContext() : null;
        this.h = zzujVar;
        this.e = zzvcVarZzd;
        this.g = zzk.zza;
        boolean z = false;
        if (context != null && zzel.zzX(context)) {
            z = true;
        }
        this.d = z;
        if (!z && context != null && zzel.zza >= 32) {
            this.f = cc7.a(context);
        }
        if (this.e.zzP && context == null) {
            Log.w("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }
}
