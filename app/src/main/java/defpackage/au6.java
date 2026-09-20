package defpackage;

import com.google.android.gms.internal.ads.zzgox;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class au6 extends InputStream {
    public int A;
    public boolean B;
    public byte[] C;
    public int D;
    public long E;
    public final Iterator w;
    public ByteBuffer x;
    public final int y = 0;
    public int z;

    public au6(ArrayList arrayList) {
        this.w = arrayList.iterator();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.y++;
        }
        this.z = -1;
        if (c()) {
            return;
        }
        this.x = zzgox.zze;
        this.z = 0;
        this.A = 0;
        this.E = 0L;
    }

    public final void b(int i) {
        int i2 = this.A + i;
        this.A = i2;
        if (i2 == this.x.limit()) {
            c();
        }
    }

    public final boolean c() {
        this.z++;
        Iterator it = this.w;
        if (!it.hasNext()) {
            return false;
        }
        ByteBuffer byteBuffer = (ByteBuffer) it.next();
        this.x = byteBuffer;
        this.A = byteBuffer.position();
        if (this.x.hasArray()) {
            this.B = true;
            this.C = this.x.array();
            this.D = this.x.arrayOffset();
        } else {
            this.B = false;
            this.E = nv6.c.y(nv6.g, this.x);
            this.C = null;
        }
        return true;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte bF;
        if (this.z == this.y) {
            return -1;
        }
        if (this.B) {
            bF = this.C[this.A + this.D];
            b(1);
        } else {
            bF = nv6.f(((long) this.A) + this.E);
            b(1);
        }
        return bF & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (this.z == this.y) {
            return -1;
        }
        int iLimit = this.x.limit();
        int i3 = this.A;
        int i4 = iLimit - i3;
        if (i2 > i4) {
            i2 = i4;
        }
        if (this.B) {
            System.arraycopy(this.C, i3 + this.D, bArr, i, i2);
            b(i2);
        } else {
            int iPosition = this.x.position();
            this.x.get(bArr, i, i2);
            b(i2);
        }
        return i2;
    }
}
