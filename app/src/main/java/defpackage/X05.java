package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.platform.AndroidComposeView;
import com.azefsw.audioconnect.R;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class X05 extends ViewGroup implements um2 {
    public pg2 A;
    public j81<? super pg2, sd5> B;
    public ij0 C;
    public j81<? super ij0, sd5> D;
    public d32 E;
    public b34 F;
    public final aq4 G;
    public final T23 H;
    public final FJCM I;
    public j81<? super Boolean, sd5> J;
    public final int[] K;
    public int L;
    public int M;
    public final vm2 N;
    public final yy1 O;
    public final mm2 w;
    public View x;
    public h81<sd5> y;
    public boolean z;

    public static final class CQf extends cx1 implements j81<ij0, sd5> {
        public final /* synthetic */ yy1 w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CQf(yy1 yy1Var) {
            super(1);
            this.w = yy1Var;
        }

        @Override // defpackage.j81
        public final sd5 invoke(ij0 ij0Var) {
            this.w.e(ij0Var);
            return sd5.a;
        }
    }

    @if0(c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedPreFling$1", f = "AndroidViewHolder.android.kt", l = {488}, m = "invokeSuspend")
    public static final class EQ extends px4 implements x81<ua0, z80<? super sd5>, Object> {
        public int A;
        public final /* synthetic */ long C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EQ(long j, z80<? super EQ> z80Var) {
            super(2, z80Var);
            this.C = j;
        }

        @Override // defpackage.m8
        public final z80<sd5> a(Object obj, z80<?> z80Var) {
            return X05.this.new EQ(this.C, z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) throws Throwable {
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i = this.A;
            if (i == 0) {
                C0239D.H(obj);
                mm2 mm2Var = X05.this.w;
                this.A = 1;
                if (mm2Var.c(this.C, this) == va0Var) {
                    return va0Var;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C0239D.H(obj);
            }
            return sd5.a;
        }

        @Override // defpackage.x81
        public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
            return ((EQ) a(ua0Var, z80Var)).i(sd5.a);
        }
    }

    public static final class F1 extends cx1 implements j81<ww2, sd5> {
        public final /* synthetic */ X05 w;
        public final /* synthetic */ yy1 x;
        public final /* synthetic */ jl3<View> y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public F1(zi5 zi5Var, yy1 yy1Var, jl3 jl3Var) {
            super(1);
            this.w = zi5Var;
            this.x = yy1Var;
            this.y = jl3Var;
        }

        @Override // defpackage.j81
        public final sd5 invoke(ww2 ww2Var) {
            ww2 ww2Var2 = ww2Var;
            AndroidComposeView androidComposeView = ww2Var2 instanceof AndroidComposeView ? (AndroidComposeView) ww2Var2 : null;
            X05 x05 = this.w;
            if (androidComposeView != null) {
                HashMap<X05, yy1> holderToLayoutNode = androidComposeView.getAndroidViewsHandler$ui_release().getHolderToLayoutNode();
                yy1 yy1Var = this.x;
                holderToLayoutNode.put(x05, yy1Var);
                androidComposeView.getAndroidViewsHandler$ui_release().addView(x05);
                androidComposeView.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().put(yy1Var, x05);
                Field field = bi5.a;
                bi5.LPt8Fixed.s(x05, 1);
                bi5.m(x05, new px8w(yy1Var, androidComposeView, androidComposeView));
            }
            View view = this.y.w;
            if (view != null) {
                x05.setView$ui_release(view);
            }
            return sd5.a;
        }
    }

    public static final class FJCM extends cx1 implements h81<sd5> {
        public final /* synthetic */ X05 w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FJCM(zi5 zi5Var) {
            super(0);
            this.w = zi5Var;
        }

        @Override // defpackage.h81
        public final sd5 invoke() {
            X05 x05 = this.w;
            if (x05.z) {
                x05.G.b(x05, x05.H, x05.getUpdate());
            }
            return sd5.a;
        }
    }

    public static final class LPt8Fixed extends cx1 implements j81<ww2, sd5> {
        public final /* synthetic */ X05 w;
        public final /* synthetic */ jl3<View> x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LPt8Fixed(zi5 zi5Var, jl3 jl3Var) {
            super(1);
            this.w = zi5Var;
            this.x = jl3Var;
        }

        /* JADX WARN: Type inference failed for: r4v4, types: [T, android.view.View] */
        @Override // defpackage.j81
        public final sd5 invoke(ww2 ww2Var) {
            ww2 ww2Var2 = ww2Var;
            AndroidComposeView androidComposeView = ww2Var2 instanceof AndroidComposeView ? (AndroidComposeView) ww2Var2 : null;
            X05 x05 = this.w;
            if (androidComposeView != null) {
                androidComposeView.getAndroidViewsHandler$ui_release().removeView(x05);
                HashMap<yy1, X05> layoutNodeToHolder = androidComposeView.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder();
                yy1 yy1VarRemove = androidComposeView.getAndroidViewsHandler$ui_release().getHolderToLayoutNode().remove(x05);
                sb5.c(layoutNodeToHolder);
                layoutNodeToHolder.remove(yy1VarRemove);
                Field field = bi5.a;
                bi5.LPt8Fixed.s(x05, 0);
            }
            this.x.w = x05.getView();
            x05.setView$ui_release(null);
            return sd5.a;
        }
    }

    public static final class NUlFixed implements rb2 {
        public final /* synthetic */ X05 a;
        public final /* synthetic */ yy1 b;

        public static final class QnHx extends cx1 implements j81<b43.QnHx, sd5> {
            public final /* synthetic */ X05 w;
            public final /* synthetic */ yy1 x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public QnHx(yy1 yy1Var, X05 x05) {
                super(1);
                this.w = x05;
                this.x = yy1Var;
            }

            @Override // defpackage.j81
            public final sd5 invoke(b43.QnHx qnHx) {
                C0239D.g(this.w, this.x);
                return sd5.a;
            }
        }

        public NUlFixed(yy1 yy1Var, zi5 zi5Var) {
            this.a = zi5Var;
            this.b = yy1Var;
        }

        @Override // defpackage.rb2
        public final sb2 a(vb2 vb2Var, List<? extends ob2> list, long j) {
            int iJ = g70.j(j);
            X05 x05 = this.a;
            if (iJ != 0) {
                x05.getChildAt(0).setMinimumWidth(g70.j(j));
            }
            if (g70.i(j) != 0) {
                x05.getChildAt(0).setMinimumHeight(g70.i(j));
            }
            x05.measure(X05.a(x05, g70.j(j), g70.h(j), x05.getLayoutParams().width), X05.a(x05, g70.i(j), g70.g(j), x05.getLayoutParams().height));
            return vb2Var.K(x05.getMeasuredWidth(), x05.getMeasuredHeight(), ds0.w, new QnHx(this.b, x05));
        }

        @Override // defpackage.rb2
        public final int b(yy1.byN byn, List list, int i) {
            X05 x05 = this.a;
            x05.measure(X05.a(x05, 0, i, x05.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
            return x05.getMeasuredHeight();
        }

        @Override // defpackage.rb2
        public final int c(yy1.byN byn, List list, int i) {
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            X05 x05 = this.a;
            x05.measure(iMakeMeasureSpec, X05.a(x05, 0, i, x05.getLayoutParams().height));
            return x05.getMeasuredWidth();
        }

        @Override // defpackage.rb2
        public final int d(yy1.byN byn, List list, int i) {
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            X05 x05 = this.a;
            x05.measure(iMakeMeasureSpec, X05.a(x05, 0, i, x05.getLayoutParams().height));
            return x05.getMeasuredWidth();
        }

        @Override // defpackage.rb2
        public final int e(yy1.byN byn, List list, int i) {
            X05 x05 = this.a;
            x05.measure(X05.a(x05, 0, i, x05.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
            return x05.getMeasuredHeight();
        }
    }

    public static final class PRnFixed extends cx1 implements j81<h81<? extends sd5>, sd5> {
        public final /* synthetic */ X05 w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PRnFixed(zi5 zi5Var) {
            super(1);
            this.w = zi5Var;
        }

        @Override // defpackage.j81
        public final sd5 invoke(h81<? extends sd5> h81Var) {
            h81<? extends sd5> h81Var2 = h81Var;
            X05 x05 = this.w;
            if (x05.getHandler().getLooper() == Looper.myLooper()) {
                h81Var2.invoke();
            } else {
                x05.getHandler().post(new FgDh(h81Var2, 0));
            }
            return sd5.a;
        }
    }

    public static final class QnHx extends cx1 implements j81<pg2, sd5> {
        public final /* synthetic */ yy1 w;
        public final /* synthetic */ pg2 x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(yy1 yy1Var, pg2 pg2Var) {
            super(1);
            this.w = yy1Var;
            this.x = pg2Var;
        }

        @Override // defpackage.j81
        public final sd5 invoke(pg2 pg2Var) {
            this.w.g(pg2Var.y(this.x));
            return sd5.a;
        }
    }

    public static final class T23 extends cx1 implements j81<X05, sd5> {
        public final /* synthetic */ X05 w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public T23(zi5 zi5Var) {
            super(1);
            this.w = zi5Var;
        }

        @Override // defpackage.j81
        public final sd5 invoke(X05 x05) {
            X05 x06 = this.w;
            x06.getHandler().post(new OBMt(x06.I, 0));
            return sd5.a;
        }
    }

    public static final class YKK extends cx1 implements j81<ro0, sd5> {
        public final /* synthetic */ yy1 w;
        public final /* synthetic */ X05 x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public YKK(yy1 yy1Var, zi5 zi5Var) {
            super(1);
            this.w = yy1Var;
            this.x = zi5Var;
        }

        @Override // defpackage.j81
        public final sd5 invoke(ro0 ro0Var) {
            dn dnVarB = ro0Var.e0().b();
            ww2 ww2Var = this.w.C;
            AndroidComposeView androidComposeView = ww2Var instanceof AndroidComposeView ? (AndroidComposeView) ww2Var : null;
            if (androidComposeView != null) {
                Canvas canvas = F6mt.a;
                Canvas canvas2 = ((ZCR) dnVarB).a;
                androidComposeView.getAndroidViewsHandler$ui_release().getClass();
                this.x.draw(canvas2);
            }
            return sd5.a;
        }
    }

    public static final class auxFixed extends cx1 implements j81<iy1, sd5> {
        public final /* synthetic */ X05 w;
        public final /* synthetic */ yy1 x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public auxFixed(yy1 yy1Var, zi5 zi5Var) {
            super(1);
            this.w = zi5Var;
            this.x = yy1Var;
        }

        @Override // defpackage.j81
        public final sd5 invoke(iy1 iy1Var) {
            C0239D.g(this.w, this.x);
            return sd5.a;
        }
    }

    @if0(c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedFling$1", f = "AndroidViewHolder.android.kt", l = {470, 475}, m = "invokeSuspend")
    public static final class byN extends px4 implements x81<ua0, z80<? super sd5>, Object> {
        public int A;
        public final /* synthetic */ boolean B;
        public final /* synthetic */ X05 C;
        public final /* synthetic */ long D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public byN(boolean z, X05 x05, long j, z80<? super byN> z80Var) {
            super(2, z80Var);
            this.B = z;
            this.C = x05;
            this.D = j;
        }

        @Override // defpackage.m8
        public final z80<sd5> a(Object obj, z80<?> z80Var) {
            return new byN(this.B, this.C, this.D, z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) throws Throwable {
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i = this.A;
            if (i == 0) {
                C0239D.H(obj);
                boolean z = this.B;
                X05 x05 = this.C;
                if (z) {
                    mm2 mm2Var = x05.w;
                    long j = this.D;
                    int i2 = mh5.c;
                    long j2 = mh5.b;
                    this.A = 2;
                    if (mm2Var.a(j, j2, this) == va0Var) {
                        return va0Var;
                    }
                } else {
                    mm2 mm2Var2 = x05.w;
                    int i3 = mh5.c;
                    long j3 = mh5.b;
                    long j4 = this.D;
                    this.A = 1;
                    if (mm2Var2.a(j3, j4, this) == va0Var) {
                        return va0Var;
                    }
                }
            } else {
                if (i != 1 && i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C0239D.H(obj);
            }
            return sd5.a;
        }

        @Override // defpackage.x81
        public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
            return ((byN) a(ua0Var, z80Var)).i(sd5.a);
        }
    }

    public static final class y extends cx1 implements h81<sd5> {
        public static final y w = new y();

        public y() {
            super(0);
        }

        @Override // defpackage.h81
        public final /* bridge */ /* synthetic */ sd5 invoke() {
            return sd5.a;
        }
    }

    public X05(Context context, l40 l40Var, mm2 mm2Var) {
        super(context);
        this.w = mm2Var;
        if (l40Var != null) {
            LinkedHashMap linkedHashMap = wm5.a;
            setTag(R.id.androidx_compose_ui_view_composition_context, l40Var);
        }
        setSaveFromParentEnabled(false);
        this.y = y.w;
        this.A = pg2.QnHx.w;
        this.C = new jj0(1.0f, 1.0f);
        zi5 zi5Var = (zi5) this;
        this.G = new aq4(new PRnFixed(zi5Var));
        this.H = new T23(zi5Var);
        this.I = new FJCM(zi5Var);
        this.K = new int[2];
        this.L = Integer.MIN_VALUE;
        this.M = Integer.MIN_VALUE;
        this.N = new vm2();
        yy1 yy1Var = new yy1(false);
        m93 m93Var = new m93();
        m93Var.w = new n93(zi5Var);
        fp3 fp3Var = new fp3();
        fp3 fp3Var2 = m93Var.x;
        if (fp3Var2 != null) {
            fp3Var2.w = null;
        }
        m93Var.x = fp3Var;
        fp3Var.w = m93Var;
        setOnRequestDisallowInterceptTouchEvent$ui_release(fp3Var);
        pg2 pg2VarP0 = fp1.p0(fp1.V(m93Var, new YKK(yy1Var, zi5Var)), new auxFixed(yy1Var, zi5Var));
        yy1Var.g(this.A.y(pg2VarP0));
        this.B = new QnHx(yy1Var, pg2VarP0);
        yy1Var.e(this.C);
        this.D = new CQf(yy1Var);
        jl3 jl3Var = new jl3();
        yy1Var.h0 = new F1(zi5Var, yy1Var, jl3Var);
        yy1Var.i0 = new LPt8Fixed(zi5Var, jl3Var);
        yy1Var.b(new NUlFixed(yy1Var, zi5Var));
        this.O = yy1Var;
    }

    public static final int a(X05 x05, int i, int i2, int i3) {
        x05.getClass();
        if (i3 >= 0 || i == i2) {
            return View.MeasureSpec.makeMeasureSpec(AY.o(i3, i, i2), 1073741824);
        }
        if (i3 != -2 || i2 == Integer.MAX_VALUE) {
            return (i3 != -1 || i2 == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
        }
        return View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE);
    }

    @Override // defpackage.um2
    public final void b(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (isNestedScrollingEnabled()) {
            float f = i;
            float f2 = -1;
            long jB = this.w.b(i5 == 0 ? 1 : 2, X.a(f * f2, i2 * f2), X.a(i3 * f2, i4 * f2));
            iArr[0] = ps0.u(kt2.c(jB));
            iArr[1] = ps0.u(kt2.d(jB));
        }
    }

    @Override // defpackage.tm2
    public final void c(View view, int i, int i2, int i3, int i4, int i5) {
        if (isNestedScrollingEnabled()) {
            float f = i;
            float f2 = -1;
            this.w.b(i5 == 0 ? 1 : 2, X.a(f * f2, i2 * f2), X.a(i3 * f2, i4 * f2));
        }
    }

    @Override // defpackage.tm2
    public final boolean d(View view, View view2, int i, int i2) {
        return ((i & 2) == 0 && (i & 1) == 0) ? false : true;
    }

    @Override // defpackage.tm2
    public final void e(View view, View view2, int i, int i2) {
        vm2 vm2Var = this.N;
        if (i2 == 1) {
            vm2Var.b = i;
        } else {
            vm2Var.a = i;
        }
    }

    @Override // defpackage.tm2
    public final void f(View view, int i) {
        vm2 vm2Var = this.N;
        if (i == 1) {
            vm2Var.b = 0;
        } else {
            vm2Var.a = 0;
        }
    }

    @Override // defpackage.tm2
    public final void g(View view, int i, int i2, int[] iArr, int i3) {
        if (isNestedScrollingEnabled()) {
            float f = i;
            float f2 = -1;
            long jA = X.a(f * f2, i2 * f2);
            int i4 = i3 == 0 ? 1 : 2;
            lm2 lm2Var = this.w.c;
            long jB = lm2Var != null ? lm2Var.b(i4, jA) : kt2.b;
            iArr[0] = ps0.u(kt2.c(jB));
            iArr[1] = ps0.u(kt2.d(jB));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        int[] iArr = this.K;
        getLocationInWindow(iArr);
        int i = iArr[0];
        region.op(i, iArr[1], getWidth() + i, getHeight() + iArr[1], Region.Op.DIFFERENCE);
        return true;
    }

    public final ij0 getDensity() {
        return this.C;
    }

    public final yy1 getLayoutNode() {
        return this.O;
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams;
        View view = this.x;
        return (view == null || (layoutParams = view.getLayoutParams()) == null) ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    public final d32 getLifecycleOwner() {
        return this.E;
    }

    public final pg2 getModifier() {
        return this.A;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        vm2 vm2Var = this.N;
        return vm2Var.b | vm2Var.a;
    }

    public final j81<ij0, sd5> getOnDensityChanged$ui_release() {
        return this.D;
    }

    public final j81<pg2, sd5> getOnModifierChanged$ui_release() {
        return this.B;
    }

    public final j81<Boolean, sd5> getOnRequestDisallowInterceptTouchEvent$ui_release() {
        return this.J;
    }

    public final b34 getSavedStateRegistryOwner() {
        return this.F;
    }

    public final h81<sd5> getUpdate() {
        return this.y;
    }

    public final View getView() {
        return this.x;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        this.O.A();
        return null;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        View view = this.x;
        return view != null ? view.isNestedScrollingEnabled() : super.isNestedScrollingEnabled();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.G.c();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        this.O.A();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        aq4 aq4Var = this.G;
        bp4 bp4Var = aq4Var.e;
        if (bp4Var != null) {
            bp4Var.a();
        }
        aq4Var.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view = this.x;
        if (view != null) {
            view.layout(0, 0, i3 - i, i4 - i2);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        View view = this.x;
        if (view != null) {
            view.measure(i, i2);
        }
        View view2 = this.x;
        int measuredWidth = view2 != null ? view2.getMeasuredWidth() : 0;
        View view3 = this.x;
        setMeasuredDimension(measuredWidth, view3 != null ? view3.getMeasuredHeight() : 0);
        this.L = i;
        this.M = i2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        fp1.k0(this.w.d(), null, 0, new byN(z, this, XTd3.c(f * (-1.0f), f2 * (-1.0f)), null), 3);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        fp1.k0(this.w.d(), null, 0, new EQ(XTd3.c(f * (-1.0f), f2 * (-1.0f)), null), 3);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        j81<? super Boolean, sd5> j81Var = this.J;
        if (j81Var != null) {
            j81Var.invoke(Boolean.valueOf(z));
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public final void setDensity(ij0 ij0Var) {
        if (ij0Var != this.C) {
            this.C = ij0Var;
            j81<? super ij0, sd5> j81Var = this.D;
            if (j81Var != null) {
                j81Var.invoke(ij0Var);
            }
        }
    }

    public final void setLifecycleOwner(d32 d32Var) {
        if (d32Var != this.E) {
            this.E = d32Var;
            setTag(R.id.view_tree_lifecycle_owner, d32Var);
        }
    }

    public final void setModifier(pg2 pg2Var) {
        if (pg2Var != this.A) {
            this.A = pg2Var;
            j81<? super pg2, sd5> j81Var = this.B;
            if (j81Var != null) {
                j81Var.invoke(pg2Var);
            }
        }
    }

    public final void setOnDensityChanged$ui_release(j81<? super ij0, sd5> j81Var) {
        this.D = j81Var;
    }

    public final void setOnModifierChanged$ui_release(j81<? super pg2, sd5> j81Var) {
        this.B = j81Var;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(j81<? super Boolean, sd5> j81Var) {
        this.J = j81Var;
    }

    public final void setSavedStateRegistryOwner(b34 b34Var) {
        if (b34Var != this.F) {
            this.F = b34Var;
            tj5.b(this, b34Var);
        }
    }

    public final void setUpdate(h81<sd5> h81Var) {
        this.y = h81Var;
        this.z = true;
        this.I.invoke();
    }

    public final void setView$ui_release(View view) {
        if (view != this.x) {
            this.x = view;
            removeAllViews();
            if (view != null) {
                addView(view);
                this.I.invoke();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }
}
