package defpackage;

import com.google.android.gms.internal.ads.zzaf;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class vh1 {
    public int a;
    public Object b;
    public Serializable c;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.Serializable, java.lang.Object[]] */
    public /* synthetic */ vh1() {
        this.b = new Object[16];
        this.c = new Object[16];
    }

    public /* synthetic */ vh1(zzaf zzafVar, String str) {
        this.b = zzafVar;
        this.a = 0;
        this.c = str;
    }

    public final int a(Object obj) {
        int iIdentityHashCode = System.identityHashCode(obj);
        int i = this.a - 1;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            Object obj2 = ((Object[]) this.b)[i3];
            int iIdentityHashCode2 = System.identityHashCode(obj2);
            if (iIdentityHashCode2 < iIdentityHashCode) {
                i2 = i3 + 1;
            } else {
                if (iIdentityHashCode2 <= iIdentityHashCode) {
                    if (obj == obj2) {
                        return i3;
                    }
                    for (int i4 = i3 - 1; -1 < i4; i4--) {
                        Object obj3 = ((Object[]) this.b)[i4];
                        if (obj3 == obj) {
                            return i4;
                        }
                        if (System.identityHashCode(obj3) != iIdentityHashCode) {
                            break;
                        }
                    }
                    int i5 = i3 + 1;
                    int i6 = this.a;
                    while (i5 < i6) {
                        Object obj4 = ((Object[]) this.b)[i5];
                        if (obj4 == obj) {
                            return i5;
                        }
                        if (System.identityHashCode(obj4) != iIdentityHashCode) {
                            return -(i5 + 1);
                        }
                        i5++;
                    }
                    i5 = this.a;
                    return -(i5 + 1);
                }
                i = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.io.Serializable, java.lang.Object] */
    public final void b(Object obj, Object obj2) {
        int iA = a(obj);
        if (iA >= 0) {
            ((Object[]) this.c)[iA] = obj2;
            return;
        }
        int i = -(iA + 1);
        int i2 = this.a;
        Object[] objArr = (Object[]) this.b;
        boolean z = i2 == objArr.length;
        Object[] objArr2 = z ? new Object[i2 * 2] : objArr;
        int i3 = i + 1;
        System.arraycopy(objArr, i, objArr2, i3, i2 - i);
        if (z) {
            NPO.a0((Object[]) this.b, objArr2, 0, 0, i, 6);
        }
        objArr2[i] = obj;
        this.b = objArr2;
        Object[] objArr3 = z ? new Object[this.a * 2] : (Object[]) this.c;
        System.arraycopy((Object[]) this.c, i, objArr3, i3, this.a - i);
        if (z) {
            NPO.a0((Object[]) this.c, objArr3, 0, 0, i, 6);
        }
        objArr3[i] = obj2;
        this.c = objArr3;
        this.a++;
    }
}
