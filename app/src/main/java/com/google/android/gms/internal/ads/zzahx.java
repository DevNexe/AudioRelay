package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Log;
import android.util.SparseArray;
import defpackage.qw5;
import defpackage.rw5;
import defpackage.sw5;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzahx implements zzzf {
    public static final zzzm zza = new zzzm() { // from class: com.google.android.gms.internal.ads.zzahv
        @Override // com.google.android.gms.internal.ads.zzzm
        public final zzzf[] zza() {
            return new zzzf[]{new zzahx()};
        }

        @Override // com.google.android.gms.internal.ads.zzzm
        public final /* synthetic */ zzzf[] zzb(Uri uri, Map map) {
            return zzzl.zza(this, uri, map);
        }
    };
    public boolean e;
    public boolean f;
    public boolean g;
    public long h;
    public qw5 i;
    public zzzi j;
    public boolean k;
    public final zzej a = new zzej(0);
    public final zzed c = new zzed(4096);
    public final SparseArray b = new SparseArray();
    public final rw5 d = new rw5();

    /* JADX WARN: Code duplicated, block: B:105:0x0247  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.ads.zzzf
    public final int zza(zzzg zzzgVar, zzaaf zzaafVar) throws EOFException, InterruptedIOException {
        long j;
        ?? r12;
        long jZzb;
        zzagz zzahbVar;
        zzdd.zzb(this.j);
        long jZzd = zzzgVar.zzd();
        long j2 = -9223372036854775807L;
        rw5 rw5Var = this.d;
        int i = 1;
        if (jZzd != -1 && !rw5Var.c) {
            boolean z = rw5Var.e;
            zzed zzedVar = rw5Var.b;
            if (!z) {
                long jZzd2 = zzzgVar.zzd();
                int iMin = (int) Math.min(20000L, jZzd2);
                long j3 = jZzd2 - ((long) iMin);
                if (zzzgVar.zzf() != j3) {
                    zzaafVar.zza = j3;
                } else {
                    zzedVar.zzC(iMin);
                    zzzgVar.zzj();
                    ((zzyv) zzzgVar).zzm(zzedVar.zzH(), 0, iMin, false);
                    int iZzc = zzedVar.zzc();
                    for (int iZzd = zzedVar.zzd() - 4; iZzd >= iZzc; iZzd--) {
                        if (rw5.b(iZzd, zzedVar.zzH()) == 442) {
                            zzedVar.zzF(iZzd + 4);
                            long jA = rw5.a(zzedVar);
                            if (jA != -9223372036854775807L) {
                                j2 = jA;
                                break;
                            }
                        }
                    }
                    rw5Var.g = j2;
                    rw5Var.e = true;
                    i = 0;
                }
            } else {
                if (rw5Var.g == -9223372036854775807L) {
                    byte[] bArr = zzel.zzf;
                    int length = bArr.length;
                    zzedVar.zzD(bArr, 0);
                    rw5Var.c = true;
                    zzzgVar.zzj();
                    return 0;
                }
                if (rw5Var.d) {
                    long j4 = rw5Var.f;
                    if (j4 == -9223372036854775807L) {
                        byte[] bArr2 = zzel.zzf;
                        int length2 = bArr2.length;
                        zzedVar.zzD(bArr2, 0);
                        rw5Var.c = true;
                        zzzgVar.zzj();
                        return 0;
                    }
                    zzej zzejVar = rw5Var.a;
                    long jZzb2 = zzejVar.zzb(rw5Var.g) - zzejVar.zzb(j4);
                    rw5Var.h = jZzb2;
                    if (jZzb2 < 0) {
                        Log.w("PsDurationReader", "Invalid duration: " + jZzb2 + ". Using TIME_UNSET instead.");
                        rw5Var.h = -9223372036854775807L;
                    }
                    byte[] bArr3 = zzel.zzf;
                    int length3 = bArr3.length;
                    zzedVar.zzD(bArr3, 0);
                    rw5Var.c = true;
                    zzzgVar.zzj();
                    return 0;
                }
                int iMin2 = (int) Math.min(20000L, zzzgVar.zzd());
                if (zzzgVar.zzf() != 0) {
                    zzaafVar.zza = 0L;
                } else {
                    zzedVar.zzC(iMin2);
                    zzzgVar.zzj();
                    ((zzyv) zzzgVar).zzm(zzedVar.zzH(), 0, iMin2, false);
                    int iZzd2 = zzedVar.zzd();
                    for (int iZzc2 = zzedVar.zzc(); iZzc2 < iZzd2 - 3; iZzc2++) {
                        if (rw5.b(iZzc2, zzedVar.zzH()) == 442) {
                            zzedVar.zzF(iZzc2 + 4);
                            long jA2 = rw5.a(zzedVar);
                            if (jA2 != -9223372036854775807L) {
                                j2 = jA2;
                                break;
                            }
                        }
                    }
                    rw5Var.f = j2;
                    rw5Var.d = true;
                    i = 0;
                }
            }
            return i;
        }
        if (this.k) {
            j = 0;
            r12 = 0;
        } else {
            this.k = true;
            long j5 = rw5Var.h;
            if (j5 != -9223372036854775807L) {
                r12 = 0;
                qw5 qw5Var = new qw5(rw5Var.a, j5, jZzd);
                this.i = qw5Var;
                this.j.zzL(qw5Var.zzb());
                j = 0;
            } else {
                r12 = 0;
                j = 0;
                this.j.zzL(new zzaah(j5, 0L));
            }
        }
        qw5 qw5Var2 = this.i;
        if (qw5Var2 != null && qw5Var2.zze()) {
            return qw5Var2.zza(zzzgVar, zzaafVar);
        }
        zzzgVar.zzj();
        long jZze = jZzd != -1 ? jZzd - zzzgVar.zze() : -1L;
        if (jZze != -1 && jZze < 4) {
            return -1;
        }
        zzed zzedVar2 = this.c;
        if (!zzzgVar.zzm(zzedVar2.zzH(), r12, 4, true)) {
            return -1;
        }
        zzedVar2.zzF(r12);
        int iZze = zzedVar2.zze();
        if (iZze == 441) {
            return -1;
        }
        if (iZze == 442) {
            zzyv zzyvVar = (zzyv) zzzgVar;
            zzyvVar.zzm(zzedVar2.zzH(), r12, 10, r12);
            zzedVar2.zzF(9);
            zzyvVar.zzo((zzedVar2.zzk() & 7) + 14, r12);
            return r12;
        }
        if (iZze == 443) {
            zzyv zzyvVar2 = (zzyv) zzzgVar;
            zzyvVar2.zzm(zzedVar2.zzH(), r12, 2, r12);
            zzedVar2.zzF(r12);
            zzyvVar2.zzo(zzedVar2.zzo() + 6, r12);
            return r12;
        }
        if ((iZze >> 8) != 1) {
            ((zzyv) zzzgVar).zzo(1, r12);
            return r12;
        }
        int i2 = iZze & 255;
        SparseArray sparseArray = this.b;
        sw5 sw5Var = (sw5) sparseArray.get(i2);
        if (!this.e) {
            if (sw5Var == null) {
                zzagz zzagzVar = null;
                if (i2 == 189) {
                    zzahbVar = new zzagp(null);
                    this.f = true;
                    this.h = zzzgVar.zzf();
                } else if ((i2 & 224) == 192) {
                    zzahbVar = new zzahn(null);
                    this.f = true;
                    this.h = zzzgVar.zzf();
                } else if ((i2 & 240) == 224) {
                    zzahbVar = new zzahb(null);
                    this.g = true;
                    this.h = zzzgVar.zzf();
                } else if (zzagzVar != null) {
                    zzagzVar.zzb(this.j, new zzail(Integer.MIN_VALUE, i2, 256));
                    sw5Var = new sw5(zzagzVar, this.a);
                    sparseArray.put(i2, sw5Var);
                }
                zzagzVar = zzahbVar;
                if (zzagzVar != null) {
                    zzagzVar.zzb(this.j, new zzail(Integer.MIN_VALUE, i2, 256));
                    sw5Var = new sw5(zzagzVar, this.a);
                    sparseArray.put(i2, sw5Var);
                }
            }
            if (zzzgVar.zzf() > ((this.f && this.g) ? this.h + 8192 : 1048576L)) {
                this.e = true;
                this.j.zzB();
            }
        }
        zzyv zzyvVar3 = (zzyv) zzzgVar;
        zzyvVar3.zzm(zzedVar2.zzH(), r12, 2, r12);
        zzedVar2.zzF(r12);
        int iZzo = zzedVar2.zzo() + 6;
        if (sw5Var == null) {
            zzyvVar3.zzo(iZzo, r12);
            return 0;
        }
        zzedVar2.zzC(iZzo);
        zzyvVar3.zzn(zzedVar2.zzH(), r12, iZzo, r12);
        zzedVar2.zzF(6);
        zzec zzecVar = sw5Var.c;
        zzedVar2.zzB(zzecVar.zza, r12, 3);
        zzecVar.zzh(r12);
        zzecVar.zzj(8);
        sw5Var.d = zzecVar.zzl();
        sw5Var.e = zzecVar.zzl();
        zzecVar.zzj(6);
        zzedVar2.zzB(zzecVar.zza, r12, zzecVar.zzc(8));
        zzecVar.zzh(r12);
        if (sw5Var.d) {
            zzecVar.zzj(4);
            int iZzc3 = zzecVar.zzc(3);
            zzecVar.zzj(1);
            int iZzc4 = zzecVar.zzc(15);
            zzecVar.zzj(1);
            long jZzc = (((long) iZzc3) << 30) | ((long) (iZzc4 << 15)) | ((long) zzecVar.zzc(15));
            zzecVar.zzj(1);
            boolean z2 = sw5Var.f;
            zzej zzejVar2 = sw5Var.b;
            if (!z2 && sw5Var.e) {
                zzecVar.zzj(4);
                int iZzc5 = zzecVar.zzc(3);
                zzecVar.zzj(1);
                int iZzc6 = zzecVar.zzc(15);
                zzecVar.zzj(1);
                int iZzc7 = zzecVar.zzc(15);
                zzecVar.zzj(1);
                zzejVar2.zzb(((long) (iZzc6 << 15)) | (((long) iZzc5) << 30) | ((long) iZzc7));
                sw5Var.f = true;
            }
            jZzb = zzejVar2.zzb(jZzc);
        } else {
            jZzb = j;
        }
        zzagz zzagzVar2 = sw5Var.a;
        zzagzVar2.zzd(jZzb, 4);
        zzagzVar2.zza(zzedVar2);
        zzagzVar2.zzc();
        zzedVar2.zzE(zzedVar2.zzb());
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final void zzb(zzzi zzziVar) {
        this.j = zzziVar;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    @Override // com.google.android.gms.internal.ads.zzzf
    public final void zzc(long j, long j2) {
        zzej zzejVar = this.a;
        if (zzejVar.zze() != -9223372036854775807L) {
            long jZzc = zzejVar.zzc();
            if (jZzc != -9223372036854775807L && jZzc != 0 && jZzc != j2) {
                zzejVar.zzf(j2);
            }
        } else {
            zzejVar.zzf(j2);
        }
        qw5 qw5Var = this.i;
        if (qw5Var != null) {
            qw5Var.zzd(j2);
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.b;
            if (i >= sparseArray.size()) {
                return;
            }
            sw5 sw5Var = (sw5) sparseArray.valueAt(i);
            sw5Var.f = false;
            sw5Var.a.zze();
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final boolean zzd(zzzg zzzgVar) throws EOFException, InterruptedIOException {
        byte[] bArr = new byte[14];
        zzyv zzyvVar = (zzyv) zzzgVar;
        zzyvVar.zzm(bArr, 0, 14, false);
        if ((((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) != 442 || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        zzyvVar.zzl(bArr[13] & 7, false);
        zzyvVar.zzm(bArr, 0, 3, false);
        return ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255)) == 1;
    }
}
