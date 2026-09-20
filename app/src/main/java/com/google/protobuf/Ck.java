package com.google.protobuf;

import defpackage.lk;

/* JADX INFO: loaded from: classes3.dex */
public final class Ck {
    public static final Ck e = new Ck(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d;

    public Ck() {
        this(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int iS1;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int iA = 0;
        for (int i2 = 0; i2 < this.a; i2++) {
            int i3 = this.b[i2];
            int i4 = i3 >>> 3;
            int i5 = i3 & 7;
            if (i5 == 0) {
                iS1 = CodedOutputStream.s1(i4, ((Long) this.c[i2]).longValue());
            } else if (i5 == 1) {
                ((Long) this.c[i2]).longValue();
                iS1 = CodedOutputStream.b1(i4);
            } else if (i5 != 2) {
                if (i5 == 3) {
                    iA = ((Ck) this.c[i2]).a() + (CodedOutputStream.p1(i4) * 2) + iA;
                } else {
                    if (i5 != 5) {
                        int i6 = InvalidProtocolBufferException.x;
                        throw new IllegalStateException(new InvalidProtocolBufferException.InvalidWireTypeException());
                    }
                    ((Integer) this.c[i2]).intValue();
                    iS1 = CodedOutputStream.a1(i4);
                }
            } else {
                iS1 = CodedOutputStream.W0(i4, (lk) this.c[i2]);
            }
            iA = iS1 + iA;
        }
        this.d = iA;
        return iA;
    }

    public final void b(YKK ykk) {
        if (this.a == 0) {
            return;
        }
        ykk.getClass();
        for (int i = 0; i < this.a; i++) {
            int i2 = this.b[i];
            Object obj = this.c[i];
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 == 0) {
                ykk.l(i3, ((Long) obj).longValue());
            } else if (i4 == 1) {
                ykk.g(i3, ((Long) obj).longValue());
            } else if (i4 == 2) {
                ykk.b(i3, (lk) obj);
            } else if (i4 == 3) {
                CodedOutputStream codedOutputStream = ykk.a;
                codedOutputStream.N1(i3, 3);
                ((Ck) obj).b(ykk);
                codedOutputStream.N1(i3, 4);
            } else {
                if (i4 != 5) {
                    int i5 = InvalidProtocolBufferException.x;
                    throw new RuntimeException(new InvalidProtocolBufferException.InvalidWireTypeException());
                }
                ykk.e(i3, ((Integer) obj).intValue());
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0046 A[RETURN] */
    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Ck)) {
            return false;
        }
        Ck ck = (Ck) obj;
        int i = this.a;
        if (i == ck.a) {
            int[] iArr = this.b;
            int[] iArr2 = ck.b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    z = true;
                    break;
                }
                if (iArr[i2] != iArr2[i2]) {
                    z = false;
                    break;
                }
                i2++;
            }
            if (z) {
                Object[] objArr = this.c;
                Object[] objArr2 = ck.c;
                int i3 = this.a;
                for (int i4 = 0; i4 < i3; i4++) {
                    if (!objArr[i4].equals(objArr2[i4])) {
                        z2 = false;
                        if (!z2) {
                            return true;
                        }
                    }
                }
                z2 = true;
                if (!z2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = (527 + i) * 31;
        int[] iArr = this.b;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i2 + i3) * 31;
        Object[] objArr = this.c;
        int i6 = this.a;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }

    public Ck(int i, int[] iArr, Object[] objArr, boolean z) {
        this.d = -1;
        this.a = i;
        this.b = iArr;
        this.c = objArr;
    }
}
