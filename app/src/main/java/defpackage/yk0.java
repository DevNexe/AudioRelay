package defpackage;

import android.app.Dialog;
import android.graphics.Outline;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.Window;
import android.view.WindowManager;
import com.azefsw.audioconnect.R;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class yk0 extends Dialog {
    public h81<sd5> w;
    public wk0 x;
    public final View y;
    public final uk0 z;

    public static final class QnHx extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            outline.setRect(0, 0, view.getWidth(), view.getHeight());
            outline.setAlpha(0.0f);
        }
    }

    public yk0(h81<sd5> h81Var, wk0 wk0Var, View view, jy1 jy1Var, ij0 ij0Var, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), R.style.DialogWindowTheme));
        this.w = h81Var;
        this.x = wk0Var;
        this.y = view;
        float f = 30;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window".toString());
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        uk0 uk0Var = new uk0(getContext(), window);
        uk0Var.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        uk0Var.setClipChildren(false);
        uk0Var.setElevation(ij0Var.b0(f));
        uk0Var.setOutlineProvider(new QnHx());
        this.z = uk0Var;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            a(viewGroup);
        }
        setContentView(uk0Var);
        uk0Var.setTag(R.id.view_tree_lifecycle_owner, XTd3.i(view));
        uk0Var.setTag(R.id.view_tree_view_model_store_owner, C0239D.q(view));
        tj5.b(uk0Var, tj5.a(view));
        b(this.w, this.x, jy1Var);
    }

    public static final void a(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof uk0) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                a(viewGroup2);
            }
        }
    }

    public final void b(h81<sd5> h81Var, wk0 wk0Var, jy1 jy1Var) {
        this.w = h81Var;
        this.x = wk0Var;
        lq0 lq0Var = thju.a;
        ViewGroup.LayoutParams layoutParams = this.y.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        int i = 1;
        boolean z = (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
        int iOrdinal = wk0Var.c.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                z = true;
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                z = false;
            }
        }
        getWindow().setFlags(z ? 8192 : -8193, 8192);
        int iOrdinal2 = jy1Var.ordinal();
        if (iOrdinal2 == 0) {
            i = 0;
        } else if (iOrdinal2 != 1) {
            throw new NoWhenBranchMatchedException();
        }
        uk0 uk0Var = this.z;
        uk0Var.setLayoutDirection(i);
        uk0Var.F = wk0Var.d;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        if (this.x.a) {
            this.w.invoke();
        }
    }

    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (zOnTouchEvent && this.x.b) {
            this.w.invoke();
        }
        return zOnTouchEvent;
    }
}
