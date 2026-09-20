package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.azefsw.audioconnect.R;
import com.facebook.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ViewConstructor"})
public final class ba3 extends byN {
    public h81<sd5> D;
    public ha3 E;
    public String F;
    public final View G;
    public final da3 H;
    public final WindowManager I;
    public final WindowManager.LayoutParams J;
    public ga3 K;
    public jy1 L;
    public final kz2 M;
    public final kz2 N;
    public qp1 O;
    public final uj0 P;
    public final Rect Q;
    public final kz2 R;
    public boolean S;
    public final int[] T;

    public static final class QnHx extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ int x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(int i) {
            super(2);
            this.x = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.x | 1;
            ba3.this.a(g30Var, i);
            return sd5.a;
        }
    }

    public ba3() {
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ba3(h81 h81Var, ha3 ha3Var, String str, View view, ij0 ij0Var, ga3 ga3Var, UUID uuid) {
        super(view.getContext());
        da3 ea3Var = Build.VERSION.SDK_INT >= 29 ? new ea3() : new fa3();
        this.D = h81Var;
        this.E = ha3Var;
        this.F = str;
        this.G = view;
        this.H = ea3Var;
        Object systemService = view.getContext().getSystemService("window");
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
        }
        this.I = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        layoutParams.flags = (layoutParams.flags & (-8552473)) | 262144;
        layoutParams.type = AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(R.string.default_popup_window_title));
        this.J = layoutParams;
        this.K = ga3Var;
        this.L = jy1.Ltr;
        this.M = ps0.R(null);
        this.N = ps0.R(null);
        this.P = ps0.x(new ca3(this));
        this.Q = new Rect();
        setId(android.R.id.content);
        setTag(R.id.view_tree_lifecycle_owner, XTd3.i(view));
        setTag(R.id.view_tree_view_model_store_owner, C0239D.q(view));
        tj5.b(this, tj5.a(view));
        setTag(R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(ij0Var.b0((float) 30));
        setOutlineProvider(new aa3());
        this.R = ps0.R(c00.a);
        this.T = new int[2];
    }

    private final x81<g30, Integer, sd5> getContent() {
        return (x81) this.R.getValue();
    }

    private final int getDisplayHeight() {
        return sy4.c(getContext().getResources().getConfiguration().screenHeightDp * getContext().getResources().getDisplayMetrics().density);
    }

    private final int getDisplayWidth() {
        return sy4.c(getContext().getResources().getConfiguration().screenWidthDp * getContext().getResources().getDisplayMetrics().density);
    }

    public static /* synthetic */ void getParams$ui_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final iy1 getParentLayoutCoordinates() {
        return (iy1) this.N.getValue();
    }

    private final void setClippingEnabled(boolean z) {
        WindowManager.LayoutParams layoutParams = this.J;
        layoutParams.flags = z ? layoutParams.flags & (-513) : layoutParams.flags | AdRequest.MAX_CONTENT_URL_LENGTH;
        this.H.a(this.I, this, layoutParams);
    }

    private final void setContent(x81<? super g30, ? super Integer, sd5> x81Var) {
        this.R.setValue(x81Var);
    }

    private final void setIsFocusable(boolean z) {
        WindowManager.LayoutParams layoutParams = this.J;
        layoutParams.flags = !z ? layoutParams.flags | 8 : layoutParams.flags & (-9);
        this.H.a(this.I, this, layoutParams);
    }

    private final void setParentLayoutCoordinates(iy1 iy1Var) {
        this.N.setValue(iy1Var);
    }

    private final void setSecurePolicy(f74 f74Var) {
        lq0 lq0Var = thju.a;
        ViewGroup.LayoutParams layoutParams = this.G.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        boolean z = true;
        boolean z2 = (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
        int iOrdinal = f74Var.ordinal();
        if (iOrdinal == 0) {
            z = z2;
        } else if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            z = false;
        }
        WindowManager.LayoutParams layoutParams3 = this.J;
        layoutParams3.flags = z ? layoutParams3.flags | 8192 : layoutParams3.flags & (-8193);
        this.H.a(this.I, this, layoutParams3);
    }

    @Override // defpackage.byN
    public final void a(g30 g30Var, int i) {
        j30 j30VarQ = g30Var.q(-857613600);
        getContent().invoke(j30VarQ, 0);
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new QnHx(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        KeyEvent.DispatcherState keyDispatcherState;
        if (keyEvent.getKeyCode() == 4 && this.E.b) {
            if (getKeyDispatcherState() == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                }
                return true;
            }
            if (keyEvent.getAction() == 1 && (keyDispatcherState = getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                h81<sd5> h81Var = this.D;
                if (h81Var != null) {
                    h81Var.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // defpackage.byN
    public final void e(boolean z, int i, int i2, int i3, int i4) {
        super.e(z, i, i2, i3, i4);
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        WindowManager.LayoutParams layoutParams = this.J;
        layoutParams.width = childAt.getMeasuredWidth();
        layoutParams.height = childAt.getMeasuredHeight();
        this.H.a(this.I, this, layoutParams);
    }

    @Override // defpackage.byN
    public final void f(int i, int i2) {
        if (this.E.g) {
            super.f(i, i2);
        } else {
            super.f(View.MeasureSpec.makeMeasureSpec(getDisplayWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getDisplayHeight(), Integer.MIN_VALUE));
        }
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.P.getValue()).booleanValue();
    }

    public final WindowManager.LayoutParams getParams$ui_release() {
        return this.J;
    }

    public final jy1 getParentLayoutDirection() {
        return this.L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final sp1 m0getPopupContentSizebOM6tXw() {
        return (sp1) this.M.getValue();
    }

    public final ga3 getPositionProvider() {
        return this.K;
    }

    @Override // defpackage.byN
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.S;
    }

    public byN getSubCompositionView() {
        return this;
    }

    public final String getTestTag() {
        return this.F;
    }

    public /* bridge */ /* synthetic */ View getViewRoot() {
        return null;
    }

    public final void j(l40 l40Var, x81<? super g30, ? super Integer, sd5> x81Var) {
        setParentCompositionContext(l40Var);
        setContent(x81Var);
        this.S = true;
    }

    public final void k(h81<sd5> h81Var, ha3 ha3Var, String str, jy1 jy1Var) {
        int i;
        this.D = h81Var;
        this.E = ha3Var;
        this.F = str;
        setIsFocusable(ha3Var.a);
        setSecurePolicy(ha3Var.d);
        setClippingEnabled(ha3Var.f);
        int iOrdinal = jy1Var.ordinal();
        if (iOrdinal != 0) {
            i = 1;
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            i = 0;
        }
        super.setLayoutDirection(i);
    }

    public final void l() {
        iy1 parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates == null) {
            return;
        }
        long jA = parentLayoutCoordinates.a();
        long jL = parentLayoutCoordinates.l(kt2.b);
        long jD = C0239D.d(sy4.c(kt2.c(jL)), sy4.c(kt2.d(jL)));
        int i = (int) (jD >> 32);
        qp1 qp1Var = new qp1(i, mp1.a(jD), ((int) (jA >> 32)) + i, sp1.b(jA) + mp1.a(jD));
        if (ur1.a(qp1Var, this.O)) {
            return;
        }
        this.O = qp1Var;
        n();
    }

    public final void m(iy1 iy1Var) {
        setParentLayoutCoordinates(iy1Var);
        l();
    }

    public final void n() {
        sp1 sp1VarM0getPopupContentSizebOM6tXw;
        qp1 qp1Var = this.O;
        if (qp1Var == null || (sp1VarM0getPopupContentSizebOM6tXw = m0getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        da3 da3Var = this.H;
        View view = this.G;
        Rect rect = this.Q;
        da3Var.c(view, rect);
        lq0 lq0Var = thju.a;
        long jE = C0239D.e(rect.right - rect.left, rect.bottom - rect.top);
        long jA = this.K.a(qp1Var, sp1VarM0getPopupContentSizebOM6tXw.a);
        WindowManager.LayoutParams layoutParams = this.J;
        int i = mp1.c;
        layoutParams.x = (int) (jA >> 32);
        layoutParams.y = mp1.a(jA);
        if (this.E.e) {
            da3Var.b(this, (int) (jE >> 32), sp1.b(jE));
        }
        da3Var.a(this.I, this, layoutParams);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.E.c) {
            return super.onTouchEvent(motionEvent);
        }
        boolean z = false;
        if ((motionEvent != null && motionEvent.getAction() == 0) && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            h81<sd5> h81Var = this.D;
            if (h81Var != null) {
                h81Var.invoke();
            }
            return true;
        }
        if (motionEvent != null && motionEvent.getAction() == 4) {
            z = true;
        }
        if (!z) {
            return super.onTouchEvent(motionEvent);
        }
        h81<sd5> h81Var2 = this.D;
        if (h81Var2 != null) {
            h81Var2.invoke();
        }
        return true;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
    }

    public final void setParentLayoutDirection(jy1 jy1Var) {
        this.L = jy1Var;
    }

    /* JADX INFO: renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m1setPopupContentSizefhxjrPA(sp1 sp1Var) {
        this.M.setValue(sp1Var);
    }

    public final void setPositionProvider(ga3 ga3Var) {
        this.K = ga3Var;
    }

    public final void setTestTag(String str) {
        this.F = str;
    }
}
