package defpackage;

import com.google.android.gms.internal.ads.zzgmo;
import com.google.android.gms.internal.ads.zzgnf;
import com.google.android.gms.internal.ads.zzgnr;
import com.google.android.gms.internal.ads.zzgnu;
import com.google.android.gms.internal.ads.zzgpx;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class nt6 extends zzgnu {
    public final byte[] d;
    public final int e;
    public int f;
    public final OutputStream g;

    public nt6(OutputStream outputStream, int i) {
        super(0);
        if (i < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int iMax = Math.max(i, 20);
        this.d = new byte[iMax];
        this.e = iMax;
        this.g = outputStream;
    }

    @Override // com.google.android.gms.internal.ads.zzgnu
    public final void b(int i, zzgpx zzgpxVar, wu6 wu6Var) throws IOException {
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

    public final void d() throws IOException {
        this.g.write(this.d, 0, this.f);
        this.f = 0;
    }

    public final void e(int i) throws IOException {
        if (this.e - this.f < i) {
            d();
        }
    }

    public final void f(int i) {
        int i2 = this.f;
        int i3 = i2 + 1;
        byte[] bArr = this.d;
        bArr[i2] = (byte) (i & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >> 8) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >> 16) & 255);
        this.f = i5 + 1;
        bArr[i5] = (byte) ((i >> 24) & 255);
    }

    public final void g(long j) {
        int i = this.f;
        int i2 = i + 1;
        byte[] bArr = this.d;
        bArr[i] = (byte) (j & 255);
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((j >> 8) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((j >> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) (255 & (j >> 24));
        int i6 = i5 + 1;
        bArr[i5] = (byte) (((int) (j >> 32)) & 255);
        int i7 = i6 + 1;
        bArr[i6] = (byte) (((int) (j >> 40)) & 255);
        int i8 = i7 + 1;
        bArr[i7] = (byte) (((int) (j >> 48)) & 255);
        this.f = i8 + 1;
        bArr[i8] = (byte) (((int) (j >> 56)) & 255);
    }

    public final void h(int i) {
        boolean z = zzgnu.c;
        byte[] bArr = this.d;
        if (z) {
            while ((i & (-128)) != 0) {
                int i2 = this.f;
                this.f = i2 + 1;
                nv6.p(bArr, i2, (byte) ((i & 127) | 128));
                i >>>= 7;
            }
            int i3 = this.f;
            this.f = i3 + 1;
            nv6.p(bArr, i3, (byte) i);
            return;
        }
        while ((i & (-128)) != 0) {
            int i4 = this.f;
            this.f = i4 + 1;
            bArr[i4] = (byte) ((i & 127) | 128);
            i >>>= 7;
        }
        int i5 = this.f;
        this.f = i5 + 1;
        bArr[i5] = (byte) i;
    }

    public final void i(long j) {
        boolean z = zzgnu.c;
        byte[] bArr = this.d;
        if (z) {
            while ((j & (-128)) != 0) {
                int i = this.f;
                this.f = i + 1;
                nv6.p(bArr, i, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            int i2 = this.f;
            this.f = i2 + 1;
            nv6.p(bArr, i2, (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            int i3 = this.f;
            this.f = i3 + 1;
            bArr[i3] = (byte) ((((int) j) & 127) | 128);
            j >>>= 7;
        }
        int i4 = this.f;
        this.f = i4 + 1;
        bArr[i4] = (byte) j;
    }

    public final void j(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f;
        int i4 = this.e;
        int i5 = i4 - i3;
        byte[] bArr2 = this.d;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.f += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.f = i4;
        d();
        if (i7 > i4) {
            this.g.write(bArr, i6, i7);
        } else {
            System.arraycopy(bArr, i6, bArr2, 0, i7);
            this.f = i7;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgnu
    public final void zzN() throws IOException {
        if (this.f > 0) {
            d();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgnu
    public final void zzO(byte b) throws IOException {
        if (this.f == this.e) {
            d();
        }
        int i = this.f;
        this.f = i + 1;
        this.d[i] = b;
    }

    @Override // com.google.android.gms.internal.ads.zzgnu
    public final void zzP(int i, boolean z) throws IOException {
        e(11);
        h(i << 3);
        int i2 = this.f;
        this.f = i2 + 1;
        this.d[i2] = z ? (byte) 1 : (byte) 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgnu
    public final void zzQ(int i, zzgnf zzgnfVar) throws IOException {
        zzs((i << 3) | 2);
        zzs(zzgnfVar.zzd());
        zzgnfVar.p(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgnu, com.google.android.gms.internal.ads.zzgmu
    public final void zza(byte[] bArr, int i, int i2) throws IOException {
        j(bArr, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgnu
    public final int zzb() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }

    @Override // com.google.android.gms.internal.ads.zzgnu
    public final void zzh(int i, int i2) throws IOException {
        e(14);
        h((i << 3) | 5);
        f(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgnu
    public final void zzi(int i) throws IOException {
        e(4);
        f(i);
    }

    @Override // com.google.android.gms.internal.ads.zzgnu
    public final void zzj(int i, long j) throws IOException {
        e(18);
        h((i << 3) | 1);
        g(j);
    }

    @Override // com.google.android.gms.internal.ads.zzgnu
    public final void zzk(long j) throws IOException {
        e(8);
        g(j);
    }

    @Override // com.google.android.gms.internal.ads.zzgnu
    public final void zzl(int i, int i2) throws IOException {
        e(20);
        h(i << 3);
        if (i2 >= 0) {
            h(i2);
        } else {
            i(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgnu
    public final void zzm(int i) throws IOException {
        if (i >= 0) {
            zzs(i);
        } else {
            zzu(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgnu
    public final void zzo(int i, String str) throws IOException {
        zzs((i << 3) | 2);
        try {
            int length = str.length() * 3;
            int iZzE = zzgnu.zzE(length);
            int i2 = iZzE + length;
            int i3 = this.e;
            if (i2 > i3) {
                byte[] bArr = new byte[length];
                int iB = rv6.b(str, bArr, 0, length);
                zzs(iB);
                j(bArr, 0, iB);
                return;
            }
            if (i2 > i3 - this.f) {
                d();
            }
            int iZzE2 = zzgnu.zzE(str.length());
            int i4 = this.f;
            byte[] bArr2 = this.d;
            try {
                if (iZzE2 == iZzE) {
                    int i5 = i4 + iZzE2;
                    this.f = i5;
                    int iB2 = rv6.b(str, bArr2, i5, i3 - i5);
                    this.f = i4;
                    h((iB2 - i4) - iZzE2);
                    this.f = iB2;
                } else {
                    int iC = rv6.c(str);
                    h(iC);
                    this.f = rv6.b(str, bArr2, this.f, iC);
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new zzgnr(e);
            } catch (qv6 e2) {
                this.f = i4;
                throw e2;
            }
        } catch (qv6 e3) {
            a(str, e3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgnu
    public final void zzq(int i, int i2) throws IOException {
        zzs((i << 3) | i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgnu
    public final void zzr(int i, int i2) throws IOException {
        e(20);
        h(i << 3);
        h(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgnu
    public final void zzs(int i) throws IOException {
        e(5);
        h(i);
    }

    @Override // com.google.android.gms.internal.ads.zzgnu
    public final void zzt(int i, long j) throws IOException {
        e(20);
        h(i << 3);
        i(j);
    }

    @Override // com.google.android.gms.internal.ads.zzgnu
    public final void zzu(long j) throws IOException {
        e(10);
        i(j);
    }
}
