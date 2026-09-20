package defpackage;

import android.util.Log;
import com.google.android.gms.internal.ads.zzaao;
import com.google.android.gms.internal.ads.zzaap;
import com.google.android.gms.internal.ads.zzaaq;
import com.google.android.gms.internal.ads.zzaar;
import com.google.android.gms.internal.ads.zzaas;
import com.google.android.gms.internal.ads.zzad;
import com.google.android.gms.internal.ads.zzaf;
import com.google.android.gms.internal.ads.zzbq;
import com.google.android.gms.internal.ads.zzbu;
import com.google.android.gms.internal.ads.zzdd;
import com.google.android.gms.internal.ads.zzed;
import com.google.android.gms.internal.ads.zzfuv;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: loaded from: classes3.dex */
public final class ew5 extends cw5 {
    public dw5 n;
    public int o;
    public boolean p;
    public zzaar q;
    public zzaap r;

    @Override // defpackage.cw5
    public final long a(zzed zzedVar) {
        if ((zzedVar.zzH()[0] & 1) == 1) {
            return -1L;
        }
        byte b = zzedVar.zzH()[0];
        dw5 dw5Var = this.n;
        zzdd.zzb(dw5Var);
        boolean z = ((zzaaq[]) dw5Var.A)[(b >> 1) & (255 >>> (8 - dw5Var.w))].zza;
        Object obj = dw5Var.x;
        int i = !z ? ((zzaar) obj).zze : ((zzaar) obj).zzf;
        long j = this.p ? (this.o + i) / 4 : 0;
        if (zzedVar.zzb() < zzedVar.zzd() + 4) {
            byte[] bArrCopyOf = Arrays.copyOf(zzedVar.zzH(), zzedVar.zzd() + 4);
            zzedVar.zzD(bArrCopyOf, bArrCopyOf.length);
        } else {
            zzedVar.zzE(zzedVar.zzd() + 4);
        }
        byte[] bArrZzH = zzedVar.zzH();
        bArrZzH[zzedVar.zzd() - 4] = (byte) (j & 255);
        bArrZzH[zzedVar.zzd() - 3] = (byte) ((j >>> 8) & 255);
        bArrZzH[zzedVar.zzd() - 2] = (byte) ((j >>> 16) & 255);
        bArrZzH[zzedVar.zzd() - 1] = (byte) ((j >>> 24) & 255);
        this.p = true;
        this.o = i;
        return j;
    }

    @Override // defpackage.cw5
    public final void b(boolean z) {
        super.b(z);
        if (z) {
            this.n = null;
            this.q = null;
            this.r = null;
        }
        this.o = 0;
        this.p = false;
    }

    /* JADX WARN: Code duplicated, block: B:171:0x03f7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:173:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:62:0x0180 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x0182  */
    /* JADX WARN: Code duplicated, block: B:64:0x0195  */
    @Override // defpackage.cw5
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public final boolean c(zzed zzedVar, long j, d7G d7g) throws zzbu {
        dw5 dw5Var;
        int i;
        int iZzb;
        int i2;
        int i3;
        if (this.n != null) {
            ((zzaf) d7g.x).getClass();
            return false;
        }
        zzaar zzaarVar = this.q;
        if (zzaarVar != null) {
            zzaap zzaapVar = this.r;
            if (zzaapVar == null) {
                this.r = zzaas.zzc(zzedVar, true, true);
            } else {
                byte[] bArr = new byte[zzedVar.zzd()];
                System.arraycopy(zzedVar.zzH(), 0, bArr, 0, zzedVar.zzd());
                int i4 = zzaarVar.zza;
                int i5 = 5;
                zzaas.zzd(5, zzedVar, false);
                int iZzk = zzedVar.zzk() + 1;
                zzaao zzaaoVar = new zzaao(zzedVar.zzH());
                zzaaoVar.zzc(zzedVar.zzc() * 8);
                int i6 = 0;
                while (i6 < iZzk) {
                    if (zzaaoVar.zzb(24) != 5653314) {
                        throw zzbu.zza("expected code book to start with [0x56, 0x43, 0x42] at " + zzaaoVar.zza(), null);
                    }
                    int iZzb2 = zzaaoVar.zzb(16);
                    int iZzb3 = zzaaoVar.zzb(24);
                    long[] jArr = new long[iZzb3];
                    long jFloor = 0;
                    if (zzaaoVar.zzd()) {
                        i3 = iZzk;
                        int iZzb4 = zzaaoVar.zzb(5) + 1;
                        int i7 = 0;
                        while (i7 < iZzb3) {
                            int iZzb5 = zzaaoVar.zzb(zzaas.zza(iZzb3 - i7));
                            int i8 = 0;
                            while (i8 < iZzb5 && i7 < iZzb3) {
                                jArr[i7] = iZzb4;
                                i7++;
                                i8++;
                                zzaapVar = zzaapVar;
                                bArr = bArr;
                            }
                            iZzb4++;
                            zzaapVar = zzaapVar;
                            bArr = bArr;
                        }
                    } else {
                        boolean zZzd = zzaaoVar.zzd();
                        int i9 = 0;
                        while (i9 < iZzb3) {
                            if (!zZzd) {
                                iZzk = iZzk;
                                jArr[i9] = zzaaoVar.zzb(5) + 1;
                            } else if (zzaaoVar.zzd()) {
                                jArr[i9] = zzaaoVar.zzb(i5) + 1;
                            } else {
                                jArr[i9] = 0;
                            }
                            i9++;
                            iZzk = iZzk;
                            i5 = 5;
                        }
                        i3 = iZzk;
                    }
                    zzaap zzaapVar2 = zzaapVar;
                    byte[] bArr2 = bArr;
                    int iZzb6 = zzaaoVar.zzb(4);
                    if (iZzb6 > 2) {
                        throw zzbu.zza("lookup type greater than 2 not decodable: " + iZzb6, null);
                    }
                    if (iZzb6 == 1) {
                        zzaaoVar.zzc(32);
                        zzaaoVar.zzc(32);
                        int iZzb7 = zzaaoVar.zzb(4) + 1;
                        zzaaoVar.zzc(1);
                        if (iZzb6 == 1) {
                            jFloor = ((long) iZzb3) * ((long) iZzb2);
                        } else if (iZzb2 != 0) {
                            jFloor = (long) Math.floor(Math.pow(iZzb3, 1.0d / ((double) iZzb2)));
                        }
                        zzaaoVar.zzc((int) (((long) iZzb7) * jFloor));
                    } else if (iZzb6 == 2) {
                        iZzb6 = 2;
                        zzaaoVar.zzc(32);
                        zzaaoVar.zzc(32);
                        int iZzb8 = zzaaoVar.zzb(4) + 1;
                        zzaaoVar.zzc(1);
                        if (iZzb6 == 1) {
                            jFloor = ((long) iZzb3) * ((long) iZzb2);
                        } else if (iZzb2 != 0) {
                            jFloor = (long) Math.floor(Math.pow(iZzb3, 1.0d / ((double) iZzb2)));
                        }
                        zzaaoVar.zzc((int) (((long) iZzb8) * jFloor));
                    }
                    i6++;
                    zzaapVar = zzaapVar2;
                    iZzk = i3;
                    bArr = bArr2;
                    i5 = 5;
                }
                zzaap zzaapVar3 = zzaapVar;
                byte[] bArr3 = bArr;
                int i10 = 6;
                int iZzb9 = zzaaoVar.zzb(6) + 1;
                for (int i11 = 0; i11 < iZzb9; i11++) {
                    if (zzaaoVar.zzb(16) != 0) {
                        throw zzbu.zza("placeholder of time domain transforms not zeroed out", null);
                    }
                }
                int i12 = 1;
                int iZzb10 = zzaaoVar.zzb(6) + 1;
                int i13 = 0;
                while (true) {
                    int i14 = 3;
                    if (i13 >= iZzb10) {
                        int i15 = 1;
                        int iZzb11 = zzaaoVar.zzb(i10) + 1;
                        int i16 = 0;
                        while (i16 < iZzb11) {
                            if (zzaaoVar.zzb(16) > 2) {
                                throw zzbu.zza("residueType greater than 2 is not decodable", null);
                            }
                            zzaaoVar.zzc(24);
                            zzaaoVar.zzc(24);
                            zzaaoVar.zzc(24);
                            int iZzb12 = zzaaoVar.zzb(i10) + i15;
                            int i17 = 8;
                            zzaaoVar.zzc(8);
                            int[] iArr = new int[iZzb12];
                            for (int i18 = 0; i18 < iZzb12; i18++) {
                                iArr[i18] = ((zzaaoVar.zzd() ? zzaaoVar.zzb(5) : 0) * 8) + zzaaoVar.zzb(3);
                            }
                            int i19 = 0;
                            while (i19 < iZzb12) {
                                int i20 = 0;
                                while (i20 < i17) {
                                    if ((iArr[i19] & (1 << i20)) != 0) {
                                        zzaaoVar.zzc(i17);
                                    }
                                    i20++;
                                    i17 = 8;
                                }
                                i19++;
                                i17 = 8;
                            }
                            i16++;
                            i10 = 6;
                            i15 = 1;
                        }
                        int iZzb13 = zzaaoVar.zzb(i10) + 1;
                        for (int i21 = 0; i21 < iZzb13; i21++) {
                            int iZzb14 = zzaaoVar.zzb(16);
                            if (iZzb14 != 0) {
                                Log.e("VorbisUtil", "mapping type other than 0 not supported: " + iZzb14);
                            } else {
                                if (zzaaoVar.zzd()) {
                                    i = 1;
                                    iZzb = zzaaoVar.zzb(4) + 1;
                                } else {
                                    i = 1;
                                    iZzb = 1;
                                }
                                if (zzaaoVar.zzd()) {
                                    int iZzb15 = zzaaoVar.zzb(8) + i;
                                    for (int i22 = 0; i22 < iZzb15; i22++) {
                                        int i23 = i4 - 1;
                                        zzaaoVar.zzc(zzaas.zza(i23));
                                        zzaaoVar.zzc(zzaas.zza(i23));
                                    }
                                }
                                if (zzaaoVar.zzb(2) != 0) {
                                    throw zzbu.zza("to reserved bits must be zero after mapping coupling steps", null);
                                }
                                if (iZzb > 1) {
                                    for (int i24 = 0; i24 < i4; i24++) {
                                        zzaaoVar.zzc(4);
                                    }
                                }
                                for (int i25 = 0; i25 < iZzb; i25++) {
                                    zzaaoVar.zzc(8);
                                    zzaaoVar.zzc(8);
                                    zzaaoVar.zzc(8);
                                }
                            }
                        }
                        int iZzb16 = zzaaoVar.zzb(6) + 1;
                        zzaaq[] zzaaqVarArr = new zzaaq[iZzb16];
                        for (int i26 = 0; i26 < iZzb16; i26++) {
                            zzaaqVarArr[i26] = new zzaaq(zzaaoVar.zzd(), zzaaoVar.zzb(16), zzaaoVar.zzb(16), zzaaoVar.zzb(8));
                        }
                        if (!zzaaoVar.zzd()) {
                            throw zzbu.zza("framing bit after modes not set as expected", null);
                        }
                        dw5Var = new dw5(zzaarVar, zzaapVar3, bArr3, zzaaqVarArr, zzaas.zza(iZzb16 - 1));
                        break;
                    }
                    int iZzb17 = zzaaoVar.zzb(16);
                    if (iZzb17 == 0) {
                        int i27 = 8;
                        zzaaoVar.zzc(8);
                        zzaaoVar.zzc(16);
                        zzaaoVar.zzc(16);
                        zzaaoVar.zzc(6);
                        zzaaoVar.zzc(8);
                        int iZzb18 = zzaaoVar.zzb(4) + 1;
                        int i28 = 0;
                        while (i28 < iZzb18) {
                            zzaaoVar.zzc(i27);
                            i28++;
                            i27 = 8;
                        }
                    } else {
                        if (iZzb17 != i12) {
                            throw zzbu.zza("floor type greater than 1 not decodable: " + iZzb17, null);
                        }
                        int iZzb19 = zzaaoVar.zzb(5);
                        int[] iArr2 = new int[iZzb19];
                        int i29 = -1;
                        for (int i30 = 0; i30 < iZzb19; i30++) {
                            int iZzb20 = zzaaoVar.zzb(4);
                            iArr2[i30] = iZzb20;
                            if (iZzb20 > i29) {
                                i29 = iZzb20;
                            }
                        }
                        int i31 = i29 + 1;
                        int[] iArr3 = new int[i31];
                        int i32 = 0;
                        while (i32 < i31) {
                            iArr3[i32] = zzaaoVar.zzb(i14) + 1;
                            int iZzb21 = zzaaoVar.zzb(2);
                            if (iZzb21 > 0) {
                                i2 = 8;
                                zzaaoVar.zzc(8);
                            } else {
                                i2 = 8;
                            }
                            int i33 = 0;
                            for (int i34 = 1; i33 < (i34 << iZzb21); i34 = 1) {
                                zzaaoVar.zzc(i2);
                                i33++;
                                i2 = 8;
                            }
                            i32++;
                            i14 = 3;
                        }
                        zzaaoVar.zzc(2);
                        int iZzb22 = zzaaoVar.zzb(4);
                        int i35 = 0;
                        int i36 = 0;
                        for (int i37 = 0; i37 < iZzb19; i37++) {
                            i35 += iArr3[iArr2[i37]];
                            while (i36 < i35) {
                                zzaaoVar.zzc(iZzb22);
                                i36++;
                            }
                        }
                    }
                    i13++;
                    i10 = 6;
                    i12 = 1;
                }
            }
            this.n = dw5Var;
            if (dw5Var == null) {
                return true;
            }
            zzaar zzaarVar2 = (zzaar) dw5Var.x;
            ArrayList arrayList = new ArrayList();
            arrayList.add(zzaarVar2.zzg);
            arrayList.add((byte[]) dw5Var.z);
            zzbq zzbqVarZzb = zzaas.zzb(zzfuv.zzn(((zzaap) dw5Var.y).zzb));
            zzad zzadVar = new zzad();
            zzadVar.zzS("audio/vorbis");
            zzadVar.zzv(zzaarVar2.zzd);
            zzadVar.zzO(zzaarVar2.zzc);
            zzadVar.zzw(zzaarVar2.zza);
            zzadVar.zzT(zzaarVar2.zzb);
            zzadVar.zzI(arrayList);
            zzadVar.zzM(zzbqVarZzb);
            d7g.x = zzadVar.zzY();
            return true;
        }
        zzaas.zzd(1, zzedVar, false);
        int iZzh = zzedVar.zzh();
        int iZzk2 = zzedVar.zzk();
        int iZzh2 = zzedVar.zzh();
        int iZzg = zzedVar.zzg();
        int i38 = iZzg <= 0 ? -1 : iZzg;
        int iZzg2 = zzedVar.zzg();
        int i39 = iZzg2 <= 0 ? -1 : iZzg2;
        int iZzg3 = zzedVar.zzg();
        int i40 = iZzg3 <= 0 ? -1 : iZzg3;
        int iZzk3 = zzedVar.zzk();
        this.q = new zzaar(iZzh, iZzk2, iZzh2, i38, i39, i40, (int) Math.pow(2.0d, iZzk3 & 15), (int) Math.pow(2.0d, (iZzk3 & 240) >> 4), 1 == (zzedVar.zzk() & 1), Arrays.copyOf(zzedVar.zzH(), zzedVar.zzd()));
        dw5Var = null;
        this.n = dw5Var;
        if (dw5Var == null) {
            return true;
        }
        zzaar zzaarVar3 = (zzaar) dw5Var.x;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(zzaarVar3.zzg);
        arrayList2.add((byte[]) dw5Var.z);
        zzbq zzbqVarZzb2 = zzaas.zzb(zzfuv.zzn(((zzaap) dw5Var.y).zzb));
        zzad zzadVar2 = new zzad();
        zzadVar2.zzS("audio/vorbis");
        zzadVar2.zzv(zzaarVar3.zzd);
        zzadVar2.zzO(zzaarVar3.zzc);
        zzadVar2.zzw(zzaarVar3.zza);
        zzadVar2.zzT(zzaarVar3.zzb);
        zzadVar2.zzI(arrayList2);
        zzadVar2.zzM(zzbqVarZzb2);
        d7g.x = zzadVar2.zzY();
        return true;
    }

    @Override // defpackage.cw5
    public final void d(long j) {
        this.g = j;
        this.p = j != 0;
        zzaar zzaarVar = this.q;
        this.o = zzaarVar != null ? zzaarVar.zze : 0;
    }
}
