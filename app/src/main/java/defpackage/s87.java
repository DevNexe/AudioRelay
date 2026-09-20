package defpackage;

import com.google.android.gms.internal.ads.zzdd;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class s87 {
    public final int a;
    public final int b;
    public final float c;
    public final float d;
    public final float e;
    public final int f;
    public final int g;
    public final int h;
    public final short[] i;
    public short[] j;
    public int k;
    public short[] l;
    public int m;
    public short[] n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;

    public s87(int i, int i2, float f, float f2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = f;
        this.d = f2;
        this.e = i / i3;
        this.f = i / 400;
        int i4 = i / 65;
        this.g = i4;
        int i5 = i4 + i4;
        this.h = i5;
        this.i = new short[i5];
        int i6 = i5 * i2;
        this.j = new short[i6];
        this.l = new short[i6];
        this.n = new short[i6];
    }

    public static void d(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i3 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i4 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i7] = (short) (((sArr3[i8] * i10) + ((i - i10) * sArr2[i9])) / i);
                i7 += i2;
                i9 += i2;
                i8 += i2;
            }
        }
    }

    public final int a(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.b;
        int i5 = 255;
        int i6 = 1;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int iAbs = 0;
            for (int i9 = 0; i9 < i2; i9++) {
                iAbs += Math.abs(sArr[i4 + i9] - sArr[(i4 + i2) + i9]);
            }
            int i10 = iAbs * i7;
            int i11 = i6 * i2;
            if (i10 < i11) {
                i6 = iAbs;
            }
            if (i10 < i11) {
                i7 = i2;
            }
            int i12 = iAbs * i5;
            int i13 = i8 * i2;
            if (i12 > i13) {
                i8 = iAbs;
            }
            if (i12 > i13) {
                i5 = i2;
            }
            i2++;
        }
        this.u = i6 / i7;
        this.v = i8 / i5;
        return i7;
    }

    public final void b(short[] sArr, int i, int i2) {
        short[] sArrF = f(this.l, this.m, i2);
        this.l = sArrF;
        int i3 = this.b;
        System.arraycopy(sArr, i * i3, sArrF, this.m * i3, i3 * i2);
        this.m += i2;
    }

    public final void c(short[] sArr, int i, int i2) {
        int i3 = this.h / i2;
        int i4 = this.b;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            this.i[i7] = (short) (i8 / i5);
        }
    }

    public final void e() {
        int i;
        int i2;
        float f;
        int iA;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11 = this.m;
        float f2 = this.c;
        float f3 = this.d;
        float f4 = f2 / f3;
        float f5 = this.e * f3;
        double d = f4;
        int i12 = this.a;
        int i13 = this.b;
        int i14 = 1;
        if (d > 1.00001d || d < 0.99999d) {
            int i15 = this.k;
            int i16 = this.h;
            if (i15 >= i16) {
                int i17 = 0;
                while (true) {
                    int i18 = this.r;
                    if (i18 > 0) {
                        int iMin = Math.min(i16, i18);
                        b(this.j, i17, iMin);
                        this.r -= iMin;
                        i17 += iMin;
                        i2 = i11;
                        i = i12;
                        f = f5;
                    } else {
                        short[] sArr = this.j;
                        int i19 = i12 > 4000 ? i12 / 4000 : 1;
                        int i20 = this.g;
                        int i21 = this.f;
                        if (i13 == i14 && i19 == i14) {
                            iA = a(sArr, i17, i21, i20);
                            i2 = i11;
                            i = i12;
                            f = f5;
                        } else {
                            c(sArr, i17, i19);
                            i = i12;
                            i2 = i11;
                            short[] sArr2 = this.i;
                            f = f5;
                            int iA2 = a(sArr2, 0, i21 / i19, i20 / i19);
                            if (i19 != 1) {
                                int i22 = iA2 * i19;
                                int i23 = i19 * 4;
                                int i24 = i22 - i23;
                                int i25 = i22 + i23;
                                if (i24 >= i21) {
                                    i21 = i24;
                                }
                                if (i25 <= i20) {
                                    i20 = i25;
                                }
                                if (i13 == 1) {
                                    iA = a(sArr, i17, i21, i20);
                                } else {
                                    c(sArr, i17, 1);
                                    iA = a(sArr2, 0, i21, i20);
                                }
                            } else {
                                iA = iA2;
                            }
                        }
                        int i26 = this.u;
                        int i27 = this.v;
                        if (i26 == 0 || (i3 = this.s) == 0 || i27 > i26 * 3 || i26 + i26 <= this.t * 3) {
                            i3 = iA;
                        }
                        this.t = i26;
                        this.s = iA;
                        if (d > 1.0d) {
                            short[] sArr3 = this.j;
                            if (f4 >= 2.0f) {
                                i5 = (int) (i3 / ((-1.0f) + f4));
                            } else {
                                this.r = (int) (((2.0f - f4) * i3) / ((-1.0f) + f4));
                                i5 = i3;
                            }
                            short[] sArrF = f(this.l, this.m, i5);
                            this.l = sArrF;
                            int i28 = i17;
                            d(i5, this.b, sArrF, this.m, sArr3, i28, sArr3, i17 + i3);
                            this.m += i5;
                            i17 = i3 + i5 + i28;
                        } else {
                            int i29 = i17;
                            short[] sArr4 = this.j;
                            if (f4 < 0.5f) {
                                i4 = (int) ((i3 * f4) / (1.0f - f4));
                            } else {
                                this.r = (int) ((((f4 + f4) - 1.0f) * i3) / (1.0f - f4));
                                i4 = i3;
                            }
                            int i30 = i3 + i4;
                            short[] sArrF2 = f(this.l, this.m, i30);
                            this.l = sArrF2;
                            System.arraycopy(sArr4, i29 * i13, sArrF2, this.m * i13, i3 * i13);
                            d(i4, this.b, this.l, this.m + i3, sArr4, i29 + i3, sArr4, i29);
                            this.m += i30;
                            i17 = i29 + i4;
                        }
                    }
                    if (i17 + i16 > i15) {
                        break;
                    }
                    i12 = i;
                    i11 = i2;
                    f5 = f;
                    i14 = 1;
                }
                int i31 = this.k - i17;
                short[] sArr5 = this.j;
                System.arraycopy(sArr5, i17 * i13, sArr5, 0, i31 * i13);
                this.k = i31;
            }
            if (f != 1.0f || this.m == (i6 = i2)) {
            }
            int i32 = i;
            int i33 = (int) (i32 / f);
            while (true) {
                if (i33 <= 16384 && i32 <= 16384) {
                    break;
                }
                i33 /= 2;
                i32 /= 2;
            }
            int i34 = this.m - i6;
            short[] sArrF3 = f(this.n, this.o, i34);
            this.n = sArrF3;
            System.arraycopy(this.l, i6 * i13, sArrF3, this.o * i13, i34 * i13);
            this.m = i6;
            this.o += i34;
            int i35 = 0;
            while (true) {
                i7 = this.o;
                i8 = i7 - 1;
                if (i35 >= i8) {
                    break;
                }
                while (true) {
                    i9 = this.p + 1;
                    i10 = this.q;
                    if (i9 * i33 <= i10 * i32) {
                        break;
                    }
                    this.l = f(this.l, this.m, 1);
                    for (int i36 = 0; i36 < i13; i36++) {
                        short[] sArr6 = this.l;
                        int i37 = this.m;
                        short[] sArr7 = this.n;
                        int i38 = (i35 * i13) + i36;
                        short s = sArr7[i38];
                        short s2 = sArr7[i38 + i13];
                        int i39 = this.q;
                        int i40 = this.p;
                        int i41 = (i40 + 1) * i33;
                        int i42 = i41 - (i39 * i32);
                        int i43 = i41 - (i40 * i33);
                        sArr6[(i37 * i13) + i36] = (short) ((((i43 - i42) * s2) + (s * i42)) / i43);
                    }
                    this.q++;
                    this.m++;
                }
                this.p = i9;
                if (i9 == i32) {
                    this.p = 0;
                    zzdd.zzf(i10 == i33);
                    this.q = 0;
                }
                i35++;
            }
            if (i8 != 0) {
                short[] sArr8 = this.n;
                System.arraycopy(sArr8, i8 * i13, sArr8, 0, (i7 - i8) * i13);
                this.o -= i8;
                return;
            }
            return;
        }
        b(this.j, 0, this.k);
        this.k = 0;
        i2 = i11;
        i = i12;
        f = f5;
        if (f != 1.0f) {
        }
    }

    public final short[] f(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.b;
        int i4 = length / i3;
        return i + i2 <= i4 ? sArr : Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }
}
