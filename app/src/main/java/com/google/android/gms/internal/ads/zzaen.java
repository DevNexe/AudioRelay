package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Log;
import defpackage.mu5;
import defpackage.nu5;
import defpackage.ou5;
import defpackage.pu5;
import defpackage.qc0;
import defpackage.qu5;
import defpackage.ru5;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaen implements zzzf {
    public static final zzzm zza = new zzzm() { // from class: com.google.android.gms.internal.ads.zzael
        @Override // com.google.android.gms.internal.ads.zzzm
        public final zzzf[] zza() {
            return new zzzf[]{new zzaen(0)};
        }

        @Override // com.google.android.gms.internal.ads.zzzm
        public final /* synthetic */ zzzf[] zzb(Uri uri, Map map) {
            return zzzl.zza(this, uri, map);
        }
    };
    public final zzed a;
    public final zzzy b;
    public final zzzu c;
    public final zzzw d;
    public zzzi e;
    public zzaam f;
    public zzaam g;
    public int h;
    public zzbq i;
    public long j;
    public long k;
    public long l;
    public int m;
    public pu5 n;
    public boolean o;

    static {
        zzaem zzaemVar = new zzacx() { // from class: com.google.android.gms.internal.ads.zzaem
        };
    }

    public zzaen() {
        this(0);
    }

    public final mu5 a(zzzg zzzgVar) {
        zzed zzedVar = this.a;
        ((zzyv) zzzgVar).zzm(zzedVar.zzH(), 0, 4, false);
        zzedVar.zzF(0);
        this.b.zza(zzedVar.zze());
        return new mu5(zzzgVar.zzd(), zzzgVar.zzf(), this.b);
    }

    public final boolean b(zzzg zzzgVar) {
        pu5 pu5Var = this.n;
        if (pu5Var != null) {
            long jZzb = pu5Var.zzb();
            if (jZzb != -1 && zzzgVar.zze() > jZzb - 4) {
                return true;
            }
        }
        try {
            return !zzzgVar.zzm(this.a.zzH(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x006d  */
    /* JADX WARN: Code duplicated, block: B:34:0x007a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x007b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0082 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x0084  */
    /* JADX WARN: Code duplicated, block: B:39:0x0090  */
    /* JADX WARN: Code duplicated, block: B:43:0x009e  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:52:0x0078 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x009a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x00a8 A[EDGE_INSN: B:55:0x00a8->B:46:0x00a8 BREAK  A[LOOP:0: B:16:0x003f->B:58:0x003f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x0074 A[SYNTHETIC] */
    public final boolean c(zzzg zzzgVar, boolean z) throws zzbu, EOFException, InterruptedIOException {
        int iZze;
        int iZzb;
        int i;
        int i2 = true != z ? 131072 : 32768;
        zzzgVar.zzj();
        if (zzzgVar.zzf() == 0) {
            zzbq zzbqVarZza = this.d.zza(zzzgVar, null);
            this.i = zzbqVarZza;
            if (zzbqVarZza != null) {
                this.c.zzb(zzbqVarZza);
            }
            iZze = (int) zzzgVar.zze();
            if (!z) {
                ((zzyv) zzzgVar).zzo(iZze, false);
            }
        } else {
            iZze = 0;
        }
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (b(zzzgVar)) {
                if (i4 > 0) {
                    break;
                }
                throw new EOFException();
            }
            zzed zzedVar = this.a;
            zzedVar.zzF(0);
            int iZze2 = zzedVar.zze();
            if (i3 == 0) {
                iZzb = zzzz.zzb(iZze2);
                if (iZzb != -1) {
                    i = i5 + 1;
                    if (i5 == i2) {
                        if (z) {
                            return false;
                        }
                        throw zzbu.zza("Searched too many bytes.", null);
                    }
                    if (z) {
                        zzzgVar.zzj();
                        ((zzyv) zzzgVar).zzl(iZze + i, false);
                    } else {
                        ((zzyv) zzzgVar).zzo(1, false);
                    }
                    i5 = i;
                    i3 = 0;
                    i4 = 0;
                } else {
                    i4++;
                    if (i4 == 1) {
                        if (i4 == 4) {
                            break;
                        }
                    } else {
                        this.b.zza(iZze2);
                        i3 = iZze2;
                    }
                    ((zzyv) zzzgVar).zzl(iZzb - 4, false);
                }
            } else {
                if (((long) ((-128000) & iZze2)) == (((long) i3) & (-128000))) {
                    iZzb = zzzz.zzb(iZze2);
                    if (iZzb != -1) {
                        i4++;
                        if (i4 == 1) {
                            if (i4 == 4) {
                                break;
                                break;
                            }
                        } else {
                            this.b.zza(iZze2);
                            i3 = iZze2;
                        }
                        ((zzyv) zzzgVar).zzl(iZzb - 4, false);
                    }
                }
                i = i5 + 1;
                if (i5 == i2) {
                    if (z) {
                        return false;
                    }
                    throw zzbu.zza("Searched too many bytes.", null);
                }
                if (z) {
                    zzzgVar.zzj();
                    ((zzyv) zzzgVar).zzl(iZze + i, false);
                } else {
                    ((zzyv) zzzgVar).zzo(1, false);
                }
                i5 = i;
                i3 = 0;
                i4 = 0;
            }
        }
        if (z) {
            ((zzyv) zzzgVar).zzo(iZze + i5, false);
        } else {
            zzzgVar.zzj();
        }
        this.h = i3;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0258  */
    /* JADX WARN: Code duplicated, block: B:106:0x025f  */
    /* JADX WARN: Code duplicated, block: B:110:0x0270  */
    /* JADX WARN: Code duplicated, block: B:112:0x0278  */
    /* JADX WARN: Code duplicated, block: B:119:0x02aa A[LOOP:2: B:118:0x02a8->B:119:0x02aa, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:11:0x003b  */
    /* JADX WARN: Code duplicated, block: B:121:0x02db A[LOOP:0: B:105:0x025d->B:121:0x02db, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:122:0x02e3 A[EDGE_INSN: B:122:0x02e3->B:123:0x02e8 BREAK  A[LOOP:0: B:105:0x025d->B:121:0x02db]] */
    /* JADX WARN: Code duplicated, block: B:125:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:126:0x02f2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:127:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:128:0x02f6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:129:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:131:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:132:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:134:0x0344  */
    /* JADX WARN: Code duplicated, block: B:136:0x0351  */
    /* JADX WARN: Code duplicated, block: B:138:0x0359  */
    /* JADX WARN: Code duplicated, block: B:13:0x003f  */
    /* JADX WARN: Code duplicated, block: B:142:0x0368  */
    /* JADX WARN: Code duplicated, block: B:145:0x0373  */
    /* JADX WARN: Code duplicated, block: B:147:0x038c  */
    /* JADX WARN: Code duplicated, block: B:148:0x038e  */
    /* JADX WARN: Code duplicated, block: B:14:0x0042  */
    /* JADX WARN: Code duplicated, block: B:150:0x0391  */
    /* JADX WARN: Code duplicated, block: B:162:0x03dc A[PHI: r1
  0x03dc: PHI (r1v5 int) = (r1v4 int), (r1v20 int) binds: [B:141:0x0366, B:157:0x03bb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:164:0x03e6 A[PHI: r2 r4
  0x03e6: PHI (r2v4 com.google.android.gms.internal.ads.zzzy) = 
  (r2v3 com.google.android.gms.internal.ads.zzzy)
  (r2v11 com.google.android.gms.internal.ads.zzzy)
  (r2v11 com.google.android.gms.internal.ads.zzzy)
 binds: [B:6:0x0016, B:163:0x03e4, B:143:0x036f] A[DONT_GENERATE, DONT_INLINE]
  0x03e6: PHI (r4v1 'this' com.google.android.gms.internal.ads.zzaen) = 
  (r4v0 'this' com.google.android.gms.internal.ads.zzaen)
  (r4v4 'this' com.google.android.gms.internal.ads.zzaen)
  (r4v4 'this' com.google.android.gms.internal.ads.zzaen)
 binds: [B:6:0x0016, B:163:0x03e4, B:143:0x036f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:165:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:168:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:16:0x0046  */
    /* JADX WARN: Code duplicated, block: B:17:0x0049  */
    /* JADX WARN: Code duplicated, block: B:181:0x02e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x0267 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x0284 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:0x0292 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:0x028f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:0x028f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x005c  */
    /* JADX WARN: Code duplicated, block: B:22:0x0065 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0067  */
    /* JADX WARN: Code duplicated, block: B:24:0x006b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0073  */
    /* JADX WARN: Code duplicated, block: B:28:0x007c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0080  */
    /* JADX WARN: Code duplicated, block: B:68:0x0173  */
    /* JADX WARN: Code duplicated, block: B:70:0x018e  */
    /* JADX WARN: Code duplicated, block: B:85:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:87:0x0202  */
    /* JADX WARN: Code duplicated, block: B:93:0x0232  */
    /* JADX WARN: Code duplicated, block: B:96:0x023f  */
    /* JADX WARN: Code duplicated, block: B:9:0x0021  */
    @Override // com.google.android.gms.internal.ads.zzzf
    public final int zza(zzzg zzzgVar, zzaaf zzaafVar) throws zzbu, EOFException, InterruptedIOException {
        zzzy zzzyVar;
        int i;
        int i2;
        pu5 pu5Var;
        zzed zzedVar;
        zzzg zzzgVar2;
        zzed zzedVar2;
        long j;
        long jZzf;
        int i3;
        int i4;
        int iZze;
        int i5;
        int iZze2;
        boolean z;
        zzed zzedVar3;
        int i6;
        int iZze3;
        zzzy zzzyVar2;
        int iZze4;
        zzed zzedVar4;
        pu5 pu5VarA;
        zzed zzedVar5;
        int iZzn;
        zzbq zzbqVar;
        long jZzf2;
        zzzy zzzyVar3;
        ou5 ou5Var;
        int iZza;
        int i7;
        zzbp zzbpVarZzb;
        zzade zzadeVar;
        int iZza2;
        int i8;
        long jZzv;
        int length;
        long[] jArr;
        long[] jArr2;
        long j2;
        int i9;
        zzbp zzbpVarZzb2;
        zzadi zzadiVar;
        zzed zzedVar6;
        zzzy zzzyVar4;
        int iZzk;
        zzdd.zzb(this.f);
        int i10 = zzel.zza;
        int i11 = this.h;
        zzzy zzzyVar5 = this.b;
        if (i11 == 0) {
            try {
                c(zzzgVar, false);
                pu5Var = this.n;
                zzedVar = this.a;
                if (pu5Var == null) {
                    zzedVar3 = new zzed(zzzyVar5.zzc);
                    ((zzyv) zzzgVar).zzm(zzedVar3.zzH(), 0, zzzyVar5.zzc, false);
                    if ((zzzyVar5.zza & 1) != 0) {
                        if (zzzyVar5.zze != 1) {
                            i6 = 36;
                        } else {
                            i6 = 21;
                        }
                    } else if (zzzyVar5.zze != 1) {
                        i6 = 21;
                    } else {
                        i6 = 13;
                    }
                    if (zzedVar3.zzd() >= i6 + 4) {
                        zzedVar3.zzF(i6);
                        iZze3 = zzedVar3.zze();
                        if (iZze3 != 1483304551) {
                            if (iZze3 == 1231971951) {
                                iZze3 = 1231971951;
                            } else if (zzedVar3.zzd() >= 40) {
                                zzedVar3.zzF(36);
                                if (zzedVar3.zze() == 1447187017) {
                                    iZze3 = 1447187017;
                                } else {
                                    iZze3 = 0;
                                }
                            } else {
                                iZze3 = 0;
                            }
                        }
                    } else if (zzedVar3.zzd() >= 40) {
                        zzedVar3.zzF(36);
                        if (zzedVar3.zze() == 1447187017) {
                            iZze3 = 1447187017;
                        } else {
                            iZze3 = 0;
                        }
                    } else {
                        iZze3 = 0;
                    }
                    zzzu zzzuVar = this.c;
                    if (iZze3 != 1483304551 || iZze3 == 1231971951) {
                        zzzgVar2 = zzzgVar;
                        zzzyVar2 = zzzyVar5;
                        long jZzd = zzzgVar.zzd();
                        long jZzf3 = zzzgVar.zzf();
                        int i12 = zzzyVar2.zzg;
                        int i13 = zzzyVar2.zzd;
                        iZze4 = zzedVar3.zze();
                        if ((iZze4 & 1) == 1 || (iZzn = zzedVar3.zzn()) == 0) {
                            zzedVar4 = zzedVar;
                            pu5VarA = null;
                        } else {
                            zzedVar4 = zzedVar;
                            long jZzw = zzel.zzw(iZzn, ((long) i12) * 1000000, i13);
                            if ((iZze4 & 6) != 6) {
                                pu5VarA = new ru5(jZzf3, zzzyVar2.zzc, jZzw, -1L, null);
                            } else {
                                long jZzs = zzedVar3.zzs();
                                long[] jArr3 = new long[100];
                                for (int i14 = 0; i14 < 100; i14++) {
                                    jArr3[i14] = zzedVar3.zzk();
                                }
                                if (jZzd != -1) {
                                    long j3 = jZzf3 + jZzs;
                                    if (jZzd != j3) {
                                        StringBuilder sbB = qc0.b("XING data size mismatch: ", jZzd, ", ");
                                        sbB.append(j3);
                                        Log.w("XingSeeker", sbB.toString());
                                    }
                                }
                                pu5VarA = new ru5(jZzf3, zzzyVar2.zzc, jZzw, jZzs, jArr3);
                            }
                        }
                        if (pu5VarA != null || zzzuVar.zza()) {
                            zzedVar5 = zzedVar4;
                        } else {
                            zzzgVar.zzj();
                            zzyv zzyvVar = (zzyv) zzzgVar2;
                            zzyvVar.zzl(i6 + 141, false);
                            zzyvVar.zzm(zzedVar4.zzH(), 0, 3, false);
                            zzedVar5 = zzedVar4;
                            zzedVar5.zzF(0);
                            int iZzm = zzedVar5.zzm();
                            int i15 = iZzm >> 12;
                            int i16 = iZzm & 4095;
                            if (i15 > 0 || i16 > 0) {
                                zzzuVar.zza = i15;
                                zzzuVar.zzb = i16;
                            }
                        }
                        ((zzyv) zzzgVar2).zzo(zzzyVar2.zzc, false);
                        if (pu5VarA != null && !pu5VarA.zzh() && iZze3 == 1231971951) {
                            pu5VarA = a(zzzgVar);
                        }
                    } else {
                        if (iZze3 == 1447187017) {
                            long jZzd2 = zzzgVar.zzd();
                            long jZzf4 = zzzgVar.zzf();
                            zzedVar3.zzG(10);
                            int iZze5 = zzedVar3.zze();
                            if (iZze5 <= 0) {
                                zzzyVar4 = zzzyVar5;
                                zzedVar6 = zzedVar;
                            } else {
                                int i17 = zzzyVar5.zzd;
                                long jZzw2 = zzel.zzw(iZze5, ((long) (i17 >= 32000 ? 1152 : 576)) * 1000000, i17);
                                int iZzo = zzedVar3.zzo();
                                int iZzo2 = zzedVar3.zzo();
                                int iZzo3 = zzedVar3.zzo();
                                zzedVar3.zzG(2);
                                long j4 = ((long) zzzyVar5.zzc) + jZzf4;
                                long[] jArr4 = new long[iZzo];
                                long[] jArr5 = new long[iZzo];
                                zzedVar6 = zzedVar;
                                long j5 = jZzf4;
                                int i18 = 0;
                                while (true) {
                                    if (i18 >= iZzo) {
                                        zzzyVar4 = zzzyVar5;
                                        long j6 = jZzd2;
                                        if (j6 != -1 && j6 != j5) {
                                            StringBuilder sbB2 = qc0.b("VBRI data size mismatch: ", j6, ", ");
                                            sbB2.append(j5);
                                            Log.w("VbriSeeker", sbB2.toString());
                                        }
                                        pu5VarA = new qu5(jArr4, jArr5, jZzw2, j5);
                                        break;
                                    }
                                    zzzyVar4 = zzzyVar5;
                                    long j7 = jZzd2;
                                    int i19 = iZzo2;
                                    zzed zzedVar7 = zzedVar3;
                                    jArr4[i18] = (((long) i18) * jZzw2) / ((long) iZzo);
                                    jArr5[i18] = Math.max(j5, j4);
                                    if (iZzo3 == 1) {
                                        iZzk = zzedVar7.zzk();
                                    } else if (iZzo3 == 2) {
                                        iZzk = zzedVar7.zzo();
                                    } else if (iZzo3 == 3) {
                                        iZzk = zzedVar7.zzm();
                                    } else if (iZzo3 == 4) {
                                        iZzk = zzedVar7.zzn();
                                    }
                                    j5 += ((long) iZzk) * ((long) i19);
                                    i18++;
                                    iZzo2 = i19;
                                    zzzyVar5 = zzzyVar4;
                                    jZzd2 = j7;
                                    zzedVar3 = zzedVar7;
                                }
                                zzzyVar2 = zzzyVar4;
                                zzzgVar2 = zzzgVar;
                                ((zzyv) zzzgVar2).zzo(zzzyVar2.zzc, false);
                            }
                            pu5VarA = null;
                            zzzyVar2 = zzzyVar4;
                            zzzgVar2 = zzzgVar;
                            ((zzyv) zzzgVar2).zzo(zzzyVar2.zzc, false);
                        } else {
                            zzzgVar2 = zzzgVar;
                            zzzyVar2 = zzzyVar5;
                            zzedVar6 = zzedVar;
                            zzzgVar.zzj();
                            pu5VarA = null;
                        }
                        zzedVar5 = zzedVar6;
                    }
                    zzbqVar = this.i;
                    jZzf2 = zzzgVar.zzf();
                    if (zzbqVar != null) {
                        zzedVar2 = zzedVar5;
                        zzzyVar3 = zzzyVar2;
                        ou5Var = null;
                        break;
                    }
                    iZza = zzbqVar.zza();
                    i7 = 0;
                    while (true) {
                        if (i7 < iZza) {
                            zzedVar2 = zzedVar5;
                            zzzyVar3 = zzzyVar2;
                            ou5Var = null;
                            break;
                        }
                        zzbpVarZzb = zzbqVar.zzb(i7);
                        if (zzbpVarZzb instanceof zzade) {
                            zzadeVar = (zzade) zzbpVarZzb;
                            iZza2 = zzbqVar.zza();
                            i8 = 0;
                            while (true) {
                                if (i8 < iZza2) {
                                    jZzv = -9223372036854775807L;
                                    break;
                                }
                                zzbpVarZzb2 = zzbqVar.zzb(i8);
                                if (zzbpVarZzb2 instanceof zzadi) {
                                    zzadiVar = (zzadi) zzbpVarZzb2;
                                    if (zzadiVar.zzf.equals("TLEN")) {
                                        jZzv = zzel.zzv(Long.parseLong(zzadiVar.zzb));
                                        break;
                                    }
                                }
                                i8++;
                            }
                            length = zzadeVar.zzd.length;
                            int i20 = length + 1;
                            jArr = new long[i20];
                            jArr2 = new long[i20];
                            jArr[0] = jZzf2;
                            j2 = 0;
                            jArr2[0] = 0;
                            i9 = 1;
                            while (i9 <= length) {
                                int i21 = i9 - 1;
                                jZzf2 += (long) (zzadeVar.zzb + zzadeVar.zzd[i21]);
                                j2 += (long) (zzadeVar.zzc + zzadeVar.zze[i21]);
                                jArr[i9] = jZzf2;
                                jArr2[i9] = j2;
                                i9++;
                                zzedVar5 = zzedVar5;
                                length = length;
                                zzzyVar2 = zzzyVar2;
                            }
                            zzedVar2 = zzedVar5;
                            zzzyVar3 = zzzyVar2;
                            ou5Var = new ou5(jArr, jArr2, jZzv);
                            break;
                        }
                        i7++;
                    }
                    if (this.o) {
                        pu5VarA = new zzaeo();
                    } else {
                        if (ou5Var != null) {
                            pu5VarA = ou5Var;
                        } else if (pu5VarA == null) {
                            pu5VarA = null;
                        }
                        if (pu5VarA != null) {
                            pu5VarA.zzh();
                        } else {
                            pu5VarA = a(zzzgVar);
                        }
                    }
                    this.n = pu5VarA;
                    this.e.zzL(pu5VarA);
                    zzaam zzaamVar = this.g;
                    zzad zzadVar = new zzad();
                    zzzyVar = zzzyVar3;
                    zzadVar.zzS(zzzyVar.zzb);
                    zzadVar.zzL(4096);
                    zzadVar.zzw(zzzyVar.zze);
                    zzadVar.zzT(zzzyVar.zzd);
                    zzadVar.zzC(zzzuVar.zza);
                    zzadVar.zzD(zzzuVar.zzb);
                    zzadVar.zzM(this.i);
                    zzaamVar.zzk(zzadVar.zzY());
                    this.l = zzzgVar.zzf();
                } else {
                    this = this;
                    zzzgVar2 = zzzgVar;
                    zzzyVar = zzzyVar5;
                    zzedVar2 = zzedVar;
                    j = this.l;
                    if (j != 0) {
                        jZzf = zzzgVar.zzf();
                        if (jZzf < j) {
                            int i22 = (int) (j - jZzf);
                            i3 = 0;
                            ((zzyv) zzzgVar2).zzo(i22, false);
                        }
                    }
                    i4 = this.m;
                    if (i4 == 0) {
                        zzzgVar.zzj();
                        if (b(zzzgVar)) {
                            i = -1;
                            i2 = -1;
                        } else {
                            zzed zzedVar8 = zzedVar2;
                            zzedVar8.zzF(i3);
                            iZze2 = zzedVar8.zze();
                            if (((-128000) & iZze2) == (((long) this.h) & (-128000))) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z || zzzz.zzb(iZze2) == -1) {
                                ((zzyv) zzzgVar2).zzo(1, false);
                                this.h = 0;
                            } else {
                                zzzyVar.zza(iZze2);
                                if (this.j == -9223372036854775807L) {
                                    this.j = this.n.zzc(zzzgVar.zzf());
                                }
                                i4 = zzzyVar.zzc;
                                this.m = i4;
                                pu5 pu5Var2 = this.n;
                                if (pu5Var2 instanceof nu5) {
                                    long j8 = ((this.k + ((long) zzzyVar.zzg)) * 1000000) / ((long) zzzyVar.zzd);
                                    throw null;
                                }
                                iZze = this.g.zze(zzzgVar2, i4, true);
                                if (iZze == -1) {
                                    i = -1;
                                    i2 = -1;
                                } else {
                                    i5 = this.m - iZze;
                                    this.m = i5;
                                    if (i5 <= 0) {
                                        this.g.zzs(this.j + ((this.k * 1000000) / ((long) zzzyVar.zzd)), 1, zzzyVar.zzc, 0, null);
                                        this.k += (long) zzzyVar.zzg;
                                        this.m = 0;
                                    }
                                }
                            }
                            i = -1;
                            i2 = 0;
                        }
                    } else {
                        iZze = this.g.zze(zzzgVar2, i4, true);
                        if (iZze == -1) {
                            i = -1;
                            i2 = -1;
                        } else {
                            i5 = this.m - iZze;
                            this.m = i5;
                            if (i5 <= 0) {
                                this.g.zzs(this.j + ((this.k * 1000000) / ((long) zzzyVar.zzd)), 1, zzzyVar.zzc, 0, null);
                                this.k += (long) zzzyVar.zzg;
                                this.m = 0;
                            }
                            i = -1;
                            i2 = 0;
                        }
                    }
                }
                i3 = 0;
                i4 = this.m;
                if (i4 == 0) {
                    zzzgVar.zzj();
                    if (b(zzzgVar)) {
                        i = -1;
                        i2 = -1;
                    } else {
                        zzed zzedVar9 = zzedVar2;
                        zzedVar9.zzF(i3);
                        iZze2 = zzedVar9.zze();
                        if (((-128000) & iZze2) == (((long) this.h) & (-128000))) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                        }
                        ((zzyv) zzzgVar2).zzo(1, false);
                        this.h = 0;
                        i = -1;
                        i2 = 0;
                    }
                } else {
                    iZze = this.g.zze(zzzgVar2, i4, true);
                    if (iZze == -1) {
                        i = -1;
                        i2 = -1;
                    } else {
                        i5 = this.m - iZze;
                        this.m = i5;
                        if (i5 <= 0) {
                            this.g.zzs(this.j + ((this.k * 1000000) / ((long) zzzyVar.zzd)), 1, zzzyVar.zzc, 0, null);
                            this.k += (long) zzzyVar.zzg;
                            this.m = 0;
                        }
                        i = -1;
                        i2 = 0;
                    }
                }
            } catch (EOFException unused) {
                this = this;
                zzzyVar = zzzyVar5;
            }
        } else {
            pu5Var = this.n;
            zzedVar = this.a;
            if (pu5Var == null) {
                zzedVar3 = new zzed(zzzyVar5.zzc);
                ((zzyv) zzzgVar).zzm(zzedVar3.zzH(), 0, zzzyVar5.zzc, false);
                if ((zzzyVar5.zza & 1) != 0) {
                    if (zzzyVar5.zze != 1) {
                        i6 = 36;
                    } else {
                        i6 = 21;
                    }
                } else if (zzzyVar5.zze != 1) {
                    i6 = 21;
                } else {
                    i6 = 13;
                }
                if (zzedVar3.zzd() >= i6 + 4) {
                    zzedVar3.zzF(i6);
                    iZze3 = zzedVar3.zze();
                    if (iZze3 != 1483304551) {
                        if (iZze3 == 1231971951) {
                            iZze3 = 1231971951;
                        } else if (zzedVar3.zzd() >= 40) {
                            zzedVar3.zzF(36);
                            if (zzedVar3.zze() == 1447187017) {
                                iZze3 = 1447187017;
                            } else {
                                iZze3 = 0;
                            }
                        } else {
                            iZze3 = 0;
                        }
                    }
                } else if (zzedVar3.zzd() >= 40) {
                    zzedVar3.zzF(36);
                    if (zzedVar3.zze() == 1447187017) {
                        iZze3 = 1447187017;
                    } else {
                        iZze3 = 0;
                    }
                } else {
                    iZze3 = 0;
                }
                zzzu zzzuVar2 = this.c;
                if (iZze3 != 1483304551) {
                    zzzgVar2 = zzzgVar;
                    zzzyVar2 = zzzyVar5;
                    long jZzd3 = zzzgVar.zzd();
                    long jZzf5 = zzzgVar.zzf();
                    int i110 = zzzyVar2.zzg;
                    int i111 = zzzyVar2.zzd;
                    iZze4 = zzedVar3.zze();
                    if ((iZze4 & 1) == 1) {
                        zzedVar4 = zzedVar;
                        pu5VarA = null;
                    } else {
                        zzedVar4 = zzedVar;
                        pu5VarA = null;
                    }
                    if (pu5VarA != null) {
                        zzedVar5 = zzedVar4;
                    } else {
                        zzedVar5 = zzedVar4;
                    }
                    ((zzyv) zzzgVar2).zzo(zzzyVar2.zzc, false);
                    if (pu5VarA != null) {
                        pu5VarA = a(zzzgVar);
                    }
                } else {
                    zzzgVar2 = zzzgVar;
                    zzzyVar2 = zzzyVar5;
                    long jZzd4 = zzzgVar.zzd();
                    long jZzf6 = zzzgVar.zzf();
                    int i112 = zzzyVar2.zzg;
                    int i113 = zzzyVar2.zzd;
                    iZze4 = zzedVar3.zze();
                    if ((iZze4 & 1) == 1) {
                        zzedVar4 = zzedVar;
                        pu5VarA = null;
                    } else {
                        zzedVar4 = zzedVar;
                        pu5VarA = null;
                    }
                    if (pu5VarA != null) {
                        zzedVar5 = zzedVar4;
                    } else {
                        zzedVar5 = zzedVar4;
                    }
                    ((zzyv) zzzgVar2).zzo(zzzyVar2.zzc, false);
                    if (pu5VarA != null) {
                        pu5VarA = a(zzzgVar);
                    }
                }
                zzbqVar = this.i;
                jZzf2 = zzzgVar.zzf();
                if (zzbqVar != null) {
                    zzedVar2 = zzedVar5;
                    zzzyVar3 = zzzyVar2;
                    ou5Var = null;
                    break;
                }
                iZza = zzbqVar.zza();
                i7 = 0;
                while (true) {
                    if (i7 < iZza) {
                        zzedVar2 = zzedVar5;
                        zzzyVar3 = zzzyVar2;
                        ou5Var = null;
                        break;
                    }
                    zzbpVarZzb = zzbqVar.zzb(i7);
                    if (zzbpVarZzb instanceof zzade) {
                        zzadeVar = (zzade) zzbpVarZzb;
                        iZza2 = zzbqVar.zza();
                        i8 = 0;
                        while (true) {
                            if (i8 < iZza2) {
                                jZzv = -9223372036854775807L;
                                break;
                            }
                            zzbpVarZzb2 = zzbqVar.zzb(i8);
                            if (zzbpVarZzb2 instanceof zzadi) {
                                zzadiVar = (zzadi) zzbpVarZzb2;
                                if (zzadiVar.zzf.equals("TLEN")) {
                                    jZzv = zzel.zzv(Long.parseLong(zzadiVar.zzb));
                                    break;
                                }
                            }
                            i8++;
                        }
                        length = zzadeVar.zzd.length;
                        int i23 = length + 1;
                        jArr = new long[i23];
                        jArr2 = new long[i23];
                        jArr[0] = jZzf2;
                        j2 = 0;
                        jArr2[0] = 0;
                        i9 = 1;
                        while (i9 <= length) {
                            int i24 = i9 - 1;
                            jZzf2 += (long) (zzadeVar.zzb + zzadeVar.zzd[i24]);
                            j2 += (long) (zzadeVar.zzc + zzadeVar.zze[i24]);
                            jArr[i9] = jZzf2;
                            jArr2[i9] = j2;
                            i9++;
                            zzedVar5 = zzedVar5;
                            length = length;
                            zzzyVar2 = zzzyVar2;
                        }
                        zzedVar2 = zzedVar5;
                        zzzyVar3 = zzzyVar2;
                        ou5Var = new ou5(jArr, jArr2, jZzv);
                        break;
                    }
                    i7++;
                }
                if (this.o) {
                    pu5VarA = new zzaeo();
                } else {
                    if (ou5Var != null) {
                        pu5VarA = ou5Var;
                    } else if (pu5VarA == null) {
                        pu5VarA = null;
                    }
                    if (pu5VarA != null) {
                        pu5VarA.zzh();
                    } else {
                        pu5VarA = a(zzzgVar);
                    }
                }
                this.n = pu5VarA;
                this.e.zzL(pu5VarA);
                zzaam zzaamVar2 = this.g;
                zzad zzadVar2 = new zzad();
                zzzyVar = zzzyVar3;
                zzadVar2.zzS(zzzyVar.zzb);
                zzadVar2.zzL(4096);
                zzadVar2.zzw(zzzyVar.zze);
                zzadVar2.zzT(zzzyVar.zzd);
                zzadVar2.zzC(zzzuVar2.zza);
                zzadVar2.zzD(zzzuVar2.zzb);
                zzadVar2.zzM(this.i);
                zzaamVar2.zzk(zzadVar2.zzY());
                this.l = zzzgVar.zzf();
            } else {
                this = this;
                zzzgVar2 = zzzgVar;
                zzzyVar = zzzyVar5;
                zzedVar2 = zzedVar;
                j = this.l;
                if (j != 0) {
                    jZzf = zzzgVar.zzf();
                    if (jZzf < j) {
                        int i25 = (int) (j - jZzf);
                        i3 = 0;
                        ((zzyv) zzzgVar2).zzo(i25, false);
                    }
                }
                i4 = this.m;
                if (i4 == 0) {
                    zzzgVar.zzj();
                    if (b(zzzgVar)) {
                        i = -1;
                        i2 = -1;
                    } else {
                        zzed zzedVar10 = zzedVar2;
                        zzedVar10.zzF(i3);
                        iZze2 = zzedVar10.zze();
                        if (((-128000) & iZze2) == (((long) this.h) & (-128000))) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                        }
                        ((zzyv) zzzgVar2).zzo(1, false);
                        this.h = 0;
                        i = -1;
                        i2 = 0;
                    }
                } else {
                    iZze = this.g.zze(zzzgVar2, i4, true);
                    if (iZze == -1) {
                        i = -1;
                        i2 = -1;
                    } else {
                        i5 = this.m - iZze;
                        this.m = i5;
                        if (i5 <= 0) {
                            this.g.zzs(this.j + ((this.k * 1000000) / ((long) zzzyVar.zzd)), 1, zzzyVar.zzc, 0, null);
                            this.k += (long) zzzyVar.zzg;
                            this.m = 0;
                        }
                        i = -1;
                        i2 = 0;
                    }
                }
            }
            i3 = 0;
            i4 = this.m;
            if (i4 == 0) {
                zzzgVar.zzj();
                if (b(zzzgVar)) {
                    i = -1;
                    i2 = -1;
                } else {
                    zzed zzedVar11 = zzedVar2;
                    zzedVar11.zzF(i3);
                    iZze2 = zzedVar11.zze();
                    if (((-128000) & iZze2) == (((long) this.h) & (-128000))) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                    }
                    ((zzyv) zzzgVar2).zzo(1, false);
                    this.h = 0;
                    i = -1;
                    i2 = 0;
                }
            } else {
                iZze = this.g.zze(zzzgVar2, i4, true);
                if (iZze == -1) {
                    i = -1;
                    i2 = -1;
                } else {
                    i5 = this.m - iZze;
                    this.m = i5;
                    if (i5 <= 0) {
                        this.g.zzs(this.j + ((this.k * 1000000) / ((long) zzzyVar.zzd)), 1, zzzyVar.zzc, 0, null);
                        this.k += (long) zzzyVar.zzg;
                        this.m = 0;
                    }
                    i = -1;
                    i2 = 0;
                }
            }
        }
        if (i2 == i) {
            pu5 pu5Var3 = this.n;
            if (pu5Var3 instanceof nu5) {
                if (pu5Var3.zze() != ((this.k * 1000000) / ((long) zzzyVar.zzd)) + this.j) {
                    throw null;
                }
            }
        }
        return i2;
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final void zzb(zzzi zzziVar) {
        this.e = zzziVar;
        zzaam zzaamVarZzv = zzziVar.zzv(0, 1);
        this.f = zzaamVarZzv;
        this.g = zzaamVarZzv;
        this.e.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final void zzc(long j, long j2) {
        this.h = 0;
        this.j = -9223372036854775807L;
        this.k = 0L;
        this.m = 0;
        pu5 pu5Var = this.n;
        if (pu5Var instanceof nu5) {
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final boolean zzd(zzzg zzzgVar) {
        return c(zzzgVar, true);
    }

    public final void zze() {
        this.o = true;
    }

    public zzaen(int i) {
        this.a = new zzed(10);
        this.b = new zzzy();
        this.c = new zzzu();
        this.j = -9223372036854775807L;
        this.d = new zzzw();
        this.g = new zzze();
    }
}
