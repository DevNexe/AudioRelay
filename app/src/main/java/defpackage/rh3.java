package defpackage;

import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.os.Build;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class rh3 extends wi4 {
    public final List<yu> c;
    public final List<Float> d = null;
    public final long e;
    public final float f;
    public final int g;

    public rh3(List list, long j, float f, int i) {
        this.c = list;
        this.e = j;
        this.f = f;
        this.g = i;
    }

    @Override // defpackage.wi4
    public final Shader b(long j) {
        float fE;
        float fC;
        int i;
        int[] iArr;
        int i2;
        int i3;
        int i4;
        char c;
        float fFloatValue;
        float[] fArr;
        Shader.TileMode tileModeB;
        float[] fArr2;
        long j2 = kt2.d;
        long j3 = this.e;
        if (j3 == j2) {
            long jH = ps0.H(j);
            fE = kt2.c(jH);
            fC = kt2.d(jH);
        } else {
            fE = (kt2.c(j3) > Float.POSITIVE_INFINITY ? 1 : (kt2.c(j3) == Float.POSITIVE_INFINITY ? 0 : -1)) == 0 ? cm4.e(j) : kt2.c(j3);
            fC = (kt2.d(j3) > Float.POSITIVE_INFINITY ? 1 : (kt2.d(j3) == Float.POSITIVE_INFINITY ? 0 : -1)) == 0 ? cm4.c(j) : kt2.d(j3);
        }
        long jA = X.a(fE, fC);
        float fD = this.f;
        if (fD == Float.POSITIVE_INFINITY) {
            fD = cm4.d(j) / 2;
        }
        float f = fD;
        List<yu> list = this.c;
        List<Float> list2 = this.d;
        if (list2 == null) {
            if (list.size() < 2) {
                throw new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
            }
        } else if (list.size() != list2.size()) {
            throw new IllegalArgumentException("colors and colorStops arguments must have equal length.");
        }
        if (Build.VERSION.SDK_INT >= 26) {
            i = 0;
        } else {
            int iJ = ps0.J(list);
            i = 0;
            for (int i5 = 1; i5 < iJ; i5++) {
                if (yu.d(list.get(i5).a) == 0.0f) {
                    i++;
                }
            }
        }
        float fC2 = kt2.c(jA);
        float fD2 = kt2.d(jA);
        if (Build.VERSION.SDK_INT >= 26) {
            int size = list.size();
            int[] iArr2 = new int[size];
            for (int i6 = 0; i6 < size; i6++) {
                iArr2[i6] = hH.A(list.get(i6).a);
            }
            iArr = iArr2;
        } else {
            iArr = new int[list.size() + i];
            int iJ2 = ps0.J(list);
            int size2 = list.size();
            int i7 = 0;
            int i8 = 0;
            while (i7 < size2) {
                int i9 = i7;
                long j4 = list.get(i7).a;
                if (!(yu.d(j4) == 0.0f)) {
                    i2 = size2;
                    i3 = i9;
                    iArr[i8] = hH.A(j4);
                    i4 = i8 + 1;
                } else if (i9 == 0) {
                    i2 = size2;
                    iArr[i8] = hH.A(yu.b(list.get(1).a, 0.0f));
                    i3 = i9;
                    i4 = i8 + 1;
                } else {
                    i2 = size2;
                    i3 = i9;
                    if (i3 == iJ2) {
                        iArr[i8] = hH.A(yu.b(list.get(i3 - 1).a, 0.0f));
                        i4 = i8 + 1;
                    } else {
                        int i10 = i8 + 1;
                        iArr[i8] = hH.A(yu.b(list.get(i3 - 1).a, 0.0f));
                        i8 = i10 + 1;
                        iArr[i10] = hH.A(yu.b(list.get(i3 + 1).a, 0.0f));
                    }
                    i7 = i3 + 1;
                    size2 = i2;
                }
                i8 = i4;
                i7 = i3 + 1;
                size2 = i2;
            }
        }
        if (i == 0) {
            if (list2 != null) {
                List<Float> list3 = list2;
                fArr2 = new float[list3.size()];
                Iterator<Float> it = list3.iterator();
                int i11 = 0;
                while (it.hasNext()) {
                    fArr2[i11] = it.next().floatValue();
                    i11++;
                }
            } else {
                fArr2 = null;
            }
            fArr = fArr2;
        } else {
            float[] fArr3 = new float[list.size() + i];
            if (list2 != null) {
                c = 0;
                fFloatValue = list2.get(0).floatValue();
            } else {
                c = 0;
                fFloatValue = 0.0f;
            }
            fArr3[c] = fFloatValue;
            int iJ3 = ps0.J(list);
            int i12 = 1;
            for (int i13 = 1; i13 < iJ3; i13++) {
                long j5 = list.get(i13).a;
                float fFloatValue2 = list2 != null ? list2.get(i13).floatValue() : i13 / ps0.J(list);
                int i14 = i12 + 1;
                fArr3[i12] = fFloatValue2;
                if (yu.d(j5) == 0.0f) {
                    i12 = i14 + 1;
                    fArr3[i14] = fFloatValue2;
                } else {
                    i12 = i14;
                }
            }
            fArr3[i12] = list2 != null ? list2.get(ps0.J(list)).floatValue() : 1.0f;
            fArr = fArr3;
        }
        int i15 = this.g;
        if (i15 == 0) {
            tileModeB = Shader.TileMode.CLAMP;
        } else if (i15 == 1) {
            tileModeB = Shader.TileMode.REPEAT;
        } else {
            tileModeB = i15 == 2 ? Shader.TileMode.MIRROR : (!(i15 == 3) || Build.VERSION.SDK_INT < 31) ? Shader.TileMode.CLAMP : p75.a.b();
        }
        return new RadialGradient(fC2, fD2, f, iArr, fArr, tileModeB);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rh3)) {
            return false;
        }
        rh3 rh3Var = (rh3) obj;
        if (!ur1.a(this.c, rh3Var.c) || !ur1.a(this.d, rh3Var.d) || !kt2.a(this.e, rh3Var.e)) {
            return false;
        }
        if (this.f == rh3Var.f) {
            return this.g == rh3Var.g;
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.c.hashCode() * 31;
        List<Float> list = this.d;
        return ry0.b(this.f, (kt2.e(this.e) + ((iHashCode + (list != null ? list.hashCode() : 0)) * 31)) * 31, 31) + this.g;
    }

    public final String toString() {
        String str;
        String str2;
        long j = this.e;
        String str3 = "";
        if (X.w(j)) {
            str = "center=" + ((Object) kt2.i(j)) + ", ";
        } else {
            str = "";
        }
        float f = this.f;
        if ((Float.isInfinite(f) || Float.isNaN(f)) ? false : true) {
            str3 = "radius=" + f + ", ";
        }
        StringBuilder sb = new StringBuilder("RadialGradient(colors=");
        sb.append(this.c);
        sb.append(", stops=");
        sb.append(this.d);
        sb.append(", ");
        sb.append(str);
        sb.append(str3);
        sb.append("tileMode=");
        int i = this.g;
        if (i == 0) {
            str2 = "Clamp";
        } else {
            if (i == 1) {
                str2 = "Repeated";
            } else {
                if (i == 2) {
                    str2 = "Mirror";
                } else {
                    str2 = i == 3 ? "Decal" : "Unknown";
                }
            }
        }
        sb.append((Object) str2);
        sb.append(')');
        return sb.toString();
    }
}
