package com.google.android.gms.internal.ads;

import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import com.facebook.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import defpackage.GM;
import defpackage.Md5A;
import defpackage.bj0;
import defpackage.g16;
import defpackage.h16;
import defpackage.i16;
import defpackage.l16;
import defpackage.o16;
import defpackage.p16;
import defpackage.q16;
import defpackage.t16;
import defpackage.u16;
import defpackage.xApe;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class zzawe implements zzauv {
    public final SparseArray a;
    public final zzbag b;
    public final zzbag c;
    public final zzbag d;
    public final zzbag e;
    public final byte[] f;
    public final Stack g;
    public final LinkedList h;
    public int i;
    public int j;
    public long k;
    public int l;
    public zzbag m;
    public long n;
    public long o;
    public q16 p;
    public int q;
    public int r;
    public int s;
    public zzauw t;
    public boolean u;
    public static final zzaux zza = new xApe();
    public static final int v = zzban.zzg("seig");
    public static final byte[] w = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    public zzawe() {
        this(0, null, null);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x007b  */
    public static zzaur a(ArrayList arrayList) {
        Pair pairCreate;
        int size = arrayList.size();
        ArrayList arrayList2 = null;
        for (int i = 0; i < size; i++) {
            h16 h16Var = (h16) arrayList.get(i);
            int i2 = h16Var.a;
            int i3 = i16.V;
            if (i2 == i3) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] bArr = h16Var.P0.zza;
                zzbag zzbagVar = new zzbag(bArr);
                if (zzbagVar.zzd() < 32) {
                    pairCreate = null;
                } else {
                    zzbagVar.zzv(0);
                    if (zzbagVar.zze() == zzbagVar.zza() + 4 && zzbagVar.zze() == i3) {
                        int iZze = (zzbagVar.zze() >> 24) & 255;
                        if (iZze > 1) {
                            bj0.b("Unsupported pssh version: ", iZze, "PsshAtomUtil");
                        } else {
                            UUID uuid = new UUID(zzbagVar.zzl(), zzbagVar.zzl());
                            if (iZze == 1) {
                                zzbagVar.zzw(zzbagVar.zzi() * 16);
                            }
                            int iZzi = zzbagVar.zzi();
                            if (iZzi == zzbagVar.zza()) {
                                byte[] bArr2 = new byte[iZzi];
                                zzbagVar.zzq(bArr2, 0, iZzi);
                                pairCreate = Pair.create(uuid, bArr2);
                            }
                        }
                        pairCreate = null;
                    } else {
                        pairCreate = null;
                    }
                }
                UUID uuid2 = pairCreate == null ? null : (UUID) pairCreate.first;
                if (uuid2 == null) {
                    Log.w("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList2.add(new zzauq(uuid2, "video/mp4", bArr, false));
                }
            }
        }
        if (arrayList2 == null) {
            return null;
        }
        return new zzaur(arrayList2);
    }

    public static void c(zzbag zzbagVar, int i, u16 u16Var) throws zzasv {
        zzbagVar.zzv(i + 8);
        int iZze = zzbagVar.zze();
        int i2 = i16.b;
        int i3 = iZze & 16777215;
        if ((i3 & 1) != 0) {
            throw new zzasv("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (i3 & 2) != 0;
        int iZzi = zzbagVar.zzi();
        int i4 = u16Var.e;
        if (iZzi != i4) {
            throw new zzasv(Md5A.e("Length mismatch: ", iZzi, ", ", i4));
        }
        Arrays.fill(u16Var.m, 0, iZzi, z);
        int iZza = zzbagVar.zza();
        zzbag zzbagVar2 = u16Var.p;
        if (zzbagVar2 == null || zzbagVar2.zzd() < iZza) {
            u16Var.p = new zzbag(iZza);
        }
        u16Var.o = iZza;
        u16Var.l = true;
        u16Var.q = true;
        zzbagVar.zzq(u16Var.p.zza, 0, iZza);
        u16Var.p.zzv(0);
        u16Var.q = false;
    }

    public final void b() {
        this.i = 0;
        this.l = 0;
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0339  */
    /* JADX WARN: Code duplicated, block: B:122:0x033c  */
    /* JADX WARN: Code duplicated, block: B:125:0x0342 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:126:0x0344  */
    /* JADX WARN: Code duplicated, block: B:127:0x034d  */
    /* JADX WARN: Code duplicated, block: B:129:0x0353  */
    /* JADX WARN: Code duplicated, block: B:130:0x035c  */
    /* JADX WARN: Code duplicated, block: B:132:0x0362  */
    /* JADX WARN: Code duplicated, block: B:134:0x0365  */
    /* JADX WARN: Code duplicated, block: B:135:0x036a A[DONT_INVERT, PHI: r9
  0x036a: PHI (r9v21 int) = (r9v19 int), (r9v24 int) binds: [B:131:0x0360, B:133:0x0363] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:136:0x036c  */
    /* JADX WARN: Code duplicated, block: B:137:0x0375  */
    /* JADX WARN: Code duplicated, block: B:139:0x037b  */
    /* JADX WARN: Code duplicated, block: B:140:0x038b  */
    /* JADX WARN: Code duplicated, block: B:143:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:144:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:234:0x05aa  */
    public final void d(long j) throws zzasv {
        zzawk zzawkVarA;
        int i;
        int i2;
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i3;
        ArrayList arrayList3;
        long j2;
        int i4;
        long jZzj;
        int[] iArr;
        int[] iArr2;
        long[] jArr;
        boolean[] zArr;
        int i5;
        long j3;
        long j4;
        long j5;
        int i6;
        int iZzi;
        int iZzi2;
        int iZze;
        boolean z;
        zzawe zzaweVar = this;
        while (true) {
            Stack stack = zzaweVar.g;
            if (stack.isEmpty() || ((g16) stack.peek()).P0 != j) {
                break;
            }
            g16 g16Var = (g16) stack.pop();
            int i7 = g16Var.a;
            int i8 = i16.C;
            SparseArray sparseArray2 = zzaweVar.a;
            ArrayList arrayList4 = g16Var.Q0;
            ArrayList arrayList5 = g16Var.R0;
            int i9 = 12;
            int i10 = 8;
            if (i7 == i8) {
                zzaur zzaurVarA = a(arrayList4);
                g16 g16VarB = g16Var.b(i16.N);
                SparseArray sparseArray3 = new SparseArray();
                int size = g16VarB.Q0.size();
                int i11 = 0;
                long jZzm = -9223372036854775807L;
                while (i11 < size) {
                    h16 h16Var = (h16) g16VarB.Q0.get(i11);
                    int i12 = h16Var.a;
                    int i13 = i16.z;
                    zzbag zzbagVar = h16Var.P0;
                    if (i12 == i13) {
                        zzbagVar.zzv(i9);
                        Pair pairCreate = Pair.create(Integer.valueOf(zzbagVar.zze()), new o16(zzbagVar.zzi() - 1, zzbagVar.zzi(), zzbagVar.zzi(), zzbagVar.zze()));
                        sparseArray3.put(((Integer) pairCreate.first).intValue(), (o16) pairCreate.second);
                    } else if (i12 == i16.O) {
                        zzbagVar.zzv(8);
                        jZzm = ((zzbagVar.zze() >> 24) & 255) == 0 ? zzbagVar.zzm() : zzbagVar.zzn();
                    }
                    i11++;
                    i9 = 12;
                }
                SparseArray sparseArray4 = new SparseArray();
                int size2 = arrayList5.size();
                for (int i14 = 0; i14 < size2; i14++) {
                    g16 g16Var2 = (g16) arrayList5.get(i14);
                    if (g16Var2.a == i16.E && (zzawkVarA = l16.a(g16Var2, g16Var.c(i16.D), jZzm, zzaurVarA, false)) != null) {
                        sparseArray4.put(zzawkVarA.zza, zzawkVarA);
                    }
                }
                int size3 = sparseArray4.size();
                if (sparseArray2.size() == 0) {
                    for (int i15 = 0; i15 < size3; i15++) {
                        zzawk zzawkVar = (zzawk) sparseArray4.valueAt(i15);
                        zzave zzaveVarZzbi = zzaweVar.t.zzbi(i15, zzawkVar.zzb);
                        q16 q16Var = new q16(zzaveVarZzbi);
                        o16 o16Var = (o16) sparseArray3.get(zzawkVar.zza);
                        q16Var.c = zzawkVar;
                        o16Var.getClass();
                        q16Var.d = o16Var;
                        zzaveVarZzbi.zza(zzawkVar.zzf);
                        q16Var.a();
                        sparseArray2.put(zzawkVar.zza, q16Var);
                        zzaweVar.o = Math.max(zzaweVar.o, zzawkVar.zze);
                    }
                    zzaweVar.t.zzb();
                } else {
                    zzazy.zze(sparseArray2.size() == size3);
                    for (int i16 = 0; i16 < size3; i16++) {
                        zzawk zzawkVar2 = (zzawk) sparseArray4.valueAt(i16);
                        q16 q16Var2 = (q16) sparseArray2.get(zzawkVar2.zza);
                        o16 o16Var2 = (o16) sparseArray3.get(zzawkVar2.zza);
                        q16Var2.c = zzawkVar2;
                        o16Var2.getClass();
                        q16Var2.d = o16Var2;
                        q16Var2.b.zza(zzawkVar2.zzf);
                        q16Var2.a();
                    }
                }
            } else if (i7 == i16.L) {
                int size4 = arrayList5.size();
                int i17 = 0;
                while (i17 < size4) {
                    g16 g16Var3 = (g16) arrayList5.get(i17);
                    if (g16Var3.a == i16.M) {
                        zzbag zzbagVar2 = g16Var3.c(i16.y).P0;
                        zzbagVar2.zzv(i10);
                        int iZze2 = zzbagVar2.zze() & 16777215;
                        q16 q16Var3 = (q16) sparseArray2.get(zzbagVar2.zze());
                        if (q16Var3 == null) {
                            q16Var3 = null;
                        } else {
                            int i18 = iZze2 & 1;
                            u16 u16Var = q16Var3.a;
                            if (i18 != 0) {
                                long jZzn = zzbagVar2.zzn();
                                u16Var.b = jZzn;
                                u16Var.c = jZzn;
                            }
                            o16 o16Var3 = q16Var3.d;
                            u16Var.a = new o16((iZze2 & 2) != 0 ? zzbagVar2.zzi() - 1 : o16Var3.a, (iZze2 & 8) != 0 ? zzbagVar2.zzi() : o16Var3.b, (iZze2 & 16) != 0 ? zzbagVar2.zzi() : o16Var3.c, (iZze2 & 32) != 0 ? zzbagVar2.zzi() : o16Var3.d);
                        }
                        if (q16Var3 == null) {
                            i = size4;
                            i2 = i17;
                            sparseArray = sparseArray2;
                            arrayList = arrayList4;
                            arrayList2 = arrayList5;
                        } else {
                            u16 u16Var2 = q16Var3.a;
                            long jZzn2 = u16Var2.r;
                            q16Var3.a();
                            int i19 = i16.x;
                            if (g16Var3.c(i19) != null) {
                                zzbag zzbagVar3 = g16Var3.c(i19).P0;
                                zzbagVar3.zzv(i10);
                                jZzn2 = ((zzbagVar3.zze() >> 24) & 255) == 1 ? zzbagVar3.zzn() : zzbagVar3.zzm();
                            }
                            ArrayList arrayList6 = g16Var3.Q0;
                            int size5 = arrayList6.size();
                            int i20 = 0;
                            int i21 = 0;
                            int i22 = 0;
                            while (i20 < size5) {
                                h16 h16Var2 = (h16) arrayList6.get(i20);
                                int i23 = size4;
                                ArrayList arrayList7 = arrayList5;
                                if (h16Var2.a == i16.A) {
                                    zzbag zzbagVar4 = h16Var2.P0;
                                    zzbagVar4.zzv(12);
                                    int iZzi3 = zzbagVar4.zzi();
                                    if (iZzi3 > 0) {
                                        i22 += iZzi3;
                                        i21++;
                                    }
                                }
                                i20++;
                                size4 = i23;
                                arrayList5 = arrayList7;
                            }
                            i = size4;
                            arrayList2 = arrayList5;
                            q16Var3.g = 0;
                            q16Var3.f = 0;
                            q16Var3.e = 0;
                            u16Var2.d = i21;
                            u16Var2.e = i22;
                            int[] iArr3 = u16Var2.g;
                            if (iArr3 == null || iArr3.length < i21) {
                                u16Var2.f = new long[i21];
                                u16Var2.g = new int[i21];
                            }
                            int[] iArr4 = u16Var2.h;
                            if (iArr4 == null || iArr4.length < i22) {
                                int i24 = (i22 * 125) / 100;
                                u16Var2.h = new int[i24];
                                u16Var2.i = new int[i24];
                                u16Var2.j = new long[i24];
                                u16Var2.k = new boolean[i24];
                                u16Var2.m = new boolean[i24];
                            }
                            int i25 = 0;
                            int i26 = 0;
                            int i27 = 0;
                            while (i25 < size5) {
                                h16 h16Var3 = (h16) arrayList6.get(i25);
                                if (h16Var3.a == i16.A) {
                                    int i28 = i27 + 1;
                                    zzbag zzbagVar5 = h16Var3.P0;
                                    zzbagVar5.zzv(8);
                                    int iZze3 = zzbagVar5.zze() & 16777215;
                                    zzawk zzawkVar3 = q16Var3.c;
                                    j2 = jZzn2;
                                    o16 o16Var4 = u16Var2.a;
                                    u16Var2.g[i27] = zzbagVar5.zzi();
                                    long[] jArr2 = u16Var2.f;
                                    long j6 = u16Var2.b;
                                    jArr2[i27] = j6;
                                    if ((iZze3 & 1) != 0) {
                                        jArr2[i27] = j6 + ((long) zzbagVar5.zze());
                                    }
                                    int i29 = iZze3 & 4;
                                    int iZzi4 = o16Var4.d;
                                    if (i29 != 0) {
                                        iZzi4 = zzbagVar5.zzi();
                                    }
                                    int i30 = iZze3 & 256;
                                    int i31 = iZze3 & AdRequest.MAX_CONTENT_URL_LENGTH;
                                    int i32 = iZze3 & 1024;
                                    int i33 = iZze3 & 2048;
                                    long[] jArr3 = zzawkVar3.zzi;
                                    if (jArr3 != null) {
                                        i4 = iZzi4;
                                        arrayList3 = arrayList6;
                                        if (jArr3.length == 1 && jArr3[0] == 0) {
                                            jZzj = zzban.zzj(zzawkVar3.zzj[0], 1000L, zzawkVar3.zzc);
                                        }
                                        iArr = u16Var2.h;
                                        iArr2 = u16Var2.i;
                                        jArr = u16Var2.j;
                                        zArr = u16Var2.k;
                                        i5 = u16Var2.g[i27] + i26;
                                        int i34 = i26;
                                        j3 = zzawkVar3.zzc;
                                        j4 = jZzj;
                                        if (i27 > 0) {
                                            j5 = u16Var2.r;
                                        } else {
                                            j5 = j2;
                                        }
                                        i6 = i34;
                                        while (i6 < i5) {
                                            if (i30 != 0) {
                                                iZzi = zzbagVar5.zzi();
                                            } else {
                                                iZzi = o16Var4.b;
                                            }
                                            if (i31 != 0) {
                                                iZzi2 = zzbagVar5.zzi();
                                            } else {
                                                iZzi2 = o16Var4.c;
                                            }
                                            if (i6 == 0) {
                                                i6 = 0;
                                                if (i29 != 0) {
                                                    iZze = i4;
                                                } else if (i32 != 0) {
                                                    iZze = zzbagVar5.zze();
                                                } else {
                                                    iZze = o16Var4.d;
                                                }
                                            } else if (i32 != 0) {
                                                iZze = zzbagVar5.zze();
                                            } else {
                                                iZze = o16Var4.d;
                                            }
                                            if (i33 != 0) {
                                                iArr2[i6] = (int) (((long) (zzbagVar5.zze() * AdError.NETWORK_ERROR_CODE)) / j3);
                                            } else {
                                                iArr2[i6] = 0;
                                            }
                                            jArr[i6] = zzban.zzj(j5, 1000L, j3) - j4;
                                            iArr[i6] = iZzi2;
                                            if (1 != (((iZze >> 16) & 1) ^ 1)) {
                                                z = false;
                                            } else {
                                                z = true;
                                            }
                                            zArr[i6] = z;
                                            j5 += (long) iZzi;
                                            i6++;
                                            i30 = i30;
                                            i31 = i31;
                                            i29 = i29;
                                            o16Var4 = o16Var4;
                                            i32 = i32;
                                        }
                                        u16Var2.r = j5;
                                        i26 = i5;
                                        i27 = i28;
                                    } else {
                                        i4 = iZzi4;
                                        arrayList3 = arrayList6;
                                    }
                                    jZzj = 0;
                                    iArr = u16Var2.h;
                                    iArr2 = u16Var2.i;
                                    jArr = u16Var2.j;
                                    zArr = u16Var2.k;
                                    i5 = u16Var2.g[i27] + i26;
                                    int i35 = i26;
                                    j3 = zzawkVar3.zzc;
                                    j4 = jZzj;
                                    if (i27 > 0) {
                                        j5 = u16Var2.r;
                                    } else {
                                        j5 = j2;
                                    }
                                    i6 = i35;
                                    while (i6 < i5) {
                                        if (i30 != 0) {
                                            iZzi = zzbagVar5.zzi();
                                        } else {
                                            iZzi = o16Var4.b;
                                        }
                                        if (i31 != 0) {
                                            iZzi2 = zzbagVar5.zzi();
                                        } else {
                                            iZzi2 = o16Var4.c;
                                        }
                                        if (i6 == 0) {
                                            i6 = 0;
                                            if (i29 != 0) {
                                                iZze = i4;
                                            } else if (i32 != 0) {
                                                iZze = zzbagVar5.zze();
                                            } else {
                                                iZze = o16Var4.d;
                                            }
                                        } else if (i32 != 0) {
                                            iZze = zzbagVar5.zze();
                                        } else {
                                            iZze = o16Var4.d;
                                        }
                                        if (i33 != 0) {
                                            iArr2[i6] = (int) (((long) (zzbagVar5.zze() * AdError.NETWORK_ERROR_CODE)) / j3);
                                        } else {
                                            iArr2[i6] = 0;
                                        }
                                        jArr[i6] = zzban.zzj(j5, 1000L, j3) - j4;
                                        iArr[i6] = iZzi2;
                                        if (1 != (((iZze >> 16) & 1) ^ 1)) {
                                            z = false;
                                        } else {
                                            z = true;
                                        }
                                        zArr[i6] = z;
                                        j5 += (long) iZzi;
                                        i6++;
                                        i30 = i30;
                                        i31 = i31;
                                        i29 = i29;
                                        o16Var4 = o16Var4;
                                        i32 = i32;
                                    }
                                    u16Var2.r = j5;
                                    i26 = i5;
                                    i27 = i28;
                                } else {
                                    i17 = i17;
                                    g16Var3 = g16Var3;
                                    arrayList3 = arrayList6;
                                    j2 = jZzn2;
                                }
                                i25++;
                                size5 = size5;
                                jZzn2 = j2;
                                sparseArray2 = sparseArray2;
                                arrayList4 = arrayList4;
                                i17 = i17;
                                g16Var3 = g16Var3;
                                arrayList6 = arrayList3;
                                q16Var3 = q16Var3;
                            }
                            i2 = i17;
                            ArrayList arrayList8 = arrayList6;
                            sparseArray = sparseArray2;
                            arrayList = arrayList4;
                            q16 q16Var4 = q16Var3;
                            h16 h16VarC = g16Var3.c(i16.d0);
                            if (h16VarC != null) {
                                int i36 = q16Var4.c.zzh[u16Var2.a.a].zza;
                                zzbag zzbagVar6 = h16VarC.P0;
                                zzbagVar6.zzv(8);
                                if ((zzbagVar6.zze() & 16777215 & 1) == 1) {
                                    zzbagVar6.zzw(8);
                                }
                                int iZzg = zzbagVar6.zzg();
                                int iZzi5 = zzbagVar6.zzi();
                                int i37 = u16Var2.e;
                                if (iZzi5 != i37) {
                                    throw new zzasv(Md5A.e("Length mismatch: ", iZzi5, ", ", i37));
                                }
                                if (iZzg == 0) {
                                    boolean[] zArr2 = u16Var2.m;
                                    i3 = 0;
                                    for (int i38 = 0; i38 < iZzi5; i38++) {
                                        int iZzg2 = zzbagVar6.zzg();
                                        i3 += iZzg2;
                                        zArr2[i38] = iZzg2 > i36;
                                    }
                                } else {
                                    i3 = iZzg * iZzi5;
                                    Arrays.fill(u16Var2.m, 0, iZzi5, iZzg > i36);
                                }
                                zzbag zzbagVar7 = u16Var2.p;
                                if (zzbagVar7 == null || zzbagVar7.zzd() < i3) {
                                    u16Var2.p = new zzbag(i3);
                                }
                                u16Var2.o = i3;
                                u16Var2.l = true;
                                u16Var2.q = true;
                            }
                            h16 h16VarC2 = g16Var3.c(i16.e0);
                            if (h16VarC2 != null) {
                                zzbag zzbagVar8 = h16VarC2.P0;
                                zzbagVar8.zzv(8);
                                int iZze4 = zzbagVar8.zze();
                                if ((16777215 & iZze4 & 1) == 1) {
                                    zzbagVar8.zzw(8);
                                }
                                int iZzi6 = zzbagVar8.zzi();
                                if (iZzi6 != 1) {
                                    throw new zzasv(GM.a("Unexpected saio entry count: ", iZzi6));
                                }
                                u16Var2.c += ((iZze4 >> 24) & 255) == 0 ? zzbagVar8.zzm() : zzbagVar8.zzn();
                            }
                            h16 h16VarC3 = g16Var3.c(i16.i0);
                            if (h16VarC3 != null) {
                                c(h16VarC3.P0, 0, u16Var2);
                            }
                            h16 h16VarC4 = g16Var3.c(i16.f0);
                            h16 h16VarC5 = g16Var3.c(i16.g0);
                            if (h16VarC4 != null && h16VarC5 != null) {
                                zzbag zzbagVar9 = h16VarC4.P0;
                                zzbagVar9.zzv(8);
                                int iZze5 = zzbagVar9.zze();
                                int iZze6 = zzbagVar9.zze();
                                int i39 = v;
                                if (iZze6 == i39) {
                                    if (((iZze5 >> 24) & 255) == 1) {
                                        zzbagVar9.zzw(4);
                                    }
                                    if (zzbagVar9.zze() != 1) {
                                        throw new zzasv("Entry count in sbgp != 1 (unsupported).");
                                    }
                                    zzbag zzbagVar10 = h16VarC5.P0;
                                    zzbagVar10.zzv(8);
                                    int iZze7 = zzbagVar10.zze();
                                    if (zzbagVar10.zze() == i39) {
                                        int i40 = (iZze7 >> 24) & 255;
                                        if (i40 == 1) {
                                            if (zzbagVar10.zzm() == 0) {
                                                throw new zzasv("Variable length decription in sgpd found (unsupported)");
                                            }
                                        } else if (i40 >= 2) {
                                            zzbagVar10.zzw(4);
                                        }
                                        if (zzbagVar10.zzm() != 1) {
                                            throw new zzasv("Entry count in sgpd != 1 (unsupported).");
                                        }
                                        zzbagVar10.zzw(2);
                                        if (zzbagVar10.zzg() == 1) {
                                            int iZzg3 = zzbagVar10.zzg();
                                            byte[] bArr = new byte[16];
                                            zzbagVar10.zzq(bArr, 0, 16);
                                            u16Var2.l = true;
                                            u16Var2.n = new zzawl(true, iZzg3, bArr);
                                        }
                                    }
                                }
                            }
                            int size6 = arrayList8.size();
                            int i41 = 0;
                            while (i41 < size6) {
                                ArrayList arrayList9 = arrayList8;
                                h16 h16Var4 = (h16) arrayList9.get(i41);
                                if (h16Var4.a == i16.h0) {
                                    zzbag zzbagVar11 = h16Var4.P0;
                                    zzbagVar11.zzv(8);
                                    byte[] bArr2 = this.f;
                                    zzbagVar11.zzq(bArr2, 0, 16);
                                    if (Arrays.equals(bArr2, w)) {
                                        c(zzbagVar11, 16, u16Var2);
                                    }
                                }
                                i41++;
                                arrayList8 = arrayList9;
                            }
                            zzaweVar = this;
                        }
                    } else {
                        i = size4;
                        i2 = i17;
                        sparseArray = sparseArray2;
                        arrayList = arrayList4;
                        arrayList2 = arrayList5;
                    }
                    i17 = i2 + 1;
                    i10 = 8;
                    size4 = i;
                    arrayList5 = arrayList2;
                    sparseArray2 = sparseArray;
                    arrayList4 = arrayList;
                }
                SparseArray sparseArray5 = sparseArray2;
                zzaur zzaurVarA2 = a(arrayList4);
                if (zzaurVarA2 != null) {
                    int size7 = sparseArray5.size();
                    for (int i42 = 0; i42 < size7; i42++) {
                        q16 q16Var5 = (q16) sparseArray5.valueAt(i42);
                        q16Var5.b.zza(q16Var5.c.zzf.zzc(zzaurVarA2));
                    }
                }
            } else if (!stack.isEmpty()) {
                ((g16) stack.peek()).R0.add(g16Var);
            }
        }
        b();
    }

    @Override // com.google.android.gms.internal.ads.zzauv
    public final void zzd(zzauw zzauwVar) {
        this.t = zzauwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzauv
    public final void zze(long j, long j2) {
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            ((q16) sparseArray.valueAt(i)).a();
        }
        this.h.clear();
        this.g.clear();
        b();
    }

    @Override // com.google.android.gms.internal.ads.zzauv
    public final int zzf(zzauu zzauuVar, zzava zzavaVar) throws InterruptedException, zzasv, EOFException {
        zzawl zzawlVar;
        zzavd zzavdVar;
        int i;
        long jZzn;
        long jZzn2;
        while (true) {
            int i2 = this.i;
            Stack stack = this.g;
            SparseArray sparseArray = this.a;
            if (i2 == 0) {
                int i3 = this.l;
                zzbag zzbagVar = this.e;
                if (i3 == 0) {
                    if (!zzauuVar.zzh(zzbagVar.zza, 0, 8, true)) {
                        return -1;
                    }
                    this.l = 8;
                    zzbagVar.zzv(0);
                    this.k = zzbagVar.zzm();
                    this.j = zzbagVar.zze();
                }
                long jZzn3 = this.k;
                if (jZzn3 == 1) {
                    zzauuVar.zzh(zzbagVar.zza, 8, 8, false);
                    this.l += 8;
                    jZzn3 = zzbagVar.zzn();
                    this.k = jZzn3;
                }
                long j = this.l;
                if (jZzn3 < j) {
                    throw new zzasv("Atom size less than header length (unsupported).");
                }
                long jZzd = zzauuVar.zzd() - j;
                if (this.j == i16.L) {
                    int size = sparseArray.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        u16 u16Var = ((q16) sparseArray.valueAt(i4)).a;
                        u16Var.c = jZzd;
                        u16Var.b = jZzd;
                    }
                }
                int i5 = this.j;
                if (i5 == i16.i) {
                    this.p = null;
                    this.n = jZzd + this.k;
                    if (!this.u) {
                        this.t.zzc(new zzavb(this.o));
                        this.u = true;
                    }
                    this.i = 2;
                } else if (i5 == i16.C || i5 == i16.E || i5 == i16.F || i5 == i16.G || i5 == i16.H || i5 == i16.L || i5 == i16.M || i5 == i16.N || i5 == i16.Q) {
                    long jZzd2 = (zzauuVar.zzd() + this.k) - 8;
                    stack.add(new g16(i5, jZzd2));
                    if (this.k == this.l) {
                        d(jZzd2);
                    } else {
                        b();
                    }
                } else if (i5 == i16.T || i5 == i16.S || i5 == i16.D || i5 == i16.B || i5 == i16.U || i5 == i16.x || i5 == i16.y || i5 == i16.P || i5 == i16.z || i5 == i16.A || i5 == i16.V || i5 == i16.d0 || i5 == i16.e0 || i5 == i16.i0 || i5 == i16.h0 || i5 == i16.f0 || i5 == i16.g0 || i5 == i16.R || i5 == i16.O || i5 == i16.G0) {
                    if (this.l != 8) {
                        throw new zzasv("Leaf atom defines extended atom size (unsupported).");
                    }
                    long j2 = this.k;
                    if (j2 > 2147483647L) {
                        throw new zzasv("Leaf atom with length > 2147483647 (unsupported).");
                    }
                    zzbag zzbagVar2 = new zzbag((int) j2);
                    this.m = zzbagVar2;
                    System.arraycopy(zzbagVar.zza, 0, zzbagVar2.zza, 0, 8);
                    this.i = 1;
                } else {
                    if (this.k > 2147483647L) {
                        throw new zzasv("Skipping atom with length > 2147483647 (unsupported).");
                    }
                    this.m = null;
                    this.i = 1;
                }
            } else if (i2 != 1) {
                long j3 = Long.MAX_VALUE;
                if (i2 != 2) {
                    if (i2 == 3) {
                        if (this.p == null) {
                            int size2 = sparseArray.size();
                            q16 q16Var = null;
                            for (int i6 = 0; i6 < size2; i6++) {
                                q16 q16Var2 = (q16) sparseArray.valueAt(i6);
                                int i7 = q16Var2.g;
                                u16 u16Var2 = q16Var2.a;
                                if (i7 != u16Var2.d) {
                                    long j4 = u16Var2.f[i7];
                                    if (j4 < j3) {
                                        q16Var = q16Var2;
                                        j3 = j4;
                                    }
                                }
                            }
                            if (q16Var == null) {
                                int iZzd = (int) (this.n - zzauuVar.zzd());
                                if (iZzd < 0) {
                                    throw new zzasv("Offset to end of mdat was negative.");
                                }
                                zzauuVar.zzi(iZzd, false);
                                b();
                            } else {
                                int iZzd2 = (int) (q16Var.a.f[q16Var.g] - zzauuVar.zzd());
                                if (iZzd2 < 0) {
                                    Log.w("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                                    iZzd2 = 0;
                                }
                                zzauuVar.zzi(iZzd2, false);
                                this.p = q16Var;
                            }
                        }
                        q16 q16Var3 = this.p;
                        u16 u16Var3 = q16Var3.a;
                        int[] iArr = u16Var3.h;
                        int i8 = q16Var3.e;
                        int i9 = iArr[i8];
                        this.q = i9;
                        if (u16Var3.l) {
                            zzbag zzbagVar3 = u16Var3.p;
                            int i10 = u16Var3.a.a;
                            zzawl zzawlVar2 = u16Var3.n;
                            if (zzawlVar2 == null) {
                                zzawlVar2 = q16Var3.c.zzh[i10];
                            }
                            int i11 = zzawlVar2.zza;
                            boolean z = u16Var3.m[i8];
                            zzbag zzbagVar4 = this.d;
                            zzbagVar4.zza[0] = (byte) ((true != z ? 0 : 128) | i11);
                            zzbagVar4.zzv(0);
                            zzave zzaveVar = q16Var3.b;
                            zzaveVar.zzb(zzbagVar4, 1);
                            zzaveVar.zzb(zzbagVar3, i11);
                            if (z) {
                                int iZzj = zzbagVar3.zzj();
                                zzbagVar3.zzw(-2);
                                int i12 = (iZzj * 6) + 2;
                                zzaveVar.zzb(zzbagVar3, i12);
                                i = i11 + 1 + i12;
                            } else {
                                i = i11 + 1;
                            }
                            this.r = i;
                            i9 = this.q + i;
                            this.q = i9;
                        } else {
                            this.r = 0;
                        }
                        if (this.p.c.zzg == 1) {
                            this.q = i9 - 8;
                            zzauuVar.zzi(8, false);
                        }
                        this.i = 4;
                        this.s = 0;
                    }
                    q16 q16Var4 = this.p;
                    u16 u16Var4 = q16Var4.a;
                    zzawk zzawkVar = q16Var4.c;
                    zzave zzaveVar2 = q16Var4.b;
                    int i13 = q16Var4.e;
                    int i14 = zzawkVar.zzk;
                    if (i14 == 0) {
                        while (true) {
                            int i15 = this.r;
                            int i16 = this.q;
                            if (i15 >= i16) {
                                break;
                            }
                            this.r += zzaveVar2.zzd(zzauuVar, i16 - i15, false);
                        }
                    } else {
                        zzbag zzbagVar5 = this.c;
                        byte[] bArr = zzbagVar5.zza;
                        bArr[0] = 0;
                        bArr[1] = 0;
                        bArr[2] = 0;
                        int i17 = i14 + 1;
                        int i18 = 4 - i14;
                        while (this.r < this.q) {
                            int i19 = this.s;
                            if (i19 == 0) {
                                zzauuVar.zzh(bArr, i18, i17, false);
                                zzbagVar5.zzv(0);
                                this.s = zzbagVar5.zzi() - 1;
                                zzbag zzbagVar6 = this.b;
                                zzbagVar6.zzv(0);
                                zzaveVar2.zzb(zzbagVar6, 4);
                                zzaveVar2.zzb(zzbagVar5, 1);
                                this.r += 5;
                                this.q += i18;
                            } else {
                                int iZzd3 = zzaveVar2.zzd(zzauuVar, i19, false);
                                this.r += iZzd3;
                                this.s -= iZzd3;
                            }
                        }
                    }
                    long j5 = (u16Var4.j[i13] + ((long) u16Var4.i[i13])) * 1000;
                    boolean z2 = u16Var4.l;
                    int i20 = (true != z2 ? 0 : 1073741824) | (u16Var4.k[i13] ? 1 : 0);
                    if (z2) {
                        zzawlVar = u16Var4.n;
                        if (zzawlVar == null) {
                            zzawlVar = zzawkVar.zzh[u16Var4.a.a];
                        }
                        q16 q16Var5 = this.p;
                        zzavdVar = zzawlVar != q16Var5.i ? new zzavd(1, zzawlVar.zzb) : q16Var5.h;
                    } else {
                        zzawlVar = null;
                        zzavdVar = null;
                    }
                    q16 q16Var6 = this.p;
                    q16Var6.h = zzavdVar;
                    q16Var6.i = zzawlVar;
                    zzaveVar2.zzc(j5, i20, this.q, 0, zzavdVar);
                    LinkedList linkedList = this.h;
                    if (!linkedList.isEmpty()) {
                        ((p16) linkedList.removeFirst()).getClass();
                        throw null;
                    }
                    q16 q16Var7 = this.p;
                    q16Var7.e++;
                    int i21 = q16Var7.f + 1;
                    q16Var7.f = i21;
                    int[] iArr2 = u16Var4.g;
                    int i22 = q16Var7.g;
                    if (i21 == iArr2[i22]) {
                        q16Var7.g = i22 + 1;
                        q16Var7.f = 0;
                        this.p = null;
                    }
                    this.i = 3;
                    return 0;
                }
                int size3 = sparseArray.size();
                q16 q16Var8 = null;
                for (int i23 = 0; i23 < size3; i23++) {
                    u16 u16Var5 = ((q16) sparseArray.valueAt(i23)).a;
                    if (u16Var5.q) {
                        long j6 = u16Var5.c;
                        if (j6 < j3) {
                            q16Var8 = (q16) sparseArray.valueAt(i23);
                            j3 = j6;
                        }
                    }
                }
                if (q16Var8 == null) {
                    this.i = 3;
                } else {
                    int iZzd4 = (int) (j3 - zzauuVar.zzd());
                    if (iZzd4 < 0) {
                        throw new zzasv("Offset to encryption data was negative.");
                    }
                    zzauuVar.zzi(iZzd4, false);
                    u16 u16Var6 = q16Var8.a;
                    zzauuVar.zzh(u16Var6.p.zza, 0, u16Var6.o, false);
                    u16Var6.p.zzv(0);
                    u16Var6.q = false;
                }
            } else {
                int i24 = ((int) this.k) - this.l;
                zzbag zzbagVar7 = this.m;
                if (zzbagVar7 != null) {
                    zzauuVar.zzh(zzbagVar7.zza, 8, i24, false);
                    int i25 = this.j;
                    zzbag zzbagVar8 = this.m;
                    h16 h16Var = new h16(zzbagVar8, i25);
                    long jZzd3 = zzauuVar.zzd();
                    if (!stack.isEmpty()) {
                        ((g16) stack.peek()).Q0.add(h16Var);
                    } else if (i25 == i16.B) {
                        zzbagVar8.zzv(8);
                        int iZze = zzbagVar8.zze();
                        zzbagVar8.zzw(4);
                        long jZzm = zzbagVar8.zzm();
                        if (((iZze >> 24) & 255) == 0) {
                            jZzn = zzbagVar8.zzm();
                            jZzn2 = zzbagVar8.zzm();
                        } else {
                            jZzn = zzbagVar8.zzn();
                            jZzn2 = zzbagVar8.zzn();
                        }
                        long jZzj = zzban.zzj(jZzn, 1000000L, jZzm);
                        zzbagVar8.zzw(2);
                        int iZzj2 = zzbagVar8.zzj();
                        int[] iArr3 = new int[iZzj2];
                        long[] jArr = new long[iZzj2];
                        long[] jArr2 = new long[iZzj2];
                        long[] jArr3 = new long[iZzj2];
                        long jZzj2 = jZzj;
                        long j7 = jZzn2 + jZzd3;
                        long j8 = jZzn;
                        int i26 = 0;
                        while (i26 < iZzj2) {
                            int iZze2 = zzbagVar8.zze();
                            if ((iZze2 & Integer.MIN_VALUE) != 0) {
                                throw new zzasv("Unhandled indirect reference");
                            }
                            long jZzm2 = zzbagVar8.zzm();
                            iArr3[i26] = iZze2 & Integer.MAX_VALUE;
                            jArr[i26] = j7;
                            jArr3[i26] = jZzj2;
                            j8 += jZzm2;
                            jZzj2 = zzban.zzj(j8, 1000000L, jZzm);
                            jArr2[i26] = jZzj2 - jArr3[i26];
                            zzbagVar8.zzw(4);
                            j7 += (long) iArr3[i26];
                            i26++;
                            iZzj2 = iZzj2;
                            jZzm = jZzm;
                        }
                        Pair pairCreate = Pair.create(Long.valueOf(jZzj), new zzaut(iArr3, jArr, jArr2, jArr3));
                        ((Long) pairCreate.first).longValue();
                        this.t.zzc((zzavc) pairCreate.second);
                        this.u = true;
                    }
                } else {
                    zzauuVar.zzi(i24, false);
                }
                d(zzauuVar.zzd());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzauv
    public final boolean zzg(zzauu zzauuVar) {
        return t16.a(zzauuVar, true);
    }

    public zzawe(int i, zzbak zzbakVar, zzawk zzawkVar) {
        this.e = new zzbag(16);
        this.b = new zzbag(zzbae.zza);
        this.c = new zzbag(5);
        new zzbag();
        this.d = new zzbag(1);
        this.f = new byte[16];
        this.g = new Stack();
        this.h = new LinkedList();
        this.a = new SparseArray();
        this.o = -9223372036854775807L;
        b();
    }
}
