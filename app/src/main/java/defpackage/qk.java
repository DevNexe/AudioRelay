package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qk {
    public static final qk e = OW8.y(new byte[0], 0, 3);
    public final byte[] a;
    public final int b;
    public final int c;
    public final boolean d;

    public qk(byte[] bArr, int i, int i2, boolean z) {
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = z;
        if (i + i2 <= bArr.length) {
            return;
        }
        int length = bArr.length;
        StringBuilder sbA = a42.a("offset or size too big for the array: ", i, " + ", i2, " > ");
        sbA.append(length);
        throw new IllegalStateException(sbA.toString().toString());
    }

    public final qk a() {
        if (this.d) {
            return this;
        }
        int i = this.c;
        byte[] bArr = new byte[i];
        int i2 = this.b;
        System.arraycopy(this.a, i2, bArr, 0, (i + i2) - i2);
        return OW8.y(bArr, 0, 3);
    }
}
