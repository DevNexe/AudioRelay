package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class mz6 extends vz6 {
    public final int z;

    public mz6(byte[] bArr, int i) {
        super(bArr);
        a07.m(0, i, bArr.length);
        this.z = i;
    }

    @Override // defpackage.vz6, defpackage.a07
    public final byte a(int i) {
        int i2 = this.z;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.y[i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(GM.a("Index < 0: ", i));
        }
        throw new ArrayIndexOutOfBoundsException(Md5A.e("Index > length: ", i, ", ", i2));
    }

    @Override // defpackage.vz6, defpackage.a07
    public final byte b(int i) {
        return this.y[i];
    }

    @Override // defpackage.vz6, defpackage.a07
    public final int c() {
        return this.z;
    }

    @Override // defpackage.vz6
    public final void r() {
    }
}
