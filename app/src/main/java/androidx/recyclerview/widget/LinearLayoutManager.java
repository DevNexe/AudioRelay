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
import defpackage.GM;
import defpackage.bi5;
import defpackage.dj;
import java.lang.reflect.Field;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.PRnFixed implements RecyclerView.SjP.CQf {
    public final QnHx A;
    public final CQf B;
    public final int C;
    public final int[] D;
    public int p;
    public F1 q;
    public LPt9Fixed r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public final boolean w;
    public int x;
    public int y;
    public LPt8Fixed z;

    public static class CQf {
        public int a;
        public boolean b;
        public boolean c;
        public boolean d;
    }

    public static class F1 {
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int j;
        public boolean l;
        public boolean a = true;
        public int h = 0;
        public int i = 0;
        public List<RecyclerView.qc> k = null;

        public final void a(View view) {
            int iA;
            int size = this.k.size();
            View view2 = null;
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < size; i2++) {
                View view3 = this.k.get(i2).a;
                RecyclerView.y yVar = (RecyclerView.y) view3.getLayoutParams();
                if (view3 != view && !yVar.c() && (iA = (yVar.a() - this.d) * this.e) >= 0 && iA < i) {
                    view2 = view3;
                    if (iA == 0) {
                        break;
                    } else {
                        i = iA;
                    }
                }
            }
            if (view2 == null) {
                this.d = -1;
            } else {
                this.d = ((RecyclerView.y) view2.getLayoutParams()).a();
            }
        }

        public final View b(RecyclerView.ta taVar) {
            List<RecyclerView.qc> list = this.k;
            if (list == null) {
                View view = taVar.i(this.d, Long.MAX_VALUE).a;
                this.d += this.e;
                return view;
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view2 = this.k.get(i).a;
                RecyclerView.y yVar = (RecyclerView.y) view2.getLayoutParams();
                if (!yVar.c() && this.d == yVar.a()) {
                    a(view2);
                    return view2;
                }
            }
            return null;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class LPt8Fixed implements Parcelable {
        public static final Parcelable.Creator<LPt8Fixed> CREATOR = new QnHx();
        public int w;
        public int x;
        public boolean y;

        public static class QnHx implements Parcelable.Creator<LPt8Fixed> {
            @Override // android.os.Parcelable.Creator
            public final LPt8Fixed createFromParcel(Parcel parcel) {
                return new LPt8Fixed(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final LPt8Fixed[] newArray(int i) {
                return new LPt8Fixed[i];
            }
        }

        public LPt8Fixed() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.w);
            parcel.writeInt(this.x);
            parcel.writeInt(this.y ? 1 : 0);
        }

        public LPt8Fixed(Parcel parcel) {
            this.w = parcel.readInt();
            this.x = parcel.readInt();
            this.y = parcel.readInt() == 1;
        }

        public LPt8Fixed(LPt8Fixed lPt8) {
            this.w = lPt8.w;
            this.x = lPt8.x;
            this.y = lPt8.y;
        }
    }

    public static class QnHx {
        public LPt9Fixed a;
        public int b;
        public int c;
        public boolean d;
        public boolean e;

        public QnHx() {
            d();
        }

        public final void a() {
            this.c = this.d ? this.a.g() : this.a.k();
        }

        public final void b(View view, int i) {
            if (this.d) {
                int iB = this.a.b(view);
                LPt9Fixed lPt9 = this.a;
                this.c = (Integer.MIN_VALUE == lPt9.b ? 0 : lPt9.l() - lPt9.b) + iB;
            } else {
                this.c = this.a.e(view);
            }
            this.b = i;
        }

        public final void c(View view, int i) {
            LPt9Fixed lPt9 = this.a;
            int iL = Integer.MIN_VALUE == lPt9.b ? 0 : lPt9.l() - lPt9.b;
            if (iL >= 0) {
                b(view, i);
                return;
            }
            this.b = i;
            if (!this.d) {
                int iE = this.a.e(view);
                int iK = iE - this.a.k();
                this.c = iE;
                if (iK > 0) {
                    int iG = (this.a.g() - Math.min(0, (this.a.g() - iL) - this.a.b(view))) - (this.a.c(view) + iE);
                    if (iG < 0) {
                        this.c -= Math.min(iK, -iG);
                        return;
                    }
                    return;
                }
                return;
            }
            int iG2 = (this.a.g() - iL) - this.a.b(view);
            this.c = this.a.g() - iG2;
            if (iG2 > 0) {
                int iC = this.c - this.a.c(view);
                int iK2 = this.a.k();
                int iMin = iC - (Math.min(this.a.e(view) - iK2, 0) + iK2);
                if (iMin < 0) {
                    this.c = Math.min(iG2, -iMin) + this.c;
                }
            }
        }

        public final void d() {
            this.b = -1;
            this.c = Integer.MIN_VALUE;
            this.d = false;
            this.e = false;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AnchorInfo{mPosition=");
            sb.append(this.b);
            sb.append(", mCoordinate=");
            sb.append(this.c);
            sb.append(", mLayoutFromEnd=");
            sb.append(this.d);
            sb.append(", mValid=");
            return dj.c(sb, this.e, '}');
        }
    }

    public LinearLayoutManager(int i) {
        this.p = 1;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = true;
        this.x = -1;
        this.y = Integer.MIN_VALUE;
        this.z = null;
        this.A = new QnHx();
        this.B = new CQf();
        this.C = 2;
        this.D = new int[2];
        V0(i);
        c(null);
        if (this.t) {
            this.t = false;
            g0();
        }
    }

    public final int A0(int i) {
        if (i == 1) {
            return (this.p != 1 && O0()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.p != 1 && O0()) ? -1 : 1;
        }
        if (i == 17) {
            return this.p == 0 ? -1 : Integer.MIN_VALUE;
        }
        if (i == 33) {
            return this.p == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i != 66) {
            return (i == 130 && this.p == 1) ? 1 : Integer.MIN_VALUE;
        }
        return this.p == 0 ? 1 : Integer.MIN_VALUE;
    }

    public final void B0() {
        if (this.q == null) {
            this.q = new F1();
        }
    }

    public final int C0(RecyclerView.ta taVar, F1 f1, RecyclerView.Aa aa, boolean z) {
        int i = f1.c;
        int i2 = f1.g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                f1.g = i2 + i;
            }
            R0(taVar, f1);
        }
        int i3 = f1.c + f1.h;
        while (true) {
            if (!f1.l && i3 <= 0) {
                break;
            }
            int i4 = f1.d;
            if (!(i4 >= 0 && i4 < aa.b())) {
                break;
            }
            CQf cQf = this.B;
            cQf.a = 0;
            cQf.b = false;
            cQf.c = false;
            cQf.d = false;
            P0(taVar, aa, f1, cQf);
            if (!cQf.b) {
                int i5 = f1.b;
                int i6 = cQf.a;
                f1.b = (f1.f * i6) + i5;
                if (!cQf.c || f1.k != null || !aa.g) {
                    f1.c -= i6;
                    i3 -= i6;
                }
                int i7 = f1.g;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    f1.g = i8;
                    int i9 = f1.c;
                    if (i9 < 0) {
                        f1.g = i8 + i9;
                    }
                    R0(taVar, f1);
                }
                if (z && cQf.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - f1.c;
    }

    public final View D0(boolean z) {
        return this.u ? I0(0, v(), z) : I0(v() - 1, -1, z);
    }

    public final View E0(boolean z) {
        return this.u ? I0(v() - 1, -1, z) : I0(0, v(), z);
    }

    public final int F0() {
        View viewI0 = I0(0, v(), false);
        if (viewI0 == null) {
            return -1;
        }
        return RecyclerView.PRnFixed.D(viewI0);
    }

    public final int G0() {
        View viewI0 = I0(v() - 1, -1, false);
        if (viewI0 == null) {
            return -1;
        }
        return RecyclerView.PRnFixed.D(viewI0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.PRnFixed
    public final boolean H() {
        return true;
    }

    public final View H0(int i, int i2) {
        byte b;
        int i3;
        int i4;
        B0();
        if (i2 > i) {
            b = 1;
        } else {
            b = i2 < i ? (byte) -1 : (byte) 0;
        }
        if (b == 0) {
            return u(i);
        }
        if (this.r.e(u(i)) < this.r.k()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        return this.p == 0 ? this.c.a(i, i2, i3, i4) : this.d.a(i, i2, i3, i4);
    }

    public final View I0(int i, int i2, boolean z) {
        B0();
        int i3 = z ? 24579 : 320;
        return this.p == 0 ? this.c.a(i, i2, i3, 320) : this.d.a(i, i2, i3, 320);
    }

    public View J0(RecyclerView.ta taVar, RecyclerView.Aa aa, int i, int i2, int i3) {
        B0();
        int iK = this.r.k();
        int iG = this.r.g();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View viewU = u(i);
            int iD = RecyclerView.PRnFixed.D(viewU);
            if (iD >= 0 && iD < i3) {
                if (((RecyclerView.y) viewU.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = viewU;
                    }
                } else {
                    if (this.r.e(viewU) < iG && this.r.b(viewU) >= iK) {
                        return viewU;
                    }
                    if (view == null) {
                        view = viewU;
                    }
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }

    public final int K0(int i, RecyclerView.ta taVar, RecyclerView.Aa aa, boolean z) {
        int iG;
        int iG2 = this.r.g() - i;
        if (iG2 <= 0) {
            return 0;
        }
        int i2 = -U0(-iG2, taVar, aa);
        int i3 = i + i2;
        if (!z || (iG = this.r.g() - i3) <= 0) {
            return i2;
        }
        this.r.o(iG);
        return iG + i2;
    }

    public final int L0(int i, RecyclerView.ta taVar, RecyclerView.Aa aa, boolean z) {
        int iK;
        int iK2 = i - this.r.k();
        if (iK2 <= 0) {
            return 0;
        }
        int i2 = -U0(iK2, taVar, aa);
        int i3 = i + i2;
        if (!z || (iK = i3 - this.r.k()) <= 0) {
            return i2;
        }
        this.r.o(-iK);
        return i2 - iK;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.PRnFixed
    public final void M(RecyclerView recyclerView) {
    }

    public final View M0() {
        return u(this.u ? 0 : v() - 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.PRnFixed
    public View N(View view, int i, RecyclerView.ta taVar, RecyclerView.Aa aa) {
        int iA0;
        View viewH0;
        T0();
        if (v() == 0 || (iA0 = A0(i)) == Integer.MIN_VALUE) {
            return null;
        }
        B0();
        X0(iA0, (int) (this.r.l() * 0.33333334f), false, aa);
        F1 f1 = this.q;
        f1.g = Integer.MIN_VALUE;
        f1.a = false;
        C0(taVar, f1, aa, true);
        if (iA0 == -1) {
            viewH0 = this.u ? H0(v() - 1, -1) : H0(0, v());
        } else {
            viewH0 = this.u ? H0(0, v()) : H0(v() - 1, -1);
        }
        View viewN0 = iA0 == -1 ? N0() : M0();
        if (!viewN0.hasFocusable()) {
            return viewH0;
        }
        if (viewH0 == null) {
            return null;
        }
        return viewN0;
    }

    public final View N0() {
        return u(this.u ? v() - 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.PRnFixed
    public final void O(AccessibilityEvent accessibilityEvent) {
        super.O(accessibilityEvent);
        if (v() > 0) {
            accessibilityEvent.setFromIndex(F0());
            accessibilityEvent.setToIndex(G0());
        }
    }

    public final boolean O0() {
        RecyclerView recyclerView = this.b;
        Field field = bi5.a;
        return bi5.NUlFixed.d(recyclerView) == 1;
    }

    public void P0(RecyclerView.ta taVar, RecyclerView.Aa aa, F1 f1, CQf cQf) {
        int iA;
        int i;
        int i2;
        int iD;
        View viewB = f1.b(taVar);
        if (viewB == null) {
            cQf.b = true;
            return;
        }
        RecyclerView.y yVar = (RecyclerView.y) viewB.getLayoutParams();
        if (f1.k == null) {
            if (this.u == (f1.f == -1)) {
                b(viewB, -1, false);
            } else {
                b(viewB, 0, false);
            }
        } else {
            if (this.u == (f1.f == -1)) {
                b(viewB, -1, true);
            } else {
                b(viewB, 0, true);
            }
        }
        RecyclerView.y yVar2 = (RecyclerView.y) viewB.getLayoutParams();
        Rect rectI = this.b.I(viewB);
        int i3 = rectI.left + rectI.right + 0;
        int i4 = rectI.top + rectI.bottom + 0;
        int iW = RecyclerView.PRnFixed.w(d(), this.n, this.l, B() + A() + ((ViewGroup.MarginLayoutParams) yVar2).leftMargin + ((ViewGroup.MarginLayoutParams) yVar2).rightMargin + i3, ((ViewGroup.MarginLayoutParams) yVar2).width);
        int iW2 = RecyclerView.PRnFixed.w(e(), this.o, this.m, z() + C() + ((ViewGroup.MarginLayoutParams) yVar2).topMargin + ((ViewGroup.MarginLayoutParams) yVar2).bottomMargin + i4, ((ViewGroup.MarginLayoutParams) yVar2).height);
        if (p0(viewB, iW, iW2, yVar2)) {
            viewB.measure(iW, iW2);
        }
        cQf.a = this.r.c(viewB);
        if (this.p == 1) {
            if (O0()) {
                iD = this.n - B();
                iA = iD - this.r.d(viewB);
            } else {
                iA = A();
                iD = this.r.d(viewB) + iA;
            }
            if (f1.f == -1) {
                i = f1.b;
                i2 = i - cQf.a;
            } else {
                i2 = f1.b;
                i = cQf.a + i2;
            }
        } else {
            int iC = C();
            int iD2 = this.r.d(viewB) + iC;
            if (f1.f == -1) {
                int i5 = f1.b;
                int i6 = i5 - cQf.a;
                iD = i5;
                i = iD2;
                iA = i6;
                i2 = iC;
            } else {
                int i7 = f1.b;
                int i8 = cQf.a + i7;
                iA = i7;
                i = iD2;
                i2 = iC;
                iD = i8;
            }
        }
        RecyclerView.PRnFixed.J(viewB, iA, i2, iD, i);
        if (yVar.c() || yVar.b()) {
            cQf.c = true;
        }
        cQf.d = viewB.hasFocusable();
    }

    public void Q0(RecyclerView.ta taVar, RecyclerView.Aa aa, QnHx qnHx, int i) {
    }

    public final void R0(RecyclerView.ta taVar, F1 f1) {
        if (!f1.a || f1.l) {
            return;
        }
        int i = f1.g;
        int i2 = f1.i;
        if (f1.f == -1) {
            int iV = v();
            if (i < 0) {
                return;
            }
            int iF = (this.r.f() - i) + i2;
            if (this.u) {
                for (int i3 = 0; i3 < iV; i3++) {
                    View viewU = u(i3);
                    if (this.r.e(viewU) < iF || this.r.n(viewU) < iF) {
                        S0(taVar, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = iV - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View viewU2 = u(i5);
                if (this.r.e(viewU2) < iF || this.r.n(viewU2) < iF) {
                    S0(taVar, i4, i5);
                    return;
                }
            }
            return;
        }
        if (i < 0) {
            return;
        }
        int i6 = i - i2;
        int iV2 = v();
        if (!this.u) {
            for (int i7 = 0; i7 < iV2; i7++) {
                View viewU3 = u(i7);
                if (this.r.b(viewU3) > i6 || this.r.m(viewU3) > i6) {
                    S0(taVar, 0, i7);
                    return;
                }
            }
            return;
        }
        int i8 = iV2 - 1;
        for (int i9 = i8; i9 >= 0; i9--) {
            View viewU4 = u(i9);
            if (this.r.b(viewU4) > i6 || this.r.m(viewU4) > i6) {
                S0(taVar, i8, i9);
                return;
            }
        }
    }

    public final void S0(RecyclerView.ta taVar, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                View viewU = u(i);
                e0(i);
                taVar.f(viewU);
                i--;
            }
            return;
        }
        while (true) {
            i2--;
            if (i2 < i) {
                return;
            }
            View viewU2 = u(i2);
            e0(i2);
            taVar.f(viewU2);
        }
    }

    public final void T0() {
        if (this.p == 1 || !O0()) {
            this.u = this.t;
        } else {
            this.u = !this.t;
        }
    }

    public final int U0(int i, RecyclerView.ta taVar, RecyclerView.Aa aa) {
        if (v() == 0 || i == 0) {
            return 0;
        }
        B0();
        this.q.a = true;
        int i2 = i > 0 ? 1 : -1;
        int iAbs = Math.abs(i);
        X0(i2, iAbs, true, aa);
        F1 f1 = this.q;
        int iC0 = C0(taVar, f1, aa, false) + f1.g;
        if (iC0 < 0) {
            return 0;
        }
        if (iAbs > iC0) {
            i = i2 * iC0;
        }
        this.r.o(-i);
        this.q.j = i;
        return i;
    }

    public final void V0(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(GM.a("invalid orientation:", i));
        }
        c(null);
        if (i != this.p || this.r == null) {
            LPt9Fixed lPt9A = LPt9Fixed.a(this, i);
            this.r = lPt9A;
            this.A.a = lPt9A;
            this.p = i;
            g0();
        }
    }

    /* JADX WARN: Code duplicated, block: B:124:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:127:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:129:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:131:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:132:0x0201  */
    /* JADX WARN: Code duplicated, block: B:133:0x0217  */
    /* JADX WARN: Code duplicated, block: B:135:0x021b  */
    /* JADX WARN: Code duplicated, block: B:136:0x0231  */
    /* JADX WARN: Code duplicated, block: B:138:0x0246  */
    /* JADX WARN: Code duplicated, block: B:148:0x0276  */
    /* JADX WARN: Code duplicated, block: B:150:0x0279  */
    /* JADX WARN: Code duplicated, block: B:152:0x027d  */
    /* JADX WARN: Code duplicated, block: B:153:0x0284  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00de  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:66:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:68:0x0100  */
    /* JADX WARN: Code duplicated, block: B:69:0x010c  */
    /* JADX WARN: Code duplicated, block: B:71:0x011b  */
    /* JADX WARN: Code duplicated, block: B:72:0x0126  */
    /* JADX WARN: Code duplicated, block: B:74:0x012a  */
    /* JADX WARN: Code duplicated, block: B:76:0x0136  */
    /* JADX WARN: Code duplicated, block: B:77:0x0138  */
    /* JADX WARN: Code duplicated, block: B:79:0x0141  */
    /* JADX WARN: Code duplicated, block: B:81:0x014a  */
    /* JADX WARN: Code duplicated, block: B:83:0x0150  */
    /* JADX WARN: Code duplicated, block: B:85:0x015c  */
    /* JADX WARN: Code duplicated, block: B:86:0x015e  */
    /* JADX WARN: Code duplicated, block: B:89:0x0163  */
    /* JADX WARN: Code duplicated, block: B:90:0x0165  */
    /* JADX WARN: Code duplicated, block: B:93:0x016c  */
    /* JADX WARN: Code duplicated, block: B:95:0x0172  */
    /* JADX WARN: Code duplicated, block: B:96:0x017e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v39, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v40 */
    @Override // androidx.recyclerview.widget.RecyclerView.PRnFixed
    public void W(RecyclerView.ta taVar, RecyclerView.Aa aa) {
        View focusedChild;
        boolean z;
        boolean z2;
        View focusedChild2;
        View viewJ0;
        boolean z3;
        int iK;
        int i;
        boolean z4;
        View viewQ;
        boolean z5;
        boolean z6;
        int iE;
        LPt9Fixed lPt9;
        int iL;
        int i2;
        int i3;
        ?? r2;
        List<RecyclerView.qc> list;
        int i4;
        int i5;
        int iK0;
        int i6;
        View viewQ2;
        int iE2;
        int iG;
        if (!(this.z == null && this.x == -1) && aa.b() == 0) {
            b0(taVar);
            return;
        }
        LPt8Fixed lPt8 = this.z;
        if (lPt8 != null) {
            int i7 = lPt8.w;
            if (i7 >= 0) {
                this.x = i7;
            }
        }
        B0();
        this.q.a = false;
        T0();
        RecyclerView recyclerView = this.b;
        if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.a.j(focusedChild)) {
            focusedChild = null;
        }
        QnHx qnHx = this.A;
        if (!qnHx.e || this.x != -1 || this.z != null) {
            qnHx.d();
            qnHx.d = this.u ^ this.v;
            if (aa.g || (i = this.x) == -1) {
                z = false;
            } else if (i < 0 || i >= aa.b()) {
                this.x = -1;
                this.y = Integer.MIN_VALUE;
                z = false;
            } else {
                int i8 = this.x;
                qnHx.b = i8;
                LPt8Fixed lPt10 = this.z;
                if (lPt10 != null) {
                    if (lPt10.w >= 0) {
                        boolean z7 = lPt10.y;
                        qnHx.d = z7;
                        if (z7) {
                            qnHx.c = this.r.g() - this.z.x;
                        } else {
                            qnHx.c = this.r.k() + this.z.x;
                        }
                    } else if (this.y == Integer.MIN_VALUE) {
                        viewQ = q(i8);
                        if (viewQ != null) {
                            if (v() > 0) {
                                if (this.x < RecyclerView.PRnFixed.D(u(0))) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if (z5 == this.u) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                qnHx.d = z6;
                            }
                            qnHx.a();
                        } else if (this.r.c(viewQ) > this.r.l()) {
                            qnHx.a();
                        } else if (this.r.e(viewQ) - this.r.k() < 0) {
                            qnHx.c = this.r.k();
                            qnHx.d = false;
                        } else if (this.r.g() - this.r.b(viewQ) < 0) {
                            qnHx.c = this.r.g();
                            qnHx.d = true;
                        } else {
                            if (qnHx.d) {
                                int iB = this.r.b(viewQ);
                                lPt9 = this.r;
                                if (Integer.MIN_VALUE == lPt9.b) {
                                    iL = 0;
                                } else {
                                    iL = lPt9.l() - lPt9.b;
                                }
                                iE = iL + iB;
                            } else {
                                iE = this.r.e(viewQ);
                            }
                            qnHx.c = iE;
                        }
                    } else {
                        z4 = this.u;
                        qnHx.d = z4;
                        if (z4) {
                            qnHx.c = this.r.g() - this.y;
                        } else {
                            qnHx.c = this.r.k() + this.y;
                        }
                    }
                } else if (this.y == Integer.MIN_VALUE) {
                    viewQ = q(i8);
                    if (viewQ != null) {
                        if (v() > 0) {
                            if (this.x < RecyclerView.PRnFixed.D(u(0))) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (z5 == this.u) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            qnHx.d = z6;
                        }
                        qnHx.a();
                    } else if (this.r.c(viewQ) > this.r.l()) {
                        qnHx.a();
                    } else if (this.r.e(viewQ) - this.r.k() < 0) {
                        qnHx.c = this.r.k();
                        qnHx.d = false;
                    } else if (this.r.g() - this.r.b(viewQ) < 0) {
                        qnHx.c = this.r.g();
                        qnHx.d = true;
                    } else {
                        if (qnHx.d) {
                            int iB2 = this.r.b(viewQ);
                            lPt9 = this.r;
                            if (Integer.MIN_VALUE == lPt9.b) {
                                iL = 0;
                            } else {
                                iL = lPt9.l() - lPt9.b;
                            }
                            iE = iL + iB2;
                        } else {
                            iE = this.r.e(viewQ);
                        }
                        qnHx.c = iE;
                    }
                } else {
                    z4 = this.u;
                    qnHx.d = z4;
                    if (z4) {
                        qnHx.c = this.r.g() - this.y;
                    } else {
                        qnHx.c = this.r.k() + this.y;
                    }
                }
                z = true;
            }
            if (!z) {
                if (v() != 0) {
                    RecyclerView recyclerView2 = this.b;
                    if (recyclerView2 == null || (focusedChild2 = recyclerView2.getFocusedChild()) == null || this.a.j(focusedChild2)) {
                        focusedChild2 = null;
                    }
                    if (focusedChild2 != null) {
                        RecyclerView.y yVar = (RecyclerView.y) focusedChild2.getLayoutParams();
                        if (!yVar.c() && yVar.a() >= 0 && yVar.a() < aa.b()) {
                            qnHx.c(focusedChild2, RecyclerView.PRnFixed.D(focusedChild2));
                        } else {
                            if (this.s == this.v) {
                                if (qnHx.d) {
                                    if (this.u) {
                                        viewJ0 = J0(taVar, aa, 0, v(), aa.b());
                                    } else {
                                        viewJ0 = J0(taVar, aa, v() - 1, -1, aa.b());
                                    }
                                } else if (this.u) {
                                    viewJ0 = J0(taVar, aa, v() - 1, -1, aa.b());
                                } else {
                                    viewJ0 = J0(taVar, aa, 0, v(), aa.b());
                                }
                                if (viewJ0 != null) {
                                    qnHx.b(viewJ0, RecyclerView.PRnFixed.D(viewJ0));
                                    if (!aa.g && u0()) {
                                        if (this.r.e(viewJ0) < this.r.g() || this.r.b(viewJ0) < this.r.k()) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        if (z3) {
                                            if (qnHx.d) {
                                                iK = this.r.g();
                                            } else {
                                                iK = this.r.k();
                                            }
                                            qnHx.c = iK;
                                        }
                                    }
                                }
                            }
                            z2 = false;
                        }
                        z2 = true;
                    } else {
                        if (this.s == this.v) {
                            if (qnHx.d) {
                                if (this.u) {
                                    viewJ0 = J0(taVar, aa, 0, v(), aa.b());
                                } else {
                                    viewJ0 = J0(taVar, aa, v() - 1, -1, aa.b());
                                }
                            } else if (this.u) {
                                viewJ0 = J0(taVar, aa, v() - 1, -1, aa.b());
                            } else {
                                viewJ0 = J0(taVar, aa, 0, v(), aa.b());
                            }
                            if (viewJ0 != null) {
                                qnHx.b(viewJ0, RecyclerView.PRnFixed.D(viewJ0));
                                if (!aa.g) {
                                    if (this.r.e(viewJ0) < this.r.g()) {
                                        z3 = true;
                                    } else {
                                        z3 = true;
                                    }
                                    if (z3) {
                                        if (qnHx.d) {
                                            iK = this.r.g();
                                        } else {
                                            iK = this.r.k();
                                        }
                                        qnHx.c = iK;
                                    }
                                }
                                z2 = true;
                            }
                        }
                        z2 = false;
                    }
                } else {
                    z2 = false;
                }
                if (!z2) {
                    qnHx.a();
                    qnHx.b = this.v ? aa.b() - 1 : 0;
                }
            }
            qnHx.e = true;
        } else if (focusedChild != null && (this.r.e(focusedChild) >= this.r.g() || this.r.b(focusedChild) <= this.r.k())) {
            qnHx.c(focusedChild, RecyclerView.PRnFixed.D(focusedChild));
        }
        F1 f1 = this.q;
        f1.f = f1.j >= 0 ? 1 : -1;
        int[] iArr = this.D;
        iArr[0] = 0;
        iArr[1] = 0;
        v0(aa, iArr);
        int iK2 = this.r.k() + Math.max(0, iArr[0]);
        int iH = this.r.h() + Math.max(0, iArr[1]);
        if (aa.g && (i6 = this.x) != -1 && this.y != Integer.MIN_VALUE && (viewQ2 = q(i6)) != null) {
            if (this.u) {
                iG = this.r.g() - this.r.b(viewQ2);
                iE2 = this.y;
            } else {
                iE2 = this.r.e(viewQ2) - this.r.k();
                iG = this.y;
            }
            int i9 = iG - iE2;
            if (i9 > 0) {
                iK2 += i9;
            } else {
                iH -= i9;
            }
        }
        Q0(taVar, aa, qnHx, (!qnHx.d ? this.u : !this.u) ? 1 : -1);
        p(taVar);
        this.q.l = this.r.i() == 0 && this.r.f() == 0;
        this.q.getClass();
        this.q.i = 0;
        if (qnHx.d) {
            Z0(qnHx.b, qnHx.c);
            F1 f2 = this.q;
            f2.h = iK2;
            C0(taVar, f2, aa, false);
            F1 f3 = this.q;
            i3 = f3.b;
            int i10 = f3.d;
            int i11 = f3.c;
            if (i11 > 0) {
                iH += i11;
            }
            Y0(qnHx.b, qnHx.c);
            F1 f4 = this.q;
            f4.h = iH;
            f4.d += f4.e;
            C0(taVar, f4, aa, false);
            F1 f5 = this.q;
            i2 = f5.b;
            int i12 = f5.c;
            if (i12 > 0) {
                Z0(i10, i3);
                F1 f6 = this.q;
                f6.h = i12;
                C0(taVar, f6, aa, false);
                i3 = this.q.b;
            }
        } else {
            Y0(qnHx.b, qnHx.c);
            F1 f7 = this.q;
            f7.h = iH;
            C0(taVar, f7, aa, false);
            F1 f8 = this.q;
            i2 = f8.b;
            int i13 = f8.d;
            int i14 = f8.c;
            if (i14 > 0) {
                iK2 += i14;
            }
            Z0(qnHx.b, qnHx.c);
            F1 f9 = this.q;
            f9.h = iK2;
            f9.d += f9.e;
            C0(taVar, f9, aa, false);
            F1 f10 = this.q;
            i3 = f10.b;
            int i15 = f10.c;
            if (i15 > 0) {
                Y0(i13, i2);
                F1 f11 = this.q;
                f11.h = i15;
                C0(taVar, f11, aa, false);
                i2 = this.q.b;
            }
        }
        if (v() > 0) {
            if (this.u ^ this.v) {
                int iK1 = K0(i2, taVar, aa, true);
                i4 = i3 + iK1;
                i5 = i2 + iK1;
                iK0 = L0(i4, taVar, aa, false);
            } else {
                int iL0 = L0(i3, taVar, aa, true);
                i4 = i3 + iL0;
                i5 = i2 + iL0;
                iK0 = K0(i5, taVar, aa, false);
            }
            i3 = i4 + iK0;
            i2 = i5 + iK0;
        }
        if (aa.k && v() != 0 && !aa.g && u0()) {
            List<RecyclerView.qc> list2 = taVar.d;
            int size = list2.size();
            int iD = RecyclerView.PRnFixed.D(u(0));
            int iC = 0;
            int iC2 = 0;
            for (int i16 = 0; i16 < size; i16++) {
                RecyclerView.qc qcVar = list2.get(i16);
                if (!qcVar.i()) {
                    byte b = (qcVar.c() < iD) != this.u ? (byte) -1 : (byte) 1;
                    View view = qcVar.a;
                    if (b == -1) {
                        iC += this.r.c(view);
                    } else {
                        iC2 += this.r.c(view);
                    }
                }
            }
            this.q.k = list2;
            if (iC > 0) {
                Z0(RecyclerView.PRnFixed.D(N0()), i3);
                F1 f12 = this.q;
                f12.h = iC;
                r2 = 0;
                f12.c = 0;
                f12.a(null);
                C0(taVar, this.q, aa, false);
            } else {
                r2 = 0;
            }
            if (iC2 > 0) {
                Y0(RecyclerView.PRnFixed.D(M0()), i2);
                F1 f13 = this.q;
                f13.h = iC2;
                f13.c = r2;
                list = null;
                f13.a(null);
                C0(taVar, this.q, aa, r2);
            } else {
                list = null;
            }
            this.q.k = list;
        }
        if (aa.g) {
            qnHx.d();
        } else {
            LPt9Fixed lPt11 = this.r;
            lPt11.b = lPt11.l();
        }
        this.s = this.v;
    }

    public void W0(boolean z) {
        c(null);
        if (this.v == z) {
            return;
        }
        this.v = z;
        g0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.PRnFixed
    public void X(RecyclerView.Aa aa) {
        this.z = null;
        this.x = -1;
        this.y = Integer.MIN_VALUE;
        this.A.d();
    }

    public final void X0(int i, int i2, boolean z, RecyclerView.Aa aa) {
        int iK;
        this.q.l = this.r.i() == 0 && this.r.f() == 0;
        this.q.f = i;
        int[] iArr = this.D;
        iArr[0] = 0;
        iArr[1] = 0;
        v0(aa, iArr);
        int iMax = Math.max(0, iArr[0]);
        int iMax2 = Math.max(0, iArr[1]);
        boolean z2 = i == 1;
        F1 f1 = this.q;
        int i3 = z2 ? iMax2 : iMax;
        f1.h = i3;
        if (!z2) {
            iMax = iMax2;
        }
        f1.i = iMax;
        if (z2) {
            f1.h = this.r.h() + i3;
            View viewM0 = M0();
            F1 f2 = this.q;
            f2.e = this.u ? -1 : 1;
            int iD = RecyclerView.PRnFixed.D(viewM0);
            F1 f3 = this.q;
            f2.d = iD + f3.e;
            f3.b = this.r.b(viewM0);
            iK = this.r.b(viewM0) - this.r.g();
        } else {
            View viewN0 = N0();
            F1 f4 = this.q;
            f4.h = this.r.k() + f4.h;
            F1 f5 = this.q;
            f5.e = this.u ? 1 : -1;
            int iD2 = RecyclerView.PRnFixed.D(viewN0);
            F1 f6 = this.q;
            f5.d = iD2 + f6.e;
            f6.b = this.r.e(viewN0);
            iK = (-this.r.e(viewN0)) + this.r.k();
        }
        F1 f7 = this.q;
        f7.c = i2;
        if (z) {
            f7.c = i2 - iK;
        }
        f7.g = iK;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.PRnFixed
    public final void Y(Parcelable parcelable) {
        if (parcelable instanceof LPt8Fixed) {
            this.z = (LPt8Fixed) parcelable;
            g0();
        }
    }

    public final void Y0(int i, int i2) {
        this.q.c = this.r.g() - i2;
        F1 f1 = this.q;
        f1.e = this.u ? -1 : 1;
        f1.d = i;
        f1.f = 1;
        f1.b = i2;
        f1.g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.PRnFixed
    public final Parcelable Z() {
        LPt8Fixed lPt8 = this.z;
        if (lPt8 != null) {
            return new LPt8Fixed(lPt8);
        }
        LPt8Fixed lPt9 = new LPt8Fixed();
        if (v() > 0) {
            B0();
            boolean z = this.s ^ this.u;
            lPt9.y = z;
            if (z) {
                View viewM0 = M0();
                lPt9.x = this.r.g() - this.r.b(viewM0);
                lPt9.w = RecyclerView.PRnFixed.D(viewM0);
            } else {
                View viewN0 = N0();
                lPt9.w = RecyclerView.PRnFixed.D(viewN0);
                lPt9.x = this.r.e(viewN0) - this.r.k();
            }
        } else {
            lPt9.w = -1;
        }
        return lPt9;
    }

    public final void Z0(int i, int i2) {
        this.q.c = i2 - this.r.k();
        F1 f1 = this.q;
        f1.d = i;
        f1.e = this.u ? 1 : -1;
        f1.f = -1;
        f1.b = i2;
        f1.g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SjP.CQf
    public final PointF a(int i) {
        if (v() == 0) {
            return null;
        }
        int i2 = (i < RecyclerView.PRnFixed.D(u(0))) != this.u ? -1 : 1;
        return this.p == 0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.PRnFixed
    public final void c(String str) {
        if (this.z == null) {
            super.c(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.PRnFixed
    public final boolean d() {
        return this.p == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.PRnFixed
    public final boolean e() {
        return this.p == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.PRnFixed
    public final void h(int i, int i2, RecyclerView.Aa aa, RecyclerView.PRnFixed.F1 f1) {
        if (this.p != 0) {
            i = i2;
        }
        if (v() == 0 || i == 0) {
            return;
        }
        B0();
        X0(i > 0 ? 1 : -1, Math.abs(i), true, aa);
        w0(aa, this.q, f1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.PRnFixed
    public int h0(int i, RecyclerView.ta taVar, RecyclerView.Aa aa) {
        if (this.p == 1) {
            return 0;
        }
        return U0(i, taVar, aa);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0013  */
    /* JADX WARN: Code duplicated, block: B:12:0x001c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:13:0x001e  */
    /* JADX WARN: Code duplicated, block: B:14:0x0021  */
    @Override // androidx.recyclerview.widget.RecyclerView.PRnFixed
    public final void i(int i, RecyclerView.PRnFixed.F1 f1) {
        boolean z;
        int i2;
        LPt8Fixed lPt8 = this.z;
        if (lPt8 == null) {
            T0();
            z = this.u;
            i2 = this.x;
            if (i2 == -1) {
                if (z) {
                    i2 = i - 1;
                } else {
                    i2 = 0;
                }
            }
        } else {
            i2 = lPt8.w;
            if (i2 >= 0) {
                z = lPt8.y;
            } else {
                T0();
                z = this.u;
                i2 = this.x;
                if (i2 == -1) {
                    if (z) {
                        i2 = i - 1;
                    } else {
                        i2 = 0;
                    }
                }
            }
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.C && i2 >= 0 && i2 < i; i4++) {
            ((y.CQf) f1).a(i2, 0);
            i2 += i3;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.PRnFixed
    public final void i0(int i) {
        this.x = i;
        this.y = Integer.MIN_VALUE;
        LPt8Fixed lPt8 = this.z;
        if (lPt8 != null) {
            lPt8.w = -1;
        }
        g0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.PRnFixed
    public final int j(RecyclerView.Aa aa) {
        return x0(aa);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.PRnFixed
    public int j0(int i, RecyclerView.ta taVar, RecyclerView.Aa aa) {
        if (this.p == 0) {
            return 0;
        }
        return U0(i, taVar, aa);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.PRnFixed
    public int k(RecyclerView.Aa aa) {
        return y0(aa);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.PRnFixed
    public int l(RecyclerView.Aa aa) {
        return z0(aa);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.PRnFixed
    public final int m(RecyclerView.Aa aa) {
        return x0(aa);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.PRnFixed
    public int n(RecyclerView.Aa aa) {
        return y0(aa);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.PRnFixed
    public int o(RecyclerView.Aa aa) {
        return z0(aa);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.PRnFixed
    public final View q(int i) {
        int iV = v();
        if (iV == 0) {
            return null;
        }
        int iD = i - RecyclerView.PRnFixed.D(u(0));
        if (iD >= 0 && iD < iV) {
            View viewU = u(iD);
            if (RecyclerView.PRnFixed.D(viewU) == i) {
                return viewU;
            }
        }
        return super.q(i);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002b A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:? A[RETURN, SYNTHETIC] */
    @Override // androidx.recyclerview.widget.RecyclerView.PRnFixed
    public final boolean q0() {
        boolean z;
        if (this.m == 1073741824 || this.l == 1073741824) {
            return false;
        }
        int iV = v();
        for (int i = 0; i < iV; i++) {
            ViewGroup.LayoutParams layoutParams = u(i).getLayoutParams();
            if (layoutParams.width < 0 && layoutParams.height < 0) {
                z = true;
                if (z) {
                    return true;
                }
                return false;
            }
        }
        z = false;
        if (z) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.PRnFixed
    public RecyclerView.y r() {
        return new RecyclerView.y(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.PRnFixed
    public void s0(RecyclerView recyclerView, int i) {
        MZ mz = new MZ(recyclerView.getContext());
        mz.a = i;
        t0(mz);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.PRnFixed
    public boolean u0() {
        return this.z == null && this.s == this.v;
    }

    public void v0(RecyclerView.Aa aa, int[] iArr) {
        int i;
        int iL = aa.a != -1 ? this.r.l() : 0;
        if (this.q.f == -1) {
            i = 0;
        } else {
            i = iL;
            iL = 0;
        }
        iArr[0] = iL;
        iArr[1] = i;
    }

    public void w0(RecyclerView.Aa aa, F1 f1, RecyclerView.PRnFixed.F1 f2) {
        int i = f1.d;
        if (i < 0 || i >= aa.b()) {
            return;
        }
        ((y.CQf) f2).a(i, Math.max(0, f1.g));
    }

    public final int x0(RecyclerView.Aa aa) {
        if (v() == 0) {
            return 0;
        }
        B0();
        LPt9Fixed lPt9 = this.r;
        boolean z = !this.w;
        return ct.a(aa, lPt9, E0(z), D0(z), this, this.w);
    }

    public final int y0(RecyclerView.Aa aa) {
        if (v() == 0) {
            return 0;
        }
        B0();
        LPt9Fixed lPt9 = this.r;
        boolean z = !this.w;
        return ct.b(aa, lPt9, E0(z), D0(z), this, this.w, this.u);
    }

    public final int z0(RecyclerView.Aa aa) {
        if (v() == 0) {
            return 0;
        }
        B0();
        LPt9Fixed lPt9 = this.r;
        boolean z = !this.w;
        return ct.c(aa, lPt9, E0(z), D0(z), this, this.w);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.p = 1;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = true;
        this.x = -1;
        this.y = Integer.MIN_VALUE;
        this.z = null;
        this.A = new QnHx();
        this.B = new CQf();
        this.C = 2;
        this.D = new int[2];
        RecyclerView.PRnFixed.LPt8Fixed lPt8E = RecyclerView.PRnFixed.E(context, attributeSet, i, i2);
        V0(lPt8E.a);
        boolean z = lPt8E.c;
        c(null);
        if (z != this.t) {
            this.t = z;
            g0();
        }
        W0(lPt8E.d);
    }
}
