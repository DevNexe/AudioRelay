package defpackage;

import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public final class bv5 extends tc7 {
    public static final bv5 C = new bv5(0, null, new Object[0]);
    public final transient Object[] A;
    public final transient int B;

    @CheckForNull
    public final transient Object z;

    public bv5(int i, @CheckForNull Object obj, Object[] objArr) {
        this.z = obj;
        this.A = objArr;
        this.B = i;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0003  */
    @Override // defpackage.tc7, java.util.Map, j$.util.Map
    @CheckForNull
    public final Object get(@CheckForNull Object obj) {
        Object obj2;
        if (obj == null) {
            obj2 = null;
        } else {
            Object[] objArr = this.A;
            if (this.B == 1) {
                Object obj3 = objArr[0];
                obj3.getClass();
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    obj2.getClass();
                } else {
                    obj2 = null;
                }
            } else {
                Object obj4 = this.z;
                if (obj4 == null) {
                    obj2 = null;
                } else if (obj4 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj4;
                    int length = bArr.length - 1;
                    int iU = Th.U(obj.hashCode());
                    while (true) {
                        int i = iU & length;
                        int i2 = bArr[i] & 255;
                        if (i2 == 255) {
                            break;
                        }
                        if (obj.equals(objArr[i2])) {
                            obj2 = objArr[i2 ^ 1];
                        } else {
                            iU = i + 1;
                        }
                    }
                    obj2 = null;
                } else if (obj4 instanceof short[]) {
                    short[] sArr = (short[]) obj4;
                    int length2 = sArr.length - 1;
                    int iU2 = Th.U(obj.hashCode());
                    while (true) {
                        int i3 = iU2 & length2;
                        char c = (char) sArr[i3];
                        if (c == 65535) {
                            break;
                        }
                        if (obj.equals(objArr[c])) {
                            obj2 = objArr[c ^ 1];
                        } else {
                            iU2 = i3 + 1;
                        }
                    }
                    obj2 = null;
                } else {
                    int[] iArr = (int[]) obj4;
                    int length3 = iArr.length - 1;
                    int iU3 = Th.U(obj.hashCode());
                    while (true) {
                        int i4 = iU3 & length3;
                        int i5 = iArr[i4];
                        if (i5 == -1) {
                            break;
                        }
                        if (obj.equals(objArr[i5])) {
                            obj2 = objArr[i5 ^ 1];
                        } else {
                            iU3 = i4 + 1;
                        }
                    }
                    obj2 = null;
                }
            }
        }
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    @Override // java.util.Map, j$.util.Map
    public final int size() {
        return this.B;
    }
}
