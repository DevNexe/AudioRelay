package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class v91 implements dl5 {
    public final float w;

    public v91(int i) {
        this.w = (float) Math.pow(10.0f, i / 20.0f);
    }

    @Override // defpackage.dl5
    public final void a(qk qkVar) {
        int i = qkVar.b;
        for (int i2 = i; i2 < qkVar.c + i; i2 += 2) {
            int i3 = i2 + 1;
            byte[] bArr = qkVar.a;
            int iMax = Math.max(Math.min((int) (((short) (((short) (((short) (bArr[i3] & 255)) << 8)) | ((short) (bArr[i2] & 255)))) * this.w), 32767), -32768);
            bArr[i2] = (byte) iMax;
            bArr[i3] = (byte) (iMax >> 8);
        }
    }
}
