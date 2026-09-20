package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class kq4 {
    public boolean a;
    public float e;
    public int i;
    public int b = -1;
    public int c = -1;
    public int d = 0;
    public boolean f = false;
    public final float[] g = new float[9];
    public final float[] h = new float[9];
    public Cpj[] j = new Cpj[16];
    public int k = 0;
    public int l = 0;

    public kq4(int i) {
        this.i = i;
    }

    public final void a(Cpj cpj) {
        int i = 0;
        while (true) {
            int i2 = this.k;
            if (i >= i2) {
                Cpj[] cpjArr = this.j;
                if (i2 >= cpjArr.length) {
                    this.j = (Cpj[]) Arrays.copyOf(cpjArr, cpjArr.length * 2);
                }
                Cpj[] cpjArr2 = this.j;
                int i3 = this.k;
                cpjArr2[i3] = cpj;
                this.k = i3 + 1;
                return;
            }
            if (this.j[i] == cpj) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void b(Cpj cpj) {
        int i = this.k;
        int i2 = 0;
        while (i2 < i) {
            if (this.j[i2] == cpj) {
                while (i2 < i - 1) {
                    Cpj[] cpjArr = this.j;
                    int i3 = i2 + 1;
                    cpjArr[i2] = cpjArr[i3];
                    i2 = i3;
                }
                this.k--;
                return;
            }
            i2++;
        }
    }

    public final void c() {
        this.i = 5;
        this.d = 0;
        this.b = -1;
        this.c = -1;
        this.e = 0.0f;
        this.f = false;
        int i = this.k;
        for (int i2 = 0; i2 < i; i2++) {
            this.j[i2] = null;
        }
        this.k = 0;
        this.l = 0;
        this.a = false;
        Arrays.fill(this.h, 0.0f);
    }

    public final void d(Cpj cpj) {
        int i = this.k;
        for (int i2 = 0; i2 < i; i2++) {
            this.j[i2].h(cpj, false);
        }
        this.k = 0;
    }

    public final String toString() {
        return "" + this.b;
    }
}
