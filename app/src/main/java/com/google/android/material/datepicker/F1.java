package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.UT;
import defpackage.d_OZ;
import defpackage.ef0;
import defpackage.n83;
import defpackage.qn4;
import defpackage.u23;
import defpackage.y92;
import defpackage.yo5;
import defpackage.zg2;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: loaded from: classes3.dex */
public final class F1<S> extends u23<S> {
    public static final /* synthetic */ int z0 = 0;
    public int p0;
    public ef0<S> q0;
    public com.google.android.material.datepicker.QnHx r0;
    public zg2 s0;
    public int t0;
    public n83 u0;
    public RecyclerView v0;
    public RecyclerView w0;
    public View x0;
    public View y0;

    public class CQf extends qn4 {
        public final /* synthetic */ int E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CQf(int i, int i2) {
            super(i);
            this.E = i2;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public final void v0(RecyclerView.Aa aa, int[] iArr) {
            int i = this.E;
            F1 f1 = F1.this;
            if (i == 0) {
                iArr[0] = f1.w0.getWidth();
                iArr[1] = f1.w0.getWidth();
            } else {
                iArr[0] = f1.w0.getHeight();
                iArr[1] = f1.w0.getHeight();
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.F1$F1, reason: collision with other inner class name */
    public class C0079F1 implements LPt8Fixed {
        public C0079F1() {
        }
    }

    public interface LPt8Fixed {
    }

    public class QnHx extends d_OZ {
        @Override // defpackage.d_OZ
        public final void d(View view, UT ut) {
            this.a.onInitializeAccessibilityNodeInfo(view, ut.a);
            ut.j(null);
        }
    }

    @Override // defpackage.u23
    public final boolean N(com.google.android.material.datepicker.LPt8Fixed.F1 f1) {
        return super.N(f1);
    }

    public final void O(zg2 zg2Var) {
        zg2 zg2Var2 = ((auxFixed) this.w0.getAdapter()).d.w;
        Calendar calendar = zg2Var2.w;
        if (!(calendar instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        int i = zg2Var.y;
        int i2 = zg2Var2.y;
        int i3 = zg2Var.x;
        int i4 = zg2Var2.x;
        int i5 = (i3 - i4) + ((i - i2) * 12);
        zg2 zg2Var3 = this.s0;
        if (!(calendar instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        int i6 = i5 - ((zg2Var3.x - i4) + ((zg2Var3.y - i2) * 12));
        boolean z = Math.abs(i6) > 3;
        boolean z2 = i6 > 0;
        this.s0 = zg2Var;
        if (z && z2) {
            this.w0.Y(i5 - 3);
            this.w0.post(new y92(this, i5));
        } else if (!z) {
            this.w0.post(new y92(this, i5));
        } else {
            this.w0.Y(i5 + 3);
            this.w0.post(new y92(this, i5));
        }
    }

    public final void P(int i) {
        this.t0 = i;
        if (i == 2) {
            this.v0.getLayoutManager().i0(this.s0.y - ((yo5) this.v0.getAdapter()).c.r0.w.y);
            this.x0.setVisibility(0);
            this.y0.setVisibility(8);
            return;
        }
        if (i == 1) {
            this.x0.setVisibility(8);
            this.y0.setVisibility(0);
            O(this.s0);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void r(Bundle bundle) {
        super.r(bundle);
        if (bundle == null) {
            bundle = this.B;
        }
        this.p0 = bundle.getInt("THEME_RES_ID_KEY");
        this.q0 = (ef0) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.r0 = (com.google.android.material.datepicker.QnHx) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.s0 = (zg2) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x013a, code lost:
    
        r9 = new androidx.recyclerview.widget.ck32();
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View s(android.view.LayoutInflater r7, android.view.ViewGroup r8, android.os.Bundle r9) {
        /*
            Method dump skipped, instruction units count: 430
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.F1.s(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // androidx.fragment.app.Fragment
    public final void y(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.p0);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.q0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.r0);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.s0);
    }
}
