package com.google.android.gms.internal.ads;

import defpackage.mt6;
import defpackage.nt6;
import defpackage.nv6;
import defpackage.ot6;
import defpackage.qv6;
import defpackage.rv6;
import defpackage.wu6;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzgnu extends zzgmu {
    public static final Logger b = Logger.getLogger(zzgnu.class.getName());
    public static final boolean c = nv6.e;
    public ot6 a;

    public zzgnu() {
    }

    public /* synthetic */ zzgnu(int i) {
    }

    @Deprecated
    public static int c(int i, zzgpx zzgpxVar, wu6 wu6Var) {
        int iZzE = zzE(i << 3);
        int i2 = iZzE + iZzE;
        zzgmo zzgmoVar = (zzgmo) zzgpxVar;
        int iA = zzgmoVar.a();
        if (iA == -1) {
            iA = wu6Var.zza(zzgmoVar);
            zzgmoVar.c(iA);
        }
        return i2 + iA;
    }

    public static int zzC(String str) {
        int length;
        try {
            length = rv6.c(str);
        } catch (qv6 unused) {
            length = str.getBytes(zzgox.a).length;
        }
        return zzE(length) + length;
    }

    public static int zzD(int i) {
        return zzE(i << 3);
    }

    public static int zzE(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int zzF(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    public static zzgnu zzG(byte[] bArr) {
        return new mt6(bArr, bArr.length);
    }

    public static zzgnu zzH(OutputStream outputStream, int i) {
        return new nt6(outputStream, i);
    }

    public static int zzw(zzgnf zzgnfVar) {
        int iZzd = zzgnfVar.zzd();
        return zzE(iZzd) + iZzd;
    }

    public static int zzy(int i) {
        if (i >= 0) {
            return zzE(i);
        }
        return 10;
    }

    public static int zzz(zzgpd zzgpdVar) {
        int iZza = zzgpdVar.zza();
        return zzE(iZza) + iZza;
    }

    public final void a(String str, qv6 qv6Var) throws zzgnr {
        b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) qv6Var);
        byte[] bytes = str.getBytes(zzgox.a);
        try {
            int length = bytes.length;
            zzs(length);
            zza(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new zzgnr(e);
        }
    }

    public abstract void b(int i, zzgpx zzgpxVar, wu6 wu6Var);

    public final void zzI() {
        if (zzb() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract void zzN();

    public abstract void zzO(byte b2);

    public abstract void zzP(int i, boolean z);

    public abstract void zzQ(int i, zzgnf zzgnfVar);

    @Override // com.google.android.gms.internal.ads.zzgmu
    public abstract void zza(byte[] bArr, int i, int i2);

    public abstract int zzb();

    public abstract void zzh(int i, int i2);

    public abstract void zzi(int i);

    public abstract void zzj(int i, long j);

    public abstract void zzk(long j);

    public abstract void zzl(int i, int i2);

    public abstract void zzm(int i);

    public abstract void zzo(int i, String str);

    public abstract void zzq(int i, int i2);

    public abstract void zzr(int i, int i2);

    public abstract void zzs(int i);

    public abstract void zzt(int i, long j);

    public abstract void zzu(long j);
}
