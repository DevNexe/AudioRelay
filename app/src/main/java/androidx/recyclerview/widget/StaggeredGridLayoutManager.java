package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import defpackage.UT;
import defpackage.bi5;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.PRnFixed implements RecyclerView.SjP.CQf {
    public final LPt8Fixed B;
    public final int C;
    public boolean D;
    public boolean E;
    public NUlFixed F;
    public final Rect G;
    public final CQf H;
    public final boolean I;
    public int[] J;
    public final QnHx K;
    public int p;
    public YKK[] q;
    public LPt9Fixed r;
    public LPt9Fixed s;
    public int t;
    public int u;
    public final RBi v;
    public boolean w;
    public BitSet y;
    public boolean x = false;
    public int z = -1;
    public int A = Integer.MIN_VALUE;

    public class CQf {
        public int a;
        public int b;
        public boolean c;
        public boolean d;
        public boolean e;
        public int[] f;

        public CQf() {
            a();
        }

        public final void a() {
            this.a = -1;
            this.b = Integer.MIN_VALUE;
            this.c = false;
            this.d = false;
            this.e = false;
            int[] iArr = this.f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }
    }

    public static class F1 extends RecyclerView.y {
        public YKK e;

        public F1(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public F1(int i, int i2) {
            super(i, i2);
        }

        public F1(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public F1(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class NUlFixed implements Parcelable {
        public static final Parcelable.Creator<NUlFixed> CREATOR = new QnHx();
        public int A;
        public int[] B;
        public List<LPt8Fixed.QnHx> C;
        public boolean D;
        public boolean E;
        public boolean F;
        public int w;
        public int x;
        public int y;
        public int[] z;

        public static class QnHx implements Parcelable.Creator<NUlFixed> {
            @Override // android.os.Parcelable.Creator
            public final NUlFixed createFromParcel(Parcel parcel) {
                return new NUlFixed(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final NUlFixed[] newArray(int i) {
                return new NUlFixed[i];
            }
        }

        public NUlFixed() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.w);
            parcel.writeInt(this.x);
            parcel.writeInt(this.y);
            if (this.y > 0) {
                parcel.writeIntArray(this.z);
            }
            parcel.writeInt(this.A);
            if (this.A > 0) {
                parcel.writeIntArray(this.B);
            }
            parcel.writeInt(this.D ? 1 : 0);
            parcel.writeInt(this.E ? 1 : 0);
            parcel.writeInt(this.F ? 1 : 0);
            parcel.writeList(this.C);
        }

        public NUlFixed(Parcel parcel) {
            this.w = parcel.readInt();
            this.x = parcel.readInt();
            int i = parcel.readInt();
            this.y = i;
            if (i > 0) {
                int[] iArr = new int[i];
                this.z = iArr;
                parcel.readIntArray(iArr);
            }
            int i2 = parcel.readInt();
            this.A = i2;
            if (i2 > 0) {
                int[] iArr2 = new int[i2];
                this.B = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.D = parcel.readInt() == 1;
            this.E = parcel.readInt() == 1;
            this.F = parcel.readInt() == 1;
            this.C = parcel.readArrayList(LPt8Fixed.QnHx.class.getClassLoader());
        }

        public NUlFixed(NUlFixed nUl) {
            this.y = nUl.y;
            this.w = nUl.w;
            this.x = nUl.x;
            this.z = nUl.z;
            this.A = nUl.A;
            this.B = nUl.B;
            this.D = nUl.D;
            this.E = nUl.E;
            this.F = nUl.F;
            this.C = nUl.C;
        }
    }

    public class QnHx implements Runnable {
        public QnHx() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            StaggeredGridLayoutManager.this.w0();
        }
    }

    public class YKK {
        public final ArrayList<View> a = new ArrayList<>();
        public int b = Integer.MIN_VALUE;
        public int c = Integer.MIN_VALUE;
        public int d = 0;
        public final int e;

        public YKK(int i) {
            this.e = i;
        }

        public static F1 h(View view) {
            return (F1) view.getLayoutParams();
        }

        public final void a() {
            ArrayList<View> arrayList = this.a;
            View view = arrayList.get(arrayList.size() - 1);
            F1 f1H = h(view);
            this.c = StaggeredGridLayoutManager.this.r.b(view);
            f1H.getClass();
        }

        public final void b() {
            this.a.clear();
            this.b = Integer.MIN_VALUE;
            this.c = Integer.MIN_VALUE;
            this.d = 0;
        }

        public final int c() {
            boolean z = StaggeredGridLayoutManager.this.w;
            ArrayList<View> arrayList = this.a;
            return z ? e(arrayList.size() - 1, -1) : e(0, arrayList.size());
        }

        public final int d() {
            boolean z = StaggeredGridLayoutManager.this.w;
            ArrayList<View> arrayList = this.a;
            return z ? e(0, arrayList.size()) : e(arrayList.size() - 1, -1);
        }

        public final int e(int i, int i2) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
            int iK = staggeredGridLayoutManager.r.k();
            int iG = staggeredGridLayoutManager.r.g();
            int i3 = i2 > i ? 1 : -1;
            while (i != i2) {
                View view = this.a.get(i);
                int iE = staggeredGridLayoutManager.r.e(view);
                int iB = staggeredGridLayoutManager.r.b(view);
                boolean z = iE <= iG;
                boolean z2 = iB >= iK;
                if (z && z2 && (iE < iK || iB > iG)) {
                    return RecyclerView.PRnFixed.D(view);
                }
                i += i3;
            }
            return -1;
        }

        public final int f(int i) {
            int i2 = this.c;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.a.size() == 0) {
                return i;
            }
            a();
            return this.c;
        }

        public final View g(int i, int i2) {
            ArrayList<View> arrayList = this.a;
            StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
            View view = null;
            if (i2 != -1) {
                int size = arrayList.size() - 1;
                while (size >= 0) {
                    View view2 = arrayList.get(size);
                    if ((staggeredGridLayoutManager.w && RecyclerView.PRnFixed.D(view2) >= i) || ((!staggeredGridLayoutManager.w && RecyclerView.PRnFixed.D(view2) <= i) || !view2.hasFocusable())) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = arrayList.size();
                int i3 = 0;
                while (i3 < size2) {
                    View view3 = arrayList.get(i3);
                    if ((staggeredGridLayoutManager.w && RecyclerView.PRnFixed.D(view3) <= i) || ((!staggeredGridLayoutManager.w && RecyclerView.PRnFixed.D(view3) >= i) || !view3.hasFocusable())) {
                        break;
                    }
                    i3++;
                    view = view3;
                }
            }
            return view;
        }

        public final int i(int i) {
            int i2 = this.b;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            ArrayList<View> arrayList = this.a;
            if (arrayList.size() == 0) {
                return i;
            }
            View view = arrayList.get(0);
            F1 f1H = h(view);
            this.b = StaggeredGridLayoutManager.this.r.e(view);
            f1H.getClass();
            return this.b;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.p = -1;
        this.w = false;
        LPt8Fixed lPt8 = new LPt8Fixed();
        this.B = lPt8;
        this.C = 2;
        this.G = new Rect();
        this.H = new CQf();
        this.I = true;
        this.K = new QnHx();
        RecyclerView.PRnFixed.LPt8Fixed lPt8E = RecyclerView.PRnFixed.E(context, attributeSet, i, i2);
        int i3 = lPt8E.a;
        if (i3 != 0 && i3 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        c(null);
        if (i3 != this.t) {
            this.t = i3;
            LPt9Fixed lPt9 = this.r;
            this.r = this.s;
            this.s = lPt9;
            g0();
        }
        int i4 = lPt8E.b;
        c(null);
        if (i4 != this.p) {
            int[] iArr = lPt8.a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            lPt8.b = null;
            g0();
            this.p = i4;
            this.y = new BitSet(this.p);
            this.q = new YKK[this.p];
            for (int i5 = 0; i5 < this.p; i5++) {
                this.q[i5] = new YKK(i5);
            }
            g0();
        }
        boolean z = lPt8E.c;
        c(null);
        NUlFixed nUl = this.F;
        if (nUl != null && nUl.D != z) {
            nUl.D = z;
        }
        this.w = z;
        g0();
        this.v = new RBi();
        this.r = LPt9Fixed.a(this, this.t);
        this.s = LPt9Fixed.a(this, 1 - this.t);
    }

    public static int Y0(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v19 */
    public final int A0(RecyclerView.ta taVar, RBi rBi, RecyclerView.Aa aa) {
        YKK ykk;
        ?? r8;
        int i;
        int iC;
        int iK;
        int iC2;
        int i2;
        int i3;
        int i4;
        int i5 = 1;
        this.y.set(0, this.p, true);
        RBi rBi2 = this.v;
        int i6 = rBi2.i ? rBi.e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : rBi.e == 1 ? rBi.g + rBi.b : rBi.f - rBi.b;
        int i7 = rBi.e;
        for (int i8 = 0; i8 < this.p; i8++) {
            if (!this.q[i8].a.isEmpty()) {
                X0(this.q[i8], i7, i6);
            }
        }
        int iG = this.x ? this.r.g() : this.r.k();
        boolean z = false;
        while (true) {
            int i9 = rBi.c;
            if (!(i9 >= 0 && i9 < aa.b()) || (!rBi2.i && this.y.isEmpty())) {
                break;
            }
            View view = taVar.i(rBi.c, Long.MAX_VALUE).a;
            rBi.c += rBi.d;
            F1 f1 = (F1) view.getLayoutParams();
            int iA = f1.a();
            LPt8Fixed lPt8 = this.B;
            int[] iArr = lPt8.a;
            int i10 = (iArr == null || iA >= iArr.length) ? -1 : iArr[iA];
            if (i10 == -1) {
                if (O0(rBi.e)) {
                    i3 = this.p - i5;
                    i2 = -1;
                    i4 = -1;
                } else {
                    i2 = this.p;
                    i3 = 0;
                    i4 = 1;
                }
                YKK ykk2 = null;
                if (rBi.e == i5) {
                    int iK2 = this.r.k();
                    int i11 = Integer.MAX_VALUE;
                    while (i3 != i2) {
                        YKK ykk3 = this.q[i3];
                        int iF = ykk3.f(iK2);
                        if (iF < i11) {
                            i11 = iF;
                            ykk2 = ykk3;
                        }
                        i3 += i4;
                    }
                } else {
                    int iG2 = this.r.g();
                    int i12 = Integer.MIN_VALUE;
                    while (i3 != i2) {
                        YKK ykk4 = this.q[i3];
                        int i13 = ykk4.i(iG2);
                        if (i13 > i12) {
                            ykk2 = ykk4;
                            i12 = i13;
                        }
                        i3 += i4;
                    }
                }
                ykk = ykk2;
                lPt8.a(iA);
                lPt8.a[iA] = ykk.e;
            } else {
                ykk = this.q[i10];
            }
            f1.e = ykk;
            if (rBi.e == 1) {
                r8 = 0;
                b(view, -1, false);
            } else {
                r8 = 0;
                b(view, 0, false);
            }
            if (this.t == 1) {
                M0(view, RecyclerView.PRnFixed.w(r8, this.u, this.l, r8, ((ViewGroup.MarginLayoutParams) f1).width), RecyclerView.PRnFixed.w(true, this.o, this.m, z() + C(), ((ViewGroup.MarginLayoutParams) f1).height), r8);
            } else {
                M0(view, RecyclerView.PRnFixed.w(true, this.n, this.l, B() + A(), ((ViewGroup.MarginLayoutParams) f1).width), RecyclerView.PRnFixed.w(false, this.u, this.m, 0, ((ViewGroup.MarginLayoutParams) f1).height), false);
            }
            if (rBi.e == 1) {
                iC = ykk.f(iG);
                i = this.r.c(view) + iC;
            } else {
                i = ykk.i(iG);
                iC = i - this.r.c(view);
            }
            if (rBi.e == 1) {
                YKK ykk5 = f1.e;
                ykk5.getClass();
                F1 f2 = (F1) view.getLayoutParams();
                f2.e = ykk5;
                ArrayList<View> arrayList = ykk5.a;
                arrayList.add(view);
                ykk5.c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    ykk5.b = Integer.MIN_VALUE;
                }
                if (f2.c() || f2.b()) {
                    ykk5.d = StaggeredGridLayoutManager.this.r.c(view) + ykk5.d;
                }
            } else {
                YKK ykk6 = f1.e;
                ykk6.getClass();
                F1 f3 = (F1) view.getLayoutParams();
                f3.e = ykk6;
                ArrayList<View> arrayList2 = ykk6.a;
                arrayList2.add(0, view);
                ykk6.b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    ykk6.c = Integer.MIN_VALUE;
                }
                if (f3.c() || f3.b()) {
                    ykk6.d = StaggeredGridLayoutManager.this.r.c(view) + ykk6.d;
                }
            }
            if (L0() && this.t == 1) {
                iC2 = this.s.g() - (((this.p - 1) - ykk.e) * this.u);
                iK = iC2 - this.s.c(view);
            } else {
                iK = this.s.k() + (ykk.e * this.u);
                iC2 = this.s.c(view) + iK;
            }
            if (this.t == 1) {
                RecyclerView.PRnFixed.J(view, iK, iC, iC2, i);
            } else {
                RecyclerView.PRnFixed.J(view, iC, iK, i, iC2);
            }
            X0(ykk, rBi2.e, i6);
            Q0(taVar, rBi2);
            if (rBi2.h && view.hasFocusable()) {
                this.y.set(ykk.e, false);
            }
            i5 = 1;
            z = true;
        }
        if (!z) {
            Q0(taVar, rBi2);
        }
        int iK3 = rBi2.e == -1 ? this.r.k() - I0(this.r.k()) : H0(this.r.g()) - this.r.g();
        if (iK3 > 0) {
            return Math.min(rBi.b, iK3);
        }
        return 0;
    }

    public final View B0(boolean z) {
        int iK = this.r.k();
        int iG = this.r.g();
        View view = null;
        for (int iV = v() - 1; iV >= 0; iV--) {
            View viewU = u(iV);
            int iE = this.r.e(viewU);
            int iB = this.r.b(viewU);
            if (iB > iK && iE < iG) {
                if (iB <= iG || !z) {
                    return viewU;
                }
                if (view == null) {
                    view = viewU;
                }
            }
        }
        return view;
    }

    public final View C0(boolean z) {
        int iK = this.r.k();
        int iG = this.r.g();
        int iV = v();
        View view = null;
        for (int i = 0; i < iV; i++) {
            View viewU = u(i);
            int iE = this.r.e(viewU);
            if (this.r.b(viewU) > iK && iE < iG) {
                if (iE >= iK || !z) {
                    return viewU;
                }
                if (view == null) {
                    view = viewU;
                }
            }
        }
        return view;
    }

    public final void D0(RecyclerView.ta taVar, RecyclerView.Aa aa, boolean z) {
        int iG;
        int iH0 = H0(Integer.MIN_VALUE);
        if (iH0 != Integer.MIN_VALUE && (iG = this.r.g() - iH0) > 0) {
            int i = iG - (-U0(-iG, taVar, aa));
            if (!z || i <= 0) {
                return;
            }
            this.r.o(i);
        }
    }

    public final void E0(RecyclerView.ta taVar, RecyclerView.Aa aa, boolean z) {
        int iK;
        int iI0 = I0(Integer.MAX_VALUE);
        if (iI0 != Integer.MAX_VALUE && (iK = iI0 - this.r.k()) > 0) {
            int iU0 = iK - U0(iK, taVar, aa);
            if (!z || iU0 <= 0) {
                return;
            }
            this.r.o(-iU0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.PRnFixed
    public final int F(RecyclerView.ta taVar, RecyclerView.Aa aa) {
        return this.t == 0 ? this.p : super.F(taVar, aa);
    }

    public final int F0() {
        if (v() == 0) {
            return 0;
        }
        return RecyclerView.PRnFixed.D(u(0));
    }

    public final int G0() {
        int iV = v();
        if (iV == 0) {
            return 0;
        }
        return RecyclerView.PRnFixed.D(u(iV - 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.PRnFixed
    public final boolean H() {
        return this.C != 0;
    }

    public final int H0(int i) {
        int iF = this.q[0].f(i);
        for (int i2 = 1; i2 < this.p; i2++) {
            int iF2 = this.q[i2].f(i);
            if (iF2 > iF) {
                iF = iF2;
            }
        }
        return iF;
    }

    public final int I0(int i) {
        int i2 = this.q[0].i(i);
        for (int i3 = 1; i3 < this.p; i3++) {
            int i4 = this.q[i3].i(i);
            if (i4 < i2) {
                i2 = i4;
            }
        }
        return i2;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0025  */
    /* JADX WARN: Code duplicated, block: B:17:0x0028 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x002b  */
    /* JADX WARN: Code duplicated, block: B:20:0x0032  */
    /* JADX WARN: Code duplicated, block: B:21:0x0036  */
    /* JADX WARN: Code duplicated, block: B:23:0x003b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x003c  */
    /* JADX WARN: Code duplicated, block: B:26:0x0040  */
    /* JADX WARN: Code duplicated, block: B:27:0x0045  */
    /* JADX WARN: Code duplicated, block: B:29:0x004b  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    public final void J0(int i, int i2, int i3) {
        int i4;
        int i5;
        LPt8Fixed lPt8;
        int iG0;
        int iG1 = this.x ? G0() : F0();
        if (i3 == 8) {
            if (i < i2) {
                i4 = i2 + 1;
            } else {
                i4 = i + 1;
                i5 = i2;
            }
            lPt8 = this.B;
            lPt8.b(i5);
            if (i3 != 1) {
                lPt8.c(i, i2);
            } else if (i3 != 2) {
                lPt8.d(i, i2);
            } else if (i3 == 8) {
                lPt8.d(i, 1);
                lPt8.c(i2, 1);
            }
            if (i4 <= iG1) {
                return;
            }
            if (this.x) {
                iG0 = F0();
            } else {
                iG0 = G0();
            }
            if (i5 <= iG0) {
                g0();
            }
        }
        i4 = i + i2;
        i5 = i;
        lPt8 = this.B;
        lPt8.b(i5);
        if (i3 != 1) {
            lPt8.c(i, i2);
        } else if (i3 != 2) {
            lPt8.d(i, i2);
        } else if (i3 == 8) {
            lPt8.d(i, 1);
            lPt8.c(i2, 1);
        }
        if (i4 <= iG1) {
            return;
        }
        if (this.x) {
            iG0 = F0();
        } else {
            iG0 = G0();
        }
        if (i5 <= iG0) {
            g0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.PRnFixed
    public final void K(int i) {
        super.K(i);
        for (int i2 = 0; i2 < this.p; i2++) {
            YKK ykk = this.q[i2];
            int i3 = ykk.b;
            if (i3 != Integer.MIN_VALUE) {
                ykk.b = i3 + i;
            }
            int i4 = ykk.c;
            if (i4 != Integer.MIN_VALUE) {
                ykk.c = i4 + i;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e7  */
    public final View K0() {
        int i;
        boolean z;
        boolean z2;
        int iV = v() - 1;
        BitSet bitSet = new BitSet(this.p);
        bitSet.set(0, this.p, true);
        byte b = (this.t == 1 && L0()) ? (byte) 1 : (byte) -1;
        if (this.x) {
            i = -1;
        } else {
            i = iV + 1;
            iV = 0;
        }
        int i2 = iV < i ? 1 : -1;
        while (iV != i) {
            View viewU = u(iV);
            F1 f1 = (F1) viewU.getLayoutParams();
            if (bitSet.get(f1.e.e)) {
                YKK ykk = f1.e;
                if (this.x) {
                    int i3 = ykk.c;
                    if (i3 == Integer.MIN_VALUE) {
                        ykk.a();
                        i3 = ykk.c;
                    }
                    if (i3 < this.r.g()) {
                        ArrayList<View> arrayList = ykk.a;
                        YKK.h(arrayList.get(arrayList.size() - 1)).getClass();
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } else {
                    int i4 = ykk.b;
                    if (i4 == Integer.MIN_VALUE) {
                        View view = ykk.a.get(0);
                        F1 f1H = YKK.h(view);
                        ykk.b = StaggeredGridLayoutManager.this.r.e(view);
                        f1H.getClass();
                        i4 = ykk.b;
                    }
                    if (i4 > this.r.k()) {
                        YKK.h(ykk.a.get(0)).getClass();
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    return viewU;
                }
                bitSet.clear(f1.e.e);
            }
            iV += i2;
            if (iV != i) {
                View viewU2 = u(iV);
                if (this.x) {
                    int iB = this.r.b(viewU);
                    int iB2 = this.r.b(viewU2);
                    if (iB < iB2) {
                        return viewU;
                    }
                    if (iB == iB2) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    int iE = this.r.e(viewU);
                    int iE2 = this.r.e(viewU2);
                    if (iE > iE2) {
                        return viewU;
                    }
                    if (iE == iE2) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    if ((f1.e.e - ((F1) viewU2.getLayoutParams()).e.e < 0) != (b < 0)) {
                        return viewU;
                    }
                } else {
                    continue;
                }
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.PRnFixed
    public final void L(int i) {
        super.L(i);
        for (int i2 = 0; i2 < this.p; i2++) {
            YKK ykk = this.q[i2];
            int i3 = ykk.b;
            if (i3 != Integer.MIN_VALUE) {
                ykk.b = i3 + i;
            }
            int i4 = ykk.c;
            if (i4 != Integer.MIN_VALUE) {
                ykk.c = i4 + i;
            }
        }
    }

    public final boolean L0() {
        RecyclerView recyclerView = this.b;
        Field field = bi5.a;
        return bi5.NUlFixed.d(recyclerView) == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.PRnFixed
    public final void M(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.K);
        }
        for (int i = 0; i < this.p; i++) {
            this.q[i].b();
        }
        recyclerView.requestLayout();
    }

    public final void M0(View view, int i, int i2, boolean z) {
        RecyclerView recyclerView = this.b;
        Rect rect = this.G;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.I(view));
        }
        F1 f1 = (F1) view.getLayoutParams();
        int iY0 = Y0(i, ((ViewGroup.MarginLayoutParams) f1).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) f1).rightMargin + rect.right);
        int iY1 = Y0(i2, ((ViewGroup.MarginLayoutParams) f1).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) f1).bottomMargin + rect.bottom);
        if (p0(view, iY0, iY1, f1)) {
            view.measure(iY0, iY1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x006c  */
    /* JADX WARN: Code duplicated, block: B:54:0x006e  */
    @Override // androidx.recyclerview.widget.RecyclerView.PRnFixed
    public final View N(View view, int i, RecyclerView.ta taVar, RecyclerView.Aa aa) {
        View viewZ;
        int i2;
        if (v() == 0) {
            return null;
        }
        RecyclerView recyclerView = this.b;
        if (recyclerView == null || (viewZ = recyclerView.z(view)) == null || this.a.j(viewZ)) {
            viewZ = null;
        }
        if (viewZ == null) {
            return null;
        }
        T0();
        if (i != 1) {
            if (i != 2) {
                if (i != 17) {
                    if (i != 33) {
                        if (i == 66 ? this.t == 0 : !(i != 130 || this.t != 1)) {
                            i2 = 1;
                        }
                    } else if (this.t == 1) {
                        i2 = -1;
                    }
                    i2 = Integer.MIN_VALUE;
                } else if (this.t == 0) {
                    i2 = -1;
                } else {
                    i2 = Integer.MIN_VALUE;
                }
            } else if (this.t != 1 && L0()) {
                i2 = -1;
            } else {
                i2 = 1;
            }
        } else if (this.t != 1 && L0()) {
            i2 = 1;
        } else {
            i2 = -1;
        }
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        F1 f1 = (F1) viewZ.getLayoutParams();
        f1.getClass();
        YKK ykk = f1.e;
        int iG0 = i2 == 1 ? G0() : F0();
        W0(iG0, aa);
        V0(i2);
        RBi rBi = this.v;
        rBi.c = rBi.d + iG0;
        rBi.b = (int) (this.r.l() * 0.33333334f);
        rBi.h = true;
        rBi.a = false;
        A0(taVar, rBi, aa);
        this.D = this.x;
        View viewG = ykk.g(iG0, i2);
        if (viewG != null && viewG != viewZ) {
            return viewG;
        }
        if (O0(i2)) {
            for (int i3 = this.p - 1; i3 >= 0; i3--) {
                View viewG2 = this.q[i3].g(iG0, i2);
                if (viewG2 != null && viewG2 != viewZ) {
                    return viewG2;
                }
            }
        } else {
            for (int i4 = 0; i4 < this.p; i4++) {
                View viewG3 = this.q[i4].g(iG0, i2);
                if (viewG3 != null && viewG3 != viewZ) {
                    return viewG3;
                }
            }
        }
        boolean z = (this.w ^ true) == (i2 == -1);
        View viewQ = q(z ? ykk.c() : ykk.d());
        if (viewQ != null && viewQ != viewZ) {
            return viewQ;
        }
        if (O0(i2)) {
            for (int i5 = this.p - 1; i5 >= 0; i5--) {
                if (i5 != ykk.e) {
                    View viewQ2 = q(z ? this.q[i5].c() : this.q[i5].d());
                    if (viewQ2 != null && viewQ2 != viewZ) {
                        return viewQ2;
                    }
                }
            }
        } else {
            for (int i6 = 0; i6 < this.p; i6++) {
                View viewQ3 = q(z ? this.q[i6].c() : this.q[i6].d());
                if (viewQ3 != null && viewQ3 != viewZ) {
                    return viewQ3;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:256:0x0415  */
    public final void N0(RecyclerView.ta taVar, RecyclerView.Aa aa, boolean z) {
        boolean z2;
        NUlFixed nUl;
        boolean z3;
        int iD;
        int i;
        NUlFixed nUl2 = this.F;
        CQf cQf = this.H;
        if (!(nUl2 == null && this.z == -1) && aa.b() == 0) {
            b0(taVar);
            cQf.a();
            return;
        }
        boolean z4 = (cQf.e && this.z == -1 && this.F == null) ? false : true;
        StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
        LPt8Fixed lPt8 = this.B;
        if (z4) {
            cQf.a();
            NUlFixed nUl3 = this.F;
            if (nUl3 != null) {
                int i2 = nUl3.y;
                if (i2 > 0) {
                    if (i2 == this.p) {
                        for (int i3 = 0; i3 < this.p; i3++) {
                            this.q[i3].b();
                            NUlFixed nUl4 = this.F;
                            int iG = nUl4.z[i3];
                            if (iG != Integer.MIN_VALUE) {
                                iG += nUl4.E ? this.r.g() : this.r.k();
                            }
                            YKK ykk = this.q[i3];
                            ykk.b = iG;
                            ykk.c = iG;
                        }
                    } else {
                        nUl3.z = null;
                        nUl3.y = 0;
                        nUl3.A = 0;
                        nUl3.B = null;
                        nUl3.C = null;
                        nUl3.w = nUl3.x;
                    }
                }
                NUlFixed nUl5 = this.F;
                this.E = nUl5.F;
                boolean z5 = nUl5.D;
                c(null);
                NUlFixed nUl6 = this.F;
                if (nUl6 != null && nUl6.D != z5) {
                    nUl6.D = z5;
                }
                this.w = z5;
                g0();
                T0();
                NUlFixed nUl7 = this.F;
                int i4 = nUl7.w;
                if (i4 != -1) {
                    this.z = i4;
                    cQf.c = nUl7.E;
                } else {
                    cQf.c = this.x;
                }
                if (nUl7.A > 1) {
                    lPt8.a = nUl7.B;
                    lPt8.b = nUl7.C;
                }
            } else {
                T0();
                cQf.c = this.x;
            }
            if (aa.g || (i = this.z) == -1) {
                z3 = false;
            } else if (i < 0 || i >= aa.b()) {
                this.z = -1;
                this.A = Integer.MIN_VALUE;
                z3 = false;
            } else {
                NUlFixed nUl8 = this.F;
                if (nUl8 == null || nUl8.w == -1 || nUl8.y < 1) {
                    View viewQ = q(this.z);
                    if (viewQ != null) {
                        cQf.a = this.x ? G0() : F0();
                        if (this.A != Integer.MIN_VALUE) {
                            if (cQf.c) {
                                cQf.b = (this.r.g() - this.A) - this.r.b(viewQ);
                            } else {
                                cQf.b = (this.r.k() + this.A) - this.r.e(viewQ);
                            }
                        } else if (this.r.c(viewQ) > this.r.l()) {
                            cQf.b = cQf.c ? this.r.g() : this.r.k();
                        } else {
                            int iE = this.r.e(viewQ) - this.r.k();
                            if (iE < 0) {
                                cQf.b = -iE;
                            } else {
                                int iG2 = this.r.g() - this.r.b(viewQ);
                                if (iG2 < 0) {
                                    cQf.b = iG2;
                                } else {
                                    cQf.b = Integer.MIN_VALUE;
                                }
                            }
                        }
                    } else {
                        int i5 = this.z;
                        cQf.a = i5;
                        int i6 = this.A;
                        if (i6 == Integer.MIN_VALUE) {
                            boolean z6 = v0(i5) == 1;
                            cQf.c = z6;
                            cQf.b = z6 ? staggeredGridLayoutManager.r.g() : staggeredGridLayoutManager.r.k();
                        } else if (cQf.c) {
                            cQf.b = staggeredGridLayoutManager.r.g() - i6;
                        } else {
                            cQf.b = staggeredGridLayoutManager.r.k() + i6;
                        }
                        cQf.d = true;
                    }
                } else {
                    cQf.b = Integer.MIN_VALUE;
                    cQf.a = this.z;
                }
                z3 = true;
            }
            if (!z3) {
                if (this.D) {
                    int iB = aa.b();
                    int iV = v();
                    while (true) {
                        iV--;
                        if (iV < 0) {
                            iD = 0;
                            break;
                        }
                        iD = RecyclerView.PRnFixed.D(u(iV));
                        if (iD >= 0 && iD < iB) {
                            break;
                        }
                    }
                } else {
                    int iB2 = aa.b();
                    int iV2 = v();
                    int i7 = 0;
                    while (true) {
                        if (i7 >= iV2) {
                            iD = 0;
                            break;
                        }
                        int iD2 = RecyclerView.PRnFixed.D(u(i7));
                        if (iD2 >= 0 && iD2 < iB2) {
                            iD = iD2;
                            break;
                        }
                        i7++;
                    }
                }
                cQf.a = iD;
                cQf.b = Integer.MIN_VALUE;
            }
            cQf.e = true;
        }
        if (this.F == null && this.z == -1 && (cQf.c != this.D || L0() != this.E)) {
            int[] iArr = lPt8.a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            lPt8.b = null;
            cQf.d = true;
        }
        if (v() > 0 && ((nUl = this.F) == null || nUl.y < 1)) {
            if (cQf.d) {
                for (int i8 = 0; i8 < this.p; i8++) {
                    this.q[i8].b();
                    int i9 = cQf.b;
                    if (i9 != Integer.MIN_VALUE) {
                        YKK ykk2 = this.q[i8];
                        ykk2.b = i9;
                        ykk2.c = i9;
                    }
                }
            } else if (z4 || cQf.f == null) {
                for (int i10 = 0; i10 < this.p; i10++) {
                    YKK ykk3 = this.q[i10];
                    boolean z7 = this.x;
                    int i11 = cQf.b;
                    int iF = z7 ? ykk3.f(Integer.MIN_VALUE) : ykk3.i(Integer.MIN_VALUE);
                    ykk3.b();
                    if (iF != Integer.MIN_VALUE) {
                        StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                        if ((!z7 || iF >= staggeredGridLayoutManager2.r.g()) && (z7 || iF <= staggeredGridLayoutManager2.r.k())) {
                            if (i11 != Integer.MIN_VALUE) {
                                iF += i11;
                            }
                            ykk3.c = iF;
                            ykk3.b = iF;
                        }
                    }
                }
                YKK[] ykkArr = this.q;
                int length = ykkArr.length;
                int[] iArr2 = cQf.f;
                if (iArr2 == null || iArr2.length < length) {
                    cQf.f = new int[staggeredGridLayoutManager.q.length];
                }
                for (int i12 = 0; i12 < length; i12++) {
                    cQf.f[i12] = ykkArr[i12].i(Integer.MIN_VALUE);
                }
            } else {
                for (int i13 = 0; i13 < this.p; i13++) {
                    YKK ykk4 = this.q[i13];
                    ykk4.b();
                    int i14 = cQf.f[i13];
                    ykk4.b = i14;
                    ykk4.c = i14;
                }
            }
        }
        p(taVar);
        RBi rBi = this.v;
        rBi.a = false;
        int iL = this.s.l();
        this.u = iL / this.p;
        View.MeasureSpec.makeMeasureSpec(iL, this.s.i());
        W0(cQf.a, aa);
        if (cQf.c) {
            V0(-1);
            A0(taVar, rBi, aa);
            V0(1);
            rBi.c = cQf.a + rBi.d;
            A0(taVar, rBi, aa);
        } else {
            V0(1);
            A0(taVar, rBi, aa);
            V0(-1);
            rBi.c = cQf.a + rBi.d;
            A0(taVar, rBi, aa);
        }
        if (this.s.i() != 1073741824) {
            int iV3 = v();
            float fMax = 0.0f;
            for (int i15 = 0; i15 < iV3; i15++) {
                View viewU = u(i15);
                float fC = this.s.c(viewU);
                if (fC >= fMax) {
                    ((F1) viewU.getLayoutParams()).getClass();
                    fMax = Math.max(fMax, fC);
                }
            }
            int i16 = this.u;
            int iRound = Math.round(fMax * this.p);
            if (this.s.i() == Integer.MIN_VALUE) {
                iRound = Math.min(iRound, this.s.l());
            }
            this.u = iRound / this.p;
            View.MeasureSpec.makeMeasureSpec(iRound, this.s.i());
            if (this.u != i16) {
                for (int i17 = 0; i17 < iV3; i17++) {
                    View viewU2 = u(i17);
                    F1 f1 = (F1) viewU2.getLayoutParams();
                    f1.getClass();
                    if (L0() && this.t == 1) {
                        int i18 = this.p;
                        int i19 = f1.e.e;
                        viewU2.offsetLeftAndRight(((-((i18 - 1) - i19)) * this.u) - ((-((i18 - 1) - i19)) * i16));
                    } else {
                        int i20 = f1.e.e;
                        int i21 = this.u * i20;
                        int i22 = i20 * i16;
                        if (this.t == 1) {
                            viewU2.offsetLeftAndRight(i21 - i22);
                        } else {
                            viewU2.offsetTopAndBottom(i21 - i22);
                        }
                    }
                }
            }
        }
        if (v() > 0) {
            if (this.x) {
                D0(taVar, aa, true);
                E0(taVar, aa, false);
            } else {
                E0(taVar, aa, true);
                D0(taVar, aa, false);
            }
        }
        if (z && !aa.g) {
            if ((this.C == 0 || v() <= 0 || K0() == null) ? false : true) {
                RecyclerView recyclerView = this.b;
                if (recyclerView != null) {
                    recyclerView.removeCallbacks(this.K);
                }
                z2 = w0();
            }
        }
        if (aa.g) {
            cQf.a();
        }
        this.D = cQf.c;
        this.E = L0();
        if (z2) {
            cQf.a();
            N0(taVar, aa, false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.PRnFixed
    public final void O(AccessibilityEvent accessibilityEvent) {
        super.O(accessibilityEvent);
        if (v() > 0) {
            View viewC0 = C0(false);
            View viewB0 = B0(false);
            if (viewC0 == null || viewB0 == null) {
                return;
            }
            int iD = RecyclerView.PRnFixed.D(viewC0);
            int iD2 = RecyclerView.PRnFixed.D(viewB0);
            if (iD < iD2) {
                accessibilityEvent.setFromIndex(iD);
                accessibilityEvent.setToIndex(iD2);
            } else {
                accessibilityEvent.setFromIndex(iD2);
                accessibilityEvent.setToIndex(iD);
            }
        }
    }

    public final boolean O0(int i) {
        if (this.t == 0) {
            return (i == -1) != this.x;
        }
        return ((i == -1) == this.x) == L0();
    }

    public final void P0(int i, RecyclerView.Aa aa) {
        int iF0;
        int i2;
        if (i > 0) {
            iF0 = G0();
            i2 = 1;
        } else {
            iF0 = F0();
            i2 = -1;
        }
        RBi rBi = this.v;
        rBi.a = true;
        W0(iF0, aa);
        V0(i2);
        rBi.c = iF0 + rBi.d;
        rBi.b = Math.abs(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.PRnFixed
    public final void Q(RecyclerView.ta taVar, RecyclerView.Aa aa, View view, UT ut) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof F1)) {
            P(view, ut);
            return;
        }
        F1 f1 = (F1) layoutParams;
        if (this.t == 0) {
            YKK ykk = f1.e;
            ut.k(UT.F1.a(ykk == null ? -1 : ykk.e, 1, -1, -1, false));
        } else {
            YKK ykk2 = f1.e;
            ut.k(UT.F1.a(-1, -1, ykk2 == null ? -1 : ykk2.e, 1, false));
        }
    }

    public final void Q0(RecyclerView.ta taVar, RBi rBi) {
        int iMin;
        if (!rBi.a || rBi.i) {
            return;
        }
        if (rBi.b == 0) {
            if (rBi.e == -1) {
                R0(rBi.g, taVar);
                return;
            } else {
                S0(rBi.f, taVar);
                return;
            }
        }
        int i = 1;
        if (rBi.e == -1) {
            int i2 = rBi.f;
            int i3 = this.q[0].i(i2);
            while (i < this.p) {
                int i4 = this.q[i].i(i2);
                if (i4 > i3) {
                    i3 = i4;
                }
                i++;
            }
            int i5 = i2 - i3;
            R0(i5 < 0 ? rBi.g : rBi.g - Math.min(i5, rBi.b), taVar);
            return;
        }
        int i6 = rBi.g;
        int iF = this.q[0].f(i6);
        while (i < this.p) {
            int iF2 = this.q[i].f(i6);
            if (iF2 < iF) {
                iF = iF2;
            }
            i++;
        }
        int i7 = iF - rBi.g;
        if (i7 < 0) {
            iMin = rBi.f;
        } else {
            iMin = Math.min(i7, rBi.b) + rBi.f;
        }
        S0(iMin, taVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.PRnFixed
    public final void R(int i, int i2) {
        J0(i, i2, 1);
    }

    public final void R0(int i, RecyclerView.ta taVar) {
        for (int iV = v() - 1; iV >= 0; iV--) {
            View viewU = u(iV);
            if (this.r.e(viewU) < i || this.r.n(viewU) < i) {
                return;
            }
            F1 f1 = (F1) viewU.getLayoutParams();
            f1.getClass();
            if (f1.e.a.size() == 1) {
                return;
            }
            YKK ykk = f1.e;
            ArrayList<View> arrayList = ykk.a;
            int size = arrayList.size();
            View viewRemove = arrayList.remove(size - 1);
            F1 f1H = YKK.h(viewRemove);
            f1H.e = null;
            if (f1H.c() || f1H.b()) {
                ykk.d -= StaggeredGridLayoutManager.this.r.c(viewRemove);
            }
            if (size == 1) {
                ykk.b = Integer.MIN_VALUE;
            }
            ykk.c = Integer.MIN_VALUE;
            d0(viewU, taVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.PRnFixed
    public final void S() {
        LPt8Fixed lPt8 = this.B;
        int[] iArr = lPt8.a;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        lPt8.b = null;
        g0();
    }

    public final void S0(int i, RecyclerView.ta taVar) {
        while (v() > 0) {
            View viewU = u(0);
            if (this.r.b(viewU) > i || this.r.m(viewU) > i) {
                return;
            }
            F1 f1 = (F1) viewU.getLayoutParams();
            f1.getClass();
            if (f1.e.a.size() == 1) {
                return;
            }
            YKK ykk = f1.e;
            ArrayList<View> arrayList = ykk.a;
            View viewRemove = arrayList.remove(0);
            F1 f1H = YKK.h(viewRemove);
            f1H.e = null;
            if (arrayList.size() == 0) {
                ykk.c = Integer.MIN_VALUE;
            }
            if (f1H.c() || f1H.b()) {
                ykk.d -= StaggeredGridLayoutManager.this.r.c(viewRemove);
            }
            ykk.b = Integer.MIN_VALUE;
            d0(viewU, taVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.PRnFixed
    public final void T(int i, int i2) {
        J0(i, i2, 8);
    }

    public final void T0() {
        if (this.t == 1 || !L0()) {
            this.x = this.w;
        } else {
            this.x = !this.w;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.PRnFixed
    public final void U(int i, int i2) {
        J0(i, i2, 2);
    }

    public final int U0(int i, RecyclerView.ta taVar, RecyclerView.Aa aa) {
        if (v() == 0 || i == 0) {
            return 0;
        }
        P0(i, aa);
        RBi rBi = this.v;
        int iA0 = A0(taVar, rBi, aa);
        if (rBi.b >= iA0) {
            i = i < 0 ? -iA0 : iA0;
        }
        this.r.o(-i);
        this.D = this.x;
        rBi.b = 0;
        Q0(taVar, rBi);
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.PRnFixed
    public final void V(int i, int i2) {
        J0(i, i2, 4);
    }

    public final void V0(int i) {
        RBi rBi = this.v;
        rBi.e = i;
        rBi.d = this.x != (i == -1) ? -1 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.PRnFixed
    public final void W(RecyclerView.ta taVar, RecyclerView.Aa aa) {
        N0(taVar, aa, true);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x003f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0042  */
    /* JADX WARN: Code duplicated, block: B:28:0x0055  */
    public final void W0(int i, RecyclerView.Aa aa) {
        int iL;
        int iL2;
        RecyclerView recyclerView;
        boolean z;
        int i2;
        RBi rBi = this.v;
        boolean z2 = false;
        rBi.b = 0;
        rBi.c = i;
        RecyclerView.SjP sjP = this.e;
        if ((sjP != null && sjP.e) && (i2 = aa.a) != -1) {
            if (this.x == (i2 < i)) {
                iL = this.r.l();
            } else {
                iL2 = this.r.l();
                iL = 0;
            }
            recyclerView = this.b;
            if (recyclerView == null && recyclerView.C) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                rBi.f = this.r.k() - iL2;
                rBi.g = this.r.g() + iL;
            } else {
                rBi.g = this.r.f() + iL;
                rBi.f = -iL2;
            }
            rBi.h = false;
            rBi.a = true;
            if (this.r.i() == 0 && this.r.f() == 0) {
                z2 = true;
            }
            rBi.i = z2;
        }
        iL = 0;
        iL2 = 0;
        recyclerView = this.b;
        if (recyclerView == null) {
            z = false;
        } else {
            z = false;
        }
        if (z) {
            rBi.f = this.r.k() - iL2;
            rBi.g = this.r.g() + iL;
        } else {
            rBi.g = this.r.f() + iL;
            rBi.f = -iL2;
        }
        rBi.h = false;
        rBi.a = true;
        if (this.r.i() == 0) {
            z2 = true;
        }
        rBi.i = z2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.PRnFixed
    public final void X(RecyclerView.Aa aa) {
        this.z = -1;
        this.A = Integer.MIN_VALUE;
        this.F = null;
        this.H.a();
    }

    public final void X0(YKK ykk, int i, int i2) {
        int i3 = ykk.d;
        int i4 = ykk.e;
        if (i != -1) {
            int i5 = ykk.c;
            if (i5 == Integer.MIN_VALUE) {
                ykk.a();
                i5 = ykk.c;
            }
            if (i5 - i3 >= i2) {
                this.y.set(i4, false);
                return;
            }
            return;
        }
        int i6 = ykk.b;
        if (i6 == Integer.MIN_VALUE) {
            View view = ykk.a.get(0);
            F1 f1H = YKK.h(view);
            ykk.b = StaggeredGridLayoutManager.this.r.e(view);
            f1H.getClass();
            i6 = ykk.b;
        }
        if (i6 + i3 <= i2) {
            this.y.set(i4, false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.PRnFixed
    public final void Y(Parcelable parcelable) {
        if (parcelable instanceof NUlFixed) {
            this.F = (NUlFixed) parcelable;
            g0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.PRnFixed
    public final Parcelable Z() {
        int i;
        int iK;
        int[] iArr;
        NUlFixed nUl = this.F;
        if (nUl != null) {
            return new NUlFixed(nUl);
        }
        NUlFixed nUl2 = new NUlFixed();
        nUl2.D = this.w;
        nUl2.E = this.D;
        nUl2.F = this.E;
        LPt8Fixed lPt8 = this.B;
        if (lPt8 == null || (iArr = lPt8.a) == null) {
            nUl2.A = 0;
        } else {
            nUl2.B = iArr;
            nUl2.A = iArr.length;
            nUl2.C = lPt8.b;
        }
        if (v() > 0) {
            nUl2.w = this.D ? G0() : F0();
            View viewB0 = this.x ? B0(true) : C0(true);
            nUl2.x = viewB0 != null ? RecyclerView.PRnFixed.D(viewB0) : -1;
            int i2 = this.p;
            nUl2.y = i2;
            nUl2.z = new int[i2];
            for (int i3 = 0; i3 < this.p; i3++) {
                if (this.D) {
                    i = this.q[i3].f(Integer.MIN_VALUE);
                    if (i != Integer.MIN_VALUE) {
                        iK = this.r.g();
                        i -= iK;
                    }
                } else {
                    i = this.q[i3].i(Integer.MIN_VALUE);
                    if (i != Integer.MIN_VALUE) {
                        iK = this.r.k();
                        i -= iK;
                    }
                }
                nUl2.z[i3] = i;
            }
        } else {
            nUl2.w = -1;
            nUl2.x = -1;
            nUl2.y = 0;
        }
        return nUl2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SjP.CQf
    public final PointF a(int i) {
        int iV0 = v0(i);
        PointF pointF = new PointF();
        if (iV0 == 0) {
            return null;
        }
        if (this.t == 0) {
            pointF.x = iV0;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = iV0;
        }
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.PRnFixed
    public final void a0(int i) {
        if (i == 0) {
            w0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.PRnFixed
    public final void c(String str) {
        if (this.F == null) {
            super.c(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.PRnFixed
    public final boolean d() {
        return this.t == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.PRnFixed
    public final boolean e() {
        return this.t == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.PRnFixed
    public final boolean f(RecyclerView.y yVar) {
        return yVar instanceof F1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.PRnFixed
    public final void h(int i, int i2, RecyclerView.Aa aa, RecyclerView.PRnFixed.F1 f1) {
        RBi rBi;
        int iF;
        int i3;
        if (this.t != 0) {
            i = i2;
        }
        if (v() == 0 || i == 0) {
            return;
        }
        P0(i, aa);
        int[] iArr = this.J;
        if (iArr == null || iArr.length < this.p) {
            this.J = new int[this.p];
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int i6 = this.p;
            rBi = this.v;
            if (i4 >= i6) {
                break;
            }
            if (rBi.d == -1) {
                iF = rBi.f;
                i3 = this.q[i4].i(iF);
            } else {
                iF = this.q[i4].f(rBi.g);
                i3 = rBi.g;
            }
            int i7 = iF - i3;
            if (i7 >= 0) {
                this.J[i5] = i7;
                i5++;
            }
            i4++;
        }
        Arrays.sort(this.J, 0, i5);
        for (int i8 = 0; i8 < i5; i8++) {
            int i9 = rBi.c;
            if (!(i9 >= 0 && i9 < aa.b())) {
                return;
            }
            ((y.CQf) f1).a(rBi.c, this.J[i8]);
            rBi.c += rBi.d;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.PRnFixed
    public final int h0(int i, RecyclerView.ta taVar, RecyclerView.Aa aa) {
        return U0(i, taVar, aa);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.PRnFixed
    public final void i0(int i) {
        NUlFixed nUl = this.F;
        if (nUl != null && nUl.w != i) {
            nUl.z = null;
            nUl.y = 0;
            nUl.w = -1;
            nUl.x = -1;
        }
        this.z = i;
        this.A = Integer.MIN_VALUE;
        g0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.PRnFixed
    public final int j(RecyclerView.Aa aa) {
        return x0(aa);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.PRnFixed
    public final int j0(int i, RecyclerView.ta taVar, RecyclerView.Aa aa) {
        return U0(i, taVar, aa);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.PRnFixed
    public final int k(RecyclerView.Aa aa) {
        return y0(aa);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.PRnFixed
    public final int l(RecyclerView.Aa aa) {
        return z0(aa);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.PRnFixed
    public final int m(RecyclerView.Aa aa) {
        return x0(aa);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.PRnFixed
    public final void m0(Rect rect, int i, int i2) {
        int iG;
        int iG2;
        int iB = B() + A();
        int iZ = z() + C();
        if (this.t == 1) {
            int iHeight = rect.height() + iZ;
            RecyclerView recyclerView = this.b;
            Field field = bi5.a;
            iG2 = RecyclerView.PRnFixed.g(i2, iHeight, bi5.LPt8Fixed.d(recyclerView));
            iG = RecyclerView.PRnFixed.g(i, (this.u * this.p) + iB, bi5.LPt8Fixed.e(this.b));
        } else {
            int iWidth = rect.width() + iB;
            RecyclerView recyclerView2 = this.b;
            Field field2 = bi5.a;
            iG = RecyclerView.PRnFixed.g(i, iWidth, bi5.LPt8Fixed.e(recyclerView2));
            iG2 = RecyclerView.PRnFixed.g(i2, (this.u * this.p) + iZ, bi5.LPt8Fixed.d(this.b));
        }
        this.b.setMeasuredDimension(iG, iG2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.PRnFixed
    public final int n(RecyclerView.Aa aa) {
        return y0(aa);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.PRnFixed
    public final int o(RecyclerView.Aa aa) {
        return z0(aa);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.PRnFixed
    public final RecyclerView.y r() {
        return this.t == 0 ? new F1(-2, -1) : new F1(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.PRnFixed
    public final RecyclerView.y s(Context context, AttributeSet attributeSet) {
        return new F1(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.PRnFixed
    public final void s0(RecyclerView recyclerView, int i) {
        MZ mz = new MZ(recyclerView.getContext());
        mz.a = i;
        t0(mz);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.PRnFixed
    public final RecyclerView.y t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new F1((ViewGroup.MarginLayoutParams) layoutParams) : new F1(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.PRnFixed
    public final boolean u0() {
        return this.F == null;
    }

    public final int v0(int i) {
        if (v() == 0) {
            return this.x ? 1 : -1;
        }
        return (i < F0()) != this.x ? -1 : 1;
    }

    public final boolean w0() {
        int iF0;
        if (v() != 0 && this.C != 0 && this.g) {
            if (this.x) {
                iF0 = G0();
                F0();
            } else {
                iF0 = F0();
                G0();
            }
            if (iF0 == 0 && K0() != null) {
                LPt8Fixed lPt8 = this.B;
                int[] iArr = lPt8.a;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                lPt8.b = null;
                this.f = true;
                g0();
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.PRnFixed
    public final int x(RecyclerView.ta taVar, RecyclerView.Aa aa) {
        return this.t == 1 ? this.p : super.x(taVar, aa);
    }

    public final int x0(RecyclerView.Aa aa) {
        if (v() == 0) {
            return 0;
        }
        LPt9Fixed lPt9 = this.r;
        boolean z = this.I;
        return ct.a(aa, lPt9, C0(!z), B0(!z), this, this.I);
    }

    public final int y0(RecyclerView.Aa aa) {
        if (v() == 0) {
            return 0;
        }
        LPt9Fixed lPt9 = this.r;
        boolean z = this.I;
        return ct.b(aa, lPt9, C0(!z), B0(!z), this, this.I, this.x);
    }

    public final int z0(RecyclerView.Aa aa) {
        if (v() == 0) {
            return 0;
        }
        LPt9Fixed lPt9 = this.r;
        boolean z = this.I;
        return ct.c(aa, lPt9, C0(!z), B0(!z), this, this.I);
    }

    public static class LPt8Fixed {
        public int[] a;
        public List<QnHx> b;

        public final void a(int i) {
            int[] iArr = this.a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i, 10) + 1];
                this.a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i >= iArr.length) {
                int length = iArr.length;
                while (length <= i) {
                    length *= 2;
                }
                int[] iArr3 = new int[length];
                this.a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        /* JADX WARN: Code duplicated, block: B:31:0x005e  */
        public final int b(int i) {
            int i2;
            int[] iArr = this.a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            List<QnHx> list = this.b;
            if (list == null) {
                i2 = -1;
            } else {
                QnHx qnHx = null;
                if (list != null) {
                    for (int size = list.size() - 1; size >= 0; size--) {
                        QnHx qnHx2 = this.b.get(size);
                        if (qnHx2.w == i) {
                            qnHx = qnHx2;
                            break;
                        }
                    }
                }
                if (qnHx != null) {
                    this.b.remove(qnHx);
                }
                int size2 = this.b.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size2) {
                        i3 = -1;
                        break;
                    }
                    if (this.b.get(i3).w >= i) {
                        break;
                    }
                    i3++;
                }
                if (i3 != -1) {
                    QnHx qnHx3 = this.b.get(i3);
                    this.b.remove(i3);
                    i2 = qnHx3.w;
                } else {
                    i2 = -1;
                }
            }
            if (i2 == -1) {
                int[] iArr2 = this.a;
                Arrays.fill(iArr2, i, iArr2.length, -1);
                return this.a.length;
            }
            int i4 = i2 + 1;
            Arrays.fill(this.a, i, i4, -1);
            return i4;
        }

        public final void c(int i, int i2) {
            int[] iArr = this.a;
            if (iArr == null || i >= iArr.length) {
                return;
            }
            int i3 = i + i2;
            a(i3);
            int[] iArr2 = this.a;
            System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
            Arrays.fill(this.a, i, i3, -1);
            List<QnHx> list = this.b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                QnHx qnHx = this.b.get(size);
                int i4 = qnHx.w;
                if (i4 >= i) {
                    qnHx.w = i4 + i2;
                }
            }
        }

        public final void d(int i, int i2) {
            int[] iArr = this.a;
            if (iArr == null || i >= iArr.length) {
                return;
            }
            int i3 = i + i2;
            a(i3);
            int[] iArr2 = this.a;
            System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
            int[] iArr3 = this.a;
            Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
            List<QnHx> list = this.b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                QnHx qnHx = this.b.get(size);
                int i4 = qnHx.w;
                if (i4 >= i) {
                    if (i4 < i3) {
                        this.b.remove(size);
                    } else {
                        qnHx.w = i4 - i2;
                    }
                }
            }
        }

        @SuppressLint({"BanParcelableUsage"})
        public static class QnHx implements Parcelable {
            public static final Parcelable.Creator<QnHx> CREATOR = new C0030QnHx();
            public int w;
            public int x;
            public int[] y;
            public boolean z;

            /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$LPt8$QnHx$QnHx, reason: collision with other inner class name */
            public static class C0030QnHx implements Parcelable.Creator<QnHx> {
                @Override // android.os.Parcelable.Creator
                public final QnHx createFromParcel(Parcel parcel) {
                    return new QnHx(parcel);
                }

                @Override // android.os.Parcelable.Creator
                public final QnHx[] newArray(int i) {
                    return new QnHx[i];
                }
            }

            public QnHx(Parcel parcel) {
                this.w = parcel.readInt();
                this.x = parcel.readInt();
                this.z = parcel.readInt() == 1;
                int i = parcel.readInt();
                if (i > 0) {
                    int[] iArr = new int[i];
                    this.y = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final String toString() {
                return "FullSpanItem{mPosition=" + this.w + ", mGapDir=" + this.x + ", mHasUnwantedGapAfter=" + this.z + ", mGapPerSpan=" + Arrays.toString(this.y) + '}';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.w);
                parcel.writeInt(this.x);
                parcel.writeInt(this.z ? 1 : 0);
                int[] iArr = this.y;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.y);
                }
            }

            public QnHx() {
            }
        }
    }
}
