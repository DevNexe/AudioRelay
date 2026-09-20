package defpackage;

import com.google.android.gms.internal.ads.EQ;
import com.google.android.gms.internal.ads.FJCM;
import com.google.android.gms.internal.ads.byN;
import com.google.android.gms.internal.ads.zzfuy;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public final class jp6 extends zzfuy {
    public static final jp6 C = new jp6(0, null, new Object[0]);
    public final transient Object[] A;
    public final transient int B;

    @CheckForNull
    public final transient Object z;

    public jp6(int i, @CheckForNull Object obj, Object[] objArr) {
        this.z = obj;
        this.A = objArr;
        this.B = i;
    }

    @Override // com.google.android.gms.internal.ads.zzfuy
    public final FJCM a() {
        return new FJCM(1, this.B, this.A);
    }

    @Override // com.google.android.gms.internal.ads.zzfuy
    public final byN b() {
        return new byN(this, this.A, this.B);
    }

    @Override // com.google.android.gms.internal.ads.zzfuy
    public final EQ c() {
        return new EQ(this, new FJCM(0, this.B, this.A));
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0003  */
    @Override // com.google.android.gms.internal.ads.zzfuy, java.util.Map, j$.util.Map
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
                    int iG = ko6.g(obj.hashCode());
                    while (true) {
                        int i = iG & length;
                        int i2 = bArr[i] & 255;
                        if (i2 == 255) {
                            break;
                        }
                        if (obj.equals(objArr[i2])) {
                            obj2 = objArr[i2 ^ 1];
                        } else {
                            iG = i + 1;
                        }
                    }
                    obj2 = null;
                } else if (obj4 instanceof short[]) {
                    short[] sArr = (short[]) obj4;
                    int length2 = sArr.length - 1;
                    int iG2 = ko6.g(obj.hashCode());
                    while (true) {
                        int i3 = iG2 & length2;
                        char c = (char) sArr[i3];
                        if (c == 65535) {
                            break;
                        }
                        if (obj.equals(objArr[c])) {
                            obj2 = objArr[c ^ 1];
                        } else {
                            iG2 = i3 + 1;
                        }
                    }
                    obj2 = null;
                } else {
                    int[] iArr = (int[]) obj4;
                    int length3 = iArr.length - 1;
                    int iG3 = ko6.g(obj.hashCode());
                    while (true) {
                        int i4 = iG3 & length3;
                        int i5 = iArr[i4];
                        if (i5 == -1) {
                            break;
                        }
                        if (obj.equals(objArr[i5])) {
                            obj2 = objArr[i5 ^ 1];
                        } else {
                            iG3 = i4 + 1;
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
