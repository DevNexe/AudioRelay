package defpackage;

import com.google.android.gms.internal.ads.zzaal;
import com.google.android.gms.internal.ads.zzed;
import com.google.android.gms.internal.ads.zzel;
import com.google.android.gms.internal.ads.zzgd;
import com.google.android.gms.internal.ads.zzgg;
import com.google.android.gms.internal.ads.zzvy;
import com.google.android.gms.internal.ads.zzwf;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class kb7 {
    public final zzed a = new zzed(32);
    public jb7 b;
    public jb7 c;
    public jb7 d;
    public long e;
    public final zzwf f;

    public kb7(zzwf zzwfVar) {
        this.f = zzwfVar;
        jb7 jb7Var = new jb7(0L);
        this.b = jb7Var;
        this.c = jb7Var;
        this.d = jb7Var;
    }

    public static jb7 c(jb7 jb7Var, long j, ByteBuffer byteBuffer, int i) {
        while (j >= jb7Var.b) {
            jb7Var = jb7Var.d;
        }
        while (i > 0) {
            int iMin = Math.min(i, (int) (jb7Var.b - j));
            zzvy zzvyVar = jb7Var.c;
            byte[] bArr = zzvyVar.zza;
            long j2 = jb7Var.a;
            int i2 = zzvyVar.zzb;
            byteBuffer.put(bArr, (int) (j - j2), iMin);
            i -= iMin;
            j += (long) iMin;
            if (j == jb7Var.b) {
                jb7Var = jb7Var.d;
            }
        }
        return jb7Var;
    }

    public static jb7 d(jb7 jb7Var, long j, byte[] bArr, int i) {
        while (j >= jb7Var.b) {
            jb7Var = jb7Var.d;
        }
        int i2 = i;
        while (i2 > 0) {
            int iMin = Math.min(i2, (int) (jb7Var.b - j));
            zzvy zzvyVar = jb7Var.c;
            byte[] bArr2 = zzvyVar.zza;
            long j2 = jb7Var.a;
            int i3 = zzvyVar.zzb;
            System.arraycopy(bArr2, (int) (j - j2), bArr, i - i2, iMin);
            i2 -= iMin;
            j += (long) iMin;
            if (j == jb7Var.b) {
                jb7Var = jb7Var.d;
            }
        }
        return jb7Var;
    }

    public static jb7 e(jb7 jb7Var, zzgg zzggVar, lb7 lb7Var, zzed zzedVar) {
        jb7 jb7VarD;
        int iZzo;
        if (zzggVar.zzk()) {
            long j = lb7Var.b;
            zzedVar.zzC(1);
            jb7 jb7VarD2 = d(jb7Var, j, zzedVar.zzH(), 1);
            long j2 = j + 1;
            byte b = zzedVar.zzH()[0];
            int i = b & 128;
            int i2 = b & 127;
            zzgd zzgdVar = zzggVar.zza;
            byte[] bArr = zzgdVar.zza;
            if (bArr == null) {
                zzgdVar.zza = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            jb7VarD = d(jb7VarD2, j2, zzgdVar.zza, i2);
            long j3 = j2 + ((long) i2);
            if (i != 0) {
                zzedVar.zzC(2);
                jb7VarD = d(jb7VarD, j3, zzedVar.zzH(), 2);
                j3 += 2;
                iZzo = zzedVar.zzo();
            } else {
                iZzo = 1;
            }
            int[] iArr = zzgdVar.zzd;
            if (iArr == null || iArr.length < iZzo) {
                iArr = new int[iZzo];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = zzgdVar.zze;
            if (iArr3 == null || iArr3.length < iZzo) {
                iArr3 = new int[iZzo];
            }
            int[] iArr4 = iArr3;
            if (i != 0) {
                int i3 = iZzo * 6;
                zzedVar.zzC(i3);
                jb7VarD = d(jb7VarD, j3, zzedVar.zzH(), i3);
                j3 += (long) i3;
                zzedVar.zzF(0);
                for (int i4 = 0; i4 < iZzo; i4++) {
                    iArr2[i4] = zzedVar.zzo();
                    iArr4[i4] = zzedVar.zzn();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = lb7Var.a - ((int) (j3 - lb7Var.b));
            }
            zzaal zzaalVar = lb7Var.c;
            int i5 = zzel.zza;
            zzgdVar.zzc(iZzo, iArr2, iArr4, zzaalVar.zzb, zzgdVar.zza, zzaalVar.zza, zzaalVar.zzc, zzaalVar.zzd);
            long j4 = lb7Var.b;
            int i6 = (int) (j3 - j4);
            lb7Var.b = j4 + ((long) i6);
            lb7Var.a -= i6;
        } else {
            jb7VarD = jb7Var;
        }
        if (!zzggVar.zze()) {
            zzggVar.zzi(lb7Var.a);
            return c(jb7VarD, lb7Var.b, zzggVar.zzb, lb7Var.a);
        }
        zzedVar.zzC(4);
        jb7 jb7VarD3 = d(jb7VarD, lb7Var.b, zzedVar.zzH(), 4);
        int iZzn = zzedVar.zzn();
        lb7Var.b += 4;
        lb7Var.a -= 4;
        zzggVar.zzi(iZzn);
        jb7 jb7VarC = c(jb7VarD3, lb7Var.b, zzggVar.zzb, iZzn);
        lb7Var.b += (long) iZzn;
        int i7 = lb7Var.a - iZzn;
        lb7Var.a = i7;
        ByteBuffer byteBuffer = zzggVar.zze;
        if (byteBuffer == null || byteBuffer.capacity() < i7) {
            zzggVar.zze = ByteBuffer.allocate(i7);
        } else {
            zzggVar.zze.clear();
        }
        return c(jb7VarC, lb7Var.b, zzggVar.zze, lb7Var.a);
    }

    public final void a(long j) {
        jb7 jb7Var;
        if (j != -1) {
            while (true) {
                jb7Var = this.b;
                if (j < jb7Var.b) {
                    break;
                }
                this.f.zzc(jb7Var.c);
                jb7 jb7Var2 = this.b;
                jb7Var2.c = null;
                jb7 jb7Var3 = jb7Var2.d;
                jb7Var2.d = null;
                this.b = jb7Var3;
            }
            if (this.c.a < jb7Var.a) {
                this.c = jb7Var;
            }
        }
    }

    public final int b(int i) {
        jb7 jb7Var = this.d;
        if (jb7Var.c == null) {
            zzvy zzvyVarZzb = this.f.zzb();
            jb7 jb7Var2 = new jb7(this.d.b);
            jb7Var.c = zzvyVarZzb;
            jb7Var.d = jb7Var2;
        }
        return Math.min(i, (int) (this.d.b - this.e));
    }
}
