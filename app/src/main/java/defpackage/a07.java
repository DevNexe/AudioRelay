package defpackage;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a07 implements Iterable, Serializable {
    public static final vz6 x = new vz6(f27.b);
    public int w = 0;

    static {
        int i = xy6.a;
    }

    public static int m(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(ex0.b("Beginning index: ", i, " < 0"));
        }
        if (i2 < i) {
            throw new IndexOutOfBoundsException(Md5A.e("Beginning index larger than ending index: ", i, ", ", i2));
        }
        throw new IndexOutOfBoundsException(Md5A.e("End index: ", i2, " >= ", i3));
    }

    public static vz6 p(byte[] bArr, int i, int i2) {
        m(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new vz6(bArr2);
    }

    public abstract byte a(int i);

    public abstract byte b(int i);

    public abstract int c();

    public abstract int d(int i, int i2);

    public abstract vz6 e();

    public abstract boolean equals(Object obj);

    public abstract String f(Charset charset);

    public abstract void g(j07 j07Var);

    public abstract boolean h();

    public final int hashCode() {
        int iD = this.w;
        if (iD == 0) {
            int iC = c();
            iD = d(iC, iC);
            if (iD == 0) {
                iD = 1;
            }
            this.w = iD;
        }
        return iD;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new gz6(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(c());
        objArr[2] = c() <= 50 ? X.I(this) : X.I(e()).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }
}
