package defpackage;

import com.google.android.gms.internal.ads.zzgmo;
import com.google.android.gms.internal.ads.zzgnf;
import com.google.android.gms.internal.ads.zzgnr;
import com.google.android.gms.internal.ads.zzgnu;
import com.google.android.gms.internal.ads.zzgpx;

/* JADX INFO: loaded from: classes3.dex */
public final class mt6 extends zzgnu {
    public final byte[] d;
    public final int e;
    public int f;

    public mt6(byte[] bArr, int i) {
        super(0);
        if (bArr == null) {
            throw new NullPointerException("buffer");
        }
        int length = bArr.length;
        if (((length - i) | i) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i)));
        }
        this.d = bArr;
        this.f = 0;
        this.e = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgnu
    public final void b(int i, zzgpx zzgpxVar, wu6 wu6Var) throws zzgnr {
        zzs((i << 3) | 2);
        zzgmo zzgmoVar = (zzgmo) zzgpxVar;
        int iA = zzgmoVar.a();
        if (iA == -1) {
            iA = wu6Var.zza(zzgmoVar);
            zzgmoVar.c(iA);
        }
        zzs(iA);
        wu6Var.d(zzgpxVar, this.a);
    }

    @Override // com.google.android.gms.internal.ads.zzgnu
    public final void zzN() {
    }

    @Override // com.google.android.gms.internal.ads.zzgnu
    public final void zzO(byte b) throws zzgnr {
        try {
            byte[] bArr = this.d;
            int i = this.f;
            this.f = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new zzgnr(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgnu
    public final void zzP(int i, boolean z) throws zzgnr {
        zzs(i << 3);
        zzO(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.ads.zzgnu
    public final void zzQ(int i, zzgnf zzgnfVar) throws zzgnr {
        zzs((i << 3) | 2);
        zzs(zzgnfVar.zzd());
        zzgnfVar.p(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgnu, com.google.android.gms.internal.ads.zzgmu
    public final void zza(byte[] bArr, int i, int i2) throws zzgnr {
        try {
            System.arraycopy(bArr, i, this.d, this.f, i2);
            this.f += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new zzgnr(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), Integer.valueOf(i2)), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgnu
    public final int zzb() {
        return this.e - this.f;
    }

    @Override // com.google.android.gms.internal.ads.zzgnu
    public final void zzh(int i, int i2) throws zzgnr {
        zzs((i << 3) | 5);
        zzi(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgnu
    public final void zzi(int i) throws zzgnr {
        try {
            byte[] bArr = this.d;
            int i2 = this.f;
            int i3 = i2 + 1;
            bArr[i2] = (byte) (i & 255);
            int i4 = i3 + 1;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i4 + 1;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f = i5 + 1;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new zzgnr(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgnu
    public final void zzj(int i, long j) throws zzgnr {
        zzs((i << 3) | 1);
        zzk(j);
    }

    @Override // com.google.android.gms.internal.ads.zzgnu
    public final void zzk(long j) throws zzgnr {
        try {
            byte[] bArr = this.d;
            int i = this.f;
            int i2 = i + 1;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i2 + 1;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i3 + 1;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i4 + 1;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
            int i6 = i5 + 1;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i6 + 1;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i7 + 1;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.f = i8 + 1;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new zzgnr(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgnu
    public final void zzl(int i, int i2) throws zzgnr {
        zzs(i << 3);
        zzm(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgnu
    public final void zzm(int i) throws zzgnr {
        if (i >= 0) {
            zzs(i);
        } else {
            zzu(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgnu
    public final void zzo(int i, String str) throws zzgnr {
        zzs((i << 3) | 2);
        int i2 = this.f;
        try {
            int iZzE = zzgnu.zzE(str.length() * 3);
            int iZzE2 = zzgnu.zzE(str.length());
            int i3 = this.e;
            byte[] bArr = this.d;
            if (iZzE2 == iZzE) {
                int i4 = i2 + iZzE2;
                this.f = i4;
                int iB = rv6.b(str, bArr, i4, i3 - i4);
                this.f = i2;
                zzs((iB - i2) - iZzE2);
                this.f = iB;
            } else {
                zzs(rv6.c(str));
                int i5 = this.f;
                this.f = rv6.b(str, bArr, i5, i3 - i5);
            }
        } catch (IndexOutOfBoundsException e) {
            throw new zzgnr(e);
        } catch (qv6 e2) {
            this.f = i2;
            a(str, e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgnu
    public final void zzq(int i, int i2) throws zzgnr {
        zzs((i << 3) | i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgnu
    public final void zzr(int i, int i2) throws zzgnr {
        zzs(i << 3);
        zzs(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgnu
    public final void zzs(int i) throws zzgnr {
        while (true) {
            int i2 = i & (-128);
            byte[] bArr = this.d;
            if (i2 == 0) {
                int i3 = this.f;
                this.f = i3 + 1;
                bArr[i3] = (byte) i;
                return;
            } else {
                try {
                    int i4 = this.f;
                    this.f = i4 + 1;
                    bArr[i4] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzgnr(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e);
                }
            }
            throw new zzgnr(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgnu
    public final void zzt(int i, long j) throws zzgnr {
        zzs(i << 3);
        zzu(j);
    }

    @Override // com.google.android.gms.internal.ads.zzgnu
    public final void zzu(long j) throws zzgnr {
        boolean z = zzgnu.c;
        int i = this.e;
        byte[] bArr = this.d;
        if (z && i - this.f >= 10) {
            while ((j & (-128)) != 0) {
                int i2 = this.f;
                this.f = i2 + 1;
                nv6.p(bArr, i2, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            int i3 = this.f;
            this.f = i3 + 1;
            nv6.p(bArr, i3, (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            try {
                int i4 = this.f;
                this.f = i4 + 1;
                bArr[i4] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new zzgnr(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(i), 1), e);
            }
        }
        int i5 = this.f;
        this.f = i5 + 1;
        bArr[i5] = (byte) j;
    }
}
