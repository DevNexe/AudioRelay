package defpackage;

import com.google.android.gms.internal.ads.zzazy;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class t06 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final short[] f;
    public int g;
    public short[] h;
    public int i;
    public short[] j;
    public int k;
    public short[] l;
    public int q;
    public int r;
    public int s;
    public int t;
    public int v;
    public int w;
    public int x;
    public int m = 0;
    public int n = 0;
    public int u = 0;
    public float o = 1.0f;
    public float p = 1.0f;

    public t06(int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = i / 400;
        int i3 = i / 65;
        this.d = i3;
        int i4 = i3 + i3;
        this.e = i4;
        this.f = new short[i4];
        this.g = i4;
        int i5 = i2 * i4;
        this.h = new short[i5];
        this.i = i4;
        this.j = new short[i5];
        this.k = i4;
        this.l = new short[i5];
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
            int i9 = 0;
            for (int i10 = 0; i10 < i2; i10++) {
                short s = sArr[i4 + i10];
                short s2 = sArr[i4 + i2 + i10];
                i9 += s >= s2 ? s - s2 : s2 - s;
            }
            int i11 = i9 * i7;
            int i12 = i6 * i2;
            if (i11 < i12) {
                i6 = i9;
            }
            if (i11 < i12) {
                i7 = i2;
            }
            int i13 = i9 * i5;
            int i14 = i8 * i2;
            if (i13 > i14) {
                i8 = i9;
            }
            if (i13 > i14) {
                i5 = i2;
            }
            i2++;
        }
        this.w = i6 / i7;
        this.x = i8 / i5;
        return i7;
    }

    public final void b(short[] sArr, int i, int i2) {
        int i3 = this.e / i2;
        int i4 = this.b;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            this.f[i7] = (short) (i8 / i5);
        }
    }

    public final void c(int i) {
        int i2 = this.r;
        int i3 = this.i;
        if (i2 + i > i3) {
            int i4 = (i3 / 2) + i + i3;
            this.i = i4;
            this.j = Arrays.copyOf(this.j, i4 * this.b);
        }
    }

    public final void e() {
        int i;
        int i2;
        int iA;
        int i3;
        int i4;
        int i5;
        float f;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11 = this.r;
        float f2 = this.o / this.p;
        double d = f2;
        int i12 = this.a;
        int i13 = this.b;
        if (d > 1.00001d || d < 0.99999d) {
            int i14 = this.q;
            int i15 = this.e;
            if (i14 >= i15) {
                int i16 = 0;
                while (true) {
                    int i17 = this.t;
                    if (i17 > 0) {
                        int iMin = Math.min(i15, i17);
                        short[] sArr = this.h;
                        c(iMin);
                        System.arraycopy(sArr, i16 * i13, this.j, this.r * i13, i13 * iMin);
                        this.r += iMin;
                        this.t -= iMin;
                        i16 += iMin;
                        i2 = i11;
                        i = i12;
                    } else {
                        short[] sArr2 = this.h;
                        int i18 = i12 > 4000 ? i12 / 4000 : 1;
                        int i19 = this.d;
                        int i20 = this.c;
                        if (i13 == 1 && i18 == 1) {
                            iA = a(sArr2, i16, i20, i19);
                            i2 = i11;
                            i = i12;
                        } else {
                            b(sArr2, i16, i18);
                            i = i12;
                            short[] sArr3 = this.f;
                            i2 = i11;
                            int iA2 = a(sArr3, 0, i20 / i18, i19 / i18);
                            if (i18 != 1) {
                                int i21 = iA2 * i18;
                                int i22 = i18 * 4;
                                int i23 = i21 - i22;
                                int i24 = i21 + i22;
                                if (i23 >= i20) {
                                    i20 = i23;
                                }
                                if (i24 <= i19) {
                                    i19 = i24;
                                }
                                if (i13 == 1) {
                                    iA = a(sArr2, i16, i20, i19);
                                } else {
                                    b(sArr2, i16, 1);
                                    iA = a(sArr3, 0, i20, i19);
                                }
                            } else {
                                iA = iA2;
                            }
                        }
                        int i25 = this.w;
                        int i26 = this.x;
                        if (i25 == 0 || (i3 = this.u) == 0 || i26 > i25 * 3 || i25 + i25 <= this.v * 3) {
                            i3 = iA;
                        }
                        this.v = i25;
                        this.u = iA;
                        if (d > 1.0d) {
                            short[] sArr4 = this.h;
                            if (f2 >= 2.0f) {
                                i5 = (int) (i3 / ((-1.0f) + f2));
                            } else {
                                this.t = (int) (((2.0f - f2) * i3) / ((-1.0f) + f2));
                                i5 = i3;
                            }
                            c(i5);
                            int i27 = i16;
                            d(i5, this.b, this.j, this.r, sArr4, i27, sArr4, i16 + i3);
                            this.r += i5;
                            i16 = i3 + i5 + i27;
                        } else {
                            int i28 = i16;
                            short[] sArr5 = this.h;
                            if (f2 < 0.5f) {
                                i4 = (int) ((i3 * f2) / (1.0f - f2));
                            } else {
                                this.t = (int) ((((f2 + f2) - 1.0f) * i3) / (1.0f - f2));
                                i4 = i3;
                            }
                            int i29 = i3 + i4;
                            c(i29);
                            System.arraycopy(sArr5, i28 * i13, this.j, this.r * i13, i3 * i13);
                            d(i4, this.b, this.j, this.r + i3, sArr5, i28 + i3, sArr5, i28);
                            this.r += i29;
                            i16 = i28 + i4;
                        }
                    }
                    if (i16 + i15 > i14) {
                        break;
                    }
                    i12 = i;
                    i11 = i2;
                }
                int i30 = this.q - i16;
                short[] sArr6 = this.h;
                System.arraycopy(sArr6, i16 * i13, sArr6, 0, i30 * i13);
                this.q = i30;
            }
            f = this.p;
            if (f != 1.0f || this.r == (i6 = i2)) {
            }
            int i31 = i;
            int i32 = (int) (i31 / f);
            while (true) {
                if (i32 <= 16384 && i31 <= 16384) {
                    break;
                }
                i32 /= 2;
                i31 /= 2;
            }
            int i33 = this.r - i6;
            int i34 = this.s;
            int i35 = this.k;
            if (i34 + i33 > i35) {
                int i36 = (i35 / 2) + i33 + i35;
                this.k = i36;
                this.l = Arrays.copyOf(this.l, i36 * i13);
            }
            System.arraycopy(this.j, i6 * i13, this.l, this.s * i13, i33 * i13);
            this.r = i6;
            this.s += i33;
            int i37 = 0;
            while (true) {
                i7 = this.s;
                i8 = i7 - 1;
                if (i37 >= i8) {
                    break;
                }
                while (true) {
                    i9 = this.m + 1;
                    i10 = this.n;
                    if (i9 * i32 <= i10 * i31) {
                        break;
                    }
                    c(1);
                    for (int i38 = 0; i38 < i13; i38++) {
                        short[] sArr7 = this.j;
                        int i39 = this.r;
                        short[] sArr8 = this.l;
                        int i40 = (i37 * i13) + i38;
                        short s = sArr8[i40];
                        short s2 = sArr8[i40 + i13];
                        int i41 = this.n;
                        int i42 = this.m;
                        int i43 = (i42 + 1) * i32;
                        int i44 = i43 - (i41 * i31);
                        int i45 = i43 - (i42 * i32);
                        sArr7[(i39 * i13) + i38] = (short) ((((i45 - i44) * s2) + (s * i44)) / i45);
                    }
                    this.n++;
                    this.r++;
                }
                this.m = i9;
                if (i9 == i31) {
                    this.m = 0;
                    zzazy.zze(i10 == i32);
                    this.n = 0;
                }
                i37++;
            }
            if (i8 != 0) {
                short[] sArr9 = this.l;
                System.arraycopy(sArr9, i8 * i13, sArr9, 0, (i7 - i8) * i13);
                this.s -= i8;
                return;
            }
            return;
        }
        short[] sArr10 = this.h;
        int i46 = this.q;
        c(i46);
        System.arraycopy(sArr10, 0 * i13, this.j, this.r * i13, i13 * i46);
        this.r += i46;
        this.q = 0;
        i2 = i11;
        i = i12;
        f = this.p;
        if (f != 1.0f) {
        }
    }
}
