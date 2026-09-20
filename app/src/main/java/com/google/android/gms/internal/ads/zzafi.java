package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.ads.AdRequest;
import defpackage.bj0;
import defpackage.gv5;
import defpackage.hH;
import defpackage.hv5;
import defpackage.iv5;
import defpackage.jv5;
import defpackage.nv5;
import defpackage.ov5;
import defpackage.su5;
import defpackage.tu5;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class zzafi implements zzzf {
    public static final zzaf F;
    public zzzi A;
    public zzaam[] B;
    public zzaam[] C;
    public boolean D;
    public final List a;
    public final SparseArray b;
    public final zzed c;
    public final zzed d;
    public final zzed e;
    public final byte[] f;
    public final zzed g;
    public final zzacd h;
    public final zzed i;
    public final ArrayDeque j;
    public final ArrayDeque k;
    public int l;
    public int m;
    public long n;
    public int o;
    public zzed p;
    public long q;
    public int r;
    public long s;
    public long t;
    public long u;
    public jv5 v;
    public int w;
    public int x;
    public int y;
    public boolean z;
    public static final zzzm zza = new zzzm() { // from class: com.google.android.gms.internal.ads.zzafe
        @Override // com.google.android.gms.internal.ads.zzzm
        public final zzzf[] zza() {
            return new zzzf[]{new zzafi(0, null)};
        }

        @Override // com.google.android.gms.internal.ads.zzzm
        public final /* synthetic */ zzzf[] zzb(Uri uri, Map map) {
            return zzzl.zza(this, uri, map);
        }
    };
    public static final byte[] E = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    static {
        zzad zzadVar = new zzad();
        zzadVar.zzS("application/x-emsg");
        F = zzadVar.zzY();
    }

    public zzafi() {
        this(0, null);
    }

    public static zzx a(ArrayList arrayList) {
        int size = arrayList.size();
        ArrayList arrayList2 = null;
        for (int i = 0; i < size; i++) {
            tu5 tu5Var = (tu5) arrayList.get(i);
            if (tu5Var.a == 1886614376) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] bArrZzH = tu5Var.b.zzH();
                UUID uuidZza = zzafp.zza(bArrZzH);
                if (uuidZza == null) {
                    Log.w("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList2.add(new zzw(uuidZza, null, "video/mp4", bArrZzH));
                }
            }
        }
        if (arrayList2 == null) {
            return null;
        }
        return new zzx(arrayList2);
    }

    public static void c(zzed zzedVar, int i, nv5 nv5Var) throws zzbu {
        zzedVar.zzF(i + 8);
        int iZze = zzedVar.zze() & 16777215;
        if ((iZze & 1) != 0) {
            throw zzbu.zzc("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (iZze & 2) != 0;
        int iZzn = zzedVar.zzn();
        if (iZzn == 0) {
            Arrays.fill(nv5Var.l, 0, nv5Var.e, false);
            return;
        }
        int i2 = nv5Var.e;
        if (iZzn != i2) {
            throw zzbu.zza("Senc sample count " + iZzn + " is different from fragment sample count" + i2, null);
        }
        Arrays.fill(nv5Var.l, 0, iZzn, z);
        int iZza = zzedVar.zza();
        zzed zzedVar2 = nv5Var.n;
        zzedVar2.zzC(iZza);
        nv5Var.k = true;
        nv5Var.o = true;
        zzedVar.zzB(zzedVar2.zzH(), 0, zzedVar2.zzd());
        zzedVar2.zzF(0);
        nv5Var.o = false;
    }

    public final void b() {
        this.l = 0;
        this.o = 0;
    }

    /* JADX WARN: Code duplicated, block: B:255:0x064e  */
    public final void d(long j) throws zzbu {
        hv5 hv5Var;
        hv5 hv5Var2;
        ArrayList arrayList;
        int i;
        ArrayList arrayList2;
        int i2;
        SparseArray sparseArray;
        int i3;
        byte[] bArr;
        int i4;
        boolean z;
        su5 su5Var;
        jv5 jv5Var;
        int i5;
        int iZze;
        jv5 jv5Var2;
        final zzafi zzafiVar = this;
        while (true) {
            ArrayDeque arrayDeque = zzafiVar.j;
            if (arrayDeque.isEmpty() || ((su5) arrayDeque.peek()).b != j) {
                break;
            }
            su5 su5Var2 = (su5) arrayDeque.pop();
            int i6 = su5Var2.a;
            SparseArray sparseArray2 = zzafiVar.b;
            ArrayList arrayList3 = su5Var2.c;
            int i7 = 12;
            if (i6 == 1836019574) {
                zzx zzxVarA = a(arrayList3);
                su5 su5VarB = su5Var2.b(1836475768);
                su5VarB.getClass();
                SparseArray sparseArray3 = new SparseArray();
                ArrayList arrayList4 = su5VarB.c;
                int size = arrayList4.size();
                long jZzs = -9223372036854775807L;
                int i8 = 0;
                while (i8 < size) {
                    tu5 tu5Var = (tu5) arrayList4.get(i8);
                    int i9 = tu5Var.a;
                    zzed zzedVar = tu5Var.b;
                    if (i9 == 1953654136) {
                        zzedVar.zzF(i7);
                        Pair pairCreate = Pair.create(Integer.valueOf(zzedVar.zze()), new hv5(zzedVar.zze() - 1, zzedVar.zze(), zzedVar.zze(), zzedVar.zze()));
                        sparseArray3.put(((Integer) pairCreate.first).intValue(), (hv5) pairCreate.second);
                    } else if (i9 == 1835362404) {
                        zzedVar.zzF(8);
                        jZzs = ((zzedVar.zze() >> 24) & 255) == 0 ? zzedVar.zzs() : zzedVar.zzt();
                    }
                    i8++;
                    i7 = 12;
                }
                ArrayList arrayListA = gv5.a(su5Var2, new zzzu(), jZzs, zzxVarA, false, new zzfru() { // from class: com.google.android.gms.internal.ads.zzaff
                    @Override // com.google.android.gms.internal.ads.zzfru
                    public final Object apply(Object obj) {
                        return (zzafs) obj;
                    }
                });
                int size2 = arrayListA.size();
                if (sparseArray2.size() == 0) {
                    for (int i10 = 0; i10 < size2; i10++) {
                        ov5 ov5Var = (ov5) arrayListA.get(i10);
                        zzafs zzafsVar = ov5Var.a;
                        zzaam zzaamVarZzv = zzafiVar.A.zzv(i10, zzafsVar.zzb);
                        int i11 = zzafsVar.zza;
                        if (sparseArray3.size() == 1) {
                            hv5Var = (hv5) sparseArray3.valueAt(0);
                        } else {
                            hv5Var = (hv5) sparseArray3.get(i11);
                            hv5Var.getClass();
                        }
                        sparseArray2.put(zzafsVar.zza, new jv5(zzaamVarZzv, ov5Var, hv5Var));
                        zzafiVar.t = Math.max(zzafiVar.t, zzafsVar.zze);
                    }
                    zzafiVar.A.zzB();
                } else {
                    zzdd.zzf(sparseArray2.size() == size2);
                    for (int i12 = 0; i12 < size2; i12++) {
                        ov5 ov5Var2 = (ov5) arrayListA.get(i12);
                        zzafs zzafsVar2 = ov5Var2.a;
                        jv5 jv5Var3 = (jv5) sparseArray2.get(zzafsVar2.zza);
                        int i13 = zzafsVar2.zza;
                        if (sparseArray3.size() == 1) {
                            hv5Var2 = (hv5) sparseArray3.valueAt(0);
                        } else {
                            hv5Var2 = (hv5) sparseArray3.get(i13);
                            hv5Var2.getClass();
                        }
                        jv5Var3.d = ov5Var2;
                        jv5Var3.e = hv5Var2;
                        jv5Var3.a.zzk(ov5Var2.a.zzf);
                        jv5Var3.c();
                    }
                }
            } else if (i6 == 1836019558) {
                ArrayList arrayList5 = su5Var2.d;
                int size3 = arrayList5.size();
                int i14 = 0;
                while (i14 < size3) {
                    su5 su5Var3 = (su5) arrayList5.get(i14);
                    if (su5Var3.a == 1953653094) {
                        tu5 tu5VarC = su5Var3.c(1952868452);
                        tu5VarC.getClass();
                        zzed zzedVar2 = tu5VarC.b;
                        zzedVar2.zzF(8);
                        int iZze2 = zzedVar2.zze() & 16777215;
                        jv5 jv5Var4 = (jv5) sparseArray2.get(zzedVar2.zze());
                        if (jv5Var4 == null) {
                            jv5Var4 = null;
                        } else {
                            int i15 = iZze2 & 1;
                            nv5 nv5Var = jv5Var4.b;
                            if (i15 != 0) {
                                long jZzt = zzedVar2.zzt();
                                nv5Var.b = jZzt;
                                nv5Var.c = jZzt;
                            }
                            hv5 hv5Var3 = jv5Var4.e;
                            nv5Var.a = new hv5((iZze2 & 2) != 0 ? zzedVar2.zze() - 1 : hv5Var3.a, (iZze2 & 8) != 0 ? zzedVar2.zze() : hv5Var3.b, (iZze2 & 16) != 0 ? zzedVar2.zze() : hv5Var3.c, (iZze2 & 32) != 0 ? zzedVar2.zze() : hv5Var3.d);
                        }
                        if (jv5Var4 != null) {
                            nv5 nv5Var2 = jv5Var4.b;
                            long j2 = nv5Var2.p;
                            boolean z2 = nv5Var2.q;
                            jv5Var4.c();
                            jv5Var4.l = true;
                            tu5 tu5VarC2 = su5Var3.c(1952867444);
                            if (tu5VarC2 != null) {
                                zzed zzedVar3 = tu5VarC2.b;
                                zzedVar3.zzF(8);
                                nv5Var2.p = ((zzedVar3.zze() >> 24) & 255) == 1 ? zzedVar3.zzt() : zzedVar3.zzs();
                                nv5Var2.q = true;
                            } else {
                                nv5Var2.p = j2;
                                nv5Var2.q = z2;
                            }
                            ArrayList arrayList6 = su5Var3.c;
                            int size4 = arrayList6.size();
                            int i16 = 0;
                            int i17 = 0;
                            int i18 = 0;
                            while (true) {
                                i3 = 1953658222;
                                if (i16 >= size4) {
                                    break;
                                }
                                tu5 tu5Var2 = (tu5) arrayList6.get(i16);
                                if (tu5Var2.a == 1953658222) {
                                    zzed zzedVar4 = tu5Var2.b;
                                    zzedVar4.zzF(12);
                                    int iZzn = zzedVar4.zzn();
                                    if (iZzn > 0) {
                                        i18 += iZzn;
                                        i17++;
                                    }
                                }
                                i16++;
                            }
                            jv5Var4.h = 0;
                            jv5Var4.g = 0;
                            jv5Var4.f = 0;
                            nv5Var2.d = i17;
                            nv5Var2.e = i18;
                            if (nv5Var2.g.length < i17) {
                                nv5Var2.f = new long[i17];
                                nv5Var2.g = new int[i17];
                            }
                            if (nv5Var2.h.length < i18) {
                                int i19 = (i18 * 125) / 100;
                                nv5Var2.h = new int[i19];
                                nv5Var2.i = new long[i19];
                                nv5Var2.j = new boolean[i19];
                                nv5Var2.l = new boolean[i19];
                            }
                            int i20 = 0;
                            int i21 = 0;
                            int i22 = 0;
                            while (true) {
                                long j3 = 0;
                                if (i20 >= size4) {
                                    arrayList = arrayList5;
                                    i = size3;
                                    ArrayList arrayList7 = arrayList6;
                                    arrayList2 = arrayList3;
                                    i2 = i14;
                                    sparseArray = sparseArray2;
                                    zzafs zzafsVar3 = jv5Var4.d.a;
                                    hv5 hv5Var4 = nv5Var2.a;
                                    hv5Var4.getClass();
                                    zzaft zzaftVarZza = zzafsVar3.zza(hv5Var4.a);
                                    tu5 tu5VarC3 = su5Var3.c(1935763834);
                                    if (tu5VarC3 != null) {
                                        zzaftVarZza.getClass();
                                        int i23 = zzaftVarZza.zzd;
                                        zzed zzedVar5 = tu5VarC3.b;
                                        zzedVar5.zzF(8);
                                        if ((zzedVar5.zze() & 1) == 1) {
                                            zzedVar5.zzG(8);
                                        }
                                        int iZzk = zzedVar5.zzk();
                                        int iZzn2 = zzedVar5.zzn();
                                        int i24 = nv5Var2.e;
                                        if (iZzn2 > i24) {
                                            throw zzbu.zza("Saiz sample count " + iZzn2 + " is greater than fragment sample count" + i24, null);
                                        }
                                        if (iZzk == 0) {
                                            boolean[] zArr = nv5Var2.l;
                                            i4 = 0;
                                            for (int i25 = 0; i25 < iZzn2; i25++) {
                                                int iZzk2 = zzedVar5.zzk();
                                                i4 += iZzk2;
                                                zArr[i25] = iZzk2 > i23;
                                            }
                                            z = false;
                                        } else {
                                            boolean z3 = iZzk > i23;
                                            i4 = iZzk * iZzn2;
                                            z = false;
                                            Arrays.fill(nv5Var2.l, 0, iZzn2, z3);
                                        }
                                        Arrays.fill(nv5Var2.l, iZzn2, nv5Var2.e, z);
                                        if (i4 > 0) {
                                            nv5Var2.n.zzC(i4);
                                            nv5Var2.k = true;
                                            nv5Var2.o = true;
                                        }
                                    }
                                    tu5 tu5VarC4 = su5Var3.c(1935763823);
                                    if (tu5VarC4 != null) {
                                        zzed zzedVar6 = tu5VarC4.b;
                                        zzedVar6.zzF(8);
                                        int iZze3 = zzedVar6.zze();
                                        if ((iZze3 & 1) == 1) {
                                            zzedVar6.zzG(8);
                                        }
                                        int iZzn3 = zzedVar6.zzn();
                                        if (iZzn3 != 1) {
                                            throw zzbu.zza("Unexpected saio entry count: " + iZzn3, null);
                                        }
                                        nv5Var2.c += ((iZze3 >> 24) & 255) == 0 ? zzedVar6.zzs() : zzedVar6.zzt();
                                    }
                                    tu5 tu5VarC5 = su5Var3.c(1936027235);
                                    if (tu5VarC5 != null) {
                                        c(tu5VarC5.b, 0, nv5Var2);
                                    }
                                    String str = zzaftVarZza != null ? zzaftVarZza.zzb : null;
                                    zzed zzedVar7 = null;
                                    zzed zzedVar8 = null;
                                    int i26 = 0;
                                    while (i26 < arrayList7.size()) {
                                        ArrayList arrayList8 = arrayList7;
                                        tu5 tu5Var3 = (tu5) arrayList8.get(i26);
                                        zzed zzedVar9 = tu5Var3.b;
                                        int i27 = tu5Var3.a;
                                        if (i27 == 1935828848) {
                                            zzedVar9.zzF(12);
                                            if (zzedVar9.zze() == 1936025959) {
                                                zzedVar7 = zzedVar9;
                                            }
                                        } else if (i27 == 1936158820) {
                                            zzedVar9.zzF(12);
                                            if (zzedVar9.zze() == 1936025959) {
                                                zzedVar8 = zzedVar9;
                                            }
                                        }
                                        i26++;
                                        arrayList7 = arrayList8;
                                    }
                                    ArrayList arrayList9 = arrayList7;
                                    if (zzedVar7 != null && zzedVar8 != null) {
                                        zzedVar7.zzF(8);
                                        int iZze4 = zzedVar7.zze();
                                        zzedVar7.zzG(4);
                                        if (((iZze4 >> 24) & 255) == 1) {
                                            zzedVar7.zzG(4);
                                        }
                                        if (zzedVar7.zze() != 1) {
                                            throw zzbu.zzc("Entry count in sbgp != 1 (unsupported).");
                                        }
                                        zzedVar8.zzF(8);
                                        int iZze5 = (zzedVar8.zze() >> 24) & 255;
                                        zzedVar8.zzG(4);
                                        if (iZze5 == 1) {
                                            if (zzedVar8.zzs() == 0) {
                                                throw zzbu.zzc("Variable length description in sgpd found (unsupported)");
                                            }
                                        } else if (iZze5 >= 2) {
                                            zzedVar8.zzG(4);
                                        }
                                        if (zzedVar8.zzs() != 1) {
                                            throw zzbu.zzc("Entry count in sgpd != 1 (unsupported).");
                                        }
                                        zzedVar8.zzG(1);
                                        int iZzk3 = zzedVar8.zzk();
                                        int i28 = (iZzk3 & 240) >> 4;
                                        int i29 = iZzk3 & 15;
                                        if (zzedVar8.zzk() == 1) {
                                            int iZzk4 = zzedVar8.zzk();
                                            byte[] bArr2 = new byte[16];
                                            zzedVar8.zzB(bArr2, 0, 16);
                                            if (iZzk4 == 0) {
                                                int iZzk5 = zzedVar8.zzk();
                                                byte[] bArr3 = new byte[iZzk5];
                                                zzedVar8.zzB(bArr3, 0, iZzk5);
                                                bArr = bArr3;
                                            } else {
                                                bArr = null;
                                            }
                                            nv5Var2.k = true;
                                            nv5Var2.m = new zzaft(true, str, iZzk4, bArr2, i28, i29, bArr);
                                        }
                                    }
                                    int size5 = arrayList9.size();
                                    for (int i30 = 0; i30 < size5; i30++) {
                                        tu5 tu5Var4 = (tu5) arrayList9.get(i30);
                                        if (tu5Var4.a == 1970628964) {
                                            zzed zzedVar10 = tu5Var4.b;
                                            zzedVar10.zzF(8);
                                            byte[] bArr4 = this.f;
                                            zzedVar10.zzB(bArr4, 0, 16);
                                            if (Arrays.equals(bArr4, E)) {
                                                c(zzedVar10, 16, nv5Var2);
                                            }
                                        }
                                    }
                                    zzafiVar = this;
                                    break;
                                }
                                tu5 tu5Var5 = (tu5) arrayList6.get(i20);
                                if (tu5Var5.a == i3) {
                                    int i31 = i22 + 1;
                                    zzed zzedVar11 = tu5Var5.b;
                                    zzedVar11.zzF(8);
                                    int iZze6 = zzedVar11.zze() & 16777215;
                                    zzafs zzafsVar4 = jv5Var4.d.a;
                                    hv5 hv5Var5 = nv5Var2.a;
                                    int i32 = zzel.zza;
                                    nv5Var2.g[i22] = zzedVar11.zzn();
                                    long[] jArr = nv5Var2.f;
                                    long j4 = nv5Var2.b;
                                    jArr[i22] = j4;
                                    if ((iZze6 & 1) != 0) {
                                        jArr[i22] = j4 + ((long) zzedVar11.zze());
                                    }
                                    int i33 = iZze6 & 4;
                                    int iZze7 = hv5Var5.d;
                                    if (i33 != 0) {
                                        iZze7 = zzedVar11.zze();
                                    }
                                    int i34 = iZze6 & 256;
                                    int i35 = iZze6 & AdRequest.MAX_CONTENT_URL_LENGTH;
                                    int i36 = iZze6 & 1024;
                                    int i37 = iZze6 & 2048;
                                    long[] jArr2 = zzafsVar4.zzh;
                                    if (jArr2 != null) {
                                        i5 = iZze7;
                                        su5Var = su5Var3;
                                        if (jArr2.length == 1 && jArr2[0] == 0) {
                                            j3 = ((long[]) zzel.zzH(zzafsVar4.zzi))[0];
                                        }
                                    } else {
                                        i5 = iZze7;
                                        su5Var = su5Var3;
                                    }
                                    int[] iArr = nv5Var2.h;
                                    long[] jArr3 = nv5Var2.i;
                                    boolean[] zArr2 = nv5Var2.j;
                                    int i38 = nv5Var2.g[i22] + i21;
                                    jv5 jv5Var5 = jv5Var4;
                                    long j5 = zzafsVar4.zzc;
                                    int i39 = i21;
                                    long j6 = nv5Var2.p;
                                    while (i39 < i38) {
                                        int iZze8 = i34 != 0 ? zzedVar11.zze() : hv5Var5.b;
                                        int i40 = i34;
                                        if (iZze8 < 0) {
                                            throw zzbu.zza("Unexpected negative value: " + iZze8, null);
                                        }
                                        int iZze9 = i35 != 0 ? zzedVar11.zze() : hv5Var5.c;
                                        if (iZze9 < 0) {
                                            throw zzbu.zza("Unexpected negative value: " + iZze9, null);
                                        }
                                        if (i36 != 0) {
                                            iZze = zzedVar11.zze();
                                        } else if (i39 != 0) {
                                            iZze = hv5Var5.d;
                                        } else if (i33 != 0) {
                                            iZze = i5;
                                            i39 = 0;
                                        } else {
                                            i39 = 0;
                                            iZze = hv5Var5.d;
                                        }
                                        long jZzw = zzel.zzw((((long) (i37 != 0 ? zzedVar11.zze() : 0)) + j6) - j3, 1000000L, j5);
                                        jArr3[i39] = jZzw;
                                        int i41 = i35;
                                        if (nv5Var2.q) {
                                            jv5Var2 = jv5Var5;
                                        } else {
                                            jv5Var2 = jv5Var5;
                                            jArr3[i39] = jZzw + jv5Var2.d.h;
                                        }
                                        iArr[i39] = iZze9;
                                        zArr2[i39] = 1 == (((iZze >> 16) & 1) ^ 1);
                                        j6 += (long) iZze8;
                                        i39++;
                                        jv5Var5 = jv5Var2;
                                        i35 = i41;
                                        i36 = i36;
                                        i37 = i37;
                                        j5 = j5;
                                        i34 = i40;
                                        i38 = i38;
                                        hv5Var5 = hv5Var5;
                                        i33 = i33;
                                    }
                                    jv5Var = jv5Var5;
                                    nv5Var2.p = j6;
                                    i22 = i31;
                                    i21 = i38;
                                } else {
                                    arrayList6 = arrayList6;
                                    arrayList3 = arrayList3;
                                    su5Var = su5Var3;
                                    jv5Var = jv5Var4;
                                }
                                i20++;
                                jv5Var4 = jv5Var;
                                arrayList5 = arrayList5;
                                size3 = size3;
                                size4 = size4;
                                sparseArray2 = sparseArray2;
                                i14 = i14;
                                arrayList3 = arrayList3;
                                arrayList6 = arrayList6;
                                su5Var3 = su5Var;
                                i3 = 1953658222;
                            }
                        } else {
                            arrayList = arrayList5;
                            i = size3;
                            arrayList2 = arrayList3;
                            i2 = i14;
                            sparseArray = sparseArray2;
                        }
                    } else {
                        arrayList = arrayList5;
                        i = size3;
                        arrayList2 = arrayList3;
                        i2 = i14;
                        sparseArray = sparseArray2;
                    }
                    i14 = i2 + 1;
                    arrayList5 = arrayList;
                    size3 = i;
                    sparseArray2 = sparseArray;
                    arrayList3 = arrayList2;
                }
                SparseArray sparseArray4 = sparseArray2;
                zzx zzxVarA2 = a(arrayList3);
                if (zzxVarA2 != null) {
                    int size6 = sparseArray4.size();
                    int i42 = 0;
                    while (i42 < size6) {
                        SparseArray sparseArray5 = sparseArray4;
                        jv5 jv5Var6 = (jv5) sparseArray5.valueAt(i42);
                        zzafs zzafsVar5 = jv5Var6.d.a;
                        hv5 hv5Var6 = jv5Var6.b.a;
                        int i43 = zzel.zza;
                        zzaft zzaftVarZza2 = zzafsVar5.zza(hv5Var6.a);
                        zzx zzxVarZzb = zzxVarA2.zzb(zzaftVarZza2 != null ? zzaftVarZza2.zzb : null);
                        zzad zzadVarZzb = jv5Var6.d.a.zzf.zzb();
                        zzadVarZzb.zzB(zzxVarZzb);
                        jv5Var6.a.zzk(zzadVarZzb.zzY());
                        i42++;
                        sparseArray4 = sparseArray5;
                    }
                }
                SparseArray sparseArray6 = sparseArray4;
                if (zzafiVar.s != -9223372036854775807L) {
                    int size7 = sparseArray6.size();
                    for (int i44 = 0; i44 < size7; i44++) {
                        jv5 jv5Var7 = (jv5) sparseArray6.valueAt(i44);
                        long j7 = zzafiVar.s;
                        int i45 = jv5Var7.f;
                        while (true) {
                            nv5 nv5Var3 = jv5Var7.b;
                            if (i45 >= nv5Var3.e || nv5Var3.i[i45] >= j7) {
                                break;
                            }
                            if (nv5Var3.j[i45]) {
                                jv5Var7.i = i45;
                            }
                            i45++;
                        }
                    }
                    zzafiVar.s = -9223372036854775807L;
                }
            } else if (!arrayDeque.isEmpty()) {
                ((su5) arrayDeque.peek()).d.add(su5Var2);
            }
        }
        b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v101, types: [com.google.android.gms.internal.ads.zzyv] */
    /* JADX WARN: Type inference failed for: r0v106, types: [com.google.android.gms.internal.ads.zzed] */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v8, types: [com.google.android.gms.internal.ads.zzed] */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v14 */
    /* JADX WARN: Type inference failed for: r16v15 */
    /* JADX WARN: Type inference failed for: r16v16 */
    /* JADX WARN: Type inference failed for: r16v17 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX WARN: Type inference failed for: r6v21, types: [com.google.android.gms.internal.ads.zzaam] */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.ads.zzzf
    public final int zza(zzzg zzzgVar, zzaaf zzaafVar) throws zzbu, EOFException, InterruptedIOException {
        zzafi zzafiVar;
        ArrayDeque arrayDeque;
        String str;
        String str2;
        long jZzw;
        long j;
        long jZzs;
        long jZzw2;
        long jZzt;
        long jZzt2;
        jv5 jv5Var;
        ?? r16;
        byte[] bArr;
        int iZze;
        ?? r17;
        boolean z;
        ?? r18;
        int i;
        int iA;
        zzafi zzafiVar2 = this;
        zzzg zzzgVar2 = zzzgVar;
        zzafi zzafiVar3 = zzafiVar2;
        while (true) {
            int i2 = zzafiVar3.l;
            ArrayDeque arrayDeque2 = zzafiVar3.j;
            SparseArray sparseArray = zzafiVar3.b;
            if (i2 != 0) {
                arrayDeque = zzafiVar3.k;
                if (i2 != 1) {
                    long j2 = Long.MAX_VALUE;
                    if (i2 != 2) {
                        jv5Var = zzafiVar3.v;
                        if (jv5Var != null) {
                            break;
                        }
                        int size = sparseArray.size();
                        jv5 jv5Var2 = null;
                        for (int i3 = 0; i3 < size; i3++) {
                            jv5 jv5Var3 = (jv5) sparseArray.valueAt(i3);
                            boolean z2 = jv5Var3.l;
                            if (z2 || jv5Var3.f != jv5Var3.d.b) {
                                nv5 nv5Var = jv5Var3.b;
                                if (!z2 || jv5Var3.h != nv5Var.d) {
                                    long j3 = !z2 ? jv5Var3.d.c[jv5Var3.f] : nv5Var.f[jv5Var3.h];
                                    if (j3 < j2) {
                                        jv5Var2 = jv5Var3;
                                        j2 = j3;
                                    }
                                }
                            }
                        }
                        if (jv5Var2 != null) {
                            int iZzf = (int) ((!jv5Var2.l ? jv5Var2.d.c[jv5Var2.f] : jv5Var2.b.f[jv5Var2.h]) - zzzgVar.zzf());
                            if (iZzf < 0) {
                                Log.w("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                                iZzf = 0;
                            }
                            ((zzyv) zzzgVar2).zzo(iZzf, false);
                            zzafiVar3.v = jv5Var2;
                            jv5Var = jv5Var2;
                            break;
                        }
                        int iZzf2 = (int) (zzafiVar3.q - zzzgVar.zzf());
                        if (iZzf2 < 0) {
                            throw zzbu.zza("Offset to end of mdat was negative.", null);
                        }
                        ((zzyv) zzzgVar2).zzo(iZzf2, false);
                        b();
                    } else {
                        int size2 = sparseArray.size();
                        jv5 jv5Var4 = null;
                        for (int i4 = 0; i4 < size2; i4++) {
                            nv5 nv5Var2 = ((jv5) sparseArray.valueAt(i4)).b;
                            if (nv5Var2.o) {
                                long j4 = nv5Var2.c;
                                if (j4 < j2) {
                                    jv5Var4 = (jv5) sparseArray.valueAt(i4);
                                    j2 = j4;
                                }
                            }
                        }
                        if (jv5Var4 == null) {
                            zzafiVar3.l = 3;
                        } else {
                            int iZzf3 = (int) (j2 - zzzgVar.zzf());
                            if (iZzf3 < 0) {
                                throw zzbu.zza("Offset to encryption data was negative.", null);
                            }
                            zzyv zzyvVar = (zzyv) zzzgVar2;
                            zzyvVar.zzo(iZzf3, false);
                            nv5 nv5Var3 = jv5Var4.b;
                            zzed zzedVar = nv5Var3.n;
                            zzyvVar.zzn(zzedVar.zzH(), 0, zzedVar.zzd(), false);
                            nv5Var3.n.zzF(0);
                            nv5Var3.o = false;
                        }
                    }
                    zzafiVar = this;
                } else {
                    int i5 = ((int) zzafiVar3.n) - zzafiVar3.o;
                    zzed zzedVar2 = zzafiVar3.p;
                    if (zzedVar2 != null) {
                        ((zzyv) zzzgVar2).zzn(zzedVar2.zzH(), 8, i5, false);
                        int i6 = zzafiVar3.m;
                        tu5 tu5Var = new tu5(i6, zzedVar2);
                        long jZzf = zzzgVar.zzf();
                        if (arrayDeque2.isEmpty()) {
                            if (i6 == 1936286840) {
                                zzedVar2.zzF(8);
                                int iZze2 = zzedVar2.zze();
                                zzedVar2.zzG(4);
                                long jZzs2 = zzedVar2.zzs();
                                if (((iZze2 >> 24) & 255) == 0) {
                                    jZzt = zzedVar2.zzs();
                                    jZzt2 = zzedVar2.zzs();
                                } else {
                                    jZzt = zzedVar2.zzt();
                                    jZzt2 = zzedVar2.zzt();
                                }
                                long j5 = jZzf + jZzt2;
                                long jZzw3 = zzel.zzw(jZzt, 1000000L, jZzs2);
                                zzedVar2.zzG(2);
                                int iZzo = zzedVar2.zzo();
                                int[] iArr = new int[iZzo];
                                long[] jArr = new long[iZzo];
                                long[] jArr2 = new long[iZzo];
                                long[] jArr3 = new long[iZzo];
                                int i7 = 0;
                                long jZzw4 = jZzw3;
                                while (i7 < iZzo) {
                                    int iZze3 = zzedVar2.zze();
                                    if ((iZze3 & Integer.MIN_VALUE) != 0) {
                                        throw zzbu.zza("Unhandled indirect reference", null);
                                    }
                                    long jZzs3 = zzedVar2.zzs();
                                    iArr[i7] = iZze3 & Integer.MAX_VALUE;
                                    jArr[i7] = j5;
                                    jArr3[i7] = jZzw4;
                                    long j6 = jZzt + jZzs3;
                                    int i8 = i7;
                                    int i9 = iZzo;
                                    long[] jArr4 = jArr2;
                                    long[] jArr5 = jArr3;
                                    int[] iArr2 = iArr;
                                    jZzw4 = zzel.zzw(j6, 1000000L, jZzs2);
                                    jArr4[i8] = jZzw4 - jArr5[i8];
                                    zzedVar2.zzG(4);
                                    j5 += (long) iArr2[i8];
                                    i7 = i8 + 1;
                                    jArr2 = jArr4;
                                    jArr3 = jArr5;
                                    iArr = iArr2;
                                    jZzt = j6;
                                    jArr = jArr;
                                    iZzo = i9;
                                }
                                Pair pairCreate = Pair.create(Long.valueOf(jZzw3), new zzyt(iArr, jArr, jArr2, jArr3));
                                zzafiVar = this;
                                zzafiVar.u = ((Long) pairCreate.first).longValue();
                                zzafiVar.A.zzL((zzaai) pairCreate.second);
                                zzafiVar.D = true;
                                zzafiVar3 = zzafiVar;
                            } else {
                                zzafiVar = this;
                                if (i6 == 1701671783 && zzafiVar3.B.length != 0) {
                                    zzedVar2.zzF(8);
                                    int iZze4 = (zzedVar2.zze() >> 24) & 255;
                                    if (iZze4 == 0) {
                                        String strZzv = zzedVar2.zzv((char) 0);
                                        strZzv.getClass();
                                        String strZzv2 = zzedVar2.zzv((char) 0);
                                        strZzv2.getClass();
                                        long jZzs4 = zzedVar2.zzs();
                                        long jZzw5 = zzel.zzw(zzedVar2.zzs(), 1000000L, jZzs4);
                                        long j7 = zzafiVar3.u;
                                        long j8 = j7 != -9223372036854775807L ? j7 + jZzw5 : -9223372036854775807L;
                                        str = strZzv2;
                                        str2 = strZzv;
                                        jZzw = zzel.zzw(zzedVar2.zzs(), 1000L, jZzs4);
                                        j = jZzw5;
                                        jZzs = zzedVar2.zzs();
                                        jZzw2 = j8;
                                    } else if (iZze4 != 1) {
                                        bj0.b("Skipping unsupported emsg version: ", iZze4, "FragmentedMp4Extractor");
                                    } else {
                                        long jZzs5 = zzedVar2.zzs();
                                        jZzw2 = zzel.zzw(zzedVar2.zzt(), 1000000L, jZzs5);
                                        long jZzw6 = zzel.zzw(zzedVar2.zzs(), 1000L, jZzs5);
                                        long jZzs6 = zzedVar2.zzs();
                                        String strZzv3 = zzedVar2.zzv((char) 0);
                                        strZzv3.getClass();
                                        String strZzv4 = zzedVar2.zzv((char) 0);
                                        strZzv4.getClass();
                                        str = strZzv4;
                                        str2 = strZzv3;
                                        jZzw = jZzw6;
                                        jZzs = jZzs6;
                                        j = -9223372036854775807L;
                                    }
                                    byte[] bArr2 = new byte[zzedVar2.zza()];
                                    zzedVar2.zzB(bArr2, 0, zzedVar2.zza());
                                    zzed zzedVar3 = new zzed(zzafiVar3.h.zza(new zzacc(str2, str, jZzw, jZzs, bArr2)));
                                    int iZza = zzedVar3.zza();
                                    for (zzaam zzaamVar : zzafiVar3.B) {
                                        zzedVar3.zzF(0);
                                        zzaamVar.zzq(zzedVar3, iZza);
                                    }
                                    if (jZzw2 == -9223372036854775807L) {
                                        arrayDeque.addLast(new iv5(iZza, j, true));
                                        zzafiVar3.r += iZza;
                                    } else if (arrayDeque.isEmpty()) {
                                        for (zzaam zzaamVar2 : zzafiVar3.B) {
                                            zzaamVar2.zzs(jZzw2, 1, iZza, 0, null);
                                        }
                                    } else {
                                        arrayDeque.addLast(new iv5(iZza, jZzw2, false));
                                        zzafiVar3.r += iZza;
                                    }
                                }
                            }
                            zzzgVar2 = zzzgVar;
                        } else {
                            ((su5) arrayDeque2.peek()).c.add(tu5Var);
                            zzafiVar = this;
                        }
                    } else {
                        zzafiVar = this;
                        ((zzyv) zzzgVar2).zzo(i5, false);
                    }
                    zzafiVar3.d(zzzgVar.zzf());
                }
            } else {
                zzafiVar = zzafiVar2;
                int i10 = zzafiVar3.o;
                zzed zzedVar4 = zzafiVar3.i;
                if (i10 == 0) {
                    if (!zzzgVar2.zzn(zzedVar4.zzH(), 0, 8, true)) {
                        return -1;
                    }
                    zzafiVar3.o = 8;
                    zzedVar4.zzF(0);
                    zzafiVar3.n = zzedVar4.zzs();
                    zzafiVar3.m = zzedVar4.zze();
                }
                long j9 = zzafiVar3.n;
                if (j9 == 1) {
                    ((zzyv) zzzgVar2).zzn(zzedVar4.zzH(), 8, 8, false);
                    zzafiVar3.o += 8;
                    zzafiVar3.n = zzedVar4.zzt();
                } else if (j9 == 0) {
                    long jZzd = zzzgVar.zzd();
                    if (jZzd == -1) {
                        jZzd = !arrayDeque2.isEmpty() ? ((su5) arrayDeque2.peek()).b : -1L;
                    }
                    if (jZzd != -1) {
                        zzafiVar3.n = (jZzd - zzzgVar.zzf()) + ((long) zzafiVar3.o);
                    }
                }
                long j10 = zzafiVar3.n;
                long j11 = zzafiVar3.o;
                if (j10 < j11) {
                    throw zzbu.zzc("Atom size less than header length (unsupported).");
                }
                long jZzf2 = zzzgVar.zzf() - j11;
                int i11 = zzafiVar3.m;
                if ((i11 == 1836019558 || i11 == 1835295092) && !zzafiVar3.D) {
                    zzafiVar3.A.zzL(new zzaah(zzafiVar3.t, jZzf2));
                    zzafiVar3.D = true;
                }
                if (zzafiVar3.m == 1836019558) {
                    int size3 = sparseArray.size();
                    for (int i12 = 0; i12 < size3; i12++) {
                        nv5 nv5Var4 = ((jv5) sparseArray.valueAt(i12)).b;
                        nv5Var4.c = jZzf2;
                        nv5Var4.b = jZzf2;
                    }
                }
                int i13 = zzafiVar3.m;
                if (i13 == 1835295092) {
                    zzafiVar3.v = null;
                    zzafiVar3.q = jZzf2 + zzafiVar3.n;
                    zzafiVar3.l = 2;
                } else if (i13 == 1836019574 || i13 == 1953653099 || i13 == 1835297121 || i13 == 1835626086 || i13 == 1937007212 || i13 == 1836019558 || i13 == 1953653094 || i13 == 1836475768 || i13 == 1701082227) {
                    long jZzf3 = (zzzgVar.zzf() + zzafiVar3.n) - 8;
                    arrayDeque2.push(new su5(i13, jZzf3));
                    if (zzafiVar3.n == zzafiVar3.o) {
                        zzafiVar3.d(jZzf3);
                    } else {
                        b();
                    }
                } else if (i13 == 1751411826 || i13 == 1835296868 || i13 == 1836476516 || i13 == 1936286840 || i13 == 1937011556 || i13 == 1937011827 || i13 == 1668576371 || i13 == 1937011555 || i13 == 1937011578 || i13 == 1937013298 || i13 == 1937007471 || i13 == 1668232756 || i13 == 1937011571 || i13 == 1952867444 || i13 == 1952868452 || i13 == 1953196132 || i13 == 1953654136 || i13 == 1953658222 || i13 == 1886614376 || i13 == 1935763834 || i13 == 1935763823 || i13 == 1936027235 || i13 == 1970628964 || i13 == 1935828848 || i13 == 1936158820 || i13 == 1701606260 || i13 == 1835362404 || i13 == 1701671783) {
                    if (zzafiVar3.o != 8) {
                        throw zzbu.zzc("Leaf atom defines extended atom size (unsupported).");
                    }
                    long j12 = zzafiVar3.n;
                    if (j12 > 2147483647L) {
                        throw zzbu.zzc("Leaf atom with length > 2147483647 (unsupported).");
                    }
                    zzed zzedVar5 = new zzed((int) j12);
                    System.arraycopy(zzedVar4.zzH(), 0, zzedVar5.zzH(), 0, 8);
                    zzafiVar3.p = zzedVar5;
                    zzafiVar3.l = 1;
                } else {
                    if (zzafiVar3.n > 2147483647L) {
                        throw zzbu.zzc("Skipping atom with length > 2147483647 (unsupported).");
                    }
                    zzafiVar3.p = null;
                    zzafiVar3.l = 1;
                }
            }
            zzafiVar2 = zzafiVar;
        }
        if (zzafiVar3.l == 3) {
            boolean z3 = jv5Var.l;
            nv5 nv5Var5 = jv5Var.b;
            int i14 = !z3 ? jv5Var.d.d[jv5Var.f] : nv5Var5.h[jv5Var.f];
            zzafiVar3.w = i14;
            if (jv5Var.f < jv5Var.i) {
                ((zzyv) zzzgVar2).zzo(i14, false);
                zzaft zzaftVarB = jv5Var.b();
                if (zzaftVarB != null) {
                    zzed zzedVar6 = nv5Var5.n;
                    int i15 = zzaftVarB.zzd;
                    if (i15 != 0) {
                        zzedVar6.zzG(i15);
                    }
                    if (nv5Var5.k && nv5Var5.l[jv5Var.f]) {
                        zzedVar6.zzG(zzedVar6.zzo() * 6);
                    }
                }
                if (!jv5Var.d()) {
                    zzafiVar3.v = null;
                }
                zzafiVar3.l = 3;
                return 0;
            }
            if (jv5Var.d.a.zzg == 1) {
                zzafiVar3.w = i14 - 8;
                ((zzyv) zzzgVar2).zzo(8, false);
            }
            if ("audio/ac4".equals(jv5Var.d.a.zzf.zzm)) {
                zzafiVar3.x = jv5Var.a(zzafiVar3.w, 7);
                int i16 = zzafiVar3.w;
                zzed zzedVar7 = zzafiVar3.g;
                zzyj.zzb(i16, zzedVar7);
                jv5Var.a.zzq(zzedVar7, 7);
                iA = zzafiVar3.x + 7;
                zzafiVar3.x = iA;
                i = 0;
            } else {
                i = 0;
                iA = jv5Var.a(zzafiVar3.w, 0);
                zzafiVar3.x = iA;
            }
            zzafiVar3.w += iA;
            zzafiVar3.l = 4;
            zzafiVar3.y = i;
        }
        ov5 ov5Var = jv5Var.d;
        zzafs zzafsVar = ov5Var.a;
        ?? r6 = jv5Var.a;
        boolean z4 = jv5Var.l;
        nv5 nv5Var6 = jv5Var.b;
        long j13 = z4 ? nv5Var6.i[jv5Var.f] : ov5Var.f[jv5Var.f];
        int i17 = zzafsVar.zzj;
        if (i17 == 0) {
            while (true) {
                int i18 = zzafiVar3.x;
                int i19 = zzafiVar3.w;
                if (i18 >= i19) {
                    break;
                }
                zzafiVar3.x += r6.zze(zzzgVar2, i19 - i18, false);
            }
        } else {
            ?? r7 = 0;
            zzed zzedVar8 = zzafiVar3.d;
            byte[] bArrZzH = zzedVar8.zzH();
            bArrZzH[0] = 0;
            bArrZzH[1] = 0;
            bArrZzH[2] = 0;
            int i20 = i17 + 1;
            int i21 = 4 - i17;
            ?? r11 = zzedVar8;
            while (zzafiVar3.x < zzafiVar3.w) {
                int i22 = zzafiVar3.y;
                if (i22 == 0) {
                    ((zzyv) zzzgVar2).zzn(bArrZzH, i21, i20, r7);
                    r11.zzF(r7);
                    int iZze5 = r11.zze();
                    if (iZze5 <= 0) {
                        throw zzbu.zza("Invalid NAL length", null);
                    }
                    zzafiVar3.y = iZze5 - 1;
                    ?? r0 = zzafiVar3.c;
                    r0.zzF(r7);
                    r6.zzq(r0, 4);
                    r6.zzq(r11, 1);
                    if (zzafiVar3.C.length > 0) {
                        String str3 = zzafsVar.zzf.zzm;
                        byte b = bArrZzH[4];
                        byte[] bArr3 = zzaac.zza;
                        r18 = r11;
                        if ("video/avc".equals(str3)) {
                            bArr = bArrZzH;
                            if ((b & 31) != 6) {
                            }
                            r17 = r18;
                            z = true;
                            r16 = r18;
                            zzafiVar3.z = z;
                            zzafiVar3.x += 5;
                            zzafiVar3.w += i21;
                            i21 = i21;
                        } else {
                            bArr = bArrZzH;
                        }
                        r17 = r18;
                        if ("video/hevc".equals(str3) && ((b & 126) >> 1) == 39) {
                            r17 = r18;
                            z = true;
                            r16 = r18;
                        }
                        zzafiVar3.z = z;
                        zzafiVar3.x += 5;
                        zzafiVar3.w += i21;
                        i21 = i21;
                    } else {
                        r17 = r11;
                        bArr = bArrZzH;
                    }
                    r17 = r18;
                    z = false;
                    r16 = r17;
                    zzafiVar3.z = z;
                    zzafiVar3.x += 5;
                    zzafiVar3.w += i21;
                    i21 = i21;
                } else {
                    r16 = r11;
                    bArr = bArrZzH;
                    if (zzafiVar3.z) {
                        zzed zzedVar9 = zzafiVar3.e;
                        zzedVar9.zzC(i22);
                        ((zzyv) zzzgVar2).zzn(zzedVar9.zzH(), 0, zzafiVar3.y, false);
                        r6.zzq(zzedVar9, zzafiVar3.y);
                        iZze = zzafiVar3.y;
                        int iZzb = zzaac.zzb(zzedVar9.zzH(), zzedVar9.zzd());
                        zzedVar9.zzF("video/hevc".equals(zzafsVar.zzf.zzm) ? 1 : 0);
                        zzedVar9.zzE(iZzb);
                        zzys.zza(j13, zzedVar9, zzafiVar3.C);
                    } else {
                        iZze = r6.zze(zzzgVar2, i22, false);
                    }
                    zzafiVar3.x += iZze;
                    zzafiVar3.y -= iZze;
                }
                r7 = 0;
                bArrZzH = bArr;
                i21 = i21;
                r11 = r16;
            }
        }
        int i23 = jv5Var.l ? nv5Var6.j[jv5Var.f] ? 1 : 0 : jv5Var.d.g[jv5Var.f];
        if (jv5Var.b() != null) {
            i23 |= 1073741824;
        }
        int i24 = i23;
        zzaft zzaftVarB2 = jv5Var.b();
        r6.zzs(j13, i24, zzafiVar3.w, 0, zzaftVarB2 != null ? zzaftVarB2.zzc : null);
        while (!arrayDeque.isEmpty()) {
            iv5 iv5Var = (iv5) arrayDeque.removeFirst();
            zzafiVar3.r -= iv5Var.c;
            boolean z5 = iv5Var.b;
            long j14 = iv5Var.a;
            if (z5) {
                j14 += j13;
            }
            for (zzaam zzaamVar3 : zzafiVar3.B) {
                zzaamVar3.zzs(j14, 1, iv5Var.c, zzafiVar3.r, null);
            }
        }
        if (!jv5Var.d()) {
            zzafiVar3.v = null;
        }
        zzafiVar3.l = 3;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final void zzb(zzzi zzziVar) {
        this.A = zzziVar;
        b();
        zzaam[] zzaamVarArr = new zzaam[2];
        this.B = zzaamVarArr;
        int i = 0;
        zzaam[] zzaamVarArr2 = (zzaam[]) zzel.zzae(zzaamVarArr, 0);
        this.B = zzaamVarArr2;
        for (zzaam zzaamVar : zzaamVarArr2) {
            zzaamVar.zzk(F);
        }
        List list = this.a;
        this.C = new zzaam[list.size()];
        int i2 = 100;
        while (i < this.C.length) {
            int i3 = i2 + 1;
            zzaam zzaamVarZzv = this.A.zzv(i2, 3);
            zzaamVarZzv.zzk((zzaf) list.get(i));
            this.C[i] = zzaamVarZzv;
            i++;
            i2 = i3;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final void zzc(long j, long j2) {
        SparseArray sparseArray = this.b;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            ((jv5) sparseArray.valueAt(i)).c();
        }
        this.k.clear();
        this.r = 0;
        this.s = j2;
        this.j.clear();
        b();
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final boolean zzd(zzzg zzzgVar) {
        return hH.G(zzzgVar, true);
    }

    public zzafi(int i, zzej zzejVar) {
        this.a = Collections.unmodifiableList(Collections.emptyList());
        this.h = new zzacd();
        this.i = new zzed(16);
        this.c = new zzed(zzaac.zza);
        this.d = new zzed(5);
        this.e = new zzed();
        byte[] bArr = new byte[16];
        this.f = bArr;
        this.g = new zzed(bArr);
        this.j = new ArrayDeque();
        this.k = new ArrayDeque();
        this.b = new SparseArray();
        this.t = -9223372036854775807L;
        this.s = -9223372036854775807L;
        this.u = -9223372036854775807L;
        this.A = zzzi.zza;
        this.B = new zzaam[0];
        this.C = new zzaam[0];
    }
}
