package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Log;
import android.util.Pair;
import defpackage.bx5;
import defpackage.cx5;
import defpackage.dx5;
import defpackage.ex5;
import defpackage.fx5;
import defpackage.gx5;
import defpackage.qc0;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzait implements zzzf {
    public static final zzzm zza = new zzzm() { // from class: com.google.android.gms.internal.ads.zzaip
        @Override // com.google.android.gms.internal.ads.zzzm
        public final zzzf[] zza() {
            return new zzzf[]{new zzait()};
        }

        @Override // com.google.android.gms.internal.ads.zzzm
        public final /* synthetic */ zzzf[] zzb(Uri uri, Map map) {
            return zzzl.zza(this, uri, map);
        }
    };
    public zzzi a;
    public zzaam b;
    public cx5 e;
    public int c = 0;
    public long d = -1;
    public int f = -1;
    public long g = -1;

    /* JADX WARN: Code duplicated, block: B:55:0x0183  */
    @Override // com.google.android.gms.internal.ads.zzzf
    public final int zza(zzzg zzzgVar, zzaaf zzaafVar) throws zzbu, EOFException, InterruptedIOException {
        byte[] bArr;
        int iZzn;
        zzdd.zzb(this.b);
        int i = zzel.zza;
        int i2 = this.c;
        if (i2 == 0) {
            zzdd.zzf(zzzgVar.zzf() == 0);
            int i3 = this.f;
            if (i3 != -1) {
                ((zzyv) zzzgVar).zzo(i3, false);
                this.c = 4;
            } else {
                if (!gx5.a(zzzgVar)) {
                    throw zzbu.zza("Unsupported or unrecognized wav file type.", null);
                }
                ((zzyv) zzzgVar).zzo((int) (zzzgVar.zze() - zzzgVar.zzf()), false);
                this.c = 1;
            }
            return 0;
        }
        long jZzp = -1;
        if (i2 == 1) {
            zzed zzedVar = new zzed(8);
            fx5 fx5VarA = fx5.a(zzzgVar, zzedVar);
            if (fx5VarA.a != 1685272116) {
                zzzgVar.zzj();
            } else {
                zzyv zzyvVar = (zzyv) zzzgVar;
                zzyvVar.zzl(8, false);
                zzedVar.zzF(0);
                zzyvVar.zzm(zzedVar.zzH(), 0, 8, false);
                jZzp = zzedVar.zzp();
                zzyvVar.zzo(((int) fx5VarA.b) + 8, false);
            }
            this.d = jZzp;
            this.c = 2;
            return 0;
        }
        if (i2 != 2) {
            if (i2 != 3) {
                zzdd.zzf(this.g != -1);
                long jZzf = this.g - zzzgVar.zzf();
                cx5 cx5Var = this.e;
                cx5Var.getClass();
                return cx5Var.a(zzzgVar, jZzf) ? -1 : 0;
            }
            zzzgVar.zzj();
            fx5 fx5VarB = gx5.b(1684108385, zzzgVar, new zzed(8));
            ((zzyv) zzzgVar).zzo(8, false);
            Pair pairCreate = Pair.create(Long.valueOf(zzzgVar.zzf()), Long.valueOf(fx5VarB.b));
            this.f = ((Long) pairCreate.first).intValue();
            long jLongValue = ((Long) pairCreate.second).longValue();
            long j = this.d;
            if (j != -1 && jLongValue == 4294967295L) {
                jLongValue = j;
            }
            long j2 = ((long) this.f) + jLongValue;
            this.g = j2;
            long jZzd = zzzgVar.zzd();
            if (jZzd != -1 && j2 > jZzd) {
                StringBuilder sbB = qc0.b("Data exceeds input length: ", j2, ", ");
                sbB.append(jZzd);
                Log.w("WavExtractor", sbB.toString());
                this.g = jZzd;
                j2 = jZzd;
            }
            cx5 cx5Var2 = this.e;
            cx5Var2.getClass();
            cx5Var2.zza(this.f, j2);
            this.c = 4;
            return 0;
        }
        zzed zzedVar2 = new zzed(16);
        long j3 = gx5.b(1718449184, zzzgVar, zzedVar2).b;
        zzdd.zzf(j3 >= 16);
        zzyv zzyvVar2 = (zzyv) zzzgVar;
        zzyvVar2.zzm(zzedVar2.zzH(), 0, 16, false);
        zzedVar2.zzF(0);
        int iZzi = zzedVar2.zzi();
        int iZzi2 = zzedVar2.zzi();
        int iZzh = zzedVar2.zzh();
        zzedVar2.zzh();
        int iZzi3 = zzedVar2.zzi();
        int iZzi4 = zzedVar2.zzi();
        int i4 = ((int) j3) - 16;
        if (i4 > 0) {
            byte[] bArr2 = new byte[i4];
            zzyvVar2.zzm(bArr2, 0, i4, false);
            bArr = bArr2;
        } else {
            bArr = zzel.zzf;
        }
        ((zzyv) zzzgVar).zzo((int) (zzzgVar.zze() - zzzgVar.zzf()), false);
        ex5 ex5Var = new ex5(iZzi, iZzi2, iZzh, iZzi3, iZzi4, bArr);
        if (iZzi == 17) {
            this.e = new bx5(this.a, this.b, ex5Var);
        } else if (iZzi == 6) {
            this.e = new dx5(this.a, this.b, ex5Var, "audio/g711-alaw", -1);
        } else if (iZzi == 7) {
            this.e = new dx5(this.a, this.b, ex5Var, "audio/g711-mlaw", -1);
        } else {
            if (iZzi == 1) {
                iZzn = zzel.zzn(iZzi4);
            } else {
                if (iZzi != 3) {
                    if (iZzi == 65534) {
                        iZzn = zzel.zzn(iZzi4);
                    }
                } else if (iZzi4 == 32) {
                    iZzn = 4;
                }
                iZzn = 0;
            }
            if (iZzn == 0) {
                throw zzbu.zzc("Unsupported WAV format type: " + iZzi);
            }
            this.e = new dx5(this.a, this.b, ex5Var, "audio/raw", iZzn);
        }
        this.c = 3;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final void zzb(zzzi zzziVar) {
        this.a = zzziVar;
        this.b = zzziVar.zzv(0, 1);
        zzziVar.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final void zzc(long j, long j2) {
        this.c = j == 0 ? 0 : 4;
        cx5 cx5Var = this.e;
        if (cx5Var != null) {
            cx5Var.zzb(j2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final boolean zzd(zzzg zzzgVar) {
        return gx5.a(zzzgVar);
    }
}
