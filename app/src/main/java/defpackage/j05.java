package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class j05 {
    public int a;
    public ByteBuffer b;
    public int c;
    public int d;

    public j05() {
        if (zv1.a == null) {
            zv1.a = new zv1();
        }
    }

    public final int a(int i) {
        if (i < this.d) {
            return this.b.getShort(this.c + i);
        }
        return 0;
    }

    public final void b(ByteBuffer byteBuffer, int i) {
        this.b = byteBuffer;
        if (byteBuffer == null) {
            this.a = 0;
            this.c = 0;
            this.d = 0;
        } else {
            this.a = i;
            int i2 = i - byteBuffer.getInt(i);
            this.c = i2;
            this.d = this.b.getShort(i2);
        }
    }
}
