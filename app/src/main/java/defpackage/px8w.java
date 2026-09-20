package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: loaded from: classes.dex */
public final class px8w extends d_OZ {
    public final /* synthetic */ yy1 d;
    public final /* synthetic */ AndroidComposeView e;
    public final /* synthetic */ AndroidComposeView f;

    public px8w(yy1 yy1Var, AndroidComposeView androidComposeView, AndroidComposeView androidComposeView2) {
        this.d = yy1Var;
        this.e = androidComposeView;
        this.f = androidComposeView2;
    }

    @Override // defpackage.d_OZ
    public final void d(View view, UT ut) {
        View.AccessibilityDelegate accessibilityDelegate = this.a;
        AccessibilityNodeInfo accessibilityNodeInfo = ut.a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        z84 z84VarZ = fp1.Z(this.d);
        z84VarZ.c();
        ((a94) z84VarZ.x).getId();
        yy1 yy1VarR = fp1.r(z84VarZ.w.A, f94.CQf.w);
        z84 z84VarZ2 = yy1VarR != null ? fp1.Z(yy1VarR) : null;
        f94 f94Var = z84VarZ2 != null ? new f94(z84VarZ2, false) : null;
        f94 f94VarA = this.e.getSemanticsOwner().a();
        int i = f94Var.f;
        if (i == f94VarA.f) {
            i = -1;
        }
        ut.b = i;
        accessibilityNodeInfo.setParent(this.f, i);
    }
}
