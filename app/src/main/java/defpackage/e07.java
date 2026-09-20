package defpackage;

import com.google.android.gms.internal.measurement.zzjj;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes3.dex */
public final class e07 extends j07 {
    public final int A;
    public int B;
    public final byte[] z;

    public e07(byte[] bArr, int i) {
        super(0);
        int length = bArr.length;
        if (((length - i) | i) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i)));
        }
        this.z = bArr;
        this.B = 0;
        this.A = i;
    }

    @Override // defpackage.j07
    public final void g(byte b) throws zzjj {
        try {
            byte[] bArr = this.z;
            int i = this.B;
            this.B = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new zzjj(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.B), Integer.valueOf(this.A), 1), e);
        }
    }

    @Override // defpackage.j07
    public final void h(int i, boolean z) throws zzjj {
        s(i << 3);
        g(z ? (byte) 1 : (byte) 0);
    }

    @Override // defpackage.j07
    public final void i(int i, a07 a07Var) throws zzjj {
        s((i << 3) | 2);
        s(a07Var.c());
        a07Var.g(this);
    }

    @Override // defpackage.j07
    public final void j(int i, int i2) throws zzjj {
        s((i << 3) | 5);
        k(i2);
    }

    @Override // defpackage.j07
    public final void k(int i) throws zzjj {
        try {
            byte[] bArr = this.z;
            int i2 = this.B;
            int i3 = i2 + 1;
            bArr[i2] = (byte) (i & 255);
            int i4 = i3 + 1;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i4 + 1;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.B = i5 + 1;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new zzjj(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.B), Integer.valueOf(this.A), 1), e);
        }
    }

    @Override // defpackage.j07
    public final void l(int i, long j) throws zzjj {
        s((i << 3) | 1);
        m(j);
    }

    @Override // defpackage.j07
    public final void m(long j) throws zzjj {
        try {
            byte[] bArr = this.z;
            int i = this.B;
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
            this.B = i8 + 1;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new zzjj(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.B), Integer.valueOf(this.A), 1), e);
        }
    }

    @Override // defpackage.j07
    public final void n(int i, int i2) throws zzjj {
        s(i << 3);
        o(i2);
    }

    @Override // defpackage.j07
    public final void o(int i) throws zzjj {
        if (i >= 0) {
            s(i);
        } else {
            u(i);
        }
    }

    @Override // defpackage.j07
    public final void p(int i, String str) throws zzjj {
        s((i << 3) | 2);
        int i2 = this.B;
        try {
            int iE = j07.e(str.length() * 3);
            int iE2 = j07.e(str.length());
            int i3 = this.A;
            byte[] bArr = this.z;
            if (iE2 == iE) {
                int i4 = i2 + iE2;
                this.B = i4;
                int iB = s57.b(str, bArr, i4, i3 - i4);
                this.B = i2;
                s((iB - i2) - iE2);
                this.B = iB;
            } else {
                s(s57.c(str));
                int i5 = this.B;
                this.B = s57.b(str, bArr, i5, i3 - i5);
            }
        } catch (IndexOutOfBoundsException e) {
            throw new zzjj(e);
        } catch (r57 e2) {
            this.B = i2;
            j07.x.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e2);
            byte[] bytes = str.getBytes(f27.a);
            try {
                int length = bytes.length;
                s(length);
                z(bytes, length);
            } catch (IndexOutOfBoundsException e3) {
                throw new zzjj(e3);
            }
        }
    }

    @Override // defpackage.j07
    public final void q(int i, int i2) throws zzjj {
        s((i << 3) | i2);
    }

    @Override // defpackage.j07
    public final void r(int i, int i2) throws zzjj {
        s(i << 3);
        s(i2);
    }

    @Override // defpackage.j07
    public final void s(int i) throws zzjj {
        while (true) {
            int i2 = i & (-128);
            byte[] bArr = this.z;
            if (i2 == 0) {
                int i3 = this.B;
                this.B = i3 + 1;
                bArr[i3] = (byte) i;
                return;
            } else {
                try {
                    int i4 = this.B;
                    this.B = i4 + 1;
                    bArr[i4] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzjj(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.B), Integer.valueOf(this.A), 1), e);
                }
            }
            throw new zzjj(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.B), Integer.valueOf(this.A), 1), e);
        }
    }

    @Override // defpackage.j07
    public final void t(int i, long j) throws zzjj {
        s(i << 3);
        u(j);
    }

    @Override // defpackage.j07
    public final void u(long j) throws zzjj {
        boolean z = j07.y;
        int i = this.A;
        byte[] bArr = this.z;
        if (!z || i - this.B < 10) {
            while ((j & (-128)) != 0) {
                try {
                    int i2 = this.B;
                    this.B = i2 + 1;
                    bArr[i2] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzjj(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.B), Integer.valueOf(i), 1), e);
                }
            }
            int i3 = this.B;
            this.B = i3 + 1;
            bArr[i3] = (byte) j;
            return;
        }
        while ((j & (-128)) != 0) {
            int i4 = this.B;
            this.B = i4 + 1;
            e57.c.h(bArr, e57.f + ((long) i4), (byte) ((((int) j) & 127) | 128));
            j >>>= 7;
        }
        int i5 = this.B;
        this.B = i5 + 1;
        e57.c.h(bArr, e57.f + ((long) i5), (byte) j);
    }

    public final void z(byte[] bArr, int i) {
        try {
            System.arraycopy(bArr, 0, this.z, this.B, i);
            this.B += i;
        } catch (IndexOutOfBoundsException e) {
            throw new zzjj(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.B), Integer.valueOf(this.A), Integer.valueOf(i)), e);
        }
    }
}
