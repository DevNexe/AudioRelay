package defpackage;

import com.google.protobuf.SjP;
import com.google.protobuf.bm88;
import j$.util.function.Consumer;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class lk implements Iterable<Byte>, Serializable {
    public static final YKK x = new YKK(SjP.c);
    public static final LPt8Fixed y;
    public int w = 0;

    public static final class CQf implements LPt8Fixed {
        @Override // lk.LPt8Fixed
        public final byte[] a(byte[] bArr, int i, int i2) {
            return Arrays.copyOfRange(bArr, i, i2 + i);
        }
    }

    public static final class F1 extends YKK {
        public final int A;
        public final int B;

        public F1(byte[] bArr, int i, int i2) {
            super(bArr);
            lk.c(i, i + i2, bArr.length);
            this.A = i;
            this.B = i2;
        }

        @Override // lk.YKK, defpackage.lk
        public final byte b(int i) {
            int i2 = this.B;
            if (((i2 - (i + 1)) | i) >= 0) {
                return this.z[this.A + i];
            }
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException(GM.a("Index < 0: ", i));
            }
            throw new ArrayIndexOutOfBoundsException(Md5A.e("Index > length: ", i, ", ", i2));
        }

        @Override // lk.YKK, defpackage.lk
        public final void e(int i, byte[] bArr) {
            System.arraycopy(this.z, this.A + 0, bArr, 0, i);
        }

        @Override // lk.YKK, defpackage.lk
        public final byte f(int i) {
            return this.z[this.A + i];
        }

        @Override // lk.YKK, defpackage.lk
        public final int size() {
            return this.B;
        }

        @Override // lk.YKK
        public final int v() {
            return this.A;
        }
    }

    public interface LPt8Fixed {
        byte[] a(byte[] bArr, int i, int i2);
    }

    public static abstract class NUlFixed extends lk {
        @Override // defpackage.lk, java.lang.Iterable
        public final Iterator<Byte> iterator() {
            return new jk(this);
        }
    }

    public static abstract class QnHx implements Iterator, j$.util.Iterator {
        @Override // j$.util.Iterator
        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            j$.util.Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            j$.util.Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final Object next() {
            jk jkVar = (jk) this;
            int i = jkVar.w;
            if (i >= jkVar.x) {
                throw new NoSuchElementException();
            }
            jkVar.w = i + 1;
            return Byte.valueOf(jkVar.y.f(i));
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public static class YKK extends NUlFixed {
        public final byte[] z;

        public YKK(byte[] bArr) {
            bArr.getClass();
            this.z = bArr;
        }

        @Override // defpackage.lk
        public final ByteBuffer a() {
            return ByteBuffer.wrap(this.z, v(), size()).asReadOnlyBuffer();
        }

        @Override // defpackage.lk
        public byte b(int i) {
            return this.z[i];
        }

        @Override // defpackage.lk
        public void e(int i, byte[] bArr) {
            System.arraycopy(this.z, 0, bArr, 0, i);
        }

        @Override // defpackage.lk
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof lk) || size() != ((lk) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof YKK)) {
                return obj.equals(this);
            }
            YKK ykk = (YKK) obj;
            int i = this.w;
            int i2 = ykk.w;
            if (i != 0 && i2 != 0 && i != i2) {
                return false;
            }
            int size = size();
            if (size > ykk.size()) {
                throw new IllegalArgumentException("Length too large: " + size + size());
            }
            if (0 + size > ykk.size()) {
                StringBuilder sbC = iZUl.c("Ran off end of other: 0, ", size, ", ");
                sbC.append(ykk.size());
                throw new IllegalArgumentException(sbC.toString());
            }
            int iV = v() + size;
            int iV2 = v();
            int iV3 = ykk.v() + 0;
            while (iV2 < iV) {
                if (this.z[iV2] != ykk.z[iV3]) {
                    return false;
                }
                iV2++;
                iV3++;
            }
            return true;
        }

        @Override // defpackage.lk
        public byte f(int i) {
            return this.z[i];
        }

        @Override // defpackage.lk
        public final boolean g() {
            int iV = v();
            return bm88.a.c(iV, size() + iV, this.z) == 0;
        }

        @Override // defpackage.lk
        public final com.google.protobuf.NUlFixed.QnHx h() {
            return com.google.protobuf.NUlFixed.d(this.z, v(), size(), true);
        }

        @Override // defpackage.lk
        public final int m(int i, int i2) {
            int iV = v() + 0;
            Charset charset = SjP.a;
            for (int i3 = iV; i3 < iV + i2; i3++) {
                i = (i * 31) + this.z[i3];
            }
            return i;
        }

        @Override // defpackage.lk
        public final YKK p(int i, int i2) {
            int iC = lk.c(i, i2, size());
            if (iC == 0) {
                return lk.x;
            }
            return new F1(this.z, v() + i, iC);
        }

        @Override // defpackage.lk
        public final String r(Charset charset) {
            return new String(this.z, v(), size(), charset);
        }

        @Override // defpackage.lk
        public int size() {
            return this.z.length;
        }

        @Override // defpackage.lk
        public final void u(B8C b8c) {
            b8c.R0(this.z, v(), size());
        }

        public int v() {
            return 0;
        }
    }

    public static final class auxFixed implements LPt8Fixed {
        @Override // lk.LPt8Fixed
        public final byte[] a(byte[] bArr, int i, int i2) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return bArr2;
        }
    }

    static {
        y = DY.a() ? new auxFixed() : new CQf();
    }

    public static int c(int i, int i2, int i3) {
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

    public static YKK d(byte[] bArr, int i, int i2) {
        c(i, i + i2, bArr.length);
        return new YKK(y.a(bArr, i, i2));
    }

    public abstract ByteBuffer a();

    public abstract byte b(int i);

    public abstract void e(int i, byte[] bArr);

    public abstract boolean equals(Object obj);

    public abstract byte f(int i);

    public abstract boolean g();

    public abstract com.google.protobuf.NUlFixed.QnHx h();

    public final int hashCode() {
        int iM = this.w;
        if (iM == 0) {
            int size = size();
            iM = m(size, size);
            if (iM == 0) {
                iM = 1;
            }
            this.w = iM;
        }
        return iM;
    }

    @Override // java.lang.Iterable
    public Iterator<Byte> iterator() {
        return new jk(this);
    }

    public abstract int m(int i, int i2);

    public abstract YKK p(int i, int i2);

    public abstract String r(Charset charset);

    public final String s() {
        return size() == 0 ? "" : r(SjP.a);
    }

    public abstract int size();

    public final String toString() {
        String strA;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(size());
        if (size() <= 50) {
            strA = y45.a(this);
        } else {
            strA = y45.a(p(0, 47)) + "...";
        }
        objArr[2] = strA;
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public abstract void u(B8C b8c);
}
